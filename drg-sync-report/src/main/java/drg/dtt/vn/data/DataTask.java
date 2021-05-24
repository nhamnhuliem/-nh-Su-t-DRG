package drg.dtt.vn.data;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import drg.dtt.vn.model.json.ChiTietThuoc;
import drg.dtt.vn.model.json.ChiTietVatTu;
import drg.dtt.vn.model.json.HoSo;
import drg.dtt.vn.model.json.ThongKe;
import drg.dtt.vn.model.json.TongHop;
import drg.dtt.vn.model.report.Report;
import drg.dtt.vn.services.ChiTietThuocService;
import drg.dtt.vn.services.ChiTietVatTuService;
import drg.dtt.vn.services.ReportService;
import drg.dtt.vn.services.TongHopService;
import drg.dtt.vn.utils.Base64Utils;
import drg.dtt.vn.utils.GzipUtil;

public class DataTask {
	private static final Logger log = LoggerFactory.getLogger(DataTask.class);

	
	public static void insert(String content,String maCoSo, TongHopService tongHopService,
			ChiTietVatTuService vatTuService, ChiTietThuocService thuocService, ReportService reportService) {
		String hoSoJson = "";
		Gson gson = new Gson();
		try {
			hoSoJson = GzipUtil.decompress(content);
			hoSoJson = Base64Utils.decode(hoSoJson);
		}catch (Exception e) {
			log.error(e.getMessage());
		}
		
		HoSo hoSo = gson.fromJson(hoSoJson, HoSo.class);
		
		if(hoSo != null) {
			// insert to Report
			ThongKe thongKe = hoSo.getThongKe();
			if(thongKe != null) {
				log.info("insert to Report");
				try {
					Report rp = new Report(maCoSo, thongKe.getMaLk(), 0, thongKe.getNam(), thongKe.getThang(), 1, thongKe.getTongChi(), thongKe.getTongBHTT());
					reportService.save(rp);
				} catch (Exception e) {
					log.info(e.getMessage());
				}
			}
			
			// insert to tonghop
			TongHop th = hoSo.getTongHop();
			long tongHopId = 0;
			String maCoSoByXML = "";
			if(th != null) {
				maCoSoByXML = th.getMa_cskcb();
				log.info("insert to tonghop");
				drg.dtt.vn.model.nghiepvu.TongHop tongHop = new drg.dtt.vn.model.nghiepvu.TongHop(
						th.getMa_lk(), th.getStt(), th.getMa_bn(), th.getHo_ten(), th.getNgay_sinh(), th.getGioi_tinh(), 
						th.getDia_chi(), th.getMa_the(), th.getMa_dkbd(), th.getGt_the_tu(), th.getGt_the_den(), th.getMien_cung_ct(), 
						th.getTen_benh(), th.getMa_benh(), th.getMa_benhkhac(), th.getMa_lydo_vvien(), th.getMa_noi_chuyen(), 
						th.getMa_tai_nan(), th.getNgay_vao(), th.getNgay_ra(), th.getSo_ngay_dtri(), th.getKet_qua_dtri(), th.getTinh_trang_rv(),
						th.getNgay_ttoan(), th.getT_thuoc(), th.getT_vtyt(), th.getT_tongchi(), th.getT_bntt(), th.getT_bncct(), th.getT_bhtt(), th.getT_nguonkhac(),
						th.getT_ngoaids(), th.getNam_qt(), th.getThang_qt(), th.getMa_loai_kcb(), th.getMa_khoa(), th.getMa_cskcb(), th.getMa_khuvuc(), th.getMa_pttt_qt(), 
						th.getCan_nang(), th.getNgay_tao(), th.getTrangthai());
				try {
					drg.dtt.vn.model.nghiepvu.TongHop tongHop2 = tongHopService.save(tongHop);
					tongHopId =tongHop2.getId();
					
					if(tongHop2 != null) {
						// insert to thuoc
						
						List<ChiTietThuoc> listThuocs = hoSo.getChiTietThuoc();
						if(listThuocs != null && listThuocs.size() > 0) {
							List<drg.dtt.vn.model.nghiepvu.ChiTietThuoc> listThuocS = new ArrayList<drg.dtt.vn.model.nghiepvu.ChiTietThuoc>();
							log.info("insert to thuoc");
							for (ChiTietThuoc thuoc : listThuocs) {
								drg.dtt.vn.model.nghiepvu.ChiTietThuoc chiTietThuoc = new drg.dtt.vn.model.nghiepvu.ChiTietThuoc(
										thuoc.getMa_lk(), thuoc.getStt(), thuoc.getMa_thuoc(), thuoc.getMa_nhom(), thuoc.getTen_thuoc(), thuoc.getDon_vi_tinh(), 
										thuoc.getHam_luong(), thuoc.getDuong_dung(), 
										thuoc.getLieu_dung(), thuoc.getSo_dang_ky(), thuoc.getTt_thau(), thuoc.getPham_vl(), thuoc.getTyle_tt(), thuoc.getSo_luong(),
										thuoc.getDon_gia(), thuoc.getThanh_tien(),
										thuoc.getMuc_huong(), thuoc.getT_nguonkhac(), thuoc.getT_bntt(), thuoc.getT_bhtt(), thuoc.getT_bncct(), thuoc.getT_ngoaids(), thuoc.getMa_khoa(), thuoc.getMa_bac_si(), 
										thuoc.getMa_benh(), thuoc.getNgay_yl(), thuoc.getMa_pttt(), thuoc.getNgay_tao(), thuoc.getTrangthai(), maCoSoByXML, tongHopId);
								listThuocS.add(chiTietThuoc);
							}
							try {
								thuocService.saveAll(listThuocS);
							} catch (Exception e) {
								log.info(e.getMessage());
							}
						}
						
						//insert to vattu
						
						List<ChiTietVatTu> listVatTus = hoSo.getChiTietVatTu();
						if(listVatTus != null && listVatTus.size()>0) {
							List<drg.dtt.vn.model.nghiepvu.ChiTietVatTu> listChiTietVatTus = new ArrayList<drg.dtt.vn.model.nghiepvu.ChiTietVatTu>();
							log.info("insert to vattu");
							for (ChiTietVatTu vt : listVatTus) {
								drg.dtt.vn.model.nghiepvu.ChiTietVatTu chiTietVatTu = new drg.dtt.vn.model.nghiepvu.ChiTietVatTu(
										vt.getMa_lk(), vt.getStt(), vt.getMa_dich_vu(), vt.getMa_vat_tu(), vt.getMa_nhom(),
										vt.getGoi_vtyt(), vt.getTen_vat_tu(), vt.getTen_dich_vu(), vt.getDon_vi_tinh(), 
										vt.getPham_vi(), vt.getSo_luong(), vt.getDon_gia(), vt.getTt_thau(), vt.getTyle_tt(), vt.getThanh_tien(),
										vt.getT_trantt(), vt.getMuc_huong(), vt.getT_nguonkhac(), vt.getT_bntt(), vt.getT_bhtt(), vt.getT_bncct(), 
										vt.getT_ngoalds(), vt.getMa_khoa(), vt.getMa_giuong(), vt.getMa_bac_si(), vt.getMa_benh(), vt.getNgay_yl(),
										vt.getNgay_kq(), vt.getMa_pttt(), vt.getNgay_tao(), vt.getTrangthai(), maCoSoByXML, tongHopId);
								listChiTietVatTus.add(chiTietVatTu);
							}
							try {
								vatTuService.saveAll(listChiTietVatTus);
							} catch (Exception e) {
								log.info(e.getMessage());
							}
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
					log.info(e.getMessage());
				}
			}
			
			
		}
	}
}
