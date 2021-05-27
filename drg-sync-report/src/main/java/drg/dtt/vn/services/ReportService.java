package drg.dtt.vn.services;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import drg.dtt.vn.model.report.Report;
import drg.dtt.vn.repository.report.ReportRepository;


@Transactional
@Service
public class ReportService {
	private static final Logger log = LoggerFactory.getLogger(ReportService.class);
	
	@Autowired
	private ReportRepository service;
	
	public Integer countAllByCS_LK_NAM_THANG(String maCoSo, String maLK, int nam, int thang, Date tuNgay, Date denNgay) {
		return service.countAllByCS_LK_NAM_THANG(maCoSo, maLK, nam, thang, tuNgay, denNgay);
	}
	
	public Report save(Report rp) {
		return service.save(rp);
	}
	
	public List<Report> getAllByCS_LK_NAM_THANG(String maCoSo, String maLK, int nam, int thang,Date tuNgay, Date denNgay,int offset,int limit) {
		return service.getAllByCS_LK_NAM_THANG(maCoSo, maLK, nam, thang,tuNgay, denNgay, offset, limit);
	}
	
	public int countChiTietSync(String maCoSo) {
		return service.countChiTietSync(maCoSo);
	}
	
	public List<Report> getChiTietSync(String maCoSo, int limit){
		return service.getChiTietSync(maCoSo, limit);
	}
	
	public void updateTrangThai(String maCoSo,
			long minId, long maxId) {
		service.updateTrangThai(maCoSo, minId, maxId);
		
	}
}
