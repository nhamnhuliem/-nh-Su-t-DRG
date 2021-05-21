package com.dtt.lgsp.app;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import org.apache.log4j.Logger;

public class ProcessingViewer extends JPanel {
	static final Logger logger = Logger.getLogger(ProcessingViewer.class);
	private JPanel contentPane;
	static JLabel lblCountDown;
	static JScrollPane scrollPane;
	Timer timer;
	static JTextArea txtLog;
	
	public JTextArea getTxtLog() {
		txtLog = new JTextArea();
		txtLog.setBorder(BorderFactory.createCompoundBorder(
				txtLog.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		scrollPane = new JScrollPane();
		lblCountDown = new JLabel("");
		return txtLog;
	}

	public ProcessingViewer() {
//		getTxtLog();
//		createUI();
	}

	public void createUI() {
		setLayout(null);

		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setSize(770, 570);
		contentPane.setLayout(null);
//		
		lblCountDown.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountDown.setForeground(Color.WHITE);
		lblCountDown.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblCountDown.setBounds(135, 60, 500, 40);
		// ImageIcon imageIcon = new
		// ImageIcon(ProcessingViewer.class.getResource("/images/processing.gif"));
		// ImageIcon imageProcessing = new
		// ImageIcon(imageIcon.getImage().getScaledInstance(lblCountDown.getWidth(),
		// lblCountDown.getHeight(), Image.SCALE_SMOOTH));
		// ImageIcon imageProcessing = imageIcon;
		// lblCountDown.setIcon(imageProcessing);
		lblCountDown.setVisible(false);
		contentPane.add(lblCountDown);
		JLabel lblNewLabel_1 = new JLabel("THEO DÕI HỆ THỐNG");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(288, 20, 194, 22);
		
		contentPane.add(lblNewLabel_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(185, 50, 400, 2);
		contentPane.add(separator_2);

		txtLog.setForeground(new Color(50, 205, 50));
		txtLog.setEditable(false);
		txtLog.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtLog.setBackground(Color.BLACK);
		txtLog.setBounds(200, 200, 675, 385);
		txtLog.setLineWrap(true);
		txtLog.setWrapStyleWord(true);

//		add(txtLog);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 140, 750, 400);
		scrollPane.add(txtLog);
		scrollPane.setViewportView(txtLog);
		contentPane.add(scrollPane);


//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setIcon(new ImageIcon(ProcessingViewer.class.getResource("/images/processing.gif")));
//		lblNewLabel.setBounds(350, 60, 100, 100);
//		lblNewLabel.setOpaque(false);
//		add(lblNewLabel);
		add(contentPane);
		
	}
}
