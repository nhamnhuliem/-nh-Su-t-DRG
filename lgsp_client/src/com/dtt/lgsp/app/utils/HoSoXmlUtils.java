package com.dtt.lgsp.app.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.mozilla.universalchardet.UniversalDetector;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;

import com.dtt.lgsp.app.config.CrontabConfiguration;
import com.dtt.lgsp.entities.GIAMDINHHS;
import com.dtt.lgsp.entities.GIAMDINHHS.THONGTINHOSO;
import com.dtt.lgsp.entities.GIAMDINHHS.THONGTINHOSO.DANHSACHHOSO;
import com.dtt.lgsp.entities.GIAMDINHHS.THONGTINHOSO.DANHSACHHOSO.HOSO;
import com.dtt.lgsp.entities.GIAMDINHHS.THONGTINHOSO.DANHSACHHOSO.HOSO.FILEHOSO;

public class HoSoXmlUtils {
	static final Logger logger = Logger.getLogger(HoSoXmlUtils.class);

	public static String readContentFile(File fileLoad) throws Exception {
		if (!fileLoad.exists()) {
			return null;
		}
		logger.info("Bat dau doc...");
		long bytes = Files.size(fileLoad.toPath());
		if (bytes > CrontabConfiguration.MAX_LENGTH.getValue() * 1024 * 1024) {
			throw new Exception("1013 - Kích thước file không được vượt quá "
					+ CrontabConfiguration.MAX_LENGTH.getValue() + " Megabytes: " + fileLoad.getName());
		}
		try {
		String encoding = UniversalDetector.detectCharset(fileLoad);
		if (encoding != null) {
			String fileAsString =new String(FileUtils.readFileToString(fileLoad, encoding));
			fileAsString = fileAsString.replaceAll("BaoHiemYTe", "TONG_HOP");
			fileAsString = XSDUtil.replaceXmlCharacters(fileAsString, "&");
			return fileAsString;
		} else {
			throw new Exception("Đọc file không đúng encoding : ");
		}
		
			// DUA VE FORMAT CHUNG
		} catch (Exception e) {
			logger.error(e);
			throw new Exception("1003 - Đọc file xảy ra lỗi : " + e.getMessage());
		}
	}

