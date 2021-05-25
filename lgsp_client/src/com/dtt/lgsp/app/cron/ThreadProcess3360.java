package com.dtt.lgsp.app.cron;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.core.DrgEnum;
import com.dtt.lgsp.app.keys.ResponseKeys;
import com.dtt.lgsp.app.utils.DateUtil;
import com.dtt.lgsp.app.utils.FileUtility;
import com.dtt.lgsp.app.utils.HoSoXmlUtils;
import com.dtt.lgsp.dao.HoSoSynedUtil;
import com.dtt.lgsp.dao.TableFileSynedUtil;
import com.dtt.lgsp.data.handler.CellKey;
import com.dtt.lgsp.data.handler.FileHandler;
import com.dtt.lgsp.data.handler.ReadExcelData;
import com.dtt.lgsp.entities.FileSynedEntity;
import com.dtt.lgsp.entities.HoSoSyncEntity;
import com.dtt.lgsp.entities.ProfileEntity;
import com.dtt.lgsp.entities.Result;
import com.dtt.lgsp.model.TongHop;
import com.google.gson.Gson;

public class ThreadProcess3360 extends Thread {
	static final Logger logger = Logger.getLogger(ThreadProcess3360.class);

	protected ProfileEntity profileEntity;
	protected static int tongHoSoFile = 0;

	public ThreadProcess3360(ProfileEntity profileEntity) {
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

	private void xuLyDongBoHoSo4210ByFile() throws Exception {
		FileInputStream fis = null;
		try {
		List<String> lstAllFile = FileUtility.getAllFileFromFolder(profileEntity.getFolder());
		if (CollectionUtils.isNotEmpty(lstAllFile)) {
			File fileRoot = null;
			for (String item : lstAllFile) {		
				if(item.contains("xml") || item.contains("XML")) {
					logger.info("Hệ thống phát hiện file " + item +" xml, vui lòng chuyển cấu hình loại dữ liệu 4210 để gửi.");
					return;
				}
				tongHoSoFile = 0;
				try {
					int thanhCong = DttCron.thanhCong;
					logger.info("Công cụ bắt đầu đọc file để xử lý : " + item + ", vui lòng đợi ....");
					fileRoot = new File(item);
					try {
						
						ReadExcelData handler = new ReadExcelData(profileEntity);
						handler.readExcel(fileRoot.toString());
						
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
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
			if(fis != null) {
				fis.close();
			}
		}
	}
	
}
