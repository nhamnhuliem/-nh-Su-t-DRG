package com.dtt.lgsp.data.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;
import org.apache.log4j.Logger;
import com.dtt.lgsp.app.core.DrgEnum;
import com.dtt.lgsp.app.utils.DateUtil;
import com.dtt.lgsp.app.utils.FileUtility;
import com.dtt.lgsp.app.utils.HoSoXmlUtils;
import com.dtt.lgsp.dao.HoSoSynedUtil;
import com.dtt.lgsp.dao.TableFileSynedUtil;
import com.dtt.lgsp.entities.FileSynedEntity;
import com.dtt.lgsp.entities.HoSoSyncEntity;

public class FileHandler {
	static final Logger logger = Logger.getLogger(FileHandler.class);
	
	public static void errorFile(FileInputStream fis,File fileRoot) {
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
	

	public static void successFile(FileInputStream fis,File fileRoot,String count) {
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
	
	
	public static void successHoSoSync(String malk) {
		HoSoSynedUtil.hoSoMap.put(malk, malk);
		HoSoSyncEntity entity = new HoSoSyncEntity(UUID.randomUUID().toString(), malk,
				DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y_H_M), "");
		HoSoSynedUtil.insert(entity);
	}
}