	public static List<String> getXmlSyns(String content) throws Exception {
		List<String> lstHoSoSyns = new ArrayList<String>();
		try {
			// Convert to object
			GIAMDINHHS objectGIAMDINHHSRoot = (GIAMDINHHS) XSDUtil.parseToObject(content, GIAMDINHHS.class);
			if (objectGIAMDINHHSRoot != null && objectGIAMDINHHSRoot.getTHONGTINHOSO() != null
					&& objectGIAMDINHHSRoot.getTHONGTINHOSO().getDANHSACHHOSO() != null
					&& CollectionUtils.isNotEmpty(objectGIAMDINHHSRoot.getTHONGTINHOSO().getDANHSACHHOSO().getHOSO())) {
				// TRUONG HOP KHONG CAST DUOC NOI DUNG
				// mau khac voi mau goc
				FILEHOSO fileHoSo = objectGIAMDINHHSRoot.getTHONGTINHOSO().getDANHSACHHOSO().getHOSO().get(0)
						.getFILEHOSO().get(0);
				if (fileHoSo != null) {
					String noiDung = fileHoSo.getNOIDUNGFILE();
					if (StringUtils.isNotEmpty(noiDung)) {
						noiDung = noiDung.replaceAll("(\r\n|\r|\n|\n\r)", "").trim();
						if (StringUtils.isEmpty(noiDung)) {
							// hash
							content = convertXML2Object(content);
							objectGIAMDINHHSRoot = (GIAMDINHHS) XSDUtil.parseToObject(content, GIAMDINHHS.class);
						}
					}
				}

				for (HOSO hoSo : objectGIAMDINHHSRoot.getTHONGTINHOSO().getDANHSACHHOSO().getHOSO()) {
					if (CollectionUtils.isEmpty(hoSo.getFILEHOSO())) {
						continue;
					}

//					FILEHOSO fileHoSo = hoSo.getFILEHOSO().get(0);
//					if(fileHoSo!= null) {
//						String noiDung = fileHoSo.getNOIDUNGFILE();
//						if(StringUtils.isNotEmpty(noiDung)) {
//							noiDung = noiDung.replaceAll("(\r\n|\r|\n|\n\r)", "").trim();
//							if(StringUtils.isEmpty(noiDung)) {
//								// hash
//								content = convertXML2Object(content);
//								objectGIAMDINHHSRoot = (GIAMDINHHS) XSDUtil.parseToObject(content, GIAMDINHHS.class);
//							}
//						}
//					}
					// truong hop base64 noi dung file
//					if (hoSo.getFILEHOSO().get(0).getLOAIHOSO().equalsIgnoreCase("XML1")
//							&& hoSo.getFILEHOSO().get(0).getNOIDUNGFILE() != null) {
//						TONGHOP tongHop = hoSo.getFILEHOSO().get(0).getNOIDUNGFILE().getTONGHOP();
//						if (tongHop == null) {
					// khong cast duoc
					// build lai
//							content = castXmlTXsd(content);

					// write the content into xml file
//							TransformerFactory tf = TransformerFactory.newInstance();
//							Transformer transformer = tf.newTransformer();
//							transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
//							StringWriter writer = new StringWriter();
//							transformer.transform(new DOMSource(doc), new StreamResult(writer));
//							content = writer.getBuffer().toString();
//							objectGIAMDINHHSRoot = (GIAMDINHHS) XSDUtil.parseToObject(content, GIAMDINHHS.class);
//						}
//					}
					// TRUONG HOP HASH THONG TIN HO SO
					List<HOSO> lstHOSONew = new ArrayList<HOSO>();
					lstHOSONew.add(hoSo);
					DANHSACHHOSO dsHoSoNew = new DANHSACHHOSO();
					dsHoSoNew.hoso = lstHOSONew;
					THONGTINHOSO thongTinHoSoNew = new THONGTINHOSO();
					thongTinHoSoNew.setDANHSACHHOSO(dsHoSoNew);
					thongTinHoSoNew.setNGAYLAP(objectGIAMDINHHSRoot.getTHONGTINHOSO().getNGAYLAP());
					thongTinHoSoNew.setSOLUONGHOSO((short) 1);
					GIAMDINHHS objectGIAMDINHHSNew = new GIAMDINHHS();
					objectGIAMDINHHSNew.setTHONGTINDONVI(objectGIAMDINHHSRoot.getTHONGTINDONVI());
					objectGIAMDINHHSNew.setTHONGTINHOSO(thongTinHoSoNew);
//					String strContent = hoSo.getFILEHOSO().get(0).getNOIDUNGFILE().getTONGHOP().replaceAll("(\r\n|\r|\n|\n\r)", "").trim();
//					if (StringUtils.isEmpty(strContent)) {
//						continue;
//					}
//						logger.debug("Content is hashed base64");
					String newContent = XSDUtil.parseToString(objectGIAMDINHHSNew, GIAMDINHHS.class);
					logger.debug("objectGIAMDINHHSNew convert to new XSD is : " + newContent);
					lstHoSoSyns.add(newContent);
				}
			}else {
				HOSO objectHOSO = (HOSO) XSDUtil.parseToObject(content, HOSO.class);
				if(objectHOSO==null) throw new NullPointerException("Sai định dạng nội dung file xml");
				// khong theo bieu mau
				GIAMDINHHS objectGIAMDINHHSNew = new GIAMDINHHS();
				objectGIAMDINHHSNew.setCHUKYDONVI(null);
				objectGIAMDINHHSNew.setTHONGTINDONVI(null);
				THONGTINHOSO thongTinHoSo = new THONGTINHOSO();
				thongTinHoSo.setSOLUONGHOSO((short) 1);
				thongTinHoSo.setNGAYLAP(Long.valueOf(DateUtil.getCurrentDate()));
				
				DANHSACHHOSO dsHoSo = new DANHSACHHOSO();
				
				List<FILEHOSO> lstFILEHOSO = new ArrayList<FILEHOSO>();
				FILEHOSO fileHoSo = new FILEHOSO();
				fileHoSo.setLOAIHOSO("XML1");
				fileHoSo.setNOIDUNGFILE(Base64Utils.encode(content));
				lstFILEHOSO.add(fileHoSo);
				
				List<HOSO> lstHoSo = new ArrayList<HOSO>();
				HOSO hoSo = new HOSO();
				hoSo.filehoso = lstFILEHOSO;
				lstHoSo.add(hoSo);
				dsHoSo.hoso = lstHoSo;
				
				thongTinHoSo.setDANHSACHHOSO(dsHoSo);
				objectGIAMDINHHSNew.setTHONGTINHOSO(thongTinHoSo);
				String newContent = XSDUtil.parseToString(objectGIAMDINHHSNew, GIAMDINHHS.class);
				lstHoSoSyns.add(newContent);
			}
		} catch (Exception e) {
			logger.error(e);
			throw e;
		}
		return lstHoSoSyns;
	}
	
	
	public static String saveFileHoSo(File fileRoot,String folder, String content, String maLk){
		String duongDanBackup = "";
		try {
			duongDanBackup = fileRoot.getParent();
			if(StringUtils.isNotEmpty(folder)) {
				duongDanBackup+= "\\" + folder;
			}
			
			File dir = new File(duongDanBackup);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			
			
		} catch (Exception e) {
			logger.error(e);
			
		}
		return duongDanBackup;
	}

