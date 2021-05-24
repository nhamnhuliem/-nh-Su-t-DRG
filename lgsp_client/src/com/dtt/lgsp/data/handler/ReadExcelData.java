package com.dtt.lgsp.data.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dtt.lgsp.app.business.DttConsumer;
import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.cron.DttCron;
import com.dtt.lgsp.app.cron.ThreadProcess3360;
import com.dtt.lgsp.app.keys.ResponseKeys;
import com.dtt.lgsp.entities.ProfileEntity;
import com.dtt.lgsp.entities.Result;
import com.dtt.lgsp.model.HoSo;
import com.dtt.lgsp.model.ThongKe;
import com.dtt.lgsp.model.TongHop;

public class ReadExcelData extends ThreadProcess3360{


	public ReadExcelData(ProfileEntity profileEntity) {
		super(profileEntity);
		// TODO Auto-generated constructor stub
	}


	static final Logger logger = Logger.getLogger(ReadExcelData.class);
	
	@SuppressWarnings("deprecation")
	public void readExcel(String excelFilePath) throws IOException {
	        // Get file
	        InputStream inputStream = new FileInputStream(new File(excelFilePath));
	        // Get workbook
	        Workbook workbook = getWorkbook(inputStream, excelFilePath);
	        // Get sheet
	        Sheet sheet = workbook.getSheetAt(0);
	        // Get all rows
	        Iterator<Row> iterator = sheet.iterator();
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            if (nextRow.getRowNum() == 0) {
	                // Ignore header
	                continue;
	            }
	            // Get all cells
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	            // Read cells and set value for book object
	            TongHop tongHop = new TongHop();
	            
	            while (cellIterator.hasNext()) {
	                //Read cell
	                Cell cell = cellIterator.next();
	                cell.setCellType(CellType.STRING);
	                Object cellValue = getCellValue(cell);
	                if (cellValue == null || cellValue.toString().isEmpty()) {
	                    continue;
	                }
	                // Set value for book object
	                int columnIndex = cell.getColumnIndex();
	                try {
	                	 switch (columnIndex) {
			                case CellKey.STT:
			                	tongHop.setStt(parseToInt(cell));
			                    break;
			                case CellKey.DIA_CHI:
			                	tongHop.setDia_chi((String) getCellValue(cell));
			                    break;
			                case CellKey.GIOI_TINH:
			                	tongHop.setGioi_tinh(parseToInt(cell));
			                    break;
			                case CellKey.GT_THE_DEN:
			                	tongHop.setGt_the_den((String) getCellValue(cell));
			                    break;
			                case CellKey.GT_THE_TU:
			                	tongHop.setGt_the_tu((String) getCellValue(cell));
			                    break;
			                case CellKey.HO_TEN:
			                	tongHop.setHo_ten((String) getCellValue(cell));
			                    break;
			                case CellKey.KET_QUA_DTRI:
			                	tongHop.setKet_qua_dtri(parseToInt(cell));
			                    break;
			                case CellKey.MA_BENH:
			                	tongHop.setMa_benh((String) getCellValue(cell));
			                    break;
			                case CellKey.MA_BENHKHAC:
			                	tongHop.setMa_benhkhac((String) getCellValue(cell));
			                    break;
			                case CellKey.MA_BN:
			                	tongHop.setMa_bn((String) getCellValue(cell));
			                	tongHop.setMa_lk((String) getCellValue(cell));
			                    break;
			                case CellKey.MA_CSKCB:
			                	tongHop.setMa_cskcb((String) getCellValue(cell));
			                    break;
			                case CellKey.MA_DKBD:
			                	tongHop.setMa_dkbd((String) getCellValue(cell));
			                    break;
			                case CellKey.MA_KHOA:
			                	tongHop.setMa_khoa((String) getCellValue(cell));
			                    break;
			                case CellKey.MA_KHUVUC:
			                	tongHop.setMa_khuvuc((String) getCellValue(cell));
			                    break;
			                case CellKey.MA_LOAIKCB:
			                	tongHop.setMa_loai_kcb(parseToInt(cell));
			                    break;
			                case CellKey.MA_LYDO_VVIEN:
			                	tongHop.setMa_lydo_vvien(parseToInt(cell));
			                    break;
			                case CellKey.MA_NOI_CHUYEN:
			                	tongHop.setMa_noi_chuyen((String) getCellValue(cell));
			                    break;
			                case CellKey.MA_THE:
			                	tongHop.setMa_the((String) getCellValue(cell));
			                    break;
			                case CellKey.NAM_QT:
			                	tongHop.setNam_qt(parseToInt(cell));
			                    break;
			                case CellKey.THANG_QT:
			                	tongHop.setThang_qt(parseToInt(cell));
			                    break;
			                case CellKey.NGAY_RA:
			                	tongHop.setNgay_ra((String) getCellValue(cell));
			                    break;
			                case CellKey.NGAY_SINH:
			                	tongHop.setNgay_sinh((String) getCellValue(cell));
			                    break;
			                case CellKey.NGAY_VAO:
			                	tongHop.setNgay_vao((String) getCellValue(cell));
			                    break;
			                case CellKey.SO_NGAY_DTRI:
			                	tongHop.setSo_ngay_dtri(parseToDouble(cell));
			                    break;
			                case CellKey.T_BHTT:
			                	tongHop.setT_bhtt(parseToDouble(cell));
			                    break;
			                case CellKey.T_BNTT:
			                	tongHop.setT_bntt(parseToDouble(cell));
			                    break;
			                case CellKey.T_TONGCHI:
			                	tongHop.setT_tongchi(parseToDouble(cell));
			                    break;
			                case CellKey.T_THUOC:
			                	tongHop.setT_thuoc(parseToDouble(cell));
			                    break;
			                case CellKey.T_VTYT:
			                	tongHop.setT_vtyt(parseToDouble(cell));
			                    break;
			                case CellKey.T_NGUONKHAC:
			                	tongHop.setT_nguonkhac(parseToDouble(cell));
			                    break;
			                    
			                    /// 3360
			                case CellKey.T_XN:
			                	tongHop.setT_xn(parseToDouble(cell));
			                    break;
			                    
			                case CellKey.T_PTTT:
			                	tongHop.setT_pttt(parseToDouble(cell));
			                    break;
			                case CellKey.T_CDHA:
			                	tongHop.setT_cdha(parseToDouble(cell));
			                    break;
			                case CellKey.T_MAU:
			                	tongHop.setT_mau(parseToDouble(cell));
			                    break;
			                case CellKey.T_VCHUYEN:
			                	tongHop.setT_vchuyen(parseToDouble(cell));
			                    break;
			                case CellKey.T_KHAM:
			                	tongHop.setT_kham(parseToDouble(cell));
			                    break;
			                case CellKey.T_VTYT_TYLE:
			                	tongHop.setT_vtyt_tyle(parseToDouble(cell));
			                    break;
			                case CellKey.T_THUOC_TYLE:
			                	tongHop.setT_thuoc_tyle(parseToDouble(cell));
			                    break;
			                case CellKey.T_DVKT_TYLE:
			                	tongHop.setT_dvkt_tyle(parseToDouble(cell));
			                    break;
			                case CellKey.T_GIUONG:
			                	tongHop.setT_giuong(parseToDouble(cell));
			                    break;
			                default:
			                    break;
			                }
					} catch (Exception e) {
						logger.error(e.getMessage());
					}
	 
	            }
	            if(StringUtils.isNotEmpty(tongHop.getMa_lk())) {
	            	ThongKe thongKe = new ThongKe(tongHop.getThang_qt(), tongHop.getNam_qt(), tongHop.getMa_lk(), tongHop.getT_tongchi(), tongHop.getT_bhtt());
	            	HoSo hoSo = new HoSo(tongHop, null, null, thongKe);
	            	dongBoHoSo(hoSo, 2, 1);
	            }
	        }
	 
