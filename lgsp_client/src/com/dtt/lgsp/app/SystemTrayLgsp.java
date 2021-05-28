package com.dtt.lgsp.app;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Timer;
import java.util.prefs.Preferences;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import org.apache.log4j.Logger;

import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.core.Validations;
import com.dtt.lgsp.app.cron.DttCron;
import com.dtt.lgsp.app.cron.ImportCron;
import com.dtt.lgsp.app.cron.KetQuaCron;
import com.dtt.lgsp.entities.ProfileEntity;

public final class SystemTrayLgsp {
	static final Logger logger = Logger.getLogger(SystemTrayLgsp.class);
	ProfileEntity entity = null;
	JMenuItem notificationItem = null; // $NON-NLS-1$
	static Timer timerPut = null;
	static Timer timerGet = null;
	static Timer timerCountDown = null;
	private int duration;
	/** Load the tray icon image to display in the tray bar */
//	private static final Image TRAY_ICON_IMAGE = Toolkit.getDefaultToolkit().getImage( SystemTrayDrg.class.getClassLoader().getResource("/images/tray.png") ); //$NON-NLS-1$

	/**
	 * Main program launched in the jar file
	 *
	 * @param args
	 * @throws IOException
	 * @wbp.parser.entryPoint
	 */
	public void makeUI() {
		BufferedImage img = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
		try {
			img = ImageIO.read(getClass().getResourceAsStream("/images/tray.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Test if the system support the system tray
		if (SystemTray.isSupported()) {

			// Try to use the system Look&Feel
			try {
//				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (final ClassNotFoundException exception) {
				// If System Look&Feel is not supported, stay with the default one
			} catch (final InstantiationException exception) {
				// If System Look&Feel is not supported, stay with the default one
			} catch (final IllegalAccessException exception) {
				// If System Look&Feel is not supported, stay with the default one
			} catch (final UnsupportedLookAndFeelException exception) {
				// If System Look&Feel is not supported, stay with the default one
			}

			// Get the system tray
			final SystemTray tray = SystemTray.getSystemTray();
			// Add the icon to the system tray
			final TrayIcon trayIcon = new TrayIcon(img, "Tray icon skeleton");
			trayIcon.setImageAutoSize(true);

//			//Action listener to get click on top menu items
			final ActionListener settingListener = new ActionListener() {
				@SuppressWarnings("synthetic-access")
				public void actionPerformed(final ActionEvent e) {
					final Home frame = new Home();
					frame.createUI();
					frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					if (!SystemTray.isSupported()) {
						frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
						return;
					}
					Handler h = new Handler(tray, trayIcon);
					frame.addWindowStateListener(h);
					frame.addWindowListener(h);
					tray.remove(trayIcon);
				}
			};
			// TODO: START
			doRun();
			
			notificationItem = new JMenuItem(entity.isDisplayNotification() ? "Bật Thông Báo" : "Tắt Thông Báo"); //$NON-NLS-1$
			notificationItem.addActionListener(new ActionListener() {
//				@Override
				@SuppressWarnings({ "synthetic-access", "deprecation" })
				public void actionPerformed(final ActionEvent e) {
					entity.setDisplayNotification(!entity.isDisplayNotification());
					Preferences userPrefs = PreferencesConfiguration.buildConfig(entity);
					userPrefs.putBoolean("displayNotification", entity.isDisplayNotification());
					notificationItem.setLabel(entity.isDisplayNotification() ? "Bật Thông Báo" : "Tắt Thông Báo");
					notificationItem.setFont(new Font("Arial", Font.BOLD, 12));
				}
			});

			// Tray icon skeleton exit listener
			final ActionListener exitListener = new ActionListener() {
				@SuppressWarnings("synthetic-access")
				public void actionPerformed(final ActionEvent e) {
					// Important: remove the icon from the tray to dispose it
					tray.remove(trayIcon);
					System.exit(0);
				}
			};

			// Popup menu
			JPopupMenu.setDefaultLightWeightPopupEnabled(true);
			final JPopupMenu popupMenu = new JPopupMenu();

			// Add 10 menu items

			// Adding some menu separator
//			popupMenu.addSeparator();

			final JMenuItem setting = new JMenuItem("Cấu hình"); //$NON-NLS-1$
			popupMenu.add(setting);
			setting.addActionListener(settingListener);

			popupMenu.add(notificationItem);

			// Adding some menu separator
			popupMenu.addSeparator();

			// Quit menu to terminate the tray icon by disposing the tray icon
			final JMenuItem exitItem = new JMenuItem("Thoát"); //$NON-NLS-1$
			popupMenu.add(exitItem);
			exitItem.addActionListener(exitListener);

			// Hidden dialog displayed behing the system tray to auto hide the popup menu
			// when clicking somewhere else on the screen
			final JDialog hiddenDialog = new JDialog();
			hiddenDialog.setSize(10, 10);

			// Listener based on the focus to auto hide the hidden dialog and the popup menu
			// when the hidden dialog box lost focus
			hiddenDialog.addWindowFocusListener(new WindowFocusListener() {

				public void windowLostFocus(final WindowEvent e) {
					hiddenDialog.setVisible(false);
				}

				public void windowGainedFocus(final WindowEvent e) {
					// Nothing to do
				}
			});

			// Add a listener to display the popupmenu and the hidden dialog box when the
			// tray icon is clicked
			trayIcon.addMouseListener(new MouseAdapter() {

				public void mouseReleased(final MouseEvent e) {

					if (e.isPopupTrigger()) {
						// Display the menu at the position of the mouse
						// The dialog is also displayed at this position but it is behind the system
						// tray
						popupMenu.setLocation(e.getX(), e.getY());
						hiddenDialog.setLocation(e.getX(), e.getY());

						// Important: set the hidden dialog as the invoker to hide the menu with this
						// dialog lost focus
						popupMenu.setInvoker(hiddenDialog);
						hiddenDialog.setVisible(true);
						popupMenu.setVisible(true);
					}
				}
			});

			// Add the icon to the system tray
			try {
				tray.add(trayIcon);
			} catch (final AWTException e) {

				final StringWriter stringWriter = new StringWriter();
				e.printStackTrace(new PrintWriter(stringWriter));
				JOptionPane.showMessageDialog(null,
						"tray icon cannot be added to the system tray" + System.lineSeparator() + e.getMessage() //$NON-NLS-1$
								+ System.lineSeparator() + stringWriter.toString(),
						"Tray icon skeleton initialization error", JOptionPane.ERROR_MESSAGE);

				System.exit(2);
			}
		} else {
			// if the System is not compatible with SystemTray
			JOptionPane.showMessageDialog(null,
					"SystemTray cannot be initialized" + System.lineSeparator() + "this system is not compatible!", //$NON-NLS-1$ //$NON-NLS-2$
					"Tray icon skeleton initialization error", JOptionPane.ERROR_MESSAGE);

			System.exit(1);
		}
	}

	public void doRun() {
		try {
			DttCron dttCron = new DttCron();
			KetQuaCron ketQuaCron = new KetQuaCron();
			CountDown countDown = new CountDown();
			ImportCron importCron = new ImportCron();
			timerPut = new Timer();
			timerGet = new Timer();
			timerCountDown = new Timer();
			
			
//			else {
//				String urlLgspDefault = "";
//				String usernameLgspDefault = "";
//				String passwordLgspDefault = "";
//				int secondRunLgspDefault = 60;
//				boolean useFolderRunLgspDefault = true;
//				entity = new ProfileEntity(folder, urlLgspDefault, usernameLgspDefault, passwordLgspDefault, secondRunLgspDefault,
//						bdisplayNotification, useFolderRunLgspDefault);
//				final Home frame = new Home();
//				frame.createUI();
//				frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
//				frame.setResizable(false);
//				frame.setLocationRelativeTo(null);
//				frame.setVisible(true);
//				if (!SystemTray.isSupported()) {
//					frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//					return;
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			System.exit(0);
		}

	}

	public static Timer getTimer() {
		return timerPut;
	}

	public static void setTimer(Timer timer) {
		SystemTrayLgsp.timerPut = timer;
	}

	public int getDuration() {
		return duration;
	}
}

class Handler extends WindowAdapter {
	private final SystemTray tray;
	private final TrayIcon icon;

	public Handler(SystemTray tray, TrayIcon icon) {
		super();
		this.tray = tray;
		this.icon = icon;
	}

	private void addTrayIconDisposeFrame(JFrame frame) {
		try {
			tray.add(icon);
			frame.dispose();
			// frame.setVisible(false);
		} catch (AWTException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("ICONIFIED");
		if (e.getNewState() == Frame.ICONIFIED) {
			addTrayIconDisposeFrame((JFrame) e.getSource());
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		addTrayIconDisposeFrame((JFrame) e.getSource());
	}
	
}