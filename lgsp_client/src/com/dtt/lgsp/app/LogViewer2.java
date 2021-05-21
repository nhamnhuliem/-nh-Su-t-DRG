package com.dtt.lgsp.app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import javax.swing.table.TableModel;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.core.MyTableModel;
import com.dtt.lgsp.entities.ProfileEntity;
import com.dtt.lgsp.entities.Report;
import com.dtt.lgsp.table.ObjectTableModel;
import com.dtt.lgsp.table.PaginationDataProvider;

import javax.swing.JTextField;
import javax.swing.JComboBox;

public class LogViewer2 extends JPanel {
	static final Logger logger = Logger.getLogger(LogViewer2.class);
	JScrollPane scroll;
	JTable table;
	MyTableModel tableModel;

	/**
	 * Create the frame.
	 */

	JPanel contentPane;
	private JTextField maLk;
	JComboBox namDongBo;
	JComboBox thangDongBo;

	public LogViewer2() {

	//	createUI();
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

		add(contentPane);

		JLabel lblNewLabel = new JLabel("Năm:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 58, 80, 20);
		contentPane.add(lblNewLabel);
		
		ProfileEntity profileEntity = PreferencesConfiguration.getConfig();

		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Item namItem = (Item) namDongBo.getSelectedItem();
					Item thangItem = (Item) thangDongBo.getSelectedItem();
					int nam =  namItem.getId();
					int thang =  thangItem.getId();
					String maDotDieuTri = maLk.getText();
					List<Report> list = DttConsumer.getReport(maDotDieuTri, nam, thang, 100, 0);
					
					List<String[]> values = new ArrayList<String[]>();
					List<String> columns = new ArrayList<String>();
					columns.add("STT");
					columns.add("MÃ ĐỢT ĐIỀU TRỊ");
					columns.add("THÁNG");
					columns.add("NĂM");
					
					if (CollectionUtils.isNotEmpty(list)) {
						for (int i = 0; i < list.size(); i++) {
							Report rp = list.get(i);
							values.add(new String[] { String.valueOf(i + 1),rp.getMaLk(),String.valueOf(rp.getThang()),String.valueOf(rp.getNam())});
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
						columnModel.getColumn(1).setResizable(true);
						columnModel.getColumn(2).setPreferredWidth(250);
						columnModel.getColumn(2).setResizable(true);
						columnModel.getColumn(3).setPreferredWidth(250);
						columnModel.getColumn(3).setResizable(true);
						
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
		btnNewButton.setBounds(338, 88, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblThng = new JLabel("Tháng:");
		lblThng.setHorizontalAlignment(SwingConstants.LEFT);
		lblThng.setForeground(Color.BLACK);
		lblThng.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblThng.setBackground(Color.WHITE);
		lblThng.setBounds(118, 60, 88, 20);
		contentPane.add(lblThng);
		
		JLabel lblM = new JLabel("Mã LK:");
		lblM.setHorizontalAlignment(SwingConstants.LEFT);
		lblM.setForeground(Color.BLACK);
		lblM.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblM.setBackground(Color.WHITE);
		lblM.setBounds(229, 58, 88, 20);
		contentPane.add(lblM);
		
		maLk = new JTextField();
		maLk.setColumns(10);
		maLk.setBounds(229, 89, 100, 20);
		contentPane.add(maLk);
		
		
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int nam = localDate.getYear();
		namDongBo = new JComboBox();
		namDongBo.setBounds(10, 89, 100, 20);
		namDongBo.addItem(new Item(0, "--Chọn năm--"));
		for(int i = nam;i >= nam - 4; i --) {
			namDongBo.addItem(new Item(i, String.valueOf(i)));
		}
		contentPane.add(namDongBo);
		
		thangDongBo = new JComboBox();
		thangDongBo.addItem(new Item(0, "--Chọn tháng--"));
		for(int j = 12;j >= 1; j --) {
			thangDongBo.addItem(new Item(j, String.valueOf(j)));
		}
		thangDongBo.setBounds(117, 89, 100, 20);
		contentPane.add(thangDongBo);
	}
	
	class Item {

		  private int id;
		  private String description;

		  public Item(int id, String description) {
		    this.id = id;
		    this.description = description;
		  }

		  public int getId() {
		    return id;
		  }

		  public String getDescription() {
		    return description;
		  }

		  @Override
		  public String toString() {
		    return description;
		  }
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
	
	// table
	
	 private static TableModel createObjectDataModel() {
	        return new ObjectTableModel<Report>() {
	            @Override
	            public Object getValueAt(Report rp, int columnIndex) {
	                switch (columnIndex) {
	                    case 0:
	                        return rp.getId();
	                    case 1:
	                        return rp.getMaLk();
	                    case 2:
	                        return rp.getThang();
	                    case 3:
	                        return rp.getNam();
	                }
	                return null;
	            }

	            @Override
	            public int getColumnCount() {
	                return 4;
	            }
	            @Override
	            public String getColumnName(int column) {
	                switch (column) {
	                    case 0:
	                        return "STT";
	                    case 1:
	                        return "Mã đợt điều trị";
	                    case 2:
	                        return "tháng";
	                    case 3:
	                        return "năm";
	                }
	                return null;
	            }
	        };
	    }

	    private static PaginationDataProvider<Report> createDataProvider(List<Report> list, int total) {

	        return new PaginationDataProvider<Report>() {
	            @Override
	            public int getTotalRowCount() {
	                return total;
	            }

	            @Override
	            public List<Report> getRows(int startIndex, int endIndex) {
	                return list.subList(startIndex, endIndex);
	            }
	        };
	    }
}
