package com.dtt.lgsp.app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Timer;
import java.util.prefs.Preferences;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import com.dtt.lgsp.app.config.MyCustomAppender;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.cron.DttCron;
import com.dtt.lgsp.app.cron.GetServerConfig;
import com.dtt.lgsp.dao.ConnectionUtilities;
import com.dtt.lgsp.dao.HoSoSynedUtil;
import com.dtt.lgsp.dao.TableFileSynedUtil;
import com.dtt.lgsp.entities.ProfileEntity;

public class Home extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final Logger logger = Logger.getLogger(Home.class);
	private JPanel contentPane;
	private static Timer timer;
	ProfileEntity profileEntity = null;
	SettingViewer settingViewer;
	ProcessingViewer processingViewer;
	LogViewer logViewer;
	RegisterViewer registerViewer;
	ActiveViewer activeViewer;
	DoiSoatViewer doiSoatViewer;
	SyncViewer syncViewer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		buildLogConfig();
//		PropertyConfigurator.configure(LoginForm.class.getResource("/resources/log4j.properties"));

		if (logger.isDebugEnabled()) {
			logger.info("LGSP Client STARTED");
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new SystemTrayLgsp().doRun();

					Home frame = new Home();
					 frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
					if (lockInstance("file.lgsp.lock")) {
						frame.setVisible(true);
						frame.setResizable(false);
					} else {
						JOptionPane.showMessageDialog(frame, "Hệ thống đang hoạt động...");
					}

					/* Some piece of code */
					frame.addWindowListener(new java.awt.event.WindowAdapter() {
						@Override
						public void windowClosing(java.awt.event.WindowEvent windowEvent) {
							if (JOptionPane.showConfirmDialog(frame, "Bạn chắc chắn thoát BYT_TTDL_4210 Client?",
									"Đóng ứng dụng?", JOptionPane.YES_NO_OPTION,
									JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
								frame.dispose();
								//new SystemTrayLgsp().makeUI();
								System.exit(0);
							} else {
							}

						}
						
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void createUI() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					// run visible
					// call cron
					DttCron dttCron = new DttCron();
					profileEntity = PreferencesConfiguration.getConfig();
					timer = new Timer();
					dttCron.setProfileEntity(profileEntity);
					// This task is scheduled to run every 10 seconds
					if (profileEntity.getFolder() != null && !profileEntity.getFolder().trim().isEmpty()
							&& profileEntity.getActivecode() != null && !profileEntity.getActivecode().trim().isEmpty()
							&& profileEntity.getSecondRun() > 0) {
						timer.scheduleAtFixedRate(dttCron, 0, Integer.valueOf(profileEntity.getSecondRun() * 1000));
						
						
					}
					
					GetServerConfig serverConfig = new GetServerConfig();
					timer.scheduleAtFixedRate(serverConfig, 0, 1000 * 60 * 5);
				} catch (Exception e) {
					e.printStackTrace();
					SystemNotification.displayTray(profileEntity.isDisplayNotification(), "9999 - " + e.getMessage(),
							MessageType.ERROR);
//					JOptionPane.showMessageDialog(null, "Lỗi hệ thống", "Hệ thống DRG",
//							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		createUI();

		Preferences userPrefs = PreferencesConfiguration.buildConfig(null);
		String activecode = userPrefs.get("lgsp.activecode", null);
		boolean isActive = userPrefs.getBoolean("lgsp.isactive", false);

		setTitle("HỆ THỐNG THU THẬP DỮ LIỆU THEO QUYẾT ĐỊNH 4210/QĐ-BYT");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/tray.png")));
		setBackground(Color.WHITE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel menu = new JPanel();
		menu.setForeground(Color.WHITE);
		menu.setBorder(new MatteBorder(1, 1, 1, 5, (Color) Color.WHITE));
		menu.setBounds(0, 0, 200, 570);
		menu.setOpaque(false);
		menu.setLayout(null);
		menu.setVisible(isActive);
		contentPane.add(menu);

		settingViewer = new SettingViewer();
		settingViewer.setLocation(200, 50);
		settingViewer.createUI();
		settingViewer.setBounds(210, 10, 770, 570);
		settingViewer.setVisible(false);
		contentPane.add(settingViewer);
		
		syncViewer = new SyncViewer(menu, settingViewer);
		syncViewer.setSize(770, 570);
		syncViewer.setLocation(210, 10);
		syncViewer.setVisible(isActive);
		if(isActive) {
			syncViewer.showProgressBarDemo();
		}
		contentPane.add(syncViewer);
		
		activeViewer = new ActiveViewer(menu, settingViewer, syncViewer);
		activeViewer.setSize(770, 570);
		activeViewer.createUI();
		activeViewer.setLocation(210, 10);
		activeViewer.setVisible(activecode == null || activecode.isEmpty() || isActive ? false : true);
		contentPane.add(activeViewer);

		registerViewer = new RegisterViewer(menu, activeViewer);
		registerViewer.setSize(770, 570);
		registerViewer.setLocation(210, 10);
		// registerViewer.setOpaque(false);
		registerViewer.setVisible(activecode == null || activecode.isEmpty() ? true : false);
		contentPane.add(registerViewer);

		processingViewer = new ProcessingViewer();
		processingViewer.setSize(770, 570);
		processingViewer.setLocation(210, 10);
		processingViewer.setVisible(false);
		contentPane.add(processingViewer);

		logViewer = new LogViewer();
		logViewer.setSize(770, 570);
		logViewer.setLocation(210, 10);
		logViewer.setVisible(false);
		contentPane.add(logViewer);
		
		doiSoatViewer = new DoiSoatViewer();
		doiSoatViewer.setSize(770, 570);
		doiSoatViewer.setLocation(210, 10);
		doiSoatViewer.setVisible(false);
		contentPane.add(doiSoatViewer);

		JLabel lblNewLabel = new JLabel("BYT_TTDL_4210 CLIENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(10, 11, 180, 30);
		lblNewLabel.setForeground(new Color(178, 34, 34));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		menu.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(36, 49, 139, 2);
		menu.add(separator);

		JButton btnNewButton = new JButton("GỬI HỒ SƠ");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(Home.class.getResource("/images/setting.png")));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPanel();
//				settingViewer.createUI();
//				settingViewer.setOpaque(false);
//				settingViewer.setBounds(210, 10, 770 , 550);
				settingViewer.setVisible(true);

			}
		});
		btnNewButton.setBounds(0, 180, 195, 40);
		menu.add(btnNewButton);

		JButton btnThngTinng = new JButton("KẾT QUẢ GỬI HỒ SƠ");
		btnThngTinng.setHorizontalAlignment(SwingConstants.LEFT);
		btnThngTinng.setIcon(new ImageIcon(Home.class.getResource("/images/history.png")));
		btnThngTinng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPanel();
				logViewer.createUI();
				logViewer.setOpaque(false);
				logViewer.setBounds(210, 10, 770, 550);
				logViewer.validate();
				logViewer.repaint();
				logViewer.setVisible(true);
			}
		});
		btnThngTinng.setForeground(Color.BLACK);
		btnThngTinng.setBackground(Color.WHITE);
		btnThngTinng.setBounds(0, 301, 195, 40);
		menu.add(btnThngTinng);

		JButton btnThot = new JButton("THOÁT");
		btnThot.setHorizontalAlignment(SwingConstants.LEFT);
		btnThot.setIcon(new ImageIcon(Home.class.getResource("/images/emergency-exit.png")));
		btnThot.setSelectedIcon(null);
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Important: remove the icon from the tray to dispose it
				System.exit(0);
			}
		});
		btnThot.setForeground(Color.BLACK);
		btnThot.setBackground(Color.WHITE);
		btnThot.setBounds(0, 421, 195, 40);
		menu.add(btnThot);

		JButton btnTheoDiX = new JButton("THEO DÕI GỬI HỒ SƠ");
		btnTheoDiX.setHorizontalAlignment(SwingConstants.LEFT);
		btnTheoDiX.setIcon(new ImageIcon(Home.class.getResource("/images/monitoring.png")));
		btnTheoDiX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPanel();
				processingViewer.createUI();
				processingViewer.setOpaque(false);
				processingViewer.setBounds(210, 10, 770, 550);
				processingViewer.setVisible(true);
			}
		});
		btnTheoDiX.setForeground(Color.BLACK);
		btnTheoDiX.setBackground(Color.WHITE);
		btnTheoDiX.setBounds(0, 241, 195, 40);
		menu.add(btnTheoDiX);

		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(new Color(178, 34, 34));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 10));
		lblNewLabel_2.setBounds(10, 60, 180, 47);
		lblNewLabel_2.setText(
				"<html><div style='text-align:center'>THU THẬP DỮ LIỆU THEO QUYẾT ĐỊNH 4210/QĐ-BYT<div></html>");
		menu.add(lblNewLabel_2);
		
		JButton btnDoiSoat = new JButton("ĐỐI SOÁT");
		btnDoiSoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetPanel();
				doiSoatViewer.createUI();
				doiSoatViewer.setOpaque(false);
				doiSoatViewer.setBounds(210, 10, 770, 550);
				doiSoatViewer.validate();
				doiSoatViewer.repaint();
				doiSoatViewer.setVisible(true);
			}
		});
		btnDoiSoat.setIcon(new ImageIcon(Home.class.getResource("/images/doisoat.png")));
		btnDoiSoat.setHorizontalAlignment(SwingConstants.LEFT);
		btnDoiSoat.setForeground(Color.BLACK);
		btnDoiSoat.setBackground(Color.WHITE);
		btnDoiSoat.setBounds(0, 359, 195, 40);
		menu.add(btnDoiSoat);

		// JLabel lblNewLabel_1 = new JLabel("Phiên bản: 1.0.0");
		// lblNewLabel_1.setFont(new Font("Segoe UI", Font.ITALIC, 10));
		// lblNewLabel_1.setForeground(new Color(0, 0, 0));
		// lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		// lblNewLabel_1.setBounds(60, 545, 130, 14);
		// menu.add(lblNewLabel_1);

		// change background
		try {
			JLabel lblBackgroundImg = new JLabel("");
			lblBackgroundImg.setBackground(Color.PINK);
			lblBackgroundImg.setForeground(Color.DARK_GRAY);
			lblBackgroundImg.setBounds(0, 0, 1000, 600);
			contentPane.add(lblBackgroundImg);
			lblBackgroundImg.setHorizontalAlignment(SwingConstants.RIGHT);
			lblBackgroundImg.setVerticalAlignment(SwingConstants.TOP);
			ImageIcon imageIcon = new ImageIcon(new ImageIcon(Home.class.getResource("/images/bg_login.png")).getImage()
					.getScaledInstance(lblBackgroundImg.getWidth(), lblBackgroundImg.getHeight(), Image.SCALE_SMOOTH));
			lblBackgroundImg.setIcon(imageIcon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void resetPanel() {
		processingViewer.setVisible(false);
		logViewer.setVisible(false);
		logViewer.removeAll();
		registerViewer.setVisible(false);
		settingViewer.setVisible(false);
		activeViewer.setVisible(false);
		doiSoatViewer.setVisible(false);
		doiSoatViewer.removeAll();
		syncViewer.setVisible(false);

	}

	public static void buildLogConfig() {
		try {
			logger.debug("============ Database Initialize ================");
			
			ConnectionUtilities.createTableFileSyned();
			TableFileSynedUtil.loadingToMap();
			
			// hoso sync constructor
			ConnectionUtilities.createHoSoSyned();
			HoSoSynedUtil.loadingToMap();
//			QueryDb.demo();
			logger.debug("============ Log Initialize ================");
			// tao bien lay thu muc setup
//			URL mySource = LoginForm.class.getProtectionDomain().getCodeSource().getLocation();
			File rootFolder = new File("");
			logger.debug(rootFolder.getAbsolutePath());
			System.setProperty("app.root", rootFolder.getAbsolutePath());

			// Creates Pattern Layout
			PatternLayout patternLayoutObj = new PatternLayout();
			String conversionPattern = "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n";
			patternLayoutObj.setConversionPattern(conversionPattern);

			DailyRollingFileAppender rollingAppenderObj = new DailyRollingFileAppender();
			rollingAppenderObj.setFile(System.getProperty("app.root") + "/logs/LogLGSP.log");
			rollingAppenderObj.setDatePattern("'.'yyyy-MM-dd-a");
			rollingAppenderObj.setBufferSize(ABORT);
			rollingAppenderObj.setLayout(patternLayoutObj);
			rollingAppenderObj.setImmediateFlush(true);
			rollingAppenderObj.activateOptions();

			// Configure the Root Logger
			Logger rootLoggerObj = LogManager.getRootLogger();
			rootLoggerObj.setLevel(Level.ALL);
			rootLoggerObj.addAppender(rollingAppenderObj);

			//
			MyCustomAppender myCustomAppender = new MyCustomAppender();
			myCustomAppender.setLayout(patternLayoutObj);
			myCustomAppender.activateOptions();

			// Configure the Root Logger
			rootLoggerObj.setLevel(Level.INFO);
//	        rootLoggerObj.addAppender(myCustomAppender);
			rootLoggerObj.addAppender(myCustomAppender);

			//
			ConsoleAppender consoleAppender = new ConsoleAppender(patternLayoutObj, ConsoleAppender.SYSTEM_OUT);
			consoleAppender.setThreshold(Level.DEBUG);
			consoleAppender.activateOptions();
			rootLoggerObj.addAppender(consoleAppender);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean lockInstance(final String lockFile) {
		try {
			final File file = new File(lockFile);
			final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
			final FileLock fileLock = randomAccessFile.getChannel().tryLock();
			if (fileLock != null) {
				Runtime.getRuntime().addShutdownHook(new Thread() {
					public void run() {
						try {
							fileLock.release();
							randomAccessFile.close();
							file.delete();
						} catch (Exception e) {
							logger.error("Unable to remove lock file: " + lockFile, e);
						}
					}
				});
				return true;
			}
		} catch (Exception e) {
			logger.error("Unable to create and/or lock file: " + lockFile, e);
		}
		return false;
	}
}