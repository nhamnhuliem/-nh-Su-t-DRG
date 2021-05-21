package com.dtt.lgsp.app.cron;

import java.awt.TrayIcon.MessageType;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.dtt.lgsp.app.SystemNotification;
import com.dtt.lgsp.app.core.LoaiHoSoEnum;
import com.dtt.lgsp.app.utils.DateUtil;
import com.dtt.lgsp.app.utils.FileUtility;
import com.dtt.lgsp.entities.ProfileEntity;

public class DttCron extends TimerTask {
	private ProfileEntity profileEntity;
	static final Logger logger = Logger.getLogger(DttCron.class);
	public static long duration;
	public static int thanhCong = 0;
	public static int thatBai = 0;
	public static boolean chayScheduleMoi = true;

	public DttCron() {
		// Some stuffs
	}

	@Override
	public void run() {
		try {
			if (profileEntity == null) {
				logger.info("1001 - MISSING CONFIGURATION");
				SystemNotification.displayTray(profileEntity.isDisplayNotification(),
						"1001 - Không tìm thấy thông tin cấu hình", MessageType.ERROR);
				return;
			}
			if (StringUtils.isEmpty(profileEntity.getFolder())) {
				logger.info("1002 - MISSING FOLDER CHOOSE");
				SystemNotification.displayTray(profileEntity.isDisplayNotification(),
						"1002 - Không tìm thấy thông tin thư mục quét file", MessageType.ERROR);
				return;
			}
			logger.debug("================Bắt đầu tiến trình quét thư mục==================");
//			PropertyConfigurator.configure(LoginForm.class.getResource("/resources/log4j.properties"));
			if (profileEntity.getFolder() != null && !profileEntity.getFolder().trim().isEmpty()) {
				// logger.info("Thư mục: "
				// + profileEntity.getFolder());
				try {
					if (chayScheduleMoi) {
						chayScheduleMoi = false;
						
						if(profileEntity.getLoaiHoSo() == Integer.valueOf(LoaiHoSoEnum.QD4210.getValue())) {
							logger.info("Hệ thống bắt đầu xử lý dữ liệu " + LoaiHoSoEnum.QD4210.getKey());
							ThreadProcess process = new ThreadProcess(profileEntity);
							process.start();
							
						}else if(profileEntity.getLoaiHoSo() == Integer.valueOf(LoaiHoSoEnum.QD3360.getValue())) {
							logger.info("Hệ thống bắt đầu xử lý dữ liệu " + LoaiHoSoEnum.QD3360.getKey());
							ThreadProcess3360 process3360 = new ThreadProcess3360(profileEntity);
							process3360.start();
						}
						// hoSo4210Process();
						// chayScheduleMoi =true;
					}
				} catch (Exception e) {
					chayScheduleMoi = true;
					logger.info(e.getMessage());
				}
			}
			List<String> lstAllFile = FileUtility.getAllFileFromFolder(profileEntity.getFolder());
			if (lstAllFile == null || lstAllFile.size() == 0) {
				logger.info(DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y_H_M_S)+":Đã đồng bộ xong tất cả file trong thư mục đồng bộ. Vui lòng copy file cần đồng bộ vào thư mục====");
			}
		} catch (Exception e) {
			logger.error(e);
			logger.info(e.getMessage());
			SystemNotification.displayTray(profileEntity.isDisplayNotification(), e.getMessage(), MessageType.ERROR);
		}
	}

	public long getDuration() {
		return this.scheduledExecutionTime();
	}

	
	
	/***
	 * 
	 * @return Danh sach duong dan file de doc content Chi doc file co duoi xml gioi
	 *         han 100 ban ghi
	 * @throws Exception
	 */
	

	public ProfileEntity getProfileEntity() {
		return profileEntity;
	}

	public void setProfileEntity(ProfileEntity profileEntity) {
		this.profileEntity = profileEntity;
	}

}