package com.dtt.lgsp.app;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.utils.Base64Utils;
import com.dtt.lgsp.dao.ConnectionUtilities;
import com.dtt.lgsp.dao.HoSoSynedUtil;
import com.dtt.lgsp.dao.TableFileSynedUtil;
import com.dtt.lgsp.entities.ProfileEntity;
import com.dtt.lgsp.entities.Result;
import com.dtt.lgsp.entities.ThongTinCoSo;
import com.google.gson.Gson;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ActiveViewer extends JPanel{
	static final Logger logger = Logger.getLogger(ActiveViewer.class);
	
	JFileChooser chooser;
	String choosertitle;

	private JPanel contentPane;
	boolean useFolder;
	private JPanel menu;
	private SettingViewer settingViewer;
	private JTextField activeCode;
	private SyncViewer syncViewer;
	
	public ActiveViewer(JPanel menu,SettingViewer settingViewer, SyncViewer syncViewer) {
		this.menu = menu;
		this.settingViewer = settingViewer;
		this.syncViewer = syncViewer;
		//createUI();
	}
	
	public void createUI() {
		setLayout(null);

		contentPane = new JPanel();
		contentPane.setLocation(0, 0);
		contentPane.setSize(735, 570);

		contentPane.setLayout(null);

		JLabel lblMa = new JLabel("Mã kích hoạt");
		lblMa.setBounds(209, 199, 135, 17);
		lblMa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa.setForeground(new Color(0, 0, 0));
		lblMa.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMa);

		JLabel lblNewLabel_1 = new JLabel("Kích hoạt hệ thống");
		lblNewLabel_1.setBounds(236, 81, 300, 22);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(614, 43, 0, 2);
		separator.setBackground(Color.BLACK);
		contentPane.add(separator);
		add(contentPane);
		
		activeCode = new JTextField();
		activeCode.setBounds(232, 227, 324, 20);
		contentPane.add(activeCode);
		activeCode.setColumns(10);
		
		JButton btnActive = new JButton("Kích hoạt");
		btnActive.setBackground(Color.WHITE);
		btnActive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (StringUtils.isEmpty(activeCode.getText())) {
						JOptionPane.showMessageDialog(null, "Bạn phải nhập mã kích hoạt", "",
								JOptionPane.ERROR_MESSAGE);
					} else {
						//lblActiveCode.setText("");
						
						ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
						String activeCodes = profileEntity.getPrimaryActivecode();
						if(activeCode.getText().equals(activeCodes)) {
							JOptionPane.showMessageDialog(null, "Kích hoạt thành công, vui lòng đọc hướng dẫn để cấu hình hệ thống", "",
									JOptionPane.INFORMATION_MESSAGE);
							profileEntity.setActive(true);
							PreferencesConfiguration.buildConfig(profileEntity);
							menu.setVisible(false);
							syncViewer.setVisible(true);
							syncViewer.showProgressBarDemo();
							contentPane.setVisible(false);
						}else {
							JOptionPane.showMessageDialog(null, "Mã kích hoạt không đúng, vui lòng kiểm tra lại!", "",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnActive.setBounds(315, 275, 147, 23);
		contentPane.add(btnActive);
		
		JLabel lblNewLabel = new JLabel("Vui lòng kiểm tra mã kích hoạt được gửi đến trong email đăng ký để kích hoạt hệ thống");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(27, 131, 658, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Thoát để đăng ký lại");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
				profileEntity.setActivecode("");
				profileEntity.setPrimaryActivecode("");
				PreferencesConfiguration.buildConfig(profileEntity);
				System.exit(0);
			}
		});
		btnNewButton.setBounds(315, 321, 147, 23);
		contentPane.add(btnNewButton);

	}
	
}
