package drg.dtt.vn.thread;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import drg.dtt.vn.model.report.TongHopChiTiet;
import drg.dtt.vn.services.TongHopChiTietService;

public class TongHopChiTietThread extends Thread{
	
	@Autowired
	
	private static final Logger log = LoggerFactory.getLogger(TongHopChiTietThread.class);
	
	private TongHopChiTietService service;
	private String maCoSo;
	private int offset;
	private int limit;
	
	
	public TongHopChiTietThread(String maCoSo,
			int offset, int limit, TongHopChiTietService service) {
		this.service = service;
		this.offset = offset;
		this.maCoSo=maCoSo;
		this.limit = limit;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			log.info("Thread update trang thai");
			service.updateTrangThai(maCoSo, offset, limit);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

}
