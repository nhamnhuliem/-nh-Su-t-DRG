package com.dtt.lgsp.app.cron;

import java.util.List;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.dtt.lgsp.app.SettingViewer;
import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.entities.DataConfig;
import com.dtt.lgsp.entities.ProfileEntity;

public class GetServerConfig extends TimerTask{
	
	static final Logger logger = Logger.getLogger(GetServerConfig.class);
	public GetServerConfig() {
		
	}

	@Override
	public void run() {
		// 3.1.0 commit
		ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
		
		// get time config
		String time = DttConsumer.getTimeConfig(profileEntity.getMaCoSo());
		profileEntity.setTimeSlepp(Double.valueOf(time));
		
		List<DataConfig> listConfig = DttConsumer.getDataConfig("");
		if(listConfig !=null &&listConfig.size() > 0) {
			
			for(DataConfig config : listConfig) {
				if("VERSION".equals(config.getMa())) {
					profileEntity.setVersion(config.getValue());
				}
			}
		}
		
		PreferencesConfiguration.buildConfig(profileEntity);
		
	}

}
