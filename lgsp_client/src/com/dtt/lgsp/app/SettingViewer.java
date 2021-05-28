package com.dtt.lgsp.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.dtt.lgsp.app.LogViewer.Item;
import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.core.LoaiHoSoEnum;
import com.dtt.lgsp.app.cron.DttCron;
import com.dtt.lgsp.app.cron.ImportCron;
import com.dtt.lgsp.app.cron.ImportFileProcess;
import com.dtt.lgsp.app.cron.KetQuaCron;
import com.dtt.lgsp.data.handler.ReadExcelData;
import com.dtt.lgsp.entities.ProfileEntity;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class SettingViewer extends JPanel {
	static final Logger logger = Logger.getLogger(RegisterViewer.class);
	JFileChooser chooser;
	String choosertitle;
	private JPanel parentPanel;
	JLabel lblPath;
	JCheckBox cbPath;
	private JTextPane txtpnThongBao;
	private JScrollPane scrollPane;
	boolean useFolder;
	private JTextField txtSecondRun;
	JComboBox cbBoxLoaiDuLieu;
	
	private JPanel panel1;
	private JPanel panel2;
	
	JFileChooser chooserFile;
	JLabel lblPath_1;
	
	static JTextArea txtLog2;
	static JScrollPane scrollPane_1;
	
	public JTextArea gettxtLog2() {
		txtLog2 = new JTextArea();
		txtLog2.setBorder(BorderFactory.createCompoundBorder(
				txtLog2.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		scrollPane_1 = new JScrollPane();
		return txtLog2;
	}

	public SettingViewer() {
		//createUI();
		//gettxtLog2();
	}

	public void createUI() {
		ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
		setLayout(null);
		// khoi tao parentPanel
		parentPanel = new JPanel();
		parentPanel.setLocation(0, 0);
		parentPanel.setOpaque(false);
		parentPanel.setSize(770, 570);
		parentPanel.setLayout(null);
		
		panel1 = creatPanel1(profileEntity);
		
		panel2 = creatPanel2(profileEntity);	
		
		
		ImageIcon folderIcon = new ImageIcon(SettingViewer.class.getResource("/images/folder-icon.png"));
		ImageIcon importIcon = new ImageIcon(SettingViewer.class.getResource("/images/import-21-723160.png"));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		tabbedPane.setBounds(0, 0, 770, 570);
		
		tabbedPane.addTab("Cấu hình thư mục đồng bộ", folderIcon, panel1,"Cấu hình thư mục đồng bộ");
		tabbedPane.addTab("Import file", importIcon, panel2,"XML");
		
		
		add(parentPanel);

		parentPanel.add(tabbedPane);
	}
	
	private JPanel creatPanel2(ProfileEntity profileEntity) {
		// khoi tao panel2 import file truc tiep
		panel2 = new JPanel();
		panel2.setLocation(0, 11);
		panel2.setOpaque(false);
		panel2.setSize(770, 570);
		panel2.setLayout(null);
		
		
		JLabel lblNewLabel_2 = new JLabel("Chọn File để đồng bộ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 55, 153, 17);
		panel2.add(lblNewLabel_2);
		
		lblPath_1 = new JLabel("");
		lblPath_1.setForeground(new Color(0, 0, 128));
		lblPath_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPath_1.setBounds(313, 55, 426, 20);
		panel2.add(lblPath_1);
		
		JButton btnFile = new JButton("Chọn file...");
		btnFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooserFile = new JFileChooser();
				chooserFile.setCurrentDirectory(new java.io.File("."));
				chooserFile.setDialogTitle(choosertitle);
				chooserFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
				chooserFile.setAcceptAllFileFilterUsed(false);
				//
				if (chooserFile.showOpenDialog(panel2) == JFileChooser.APPROVE_OPTION) {
					logger.info("file đã chọn: " + chooserFile.getSelectedFile());
					lblPath_1.setText(chooserFile.getSelectedFile().toString());
					profileEntity.setUrlWs(chooserFile.getSelectedFile().toString());
					PreferencesConfiguration.buildConfig(profileEntity);
				}
			}
		});
		btnFile.setBounds(173, 54, 130, 23);
		panel2.add(btnFile);
		
		JButton btnDongBoFile = new JButton("Đồng bộ");
		btnDongBoFile.addActionListener(new RunFileActionListener());
		btnDongBoFile.setBounds(173, 92, 130, 23);
		panel2.add(btnDongBoFile);
		
		txtLog2.setForeground(new Color(50, 205, 50));
		txtLog2.setEditable(false);
		txtLog2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtLog2.setBackground(Color.BLACK);
		txtLog2.setLineWrap(true);
		txtLog2.setWrapStyleWord(true);
		
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(10, 140, 745, 314);
		scrollPane_1.add(txtLog2);
		scrollPane_1.setViewportView(txtLog2);
		
		panel2.add(scrollPane_1);
		
		return panel2;
	}
	
	 private JPanel creatPanel1(ProfileEntity profileEntity) {
			// khoi tao panel cau hinh thu muc
			panel1 = new JPanel();
			panel1.setLocation(0, 11);
			panel1.setOpaque(false);
			panel1.setSize(770, 570);
			panel1.setLayout(null);
			

			JLabel lblNewLabel_2 = new JLabel("Thư mục nguồn");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2.setForeground(new Color(0, 0, 0));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setBounds(10, 22, 205, 17);
			panel1.add(lblNewLabel_2);

			cbPath = new JCheckBox("");
			cbPath.setHorizontalAlignment(SwingConstants.CENTER);
			cbPath.setForeground(Color.WHITE);
			cbPath.setBounds(230, 33, 21, 21);
			cbPath.setFont(new Font("Tahoma", Font.BOLD, 14));
			cbPath.setSelected(useFolder);
			panel1.add(cbPath);

			lblPath = new JLabel("");
			lblPath.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblPath.setForeground(new Color(0, 0, 128));
			lblPath.setBounds(390, 33, 365, 20);
			lblPath.setText(profileEntity.getFolder());
			panel1.add(lblPath);

			JButton btnFolderHSVV = new JButton("Chọn thư mục...");
			btnFolderHSVV.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chooser = new JFileChooser();
					chooser.setCurrentDirectory(new java.io.File("."));
					chooser.setDialogTitle(choosertitle);
					chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					//
					// disable the "All files" option.
					//
					chooser.setAcceptAllFileFilterUsed(false);
					//
					if (chooser.showOpenDialog(panel1) == JFileChooser.APPROVE_OPTION) {
						System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
						System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
//						pathFileHSVV = chooser.getSelectedFile().getAbsolutePath();

						lblPath.setText(chooser.getSelectedFile().getAbsolutePath());
					}
				}
			});
			btnFolderHSVV.setBounds(255, 33, 130, 23);
			panel1.add(btnFolderHSVV);

			JSeparator separator = new JSeparator();
			separator.setBackground(Color.BLACK);
			separator.setBounds(614, 43, 0, 2);
			panel1.add(separator);

			JButton btnNewButton = new JButton("Kiểm tra dịch vụ");
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String strPingHost = "";
					try {
						strPingHost = DttConsumer.pingHost();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(txtSecondRun,
								"Lỗi kết nối, kiểm tra lại đường dẫn dịch vụ: " + e2.getMessage(), "DRG",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (StringUtils.isNotEmpty(strPingHost)) {
						JOptionPane.showMessageDialog(txtSecondRun,
								"Lỗi kết nối, kiểm tra lại đường dẫn dịch vụ: " + strPingHost, "DRG",
								JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(txtSecondRun, "Kết nối dịch vụ thành công", "BYT_TTDL_4210 Client",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			});
			btnNewButton.setForeground(new Color(0, 0, 255));
			btnNewButton.setIcon(new ImageIcon(SettingViewer.class.getResource("/images/worldwide.png")));
			btnNewButton.setBounds(390, 103, 160, 30);
			panel1.add(btnNewButton);

			JLabel lblThiGianChy = new JLabel("Th\u1EDDi gian ch\u1EA1y (gi\u00E2y)");
			lblThiGianChy.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblThiGianChy.setForeground(new Color(0, 0, 0));
			lblThiGianChy.setHorizontalAlignment(SwingConstants.RIGHT);
			lblThiGianChy.setBounds(44, 109, 165, 17);
			panel1.add(lblThiGianChy);

			txtSecondRun = new JTextField();
			txtSecondRun.setBounds(228, 110, 157, 23);
			txtSecondRun.setText(profileEntity.getSecondRun() + "");
			panel1.add(txtSecondRun);
			txtSecondRun.setColumns(10);

			JButton btnUpdate = new JButton("Lưu và gửi hồ sơ");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int secondRun = Integer.valueOf(txtSecondRun.getText());
					if (secondRun < 60) {
						JOptionPane.showMessageDialog(txtSecondRun,
								"Lưu thông tin không thành công: Thời gian chạy phải lớn hơn 60 giây", "DRG",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					useFolder = cbPath.isSelected();

					// xoa cau hinh cu
//						PropertieConfiguration proConfig = PropertieConfiguration.getInstance();
//						String urlApi = proConfig.getProperty("ws.api");
					// luu thiet lap cau hinh moi
					ProfileEntity profileEntityold = PreferencesConfiguration.getConfig();
					Item loaiHoSoItem = (Item) cbBoxLoaiDuLieu.getSelectedItem();
					int loaiHoSo = loaiHoSoItem.getId();
					if(loaiHoSo == 0) {
						JOptionPane.showMessageDialog(cbBoxLoaiDuLieu,
								"Lưu thông tin không thành công: Bạn phải chọn loại dữ liệu", "DRG",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					profileEntityold.setLoaiHoSo(loaiHoSo);
					if (chooser != null) { 
						profileEntityold.setFolder(chooser.getSelectedFile().getAbsolutePath());
					}
					PreferencesConfiguration.buildConfig(profileEntityold);
					SystemTrayLgsp.timerPut.cancel();
					SystemTrayLgsp.timerGet.cancel();
					SystemTrayLgsp.timerCountDown.cancel();
					SystemTrayLgsp.timerPut.purge();
					SystemTrayLgsp.timerGet.purge();
					SystemTrayLgsp.timerCountDown.purge();

					SystemTrayLgsp.timerPut = new Timer();
					SystemTrayLgsp.timerGet = new Timer();
					SystemTrayLgsp.timerCountDown = new Timer();

					DttCron dttCron = new DttCron();
					dttCron.setProfileEntity(profileEntityold);
					KetQuaCron ketQuaCron = new KetQuaCron();
					ketQuaCron.setProfileEntity(profileEntityold);
					CountDown countDown = new CountDown();
					countDown.setCounter(Integer.valueOf(Integer.valueOf(txtSecondRun.getText())));
					SystemTrayLgsp.timerPut.scheduleAtFixedRate(dttCron, 0,
							Integer.valueOf(Integer.valueOf(txtSecondRun.getText()) * 1000));
					SystemTrayLgsp.timerGet.scheduleAtFixedRate(ketQuaCron, 0,
							Integer.valueOf(Integer.valueOf(txtSecondRun.getText()) * 1000));
					SystemTrayLgsp.timerCountDown.scheduleAtFixedRate(countDown, 0, Integer.valueOf(1 * 1000));

					JOptionPane.showMessageDialog(null, "Lưu thông tin thành công", "DRG", JOptionPane.INFORMATION_MESSAGE);
					
				}
			});

			btnUpdate.setBounds(228, 146, 157, 23);
			panel1.add(btnUpdate);

			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(186, 92, 400, 2);
			panel1.add(separator_1);

			
			txtpnThongBao = new JTextPane();
			// scrollPane.setViewportView(txtpnThongBao);
			txtpnThongBao.setFont(new Font("Tahoma", Font.BOLD, 13));
			txtpnThongBao.setText(
					"=========== CÁC BƯỚC THỰC HIỆN ===========\r\nBước 1: Cấu hình \"Thư mục nguồn\",\"thời gian chạy\", và \"Kiểm tra dịch vụ \" để đảm bảo cấu hình đã đúng theo hướng dẫn\r\nBước 2: Copy hồ sơ 4210 định dạng .xml vào thư mục đã được cấu hình \"Thư mục nguồn\" không hạn chế số lượng file\r\nBước 3: Click vào nút \"Lưu và gửi hồ sơ\" để xác nhận việc gửi \r\nChú ý:\r\n- Hệ thống sẽ tự động loại bỏ thông tin bệnh nhân trước khi gửi hồ sơ lên.\r\n- Bạn chỉ cần bấm 1 lần hệ thống sẽ tự động chuyển hồ sơ tại thư mục cấu hình\r\nBước 4: Theo dõi kết quả gửi lên ( xem chi tiết tại mục \"Kết quả gửi hồ sơ\")\r\n\r\n=========== CHÚ Ý ===========\r\n1. Dữ liệu ưu tiên theo thời gian như sau: Dữ liệu 2019, 2020 cuối cùng là 2018.\r\n2. Giới hạn độ lớn của 1 file: 1GB, vượt quá không thực hiện được\r\n3. Số lượng file XML không giới hạn. Các cơ sở y tế copy toàn bộ các file XML của mình vào thư mục gốc. Công cụ sẽ tự động chuyển dần dữ liệu lên máy chủ dữ liệu của Bộ Y tế\r\n4. Do giới hạn đường truyền, chỉ cho phép 1 cơ sở chuyển tối đa 1 hồ sơ/1 giây hoặc 2 giây. Vì thế cơ sở y tế cần bật máy tính liên tục cho đến khi chuyển hết dữ liệu lên. Thời gian có thể mất một hoặc nhiều ngày tùy thuộc vào số lượng XML của cơ sở. Sau khi chuyển xong dữ liệu (mọi file XML đã được chuyển lên máy chủ trung ương hoặc chuyển vào thư mục lỗi do bị lỗi) thì phần mềm sẽ báo đã chuyển hết dữ liệu. Lúc đó mới được tắt máy\r\n5. Trong khi phần mềm chạy, có thể máy bị treo hoặc phần mềm bị treo (nếu phần mềm bị treo thì không thấy tỷ lệ xử lý thay đổi trong thời gian dài), người phụ trách việc chuyển dữ liệu khởi động lại máy (nếu treo máy) hoặc khởi động lại phần mềm – bấm nút thoát và chạy lại chương trình.\r\n6. Do giới hạn năng lực xử lý nên kết quả báo cáo sẽ được thực hiện vào ban đêm. Vì thế cơ sở không thể xem ngay được số lượng đã được đồng bộ với máy chủ - nhưng xem được số lượng file đã được gửi lên ngay ở máy cài đặt chương trình chuyển dữ liệu.\r\n7. Nếu phần mềm đã báo đã đồng bộ xong, vào kiểm tra thư mục gốc mà không còn file nào nữa, tiếp đến kiểm tra thư mục lỗi mà cũng không có file nào thì có nghĩa là dữ liệu đã được chuyển toàn vẹn lên máy chủ. Nếu có file trong thư mục lỗi, đề nghị copy lại thư mục gốc và cho phần mềm tiếp tục chạy. Nếu sau khi làm lần 2 như trên mà vẫn còn file trong thư mục lỗi, đề nghị lên zalo nhóm này để được hỗ trợ.");

			scrollPane = new JScrollPane(txtpnThongBao);
			scrollPane.setBounds(10, 180, 745, 320);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.add(txtpnThongBao);
			scrollPane.setViewportView(txtpnThongBao);
			panel1.add(scrollPane);

			JLabel lblNewLabel_2_1 = new JLabel("(Viết liền, không dấu)");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_1.setForeground(Color.RED);
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_1.setBounds(20, 37, 205, 17);
			panel1.add(lblNewLabel_2_1);
			
			cbBoxLoaiDuLieu = new JComboBox();
			cbBoxLoaiDuLieu.addItem(new Item(0, "--Chọn loại dữ liệu--"));
			cbBoxLoaiDuLieu.addItem(new Item(Integer.valueOf(LoaiHoSoEnum.QD4210.getValue()), LoaiHoSoEnum.QD4210.getKey()));
			cbBoxLoaiDuLieu.addItem(new Item(Integer.valueOf(LoaiHoSoEnum.QD3360.getValue()), LoaiHoSoEnum.QD3360.getKey()));
			cbBoxLoaiDuLieu.setSelectedIndex(profileEntity.getLoaiHoSo());
			cbBoxLoaiDuLieu.setBounds(230, 61, 155, 20);
			
			cbBoxLoaiDuLieu.addActionListener (new ActionListener () {
			    public void actionPerformed(ActionEvent e) {
			    	Item loaiHoSoItem = (Item) cbBoxLoaiDuLieu.getSelectedItem();
					int loaiHoSo = loaiHoSoItem.getId();
					cbBoxLoaiDuLieu.setSelectedIndex(loaiHoSo);
			    }
			});
			
			panel1.add(cbBoxLoaiDuLieu);
			
			JLabel lblNewLabel_2_2 = new JLabel("Loại dữ liệu: ");
			lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_2.setForeground(Color.BLACK);
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_2.setBounds(10, 64, 205, 17);
			panel1.add(lblNewLabel_2_2);
			
        return panel1;
    }
	 
	 class RunFileActionListener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	        	ImportCron cron = new ImportCron();
	        	SystemTrayLgsp.timerPut.scheduleAtFixedRate(cron, 0,
						Integer.valueOf(365 * 24 * 60 * 60 * 1000));
				lblPath_1.setText("");
				DttCron.chayScheduleMoi = false;
	        }
	    }
}
