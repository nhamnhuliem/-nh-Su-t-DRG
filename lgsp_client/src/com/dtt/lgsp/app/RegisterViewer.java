package com.dtt.lgsp.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

@SuppressWarnings("serial")
public class RegisterViewer extends JPanel {
	static final Logger logger = Logger.getLogger(RegisterViewer.class);
	JFileChooser chooser;
	String choosertitle;

	private JPanel contentPane;
	JLabel lblPathNguon;
	JLabel lblPathDich;
	JLabel lblValidateMaDV;
	JLabel lblValidateTenDV;
	JLabel lblValidateNguoiLH;
	JLabel lblValidateDienThoai;
	JLabel lblValidateEmail;
	JLabel lblValidateGD;
	JLabel lblValidateDiaChi;
	JLabel lblValidateTuyen;
	boolean useFolder;
	private JTextField textMa;
	private JTextField textTenNguoiLH;
	private JTextField textEmail;
	private JTextField textDienThoai;
	private JPanel menu;
	private SettingViewer settingViewer;
	private ActiveViewer activeViewer;
	private JTextField tenGDBV;
	private JTextField tuyen;
	JTextArea textAreaDiaChi;

//	private static Timer timer;
	public RegisterViewer(JPanel menu, ActiveViewer activeViewer) {
		this.menu = menu;
		this.activeViewer = activeViewer;
		createUI();
	}

	public void createUI() {
		setLayout(null);

		contentPane = new JPanel();
		contentPane.setLocation(0, 0);
		contentPane.setOpaque(false);
		contentPane.setSize(733, 608);

		contentPane.setLayout(null);

		JLabel lblMa = new JLabel("Mã Đơn Vị");
		lblMa.setBounds(203, 90, 79, 17);
		lblMa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa.setForeground(new Color(0, 0, 0));
		lblMa.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblMa);

		JLabel lblNewLabel_1 = new JLabel("Đăng ký thông tin");
		lblNewLabel_1.setBounds(232, 23, 300, 22);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(614, 43, 0, 2);
		separator.setBackground(Color.BLACK);
		contentPane.add(separator);

		JTextArea textAreaTen = new JTextArea();
		textAreaTen.setToolTipText("Nhập tên đơn vị");
		textAreaTen.setWrapStyleWord(true);
		textAreaTen.setLineWrap(true);
		textAreaTen.setRows(3);
		textAreaTen.setBounds(373, 128, 212, 50);
		contentPane.add(textAreaTen);

		JButton btnDangKy = new JButton("Đăng ký");
		btnDangKy.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDangKy.setBounds(489, 488, 96, 42);
		btnDangKy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (StringUtils.isEmpty(textMa.getText())) {
						lblValidateMaDV.setText("Bạn cần phải nhập mã đơn vị");
					} else {
						if(textMa.getText().length() != 5) {
							lblValidateMaDV.setText("Mã đơn vị không chính xác");
						}else {
							lblValidateMaDV.setText("");
						}
					}

					if (StringUtils.isEmpty(textAreaTen.getText())) {
						lblValidateTenDV.setText("Bạn cần phải nhập tên đơn vị");
					} else {
						lblValidateTenDV.setText("");
					}

					if (StringUtils.isEmpty(textTenNguoiLH.getText())) {
						lblValidateNguoiLH.setText("Bạn cần phải nhập tên người liên hệ");
					} else {
						lblValidateNguoiLH.setText("");
					}

					if (StringUtils.isEmpty(textDienThoai.getText())) {
						lblValidateDienThoai.setText("Bạn cần phải nhập số điện thoại");
					} else {
						lblValidateDienThoai.setText("");
					}

					if (StringUtils.isEmpty(textEmail.getText())) {
						lblValidateEmail.setText("Bạn cần phải nhập địa chỉ email");
					} else {
						if(validateEmail(textEmail.getText())) {
							lblValidateEmail.setText("");
						}else {
							lblValidateEmail.setText("Bạn cần phải nhập đúng định dạng email");
						}
					}
					
					if (StringUtils.isEmpty(tenGDBV.getText())) {
						lblValidateGD.setText("Bạn cần phải nhập thông tin này");
					} else {
						lblValidateGD.setText("");
					}
					
					if (StringUtils.isEmpty(tuyen.getText())) {
						lblValidateTuyen.setText("Bạn cần phải nhập thông tin này");
					} else {
						lblValidateTuyen.setText("");
					}
					