	/***
	 * 
	 * @param fileRoot
	 * @param parentFolderHSVV
	 * @param folder           DrgEnum
	 * @param dateFolder
	 * @param statusFilename   : success : "" | fail: thatbai
	 * @throws Exception
	 */
	public static String saveFile(File fileRoot, String folder, String dateFolder, String statusFilename)
			{
		String duongDanBackup = "";
		try {
			duongDanBackup = fileRoot.getParent();
			if(StringUtils.isNotEmpty(folder)) {
				duongDanBackup+= "\\" + folder;
			}
			
			File dir = new File(duongDanBackup);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			Path from = fileRoot.toPath(); // convert from File to Path
			String tenFile = fileRoot.getName();
			String extension = FilenameUtils.getExtension(tenFile);
			tenFile = FilenameUtils.getBaseName(tenFile);
			duongDanBackup += "\\" +  tenFile + "_" + statusFilename + "." + extension ;

			Path to = Paths.get(duongDanBackup); // convert from String to Path
			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
			FileUtility.deleted(fileRoot);
			

			//logger.debug("Lưu File thành công : " + fileRoot.getName());
		} catch (Exception e) {
			logger.error(e);
			
		}
		return duongDanBackup;
	}
	public static String saveFile(String content, String folder, String dateFolder, String statusFilename)
			{
		String duongDanBackup = folder;
		try {
			
			File dir = new File(duongDanBackup);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			String tenFile = System.currentTimeMillis()+"";
			String extension = "xml";
			duongDanBackup += "\\" +  tenFile + "_" + statusFilename + "." + extension ;
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(duongDanBackup));
		    writer.write(content);
		    writer.close();
			//logger.info("Lưu File thành công : ");
		} catch (Exception e) {
			logger.error(e);
			
		}
		return duongDanBackup;
	}

	private static String convertXML2Object(String xmlString) {
		// Parser that produces DOM object trees from XML content
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// API to obtain DOM Document instance
		DocumentBuilder builder = null;
		try {
			// Create DocumentBuilder with default configuration
			builder = factory.newDocumentBuilder();

			// Parse the content to Document object
			// Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
			Document doc = builder.parse(new InputSource(new ByteArrayInputStream(xmlString.getBytes("UTF-8"))));
			doc.getDocumentElement().normalize();
//			System.out.println("ROOT element: " + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("FILEHOSO");

			for (int i = 0; i < nList.getLength(); i++) {
				Node node = nList.item(i);

//				System.out.println("\nCurrent Element: " + node.getNodeName());

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element elm = (Element) node;
//					System.out.println("elm.getTextContent(): " + elm.getTextContent());
					Node nodeLoai = elm.getElementsByTagName("LOAIHOSO").item(0);
					String strLoai = nodeLoai.getTextContent();

					Node nodeNoiDung = elm.getElementsByTagName("NOIDUNGFILE").item(0);
					if (nodeNoiDung != null) {
						String hashed = innerXml(nodeNoiDung).replaceAll("\\<\\?xml(.+?)\\?\\>", "").trim();
						hashed = Base64Utils.encode(hashed);
//						hashed = hashed.replaceAll("\\<\\?xml(.+?)\\?\\>", "").trim();
//						System.out.println("String Hashed: " + hashed);
						nodeNoiDung.setTextContent(hashed);
					}
				}
			}

			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			StringWriter writer = new StringWriter();
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			return writer.getBuffer().toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String innerXml(Node node) {
		DOMImplementationLS lsImpl = (DOMImplementationLS) node.getOwnerDocument().getImplementation().getFeature("LS",
				"3.0");
		LSSerializer lsSerializer = lsImpl.createLSSerializer();
		NodeList childNodes = node.getChildNodes();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < childNodes.getLength(); i++) {
			sb.append(lsSerializer.writeToString(childNodes.item(i)));
		}
		return sb.toString();
	}
}