	        workbook.close();
	        inputStream.close();
	    }
	 
	    // Get Workbook
	    private static Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException {
	        Workbook workbook = null;
	        if (excelFilePath.endsWith("xlsx")) {
	            workbook = new XSSFWorkbook(inputStream);
	        } else if (excelFilePath.endsWith("xls")) {
	            workbook = new HSSFWorkbook(inputStream);
	        } else {
	            throw new IllegalArgumentException("The specified file is not Excel file");
	        }
	 
	        return workbook;
	    }
	 
	    // Get cell value
	    private static Object getCellValue(Cell cell) {
	        CellType cellType = cell.getCellTypeEnum();
	        Object cellValue = null;
	        switch (cellType) {
	        case BOOLEAN:
	            cellValue = cell.getBooleanCellValue();
	            break;
	        case FORMULA:
	            Workbook workbook = cell.getSheet().getWorkbook();
	            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
	            cellValue = evaluator.evaluate(cell).getNumberValue();
	            break;
	        case NUMERIC:
	            cellValue = cell.getNumericCellValue();
	            break;
	        case STRING:
	            cellValue = cell.getStringCellValue();
	            break;
	        case _NONE:
	        case BLANK:
	        case ERROR:
	            break;
	        default:
	            break;
	        }
	 
	        return cellValue;
	    }
	    
	    private static int parseToInt(Cell cell) {
	    	String cellValue = (String) getCellValue(cell);
	    	int value = Integer.valueOf(cellValue);
	    	return value;
	    }
	    
	   private static double parseToDouble(Cell cell) {
		   String cellValue = (String) getCellValue(cell);
	    	double value = Double.valueOf(cellValue);
	    	return value;
	   }
	   
	   
	   public boolean dongBoHoSo(HoSo hoSo, int loaiHoSo, int soLuong) {
			try {
				ProfileEntity config = PreferencesConfiguration.getConfig();
				String clientVersion = config.getClientVersion();
				String version = config.getVersion();
				
				if(!clientVersion.equals(version)) {
					logger.info(
							"Phiên bản phần mềm " + clientVersion + " của bạn đã cũ, vui lòng update phiên bản "+ version +" mới để tiếp tục...");
					JOptionPane.showMessageDialog(null, "Phiên bản phần mềm " + clientVersion + " của bạn đã cũ, vui lòng update phiên bản "+ version +" mới để tiếp tục...", "",
							JOptionPane.INFORMATION_MESSAGE);
					sleep(1000 * 60 * 60);
				}
				Result result = DttConsumer.send3360(hoSo, loaiHoSo);
				if (result == null) {
					logger.info(
							"Bạn chưa được phân luồng để tải dữ liệu - xin chờ một thời gian. Hệ thống sẽ tự động tải khi được phân luồng....");
					sleep(1000 * 60 * 5);
					return dongBoHoSo(hoSo, loaiHoSo, soLuong);

				} else {
					if (ResponseKeys.OK.equals(result.getCode())) {
						++DttCron.thanhCong;
						++tongHoSoFile;
						
						successHoSoSync(result.getDescription());
						sleep((long) (config.getTimeSlepp() * 1000));
						logger.info("Gửi thành công : " + (DttCron.thanhCong) + "(hồ sơ) - time: " + config.getTimeSlepp());
						return true;
					} else if (ResponseKeys.ERROR_HS.equals(result.getCode())) {
						logger.info("Thông báo: Phát hiện 1 hồ sơ trong file bị lỗi dữ liệu" );
						return true;
					}else if (ResponseKeys.ACTIVE_CODE_NULL.equals(result.getCode())) {
						logger.info("Tài khoản của bạn không chính xác!");
						sleep(1000 * 60 * 5);
						return dongBoHoSo(hoSo, loaiHoSo, soLuong);
					} else if (ResponseKeys.ACTIVE_CODE_NOT.equals(result.getCode())) {
						logger.info("Tài khoản của bạn đã bị khóa bởi Quản trị viên BYT xin vui lòng liên hệ qua nhóm Zalo để được hỗ trợ!");
						sleep(1000 * 60 * 5);
						return dongBoHoSo(hoSo, loaiHoSo, soLuong);
					}else if (ResponseKeys.USER_IS_NOTACTIVE.equals(result.getCode())) {
						logger.info("Tài khoản của bạn chưa kích hoạt, vui lòng liên hệ Quản trị viên BYT xin vui lòng liên hệ qua nhóm Zalo để được hỗ trợ!");
						sleep(1000 * 60 * 5);
						return dongBoHoSo(hoSo, loaiHoSo, soLuong);
					}else if(ResponseKeys.WAS_SEND.equals(result.getCode())){
						logger.info("Hồ sơ " + result.getDescription() +" bị trùng, đã được đồng bộ");
						return false;
					}else {
						logger.info("Có lỗi xảy ra: " + result.getCode());
						sleep(1000 * 60 * 5);
						return dongBoHoSo(hoSo, loaiHoSo, soLuong);
					}
				}

			} catch (Exception e) {
				logger.info(
						"Bạn chưa được phân luồng để tải dữ liệu - xin chờ một thời gian. Hệ thống sẽ tự động tải khi được phân luồng....!");
				try {
					sleep(20000);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return dongBoHoSo(hoSo, loaiHoSo, soLuong);
			}
		}
}	
