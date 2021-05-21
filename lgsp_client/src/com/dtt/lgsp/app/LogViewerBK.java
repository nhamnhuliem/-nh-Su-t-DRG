package com.dtt.lgsp.app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jdatepicker.DateLabelFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.core.MyTableModel;
import com.dtt.lgsp.app.utils.DateUtil;
import com.dtt.lgsp.dao.TableFileSynedUtil;
import com.dtt.lgsp.entities.FileSynedEntity;
import com.dtt.lgsp.entities.ProfileEntity;

public class LogViewerBK extends JPanel {
	static final Logger logger = Logger.getLogger(LogViewerBK.class);
	JScrollPane scroll;
	JTable table;
	MyTableModel tableModel;
	JDatePickerImpl datePickerFrom;

	/**
	 * Create the frame.
	 */

	JPanel contentPane;

	public LogViewerBK() {

		//createUI();
	}

	public void createUI() {
		setLayout(null);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setSize(770, 570);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("LỊCH SỬ HỆ THỐNG");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(288, 20, 194, 22);
		contentPane.add(lblNewLabel_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(200, 50, 400, 2);
		contentPane.add(separator_2);

		// model.setDate(20,04,2014);
		// Need this...
		UtilDateModel modelFrom = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(modelFrom, p);
		// Don't know about the formatter, but there it is...
		datePickerFrom = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePickerFrom.setSize(200, 23);
		datePickerFrom.setLocation(100, 101);
		contentPane.add(datePickerFrom);

//		UtilDateModel modelTo = new UtilDateModel();
//		JDatePanelImpl datePanelTo = new JDatePanelImpl(modelTo, p);
//		JDatePickerImpl datePickerTo = new JDatePickerImpl(datePanelTo, new DateLabelFormatter());
//		datePickerTo.setSize(200, 23);
//		datePickerTo.setLocation(400, 90);
//		contentPane.add(datePickerTo);

		add(contentPane);

		JLabel lblNewLabel = new JLabel("Ngày đồng bộ:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 101, 80, 20);
		contentPane.add(lblNewLabel);
		
		
		
		// link xem ho so
		
		JLabel hyperlink  = new JLabel("Bấm vào đây để xem chi tiết kết quả gửi hồ sơ");
		hyperlink.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hyperlink .setBounds(10, 63, 388, 14);
		hyperlink.setForeground(new Color(178, 34, 34));
		hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		ProfileEntity profileEntity = PreferencesConfiguration.getConfig();

		hyperlink.addMouseListener(new MouseAdapter() {
			 
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        // the user clicks on the label
		    	try {
		            Desktop.getDesktop().browse(new URI("https://drg.moh.gov.vn/web/guest/report?p_p_id=drgthuthapdulieu_WAR_drgthuthapdulieuportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_pos=1&p_p_col_count=2&_drgthuthapdulieu_WAR_drgthuthapdulieuportlet_jspPage=%2Fhtml%2Fdrg%2Fportlet%2Fthuthap%2Fchitiet_coso.jsp&_drgthuthapdulieu_WAR_drgthuthapdulieuportlet_maCSKCB=" + profileEntity.getMaCoSo()));
		             
		        } catch (IOException | URISyntaxException e1) {
		            e1.printStackTrace();
		        }
		    }
		 
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        // the mouse has entered the label
		    }
		 
		    @Override
		    public void mouseExited(MouseEvent e) {
		        // the mouse has exited the label
		    }
		});
		contentPane.add(hyperlink );

//		JLabel lblnNgy = new JLabel("Đến ngày:");
//		lblnNgy.setForeground(Color.WHITE);
//		lblnNgy.setHorizontalAlignment(SwingConstants.RIGHT);
//		lblnNgy.setFont(new Font("Segoe UI", Font.PLAIN, 11));
//		lblnNgy.setBackground(Color.WHITE);
//		lblnNgy.setBounds(310, 89, 80, 20);
//		contentPane.add(lblnNgy);

		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dateFinder = datePickerFrom.getJFormattedTextField().getText();
					List<FileSynedEntity> result = new ArrayList<FileSynedEntity>();
					try {
					
						String ngayGui = StringUtils.isNotEmpty(dateFinder) ? dateFinder
								: DateUtil.parseDateToString(DateUtil.getCurrentDateTime(), DateUtil.DATE_FORMAT_D_M_Y);
						result = TableFileSynedUtil.search(ngayGui);
					} catch (Exception ex) {
						logger.error(ex);
					}
					List<String[]> values = new ArrayList<String[]>();
					List<String> columns = new ArrayList<String>();

					columns.add("STT");
					columns.add("NGÀY GỬI");
					columns.add("TÊN FILE");
					columns.add("TRẠNG THÁI");
					columns.add("TỔNG HỒ SƠ");	
					columns.add("LÝ DO");
					
					if (CollectionUtils.isNotEmpty(result)) {
						for (int i = 0; i < result.size(); i++) {
							FileSynedEntity entity = result.get(i);
							
							String trangThai = entity.getStatus();
							if(trangThai != null && trangThai.equalsIgnoreCase("OK")) {
								trangThai ="Thành công";
							}else {
								trangThai ="Thất bại";
							}
							

							values.add(new String[] { String.valueOf(i + 1),entity.getCreatedate(),entity.getFilename(),trangThai,entity.getCount(),entity.getDesc()});
						}
					}

					
					if (CollectionUtils.isEmpty(values)) {
						if(scroll!=null) {
							contentPane.remove(scroll);
						}
						JLabel lblNewLabel_2 = new JLabel("Không tìm thấy dữ liệu");
						lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
						lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
						lblNewLabel_2.setForeground(Color.WHITE);
						lblNewLabel_2.setBounds(24, 165, 700, 30);
						lblNewLabel_2.setOpaque(false);
						contentPane.add(lblNewLabel_2);
						contentPane.repaint();
//						contentPane.updateUI();
					}else {
						tableModel = new MyTableModel(
								(values != null && values.size() > 0 ? values.toArray(new Object[][] {}) : null),
								columns.toArray());
						tableModel.fireTableDataChanged();
						table = new JTable(tableModel);

						
						table.getTableHeader().setFont(new Font("Segoe UI ", Font.BOLD, 12));
						table.getTableHeader().setOpaque(false);
						table.getTableHeader().setBackground(new Color(32, 136, 203));
						table.getTableHeader().setForeground(new Color(255, 255, 255));
						// set with height
						TableColumnModel columnModel = table.getColumnModel();
						columnModel.getColumn(0).setPreferredWidth(50);
						columnModel.getColumn(1).setPreferredWidth(150);
						columnModel.getColumn(2).setPreferredWidth(250);
						columnModel.getColumn(2).setResizable(true);
						columnModel.getColumn(3).setPreferredWidth(100);
						columnModel.getColumn(4).setPreferredWidth(50);
						columnModel.getColumn(5).setPreferredWidth(250);
						columnModel.getColumn(5).setResizable(true);
						
//						table.getColumnModel().getColumn(4).setCellRenderer(new WordWrapCellRenderer());
						table.setRowHeight(25);
						table.setShowVerticalLines(true);
//						table.setFocusable(false);
						table.setIntercellSpacing(new Dimension(0, 0));
						table.setRowMargin(0);
						table.setLocation(10, 100);
						table.setSize(750, 100);
						table.setSelectionBackground(new Color(173, 223, 248));
						table.setRowSelectionAllowed(true);
						scroll = new JScrollPane(table);
						scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						scroll.setBounds(10, 120, 750, 420);
						scroll.add(table);
						scroll.setViewportView(table);
						contentPane.add(scroll);
					} 

				} catch (Exception ex) {
					ex.printStackTrace();
					logger.error(ex);
				}

			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(310, 101, 89, 23);
		contentPane.add(btnNewButton);
	}

	static class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		WordWrapCellRenderer() {
			setLineWrap(true);
			setWrapStyleWord(true);
		}

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			setText(value.toString());
			setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
			if (table.getRowHeight(row) != getPreferredSize().height) {
				table.setRowHeight(row, getPreferredSize().height);
			}
			return this;
		}
	}
}
