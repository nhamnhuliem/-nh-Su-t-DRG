package com.dtt.lgsp.app.cron;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import com.dtt.lgsp.app.utils.FileUtility;
import com.dtt.lgsp.data.handler.FileHandler;
import com.dtt.lgsp.data.handler.ReadExcelData;
import com.dtt.lgsp.data.handler.XMLDataHandler;
import com.dtt.lgsp.entities.ProfileEntity;

public class ImportFileProcess extends Thread {
	static final Logger logger = Logger.getLogger(ImportFileProcess.class);

	protected ProfileEntity profileEntity;
	protected String filePath;
	protected static int tongHoSoFile = 0;

	public ImportFileProcess(ProfileEntity profileEntity, String filePath) {
		this.profileEntity = profileEntity;
		this.filePath = filePath;
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

	private void xuLyDongBoHoSo4210ByFile() throws Exception {
		FileInputStream fis = null;
		try {
			File fileRoot = null;
			tongHoSoFile = 0;
			try {
				int thanhCong = DttCron.thanhCong;
				logger.info("Công cụ bắt đầu đọc file để xử lý : " + filePath + ", vui lòng đợi ....");
				fileRoot = new File(filePath);
				try {
					if(filePath.contains(".XLM") || filePath.contains(".xml")) {
						XMLDataHandler xmlHandler = new XMLDataHandler(profileEntity);
						xmlHandler.xmlDataHandler(filePath);
					}else if(filePath.contains(".xlsx") || filePath.contains(".xls")) {
						ReadExcelData handler = new ReadExcelData(profileEntity);
						handler.readExcel(fileRoot.toString());
					}else {
						JOptionPane.showMessageDialog(null, "File chọn không đúng định dạng", "",
								JOptionPane.ERROR_MESSAGE);
					}
					
					if (thanhCong == DttCron.thanhCong) {
						FileHandler.errorFile(fis, fileRoot);
					}
				} catch (Exception e) {
					logger.error(e.getMessage());
					FileHandler.errorFile(fis, fileRoot);
				}
				FileHandler.successFile(fis, fileRoot, String.valueOf(tongHoSoFile));
			} catch (Exception e) {
				logger.error(e.getMessage());
				FileHandler.errorFile(fis, fileRoot);
			}
		}catch (Exception e) {
			// TODO: handle exception
			if(fis != null) {
				fis.close();
			}
		}
	}
}
