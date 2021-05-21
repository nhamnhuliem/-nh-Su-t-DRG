package com.dtt.lgsp.app;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

import org.apache.log4j.Logger;

import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.utils.DateUtil;
import com.dtt.lgsp.dao.HoSoSynedUtil;
import com.dtt.lgsp.entities.HoSoSyncEntity;
import com.dtt.lgsp.entities.TongHopChiTiet;

import java.awt.Color;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

@SuppressWarnings("serial")
public class SyncViewer extends JPanel{
	static final Logger logger = Logger.getLogger(SyncViewer.class);
	
	private static int offset = 0;
	private static int limit = 1000;
	JFileChooser chooser;
	String choosertitle;

	private JPanel contentPane;
	private static JProgressBar progressBar;
	private JLabel lblNewLabel;
	private SettingViewer settingViewer;
	private JPanel menu;
	private JLabel lblSTT;
	
	public SyncViewer(JPanel menu,SettingViewer settingViewer) {
		this.settingViewer = settingViewer;
		this.menu = menu;
		createUI();
	}
	
	public void createUI() {
		setLayout(null);

		contentPane = new JPanel();
		contentPane.setLocation(0, 0);
		contentPane.setSize(735, 570);
		contentPane.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(614, 43, 0, 2);
		separator.setBackground(Color.BLACK);
		contentPane.add(separator);
		add(contentPane);
		
		lblNewLabel = new JLabel("<html><div style='text-align:center'>HỆ THỐNG ĐANG ĐỒNG BỘ DỮ LIỆU, VUI LÒNG CHỜ TRONG ÍT PHÚT<div></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setBounds(100, 174, 560, 33);
		contentPane.add(lblNewLabel);
		
		lblSTT = new JLabel("");
		lblSTT.setBounds(266, 297, 253, 14);
		contentPane.add(lblSTT);
		
	}
	public void showProgressBarDemo() {
		
		Task task = new Task();
		task.start();
	}
	
	private class Task extends Thread {
        public Task() {
        }
 
        public void run() {
        	
        	Preferences userPrefs = PreferencesConfiguration.buildConfig(null);
    		boolean isActive = userPrefs.getBoolean("lgsp.isactive", false);
    		if(isActive) {
    			try {
    				int count = 0;
    				count = DttConsumer.countChiTietSync();
    				if(count > 0) {
    					int turn =  count/limit;
    					if(count % limit != 0) {
    						turn = turn + 1;
    					}
    					progressBar = new JProgressBar(0,turn-1);
    					progressBar.setForeground(Color.GREEN);
    					progressBar.setBounds(194, 242, 331, 28);
    					progressBar.setStringPainted(true);
    					progressBar.setValue(0);
    					contentPane.add(progressBar);
    					int j = 0;
    					for(int i=0; i< turn;i++) {
    						offset = i*limit;
    						List<TongHopChiTiet> listChiTiet = DttConsumer.getChiTietSync(limit, offset);
    						for (TongHopChiTiet tongHopChiTiet : listChiTiet) {
    							j++;
    							lblSTT.setText("Đã đồng bộ " + j +"/" + count + " hồ sơ");
    							if(HoSoSynedUtil.hoSoMap.get(tongHopChiTiet.getMaLk()) == null) {
    								HoSoSynedUtil.hoSoMap.put(tongHopChiTiet.getMaLk(), tongHopChiTiet.getMaLk());
    								HoSoSyncEntity entity = new HoSoSyncEntity(UUID.randomUUID().toString(), tongHopChiTiet.getMaLk(),
    										DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y_H_M), "");
    								HoSoSynedUtil.insert(entity);
    							}
    							
    							
    						}
    						// processBar
    						final int progress = i;
    						SwingUtilities.invokeLater(new Runnable() {
    							public void run() {
    								progressBar.setValue(progress);
    							}
    						});
    						try {
    							Thread.sleep(100);
    						} catch (InterruptedException e) {
    						}
    						
    					}
    					JOptionPane.showMessageDialog(null, "Đã hoàn tất đồng bộ", "",
    							JOptionPane.INFORMATION_MESSAGE);
    					menu.setVisible(true);
    					settingViewer.setVisible(true);
    					contentPane.setVisible(false);
    				}else {
    					menu.setVisible(true);
    					settingViewer.setVisible(true);
    					contentPane.setVisible(false);
    				}
    			} catch (Exception e) {
    				
    			}
    			
    		}
        		
        	
        }
    }
	
}
