package drg.dtt.vn.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import drg.dtt.vn.model.report.TongHopChiTiet;
import drg.dtt.vn.repository.report.TongHopChiTietRepository;


@Transactional
@Service
public class TongHopChiTietService {
	private static final Logger log = LoggerFactory.getLogger(TongHopChiTietService.class);
	
	@Autowired
	private TongHopChiTietRepository service;
	
	public TongHopChiTiet save(TongHopChiTiet th) {
		return service.save(th);
	}
	
	public void updateChiTiet(TongHopChiTiet th) {
		th.setTrangThai(1);
		service.save(th);
	}
	
	public int countChiTietSync(String maCoSo) {
		return service.countChiTietSync(maCoSo);
	}
	
	public List<TongHopChiTiet> getChiTietSync(String maCoSo, int limit){
		return service.getChiTietSync(maCoSo, limit);
	}
	
	public void updateTrangThai(String maCoSo,
			long minId, long maxId) {
		service.updateTrangThai(maCoSo, minId, maxId);
		
	}
}
