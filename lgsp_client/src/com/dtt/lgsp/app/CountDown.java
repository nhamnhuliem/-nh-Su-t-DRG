package com.dtt.lgsp.app;

import java.util.TimerTask;
import java.util.prefs.Preferences;

import org.apache.log4j.Logger;

import com.dtt.lgsp.app.config.PreferencesConfiguration;

public class CountDown extends TimerTask {
	static final Logger logger = Logger.getLogger(CountDown.class);
	private static int counter =  0;
	
	@Override
	public void run() {
		try {
			Preferences userPrefs = PreferencesConfiguration.buildConfig(null);
			int secondRun = userPrefs.getInt("lgsp.secondRun", 0);
			if(counter<=0)
			{
				counter = secondRun;
			}
			counter--;
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CountDown.counter = counter;
	}
	
	
}
