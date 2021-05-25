package com.dtt.lgsp.data.handler;

import java.io.File;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.cron.DttCron;
import com.dtt.lgsp.app.cron.ThreadProcess;
import com.dtt.lgsp.app.keys.ResponseKeys;
import com.dtt.lgsp.app.utils.FileUtility;
import com.dtt.lgsp.entities.ProfileEntity;
import com.dtt.lgsp.entities.Result;

public class XMLDataHandler extends ThreadProcess{
	
	public XMLDataHandler(ProfileEntity profileEntity) {
		super(profileEntity);
		// TODO Auto-generated constructor stub
	}

	static final Logger logger = Logger.getLogger(XMLDataHandler.class);
	
	public boolean dongBoHoSo(String hoSo, int loaiHoSo, int soLuong) {
		try {
			ProfileEntity config = PreferencesConfiguration.getConfig();
			String clientVersion = config.getClientVersion();
			String version = config.getVersion();
			
			if(!clientVersion.equals(version)) {
				logger.info(
						"Phiên bản phần mềm " + clientVersion + " của bạn đã cũ, vui lòng update phiên bản "+ version +" mới để tiếp tục...");
				JOptionPane.showMessageDialog(null, "Phiên bản phần mềm " + clientVersion + " của bạn đã cũ, vui lòng update phiên bản "+ version +" mới để tiếp tục...", "",
						JOptionPane.INFORMATION_MESSAGE);
				sleep(1000 * 60 * 60);
			}
			
			
			Result result = DttConsumer.send4210(hoSo, loaiHoSo, soLuong);
			if (result == null) {
				logger.info(
						"Bạn chưa được phân luồng để tải dữ liệu - xin chờ một thời gian. Hệ thống sẽ tự động tải khi được phân luồng....");
				sleep(1000 * 60 * 5);
				return dongBoHoSo(hoSo, loaiHoSo, soLuong);

			} else {
				if (ResponseKeys.OK.equals(result.getCode())) {
					++DttCron.thanhCong;
					FileHandler.successHoSoSync(result.getDescription());
					sleep((long) (config.getTimeSlepp() * 1000));
					logger.info("Gửi thành công : " + (DttCron.thanhCong) + "(hồ sơ) - time: " + config.getTimeSlepp());
					++tongHoSoFile;
					return true;
				} else if (ResponseKeys.ERROR_HS.equals(result.getCode())) {
					logger.info("Thông báo: Phát hiện 1 hồ sơ trong file bị lỗi dữ liệu" );
					return true;
				}else if (ResponseKeys.ACTIVE_CODE_NULL.equals(result.getCode())) {
					logger.info("Tài khoản của bạn không chính xác!");
					sleep(1000 * 60 * 5);
					return dongBoHoSo(hoSo, loaiHoSo, soLuong);
				} else if (ResponseKeys.ACTIVE_CODE_NOT.equals(result.getCode())) {
					logger.info("Tài khoản của bạn đã bị khóa bởi Quản trị viên BYT xin vui lòng liên hệ qua nhóm Zalo để được hỗ trợ!");
					sleep(1000 * 60 * 5);
					return dongBoHoSo(hoSo, loaiHoSo, soLuong);
				}else if (ResponseKeys.USER_IS_NOTACTIVE.equals(result.getCode())) {
					logger.info("Tài khoản của bạn chưa kích hoạt, vui lòng liên hệ Quản trị viên BYT xin vui lòng liên hệ qua nhóm Zalo để được hỗ trợ!");
					sleep(1000 * 60 * 5);
					return dongBoHoSo(hoSo, loaiHoSo, soLuong);
				}else if(ResponseKeys.WAS_SEND.equals(result.getCode())){
					logger.info("Hồ sơ " + result.getDescription() +" bị trùng, đã được đồng bộ");
					return false;
				}else {
					logger.info("Có lỗi xảy ra: " + result.getCode());
					sleep(1000 * 60 * 5);
					return dongBoHoSo(hoSo, loaiHoSo, soLuong);
				}
			}

		} catch (Exception e) {
			logger.info(
					"Bạn chưa được phân luồng để tải dữ liệu - xin chờ một thời gian. Hệ thống sẽ tự động tải khi được phân luồng....!");
			try {
				sleep(20000);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return dongBoHoSo(hoSo, loaiHoSo, soLuong);
		}
	}
	
	class DefaultHandlerSAX extends DefaultHandler {

		StringBuilder hoSoHeaderXML = new StringBuilder();
		boolean valueHearder = true;
		StringBuilder hoSoXML = new StringBuilder();
		StringBuilder xml = new StringBuilder();
		StringBuilder xmlMau2018 = new StringBuilder();
		int countHoSo = 0;
		int tongHoSoCaFile =0;
		private File fileRoot;

		public DefaultHandlerSAX(File fileRoot) {
			this.fileRoot = fileRoot;
			this.countHoSo=0;
			this.tongHoSoCaFile =0;
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes)
				throws SAXException {
			if (qName.equalsIgnoreCase("GIAMDINHHS")) {
				hoSoHeaderXML.append("<GIAMDINHHS>");
			} else if (qName.equalsIgnoreCase("THONGTINDONVI")) {
				hoSoHeaderXML.append("<THONGTINDONVI>");
			} else if (qName.equalsIgnoreCase("MACSKCB")) {
				hoSoHeaderXML.append("<MACSKCB>");
			} else if (qName.equalsIgnoreCase("THONGTINHOSO")) {
				hoSoHeaderXML.append("<THONGTINHOSO>");
			} else if (qName.equalsIgnoreCase("NGAYLAP")) {
				hoSoHeaderXML.append("<NGAYLAP>");
			} else if (qName.equalsIgnoreCase("SOLUONGHOSO")) {
				hoSoHeaderXML.append("<SOLUONGHOSO>");
			} else if (qName.equalsIgnoreCase("DANHSACHHOSO")) {
				hoSoHeaderXML.append("<DANHSACHHOSO>");
			} else if (qName.equalsIgnoreCase("HOSO")) {
				valueHearder = false;
				hoSoXML.append("<HOSO>");
			} else if (qName.equalsIgnoreCase("FILEHOSO")) {
				hoSoXML.append("<FILEHOSO>");
			} else if (qName.equalsIgnoreCase("LOAIHOSO")) {
				hoSoXML.append("<LOAIHOSO>");
			} else if (qName.equalsIgnoreCase("NOIDUNGFILE")) {
				hoSoXML.append("<NOIDUNGFILE>");
			} else if (qName.equalsIgnoreCase("CHECKOUT")) {
				try {
					xmlMau2018.append(FileUtility.readContentFile(this.fileRoot));
					
					boolean result = dongBoHoSo(xmlMau2018.toString(), 2, countHoSo);
					xmlMau2018.setLength(0);
					return;
				} catch (Exception e) {
					throw new SAXException();
				}

			}

		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			String value = new String(ch, start, length);
			if (valueHearder) {
				hoSoHeaderXML.append(value);
			} else {
				hoSoXML.append(value);
			}

		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			if (qName.equalsIgnoreCase("GIAMDINHHS")) {
				hoSoHeaderXML.append("</GIAMDINHHS>");
			} else if (qName.equalsIgnoreCase("THONGTINDONVI")) {
				hoSoHeaderXML.append("</THONGTINDONVI>");
			} else if (qName.equalsIgnoreCase("MACSKCB")) {
				hoSoHeaderXML.append("</MACSKCB>");
			} else if (qName.equalsIgnoreCase("THONGTINHOSO")) {
				hoSoHeaderXML.append("</THONGTINHOSO>");
			} else if (qName.equalsIgnoreCase("NGAYLAP")) {
				hoSoHeaderXML.append("</NGAYLAP>");
			} else if (qName.equalsIgnoreCase("SOLUONGHOSO")) {
				hoSoHeaderXML.append("</SOLUONGHOSO>");
			} else if (qName.equalsIgnoreCase("DANHSACHHOSO")) {
				hoSoHeaderXML.append(hoSoXML);
				hoSoHeaderXML.append("</DANHSACHHOSO>");
			} else if (qName.equalsIgnoreCase("HOSO")) {
				hoSoXML.append("</HOSO>");
				countHoSo++;
				if (countHoSo >= 1) {
					xml.append(hoSoHeaderXML);
					xml.append(hoSoXML);
					xml.append("</DANHSACHHOSO>\r\n");
					xml.append("	</THONGTINHOSO>\r\n");
					xml.append("</GIAMDINHHS>");
					
					boolean result = dongBoHoSo(xml.toString(), 1, countHoSo);
					
					hoSoXML.setLength(0);
					xml.setLength(0);
					countHoSo = 0;
				}

			} else if (qName.equalsIgnoreCase("FILEHOSO")) {
				hoSoXML.append("</FILEHOSO>");
			} else if (qName.equalsIgnoreCase("LOAIHOSO")) {
				hoSoXML.append("</LOAIHOSO>");
			} else if (qName.equalsIgnoreCase("NOIDUNGFILE")) {
				hoSoXML.append("</NOIDUNGFILE>");
			}
		}

	}
}
