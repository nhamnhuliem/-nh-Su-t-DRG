package com.dtt.lgsp.app.core;

import java.awt.TrayIcon.MessageType;
import java.util.Timer;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.apache.commons.lang3.StringUtils;

import com.dtt.lgsp.app.SystemNotification;
import com.dtt.lgsp.entities.ProfileEntity;

public class Validations extends JFrame {
	JFileChooser chooser;
	String choosertitle;
	
	private JPanel contentPane;
	private JTextField txturlWs;
	JLabel lblPathHSVV;
	JLabel lblPathHSQT;
	JCheckBox cbQuyetToan;
	JCheckBox cbVaoVien;
	boolean useFolderHSVV;
	boolean useFolderHSQT;
	private JTextField txtSecondRun;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private static Timer timer;
	ProfileEntity profileEntity = null;
	public void createUI() {
	}

	/**
	 * Create the frame.
	 */
	public Validations() {
	}

	public static boolean checkConfig(String username, String password, int secondRun, String urlWs, String folder,
			boolean useFolder) {
		boolean bResult = false;
		try {
			if (StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password) && secondRun > 0
					&& StringUtils.isNotEmpty(urlWs)
					&& StringUtils.isNotEmpty(folder)) {
				return true;
			}

//			if (!bResult) {
//				SystemNotification.displayTray(true,"1000 - Chưa thiết lập chính xác thông tin cấu hình kết nối với hệ thống đồng bộ LGSP", MessageType.WARNING);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bResult;
	}
}