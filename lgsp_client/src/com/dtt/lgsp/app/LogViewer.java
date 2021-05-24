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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import org.apache.log4j.Logger;
import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.core.MyTableModel;
import com.dtt.lgsp.entities.Report;
import com.dtt.lgsp.table.ObjectTableModel;
import com.dtt.lgsp.table.PaginatedTableDecorator;
import com.dtt.lgsp.table.PaginationDataProvider;

import javax.swing.JTextField;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class LogViewer extends JPanel {
	static final Logger logger = Logger.getLogger(LogViewer.class);
	JScrollPane scroll;
	JTable table;
	MyTableModel tableModel;

	JPanel contentPane;
	
	JTextField maLk;
	JComboBox namDongBo;
	JComboBox thangDongBo;
	JLabel lblTongHoSo;
	JLabel lblDaGui;
	
	static int nam = 0;
	static int thang = 0;
	static String maDotDieuTri = "";

	public LogViewer() {

		createUI();
	}

	public void createUI() {
		setLayout(null);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setSize(770, 550);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("KẾT QUẢ GỬI HỒ SƠ");
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

		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(scroll!=null) {
						contentPane.remove(scroll);
					}
					Item namItem = (Item) namDongBo.getSelectedItem();
					Item thangItem = (Item) thangDongBo.getSelectedItem();
					nam =  namItem.getId();
					thang =  thangItem.getId();
					maDotDieuTri = maLk.getText();
					int total = DttConsumer.countReport(maDotDieuTri, nam, thang);
					//List<Report> list = new ArrayList<Report>();
					lblDaGui.setText("Tổng hồ sơ đã gửi: ");
					lblTongHoSo.setText(String.valueOf(total));
					
					JLabel noData = new JLabel("Không tìm thấy dữ liệu");
					
					if (total == 0) {
						if(scroll!=null) {
							contentPane.remove(scroll);
						}
						noData.setHorizontalAlignment(SwingConstants.CENTER);
						noData.setFont(new Font("Segoe UI", Font.BOLD, 22));
						noData.setBackground(Color.LIGHT_GRAY);
						noData.setForeground(Color.WHITE);
						noData.setBounds(24, 165, 700, 30);
						noData.setOpaque(false);
						contentPane.add(noData);
						contentPane.repaint();
						contentPane.validate();
						//contentPane.updateUI();
					}else {
						table = new JTable(createObjectDataModel());
					    DefaultTableCellRenderer hr = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
					    hr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
					    
					    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
					    centerRenderer.setHorizontalAlignment( JLabel.CENTER );
					    table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
					    table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
					    table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
					    table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
					    
						table.getTableHeader().setFont(new Font("Segoe UI ", Font.BOLD, 12));
						table.getTableHeader().setOpaque(false);
						table.getTableHeader().setBackground(new Color(32, 136, 203));
						table.getTableHeader().setForeground(new Color(255, 255, 255));
						// set with height
						TableColumnModel columnModel = table.getColumnModel();
						columnModel.getColumn(0).setPreferredWidth(150);
						columnModel.getColumn(1).setPreferredWidth(150);
						columnModel.getColumn(1).setResizable(true);
						columnModel.getColumn(2).setPreferredWidth(150);
						columnModel.getColumn(2).setResizable(true);
						columnModel.getColumn(3).setPreferredWidth(150);
						columnModel.getColumn(3).setResizable(true);
						//columnModel.set
						
						table.setRowHeight(25);
						table.setShowVerticalLines(true);
						table.setIntercellSpacing(new Dimension(0, 0));
						table.setRowMargin(0);
						table.setLocation(10, 100);
						table.setSize(750, 100);
						table.setSelectionBackground(new Color(173, 223, 248));
						table.setRowSelectionAllowed(true);
						///
						
						PaginationDataProvider<Report> dataProvider = createDataProvider(total);
						PaginatedTableDecorator<Report> paginatedDecorator = PaginatedTableDecorator.decorate(table,
					                dataProvider, new int[]{5, 10, 20, 50, 75, 100}, 10);
						
						scroll = new JScrollPane(paginatedDecorator.getContentPanel());
						scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						scroll.setBounds(10, 150, 750, 420);
						scroll.add(paginatedDecorator.getContentPanel());
						scroll.setViewportView(paginatedDecorator.getContentPanel());
						contentPane.add(scroll);
						contentPane.setVisible(true);
						contentPane.validate();
						
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
		
		// nam
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int nam = localDate.getYear();
		namDongBo = new JComboBox<Item>();
		namDongBo.setBounds(10, 89, 100, 20);
		namDongBo.addItem(new Item(0, "--Chọn năm--"));
		for(int i = nam;i >= nam - 4; i --) {
			namDongBo.addItem(new Item(i, String.valueOf(i)));
		}
		contentPane.add(namDongBo);
		
		// thang
		thangDongBo = new JComboBox<Item>();
		thangDongBo.addItem(new Item(0, "--Chọn tháng--"));
		for(int j = 12;j >= 1; j --) {
			thangDongBo.addItem(new Item(j, String.valueOf(j)));
		}
		thangDongBo.setSelectedIndex(0);
		thangDongBo.setBounds(117, 89, 100, 20);
		contentPane.add(thangDongBo);
		
		lblDaGui = new JLabel("");
		lblDaGui.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDaGui.setBounds(10, 120, 123, 14);
		contentPane.add(lblDaGui);
		
		lblTongHoSo = new JLabel("");
		lblTongHoSo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTongHoSo.setForeground(Color.RED);
		lblTongHoSo.setBounds(140, 120, 126, 14);
		contentPane.add(lblTongHoSo);
	}
	
	static class Item {

		  private int id;
		  private String value;

		  public Item(int id, String description) {
		    this.id = id;
		    this.value = description;
		  }

		  public int getId() {
		    return id;
		  }

		  public String getDescription() {
		    return value;
		  }

		  @Override
		  public String toString() {
		    return value;
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
	
	 private static PaginationDataProvider<Report> createDataProvider(int total) {
        return new PaginationDataProvider<Report>() {
            @Override
            public int getTotalRowCount() {
                return total;
            }
            @Override
            public List<Report> getRows(int startIndex, int endIndex) {
                //return list.subList(startIndex, endIndex);
            	try {
            		return DttConsumer.getReport(maDotDieuTri, nam, thang, endIndex - startIndex, startIndex);
				} catch (Exception e) {
					return null;
				}
            }
        };
    }
	 
	 // table model
	 
	  private static TableModel createObjectDataModel() {
	        return new ObjectTableModel<Report>() {
	            @Override
	            public Object getValueAt(Report rp, int columnIndex) {
	                switch (columnIndex) {
	                    case 0:
	                    	return rp.getMaLk();
	                    case 1:
	                    	return rp.getMaCoSo();
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
	                        return "MÃ ĐỢT ĐIỀU TRỊ";
	                    case 1:
	                    	return "MÃ CƠ SỞ";
	                    case 2:
	                    	return "THÁNG";
	                    case 3:
	                    	return "NĂM";
	                }
	                return null;
	            }
	        };
	    }
}
