package com.dtt.lgsp.app.cron;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.config.PropertieConfiguration;
import com.dtt.lgsp.app.core.DrgEnum;
import com.dtt.lgsp.app.keys.ResponseKeys;
import com.dtt.lgsp.app.utils.DateUtil;
import com.dtt.lgsp.app.utils.FileUtility;
import com.dtt.lgsp.app.utils.GzipUtil;
import com.dtt.lgsp.app.utils.HoSoXmlUtils;
import com.dtt.lgsp.app.utils.XML4210Parser;
import com.dtt.lgsp.dao.HoSoSynedUtil;
import com.dtt.lgsp.dao.TableFileSynedUtil;
import com.dtt.lgsp.data.handler.FileHandler;
import com.dtt.lgsp.data.handler.XMLDataHandler;
import com.dtt.lgsp.entities.FileSynedEntity;
import com.dtt.lgsp.entities.HoSoSyncEntity;
import com.dtt.lgsp.entities.ProfileEntity;
import com.dtt.lgsp.entities.Result;

public class ThreadProcess extends Thread {
	static final Logger logger = Logger.getLogger(ThreadProcess.class);

	private ProfileEntity profileEntity;
	protected int tongHoSoFile = 0;

	public ThreadProcess(ProfileEntity profileEntity) {
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
		try {
			List<String> lstAllFile = FileUtility.getAllFileFromFolder(profileEntity.getFolder());
			if (CollectionUtils.isNotEmpty(lstAllFile)) {
				for (String item : lstAllFile) {	
					this.tongHoSoFile = 0;
					XMLDataHandler xmlHandler = new XMLDataHandler(profileEntity);
					xmlHandler.xmlDataHandler(item);
				}
			}
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

}