					if (StringUtils.isEmpty(textAreaDiaChi.getText())) {
						lblValidateDiaChi.setText("Bạn cần phải nhập tên đơn vị");
					} else {
						lblValidateDiaChi.setText("");
					}
					
					

					if (
							!StringUtils.isEmpty(textMa.getText())  && textMa.getText().length() == 5
							&& !StringUtils.isEmpty(textAreaTen.getText())
							&& !StringUtils.isEmpty(textTenNguoiLH.getText())
							&& !StringUtils.isEmpty(textDienThoai.getText())
							&& !StringUtils.isEmpty(textEmail.getText())
							&& !StringUtils.isEmpty(tuyen.getText())
							&& !StringUtils.isEmpty(textAreaDiaChi.getText())
							&& !StringUtils.isEmpty(tenGDBV.getText())
							&& validateEmail(textEmail.getText())
							) {
						// check macoso da duoc dang ky hay chu
						String activecode = DttConsumer.getActivecodeByMaCoSo(textMa.getText());
						if(!StringUtils.isEmpty(activecode)) {
							JOptionPane.showMessageDialog(null, "Cơ sơ của bạn đã đăng ký trên hệ thống, vui lòng dùng mã kích hoạt đã được cấp để kích hoạt hệ thống", "",
									JOptionPane.INFORMATION_MESSAGE);
							
							String subActivecode = textMa.getText() + String.valueOf(UUID.randomUUID());
							MessageDigest digest = MessageDigest.getInstance("MD5");
							byte[] bytes = digest.digest(subActivecode.getBytes());
							StringBuilder hashActivecode = new StringBuilder();
							for (byte b : bytes) {
								hashActivecode.append(String.format("%02x", b));
							}
							
							ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
							profileEntity.setActivecode(hashActivecode.toString());
							profileEntity.setMaCoSo(textMa.getText());
							profileEntity.setPrimaryActivecode(activecode);
							PreferencesConfiguration.buildConfig(profileEntity);

							activeViewer.setVisible(true);
							contentPane.setVisible(false);
							// end
						}else {
							ThongTinCoSo thongTinCoSo = new ThongTinCoSo(textMa.getText(), textAreaTen.getText(),
									textTenNguoiLH.getText(), textEmail.getText(), textDienThoai.getText(), tenGDBV.getText(),
									textAreaDiaChi.getText(), tuyen.getText()
									);
							Gson gson = new Gson();
							String jsonValue = gson.toJson(thongTinCoSo);
							Result result = DttConsumer.callRegister(Base64Utils.encode(jsonValue));
							if (result != null && "00".equals(result.getCode())) {
								ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
								profileEntity.setActivecode(result.getMsgId());
								profileEntity.setPrimaryActivecode(result.getMsgId());
								profileEntity.setMaCoSo(textMa.getText());
								PreferencesConfiguration.buildConfig(profileEntity);
								//menu.setVisible(true);
								activeViewer.setVisible(true);
								contentPane.setVisible(false);
								try {
									// tablefile constructor
									TableFileSynedUtil.dropTable();
									ConnectionUtilities.createTableFileSyned();
									TableFileSynedUtil.loadingToMap();
									
									// hoso sync constructor
									HoSoSynedUtil.dropTable();
									ConnectionUtilities.createHoSoSyned();
									HoSoSynedUtil.loadingToMap();
									
								}catch (Exception e2) {
									// TODO: handle exception
								}
							} else {
								JOptionPane.showMessageDialog(null, "Không thể đăng ký được dịch vụ ", "",
										JOptionPane.ERROR_MESSAGE);
							}
							
						}
					}
				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Có lỗi xảy ra ", "", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnDangKy);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(185, 50, 429, 2);
		contentPane.add(separator_2);

		add(contentPane);

