package com.dtt.lgsp.app.config;

import java.util.prefs.Preferences;

import org.apache.commons.lang3.StringUtils;

import com.dtt.lgsp.entities.ProfileEntity;

/***
 * Neu entity khong co --> lay du lieu tu file properties
 * 
 * @author Admin
 *
 */
public class PreferencesConfiguration {
	public static Preferences buildConfig(ProfileEntity entity) {
		Preferences userPrefs = Preferences.userNodeForPackage(PreferencesConfiguration.class);

		// lay du lieu trong file properties
		if (entity != null) {
			userPrefs.put("lgsp.folder", (StringUtils.isNotEmpty(entity.getFolder()) ? entity.getFolder() : ""));
			userPrefs.put("lgsp.urlws", StringUtils.isNotEmpty(entity.getUrlWs()) ? entity.getUrlWs() : "");
			userPrefs.putInt("lgsp.secondrun", entity.getSecondRun());
			userPrefs.putBoolean("lgsp.displaynotification", entity.isDisplayNotification());
			userPrefs.put("lgsp.macoso", (StringUtils.isNotEmpty(entity.getMaCoSo()) ? entity.getMaCoSo() : ""));
			userPrefs.put("lgsp.activecode",
					(StringUtils.isNotEmpty(entity.getActivecode()) ? entity.getActivecode() : ""));
			userPrefs.putBoolean("lgsp.isactive", entity.isActive());
			userPrefs.putDouble("lgsp.timesleep", entity.getTimeSlepp());
			userPrefs.put("lgsp.primaryactivecode", StringUtils.isNotEmpty(entity.getPrimaryActivecode()) ? entity.getPrimaryActivecode() : "");
			userPrefs.put("lgsp.version", StringUtils.isNotEmpty(entity.getVersion()) ? entity.getVersion() : "");
			userPrefs.putInt("lgsp.loaihoso", entity.getLoaiHoSo());

		}
		userPrefs.put("lgsp.clientversion", "3.3.0");

		return userPrefs;
	}

	public static ProfileEntity getConfig() {
		Preferences userPrefs = Preferences.userNodeForPackage(PreferencesConfiguration.class);
		ProfileEntity entity = new ProfileEntity(userPrefs.get("lgsp.folder", ""), userPrefs.get("lgsp.urlws", ""),
				userPrefs.getInt("lgsp.secondrun", 60), userPrefs.getBoolean("lgsp.displaynotification", true),
				userPrefs.get("lgsp.macoso", ""), userPrefs.get("lgsp.activecode", ""), 
				userPrefs.getBoolean("lgsp.isactive", false), 
				userPrefs.getDouble("lgsp.timesleep", 0), userPrefs.get("lgsp.primaryactivecode", ""), 
				userPrefs.get("lgsp.version", ""), userPrefs.get("lgsp.clientversion", "3.3.0"),
				userPrefs.getInt("lgsp.loaihoso", 1)
				);
		return entity;
	}

	public static Preferences updateMaCoSoConfig(String maCoSo) {
		Preferences userPrefs = Preferences.userNodeForPackage(PreferencesConfiguration.class);
		try {
//			String[] keys = userPrefs.keys();
//			if (keys == null || keys.length == 0) {
			// lay du lieu trong file properties
			if (StringUtils.isNotEmpty(maCoSo)) {
				userPrefs.put("lgsp.macoso", maCoSo);
			}
//			} else {
			return userPrefs;
//			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return userPrefs;
	}

//	public static void cleanPreferences() {
//		Preferences userPrefs = Preferences.userNodeForPackage(PreferencesConfiguration.class);
//		try {
//			userPrefs.removeNode();
//		} catch (BackingStoreException ex) {
//			System.err.println(ex);
//		}
//	}
}