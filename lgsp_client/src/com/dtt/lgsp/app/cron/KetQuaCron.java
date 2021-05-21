package com.dtt.lgsp.app.cron;

import java.util.TimerTask;

import org.apache.log4j.Logger;

import com.dtt.lgsp.entities.ProfileEntity;

public class KetQuaCron extends TimerTask {
	private ProfileEntity profileEntity;

	static final Logger logger = Logger.getLogger(KetQuaCron.class);
	public static long duration;

	public KetQuaCron() {
		// Some stuffs
	}

	@Override
	public void run() {
		/*
		 * try { if (profileEntity == null) {
		 * logger.info("1001 - MISSING CONFIGURATION");
		 * SystemNotification.displayTray(true,
		 * "1001 - Không tìm thấy thông tin cấu hình", MessageType.ERROR); return; }
		 * logger.
		 * info("================Bắt đầu tiến trình lấy thông tin xử lý hồ sơ=================="
		 * );
		 * 
		 * try { thucHienLayKetQua(); } catch (Exception e) {
		 * logger.info(e.getMessage()); }
		 * 
		 * logger.
		 * info("================Kết thúc tiến trình lấy thông tin xử lý hồ sơ=================="
		 * ); } catch (Exception e) { logger.error(e); logger.info(e.getMessage());
		 * SystemNotification.displayTray(profileEntity.isDisplayNotification(),
		 * e.getMessage(), MessageType.ERROR); }
		 */
	}

	/***
	 * Lay danh sach ket qua cua ho so da dong bo len he thong luu file ket qua neu
	 * co update tinh dang dong bo
	 * 
	 * @throws Exception
	 */
	

	public ProfileEntity getProfileEntity() {
		return profileEntity;
	}

	public void setProfileEntity(ProfileEntity profileEntity) {
		this.profileEntity = profileEntity;
	}
}