		JLabel lblTen = new JLabel("Tên Đơn Vị");
		lblTen.setBounds(203, 130, 86, 17);
		lblTen.setHorizontalAlignment(SwingConstants.LEFT);
		lblTen.setForeground(Color.BLACK);
		lblTen.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblTen);

		textMa = new JTextField();
		textMa.setToolTipText("Nhập mã đơn vị");
		textMa.setBounds(373, 90, 212, 20);
		contentPane.add(textMa);
		textMa.setColumns(10);

		JLabel lblNguoiLH = new JLabel("Tên người liên hệ");
		lblNguoiLH.setBounds(203, 307, 130, 17);
		lblNguoiLH.setHorizontalAlignment(SwingConstants.LEFT);
		lblNguoiLH.setForeground(Color.BLACK);
		lblNguoiLH.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNguoiLH);

		textTenNguoiLH = new JTextField();
		textTenNguoiLH.setToolTipText("Nhập tên người liên hệ");
		textTenNguoiLH.setBounds(372, 307, 213, 20);
		textTenNguoiLH.setColumns(10);
		contentPane.add(textTenNguoiLH);

		textEmail = new JTextField();
		textEmail.setToolTipText("Nhập địa chỉ email");
		textEmail.setBounds(373, 393, 212, 20);
		textEmail.setColumns(10);
		contentPane.add(textEmail);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(203, 393, 44, 17);
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblEmail);

		JLabel lblDienThoai = new JLabel("Điện Thoại");
		lblDienThoai.setBounds(203, 355, 86, 17);
		lblDienThoai.setHorizontalAlignment(SwingConstants.LEFT);
		lblDienThoai.setForeground(Color.BLACK);
		lblDienThoai.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblDienThoai);

		textDienThoai = new JTextField();
		textDienThoai.setToolTipText("Nhập số điên thoại");
		textDienThoai.setBounds(373, 352, 212, 20);
		textDienThoai.setColumns(10);
		contentPane.add(textDienThoai);

		JLabel lblMa_1 = new JLabel("(*)");
		lblMa_1.setBackground(Color.WHITE);
		lblMa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa_1.setForeground(Color.RED);
		lblMa_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa_1.setBounds(280, 90, 28, 17);
		contentPane.add(lblMa_1);

		JLabel lblMa_1_1 = new JLabel("(*)");
		lblMa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa_1_1.setForeground(Color.RED);
		lblMa_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa_1_1.setBackground(Color.WHITE);
		lblMa_1_1.setBounds(280, 130, 38, 17);
		contentPane.add(lblMa_1_1);

		JLabel lblMa_1_1_1 = new JLabel("(*)");
		lblMa_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa_1_1_1.setForeground(Color.RED);
		lblMa_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa_1_1_1.setBackground(Color.WHITE);
		lblMa_1_1_1.setBounds(324, 307, 38, 17);
		contentPane.add(lblMa_1_1_1);

		JLabel lblMa_1_1_2 = new JLabel("(*)");
		lblMa_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa_1_1_2.setForeground(Color.RED);
		lblMa_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa_1_1_2.setBackground(Color.WHITE);
		lblMa_1_1_2.setBounds(280, 355, 38, 17);
		contentPane.add(lblMa_1_1_2);

		JLabel lblMa_1_1_2_1 = new JLabel("(*)");
		lblMa_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa_1_1_2_1.setForeground(Color.RED);
		lblMa_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa_1_1_2_1.setBackground(Color.WHITE);
		lblMa_1_1_2_1.setBounds(248, 393, 38, 17);
		contentPane.add(lblMa_1_1_2_1);

		lblValidateMaDV = new JLabel("");
		lblValidateMaDV.setForeground(Color.RED);
		lblValidateMaDV.setBackground(Color.WHITE);
		lblValidateMaDV.setBounds(373, 110, 212, 14);
		contentPane.add(lblValidateMaDV);

		lblValidateTenDV = new JLabel("");
		lblValidateTenDV.setForeground(Color.RED);
		lblValidateTenDV.setBackground(Color.WHITE);
		lblValidateTenDV.setBounds(373, 178, 212, 14);
		contentPane.add(lblValidateTenDV);

		lblValidateNguoiLH = new JLabel("");
		lblValidateNguoiLH.setForeground(Color.RED);
		lblValidateNguoiLH.setBackground(Color.WHITE);
		lblValidateNguoiLH.setBounds(373, 327, 212, 14);
		contentPane.add(lblValidateNguoiLH);

		lblValidateDienThoai = new JLabel("");
		lblValidateDienThoai.setForeground(Color.RED);
		lblValidateDienThoai.setBackground(Color.WHITE);
		lblValidateDienThoai.setBounds(373, 371, 212, 14);
		contentPane.add(lblValidateDienThoai);

		lblValidateEmail = new JLabel("");
		lblValidateEmail.setForeground(Color.RED);
		lblValidateEmail.setBackground(Color.WHITE);
		lblValidateEmail.setBounds(373, 411, 212, 14);
		contentPane.add(lblValidateEmail);
		
		JTextPane txtpnCh = new JTextPane();
		txtpnCh.setText("   ==== CHÚ Ý ====\r\n   Để đảm bảo tính bảo mật và thuận tiện trong quá trình gửi hồ sơ 4210 Bộ y tế đề nghị các Cơ sở khám chữa bệnh trước khi gửi hồ sơ thực hiện \r\nđăng ký thông tin để xác thực nội dung gửi (Chỉ đăng ký lần đầu cài đặt)");
		txtpnCh.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnCh.setBounds(3, 66, 172, 166);
		contentPane.add(txtpnCh);
		
		JLabel lblTnNgiG = new JLabel("GĐ Bệnh Viện");
		lblTnNgiG.setHorizontalAlignment(SwingConstants.LEFT);
		lblTnNgiG.setForeground(Color.BLACK);
		lblTnNgiG.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTnNgiG.setBounds(203, 203, 96, 17);
		contentPane.add(lblTnNgiG);
		
		tenGDBV = new JTextField();
		tenGDBV.setBounds(373, 200, 212, 20);
		contentPane.add(tenGDBV);
		tenGDBV.setColumns(10);
		
		JLabel lblaChChi = new JLabel("Địa chỉ chi tiết");
		lblaChChi.setHorizontalAlignment(SwingConstants.LEFT);
		lblaChChi.setForeground(Color.BLACK);
		lblaChChi.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblaChChi.setBounds(203, 245, 96, 17);
		contentPane.add(lblaChChi);
		
		textAreaDiaChi = new JTextArea();
		textAreaDiaChi.setBounds(373, 243, 212, 42);
		contentPane.add(textAreaDiaChi);
		
		lblValidateGD = new JLabel("");
		lblValidateGD.setForeground(Color.RED);
		lblValidateGD.setBackground(Color.WHITE);
		lblValidateGD.setBounds(373, 218, 212, 14);
		contentPane.add(lblValidateGD);
		
		lblValidateDiaChi = new JLabel("");
		lblValidateDiaChi.setForeground(Color.RED);
		lblValidateDiaChi.setBackground(Color.WHITE);
		lblValidateDiaChi.setBounds(373, 282, 212, 14);
		contentPane.add(lblValidateDiaChi);
		
		JLabel lblMa_1_1_2_2 = new JLabel("(*)");
		lblMa_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa_1_1_2_2.setForeground(Color.RED);
		lblMa_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa_1_1_2_2.setBackground(Color.WHITE);
		lblMa_1_1_2_2.setBounds(295, 203, 38, 17);
		contentPane.add(lblMa_1_1_2_2);
		
		JLabel lblMa_1_1_2_3 = new JLabel("(*)");
		lblMa_1_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa_1_1_2_3.setForeground(Color.RED);
		lblMa_1_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa_1_1_2_3.setBackground(Color.WHITE);
		lblMa_1_1_2_3.setBounds(295, 245, 38, 17);
		contentPane.add(lblMa_1_1_2_3);
		
		JLabel lblTuynBnhVin = new JLabel("Tuyến bệnh viện");
		lblTuynBnhVin.setHorizontalAlignment(SwingConstants.LEFT);
		lblTuynBnhVin.setForeground(Color.BLACK);
		lblTuynBnhVin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTuynBnhVin.setBounds(203, 439, 114, 17);
		contentPane.add(lblTuynBnhVin);
		
		tuyen = new JTextField();
		tuyen.setBounds(373, 436, 212, 20);
		contentPane.add(tuyen);
		tuyen.setColumns(10);
		
		lblValidateTuyen = new JLabel("");
		lblValidateTuyen.setForeground(Color.RED);
		lblValidateTuyen.setBackground(Color.WHITE);
		lblValidateTuyen.setBounds(373, 453, 212, 14);
		contentPane.add(lblValidateTuyen);
		
		JLabel lblMa_1_1_2_1_1 = new JLabel("(*)");
		lblMa_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMa_1_1_2_1_1.setForeground(Color.RED);
		lblMa_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMa_1_1_2_1_1.setBackground(Color.WHITE);
		lblMa_1_1_2_1_1.setBounds(324, 439, 38, 17);
		contentPane.add(lblMa_1_1_2_1_1);

	}
	
	private static boolean validateEmail(String email) {
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		return matcher.matches();
	}
}
