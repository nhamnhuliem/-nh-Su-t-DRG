package com.dtt.lgsp.app;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

import org.apache.log4j.Logger;

public class SystemNotification {
	static final Logger  logger = Logger.getLogger(SystemNotification.class);
	public static void displayTray(boolean displayNotification, String notification, MessageType messageType) {
		try {
			if (!SystemTray.isSupported()) {
				logger.error("SystemTray not supported!!!!!");
		        return;
		    }
			if (!displayNotification) {
				return;
			}
			// Obtain only one instance of the SystemTray object
			SystemTray tray = SystemTray.getSystemTray();

			// If the icon is a file
			Image image = Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/tray.png"));
			// Alternative (if the icon is on the classpath):
			// Image image =
			// Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

			TrayIcon trayIcon = new TrayIcon(image, "Thông báo hệ thống BYT_TTDL_4210 Client");
			// Let the system resize the image if needed
			trayIcon.setImageAutoSize(true);
			// Set tooltip text for the tray icon
			trayIcon.setToolTip("Thông báo hệ thống BYT_TTDL_4210 Client");
			tray.add(trayIcon);

			trayIcon.displayMessage("Thông báo hệ thống", notification, messageType);
			Thread.sleep(3000);
			tray.remove(trayIcon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
