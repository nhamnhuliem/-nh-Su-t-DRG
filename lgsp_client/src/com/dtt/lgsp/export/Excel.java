package com.dtt.lgsp.export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dtt.lgsp.entities.TongHopThongKe;

public class Excel {
	
	public void export(List<TongHopThongKe> result) {
 
        JFileChooser chooser = new JFileChooser();
		 int i = chooser.showSaveDialog(chooser);
		 if (i == JFileChooser.APPROVE_OPTION) {
		  File file = chooser.getSelectedFile();
	        try{
	 
	        	String excelFilePath = new String(file + ".xlsx");
	            XSSFWorkbook workbook = new XSSFWorkbook();
	            XSSFSheet sheet = workbook.createSheet("Đối soát");
	 
	            writeHeaderLine(sheet, workbook);
	 
	            writeDataLines(result, workbook, sheet);
	            JOptionPane.showMessageDialog(null, "Xuất file thành công!");
	            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
	            workbook.write(outputStream);
	            workbook.close();
	 
	        } catch (IOException e) {
	            System.out.println("File IO error:");
	            e.printStackTrace();
	        }
		 }
    }
	
	
	 private void writeHeaderLine(XSSFSheet sheet,XSSFWorkbook workbook) {
		 
	        Row headerRow = sheet.createRow(0);
	        
	        
	        XSSFColor color = new XSSFColor(new java.awt.Color(43,150,150), null);
	        XSSFCellStyle cellStyle = workbook.createCellStyle();
	        cellStyle.setFillForegroundColor(color);
	        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        cellStyle.setAlignment(HorizontalAlignment.CENTER);
	 
	        Cell headerCell = headerRow.createCell(0);
	        headerCell.setCellValue("Mã cơ sở");
	        headerCell.setCellStyle(cellStyle);
	        
	        headerCell = headerRow.createCell(1);
	        headerCell.setCellStyle(cellStyle);
	        headerCell.setCellValue("Năm QT");
	 
	        headerCell = headerRow.createCell(2);
	        headerCell.setCellStyle(cellStyle);
	        headerCell.setCellValue("Tháng QT");
	 
	        headerCell = headerRow.createCell(3);
	        headerCell.setCellStyle(cellStyle);
	        headerCell.setCellValue("Tổng hồ sơ");
	 
	        headerCell = headerRow.createCell(4);
	        headerCell.setCellStyle(cellStyle);
	        headerCell.setCellValue("Tổng chi");
	        
	        headerCell = headerRow.createCell(5);
	        headerCell.setCellStyle(cellStyle);
	        headerCell.setCellValue("Tổng BHTT");
	    }
	
	
	  private void writeDataLines(List<TongHopThongKe> result, XSSFWorkbook workbook,
	            XSSFSheet sheet) {
	        int rowCount = 1;
	        
	        for(TongHopThongKe th : result) {
	        	String maCoSo = th.getMaCoSo();
	            int namQT = th.getNamQT();
	            int thangQT = th.getThangQT();
	            long tongHS = th.getTongHoSo();
	            double tongChi = th.getTongChi() ;
	            double tongBHTT = th.getTongBaoHiemTT();
	 
	            Row row = sheet.createRow(rowCount++);
	 
	            int columnCount = 0;
	            
		        XSSFCellStyle cellStyle = workbook.createCellStyle();
		        cellStyle.setAlignment(HorizontalAlignment.CENTER);
	            
	            Cell cell = row.createCell(columnCount++);
	            cell.setCellValue(maCoSo);
	            cell.setCellStyle(cellStyle);
	 
	            cell = row.createCell(columnCount++);
	            cell.setCellValue(namQT);
	            cell.setCellStyle(cellStyle);
	 
	            cell = row.createCell(columnCount++);
	            cell.setCellValue(thangQT);
	            cell.setCellStyle(cellStyle);
	 
	            cell = row.createCell(columnCount++);
	            cell.setCellValue(tongHS);
	            cell.setCellStyle(cellStyle);
	 
	            cell = row.createCell(columnCount++);
	            cell.setCellValue(tongChi);
	            
	            cell = row.createCell(columnCount);
	            cell.setCellValue(tongBHTT);
	        }
	 
	    }
	
}
