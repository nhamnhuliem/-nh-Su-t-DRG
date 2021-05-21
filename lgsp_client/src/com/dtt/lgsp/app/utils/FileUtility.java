package com.dtt.lgsp.app.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.mozilla.universalchardet.UniversalDetector;

import com.dtt.lgsp.app.core.DrgEnum;
import com.dtt.lgsp.dao.TableFileSynedUtil;

public class FileUtility {
	static final Logger logger = Logger.getLogger(FileUtility.class);
	public static boolean deleted(File f) {
		if(f != null && f.isFile()) {
			if(f.delete()) {
				//logger.info("Thông báo:Đồng bộ xong file:"+f.getName());
				return true;
				
			}else {
				logger.info("Thông báo:Có tiến trình đang xử lý file:"+f.getName()+", Sau khi đồng bộ xong không thể xóa được...!");
				
			}
		}
		return false;
	}
	public static byte[] getBytes(InputStream is) {
		try(ByteArrayOutputStream buffer = new ByteArrayOutputStream();) {
			int nRead;
			byte[] data = new byte[16384];

			while ((nRead = is.read(data, 0, data.length)) != -1) {
			  buffer.write(data, 0, nRead);
			}

			return buffer.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	public static String readContentFile(File fileLoad) throws Exception {
		if (!fileLoad.exists()) {
			return null;
		}
		long bytes = Files.size(fileLoad.toPath());
		if (bytes > 5 * 1024 * 1024) {
			throw new Exception("1013 - Kích thước file không được vượt quá "
					+ 5 + " Megabytes: " + fileLoad.getName());
		}
		try {
		String encoding = UniversalDetector.detectCharset(fileLoad);
		if (encoding != null) {
			String fileAsString =new String(FileUtils.readFileToString(fileLoad, encoding));
			return fileAsString;
		} else {
			throw new Exception("Đọc file không đúng encoding : ");
		}
		
			// DUA VE FORMAT CHUNG
		} catch (Exception e) {
			throw new Exception("1003 - Đọc file xảy ra lỗi : " + e.getMessage());
		}
	}
	
	
	public static List<String> getAllFileFromFolder(String folderPath) throws Exception {
		List<String> lstFileUrl = new ArrayList<String>();
		try {
			File dir = new File(folderPath);
			if (!dir.isDirectory()) {
				throw new Exception("1005 - Thư mục chứa file XML không tồn tại");
			}
			String[] extensions = new String[] { "xml", "XML", "xlsx", "xls" };
			List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, false);
			// int iMaxItem = 0;
			for (File file : files) {
//				if (iMaxItem >= CrontabConfiguration.MAX_ITEMS.getValue()) {
//					break;
//				}
				if(TableFileSynedUtil.fileMap.get(file.getName()) == null) {
					lstFileUrl.add(file.getCanonicalPath());
				}else {
					logger.info("ERROR-Thông báo: File:["+file.getName()+"], Đã được đồng bộ trước đây rồi nên không được gửi lại. Hệ thống sẽ tự động xóa đi!");
					
					String folderErors = DrgEnum.BACKUP.getValue() + "\\" + DateUtil.getCurrentDate() + "\\DaGui_KhongGuiLai";
					HoSoXmlUtils.saveFile(file, folderErors, DateUtil.getCurrentDate(),DrgEnum.LOI.getValue());
				}
//				iMaxItem++;
			}
		} catch (Exception e) {
			throw new Exception("1004 - Quét thư mục " + folderPath + " xảy ra lỗi : " + e.getMessage());
		}

		return lstFileUrl;
	}
}
