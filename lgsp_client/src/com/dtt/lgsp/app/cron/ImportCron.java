package com.dtt.lgsp.app.cron;

import java.util.TimerTask;
import java.util.prefs.Preferences;

import org.apache.log4j.Logger;

import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.entities.ProfileEntity;

public class ImportCron extends TimerTask {
	static final Logger logger = Logger.getLogger(ImportCron.class);
	public ImportCron() {}
	
	@Override
	public void run() {
		try {
			ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
			ImportFileProcess thread = new ImportFileProcess(profileEntity);
			thread.run();
		} catch (Exception e) {
			logger.error(e);
		}
	}

}
