package drg.dtt.vn.services;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import drg.dtt.vn.model.report.ThongTinGuiHoSo;
import drg.dtt.vn.repository.report.ThongTinGuiHoSoRepository;



@Transactional
@Service
public class ThongTinGuiHoSoService {
private static final Logger logger = LoggerFactory.getLogger(ThongTinGuiHoSoService.class);
	
	@Autowired
	private ThongTinGuiHoSoRepository service;
	
	public ThongTinGuiHoSo save(ThongTinGuiHoSo thongTinGuiHoSo) {
		logger.info("Creating {}", thongTinGuiHoSo);
		return service.save(thongTinGuiHoSo);
	}
	
	public boolean saveAll(List<ThongTinGuiHoSo> list) {
		logger.info("Creating {}", list.size());
		try {
			service.saveAll(list);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
}
