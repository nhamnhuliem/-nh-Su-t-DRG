package com.dtt.lgsp.app.cron;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.config.PropertieConfiguration;
import com.dtt.lgsp.app.core.DrgEnum;
import com.dtt.lgsp.app.keys.ResponseKeys;
import com.dtt.lgsp.app.utils.DateUtil;
import com.dtt.lgsp.app.utils.FileUtility;
import com.dtt.lgsp.app.utils.GzipUtil;
import com.dtt.lgsp.app.utils.HoSoXmlUtils;
import com.dtt.lgsp.app.utils.XML4210Parser;
import com.dtt.lgsp.dao.HoSoSynedUtil;
import com.dtt.lgsp.dao.TableFileSynedUtil;
import com.dtt.lgsp.entities.FileSynedEntity;
import com.dtt.lgsp.entities.HoSoSyncEntity;
import com.dtt.lgsp.entities.ProfileEntity;
import com.dtt.lgsp.entities.Result;

public class ThreadProcess extends Thread {
	static final Logger logger = Logger.getLogger(ThreadProcess.class);

	private ProfileEntity profileEntity;
	private int tongHoSoFile = 0;

	public ThreadProcess(ProfileEntity profileEntity) {
		this.profileEntity = profileEntity;
	}

	@Override
	public void run() {
		try {
			xuLyDongBoHoSo4210ByFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		DttCron.chayScheduleMoi = true;

	}

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
					successHoSoSync(result.getDescription());
					sleep((long) (config.getTimeSlepp() * 1000));
					logger.info("Gửi thành công : " + (DttCron.thanhCong) + "(hồ sơ) - time: " + config.getTimeSlepp());
					this.tongHoSoFile =this.tongHoSoFile + 1;
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

	private void xuLyDongBoHoSo4210ByFile() throws Exception {
		// check danh sach file co du lieu
		// khong ==> khong call service
		FileInputStream fis = null;
		try {
		List<String> lstAllFile = FileUtility.getAllFileFromFolder(profileEntity.getFolder());
		if (CollectionUtils.isNotEmpty(lstAllFile)) {
			File fileRoot = null;
			for (String item : lstAllFile) {	
				if(item.contains("xlsx") || item.contains("xls")) {
					logger.info("Hệ thống phát hiện file " + item +", vui lòng chuyển cấu hình loại dữ liệu 3360 để gửi.");
					return;
				}
				this.tongHoSoFile = 0;
				try {
					int thanhCong = DttCron.thanhCong;
				
					logger.debug("==================================");
					logger.info("Công cụ bắt đầu đọc file để xử lý : " + item + ", vui lòng đợi ....");
					fileRoot = new File(item);
					DefaultHandlerSAX defaultHandlerSAX = null;
					
					try {
						SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
						SAXParser saxParser = saxParserFactory.newSAXParser();

						defaultHandlerSAX = new DefaultHandlerSAX(fileRoot);
						fis = new FileInputStream(fileRoot);
						saxParser.parse(fis, defaultHandlerSAX);
						
						if (thanhCong == DttCron.thanhCong) {
							errorFile(fis, fileRoot);
						}

					} catch (Exception e) {
						logger.error(e.getMessage());
						//errorFile(fis, fileRoot);
					}
					
					successFile(fis, fileRoot, defaultHandlerSAX !=null?String.valueOf(this.tongHoSoFile):"0");
					
				} catch (Exception e) {
					logger.error(e.getMessage());
					errorFile(fis, fileRoot);

					
				}
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
			if(fis != null) {
				fis.close();
			}
		}
	}
	
	private void errorFile(FileInputStream fis,File fileRoot) {
		logger.info("Công cụ đọc file thấy có lỗi, có thể file không đúng định dạng 4210 theo quy định... ");
		if(fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String folderErors = DrgEnum.BACKUP.getValue() + "\\" + DateUtil.getCurrentDate() + "\\LOI_FILE";
		HoSoXmlUtils.saveFile(fileRoot, folderErors, DateUtil.getCurrentDate(),DrgEnum.LOI.getValue());
		FileSynedEntity entity = new FileSynedEntity(UUID.randomUUID().toString()
				, fileRoot.getName(), "ERROR", "0"
				, DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y_H_M)
				,"Nội dung file không hợp lệ");
		TableFileSynedUtil.insert(entity);
	}
	

	private void successFile(FileInputStream fis,File fileRoot,String count) {
		if(Integer.valueOf(count) > 0) {
			logger.info("Thông báo: Đã xử lý xong hồ sơ file["+ fileRoot.getName()+"], số lượng hồ sơ đã gửi: "+count);
		}
		if(fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileUtility.deleted(fileRoot);
		TableFileSynedUtil.fileMap.put(fileRoot.getName(), count);
		
		FileSynedEntity entity = new FileSynedEntity(UUID.randomUUID().toString()
				, fileRoot.getName(), "OK", count
				, DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y_H_M)
				,"");
		TableFileSynedUtil.insert(entity);
	}
	
	
	private void successHoSoSync(String malk) {
		HoSoSynedUtil.hoSoMap.put(malk, malk);
		HoSoSyncEntity entity = new HoSoSyncEntity(UUID.randomUUID().toString(), malk,
				DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y_H_M), "");
		HoSoSynedUtil.insert(entity);
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
