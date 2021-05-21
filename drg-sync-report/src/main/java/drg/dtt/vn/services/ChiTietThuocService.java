package drg.dtt.vn.services;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import drg.dtt.vn.model.nghiepvu.ChiTietThuoc;
import drg.dtt.vn.repository.nghiepvu.ChiTietThuocRepository;



@Transactional
@Service
public class ChiTietThuocService {
private static final Logger logger = LoggerFactory.getLogger(ChiTietThuocService.class);
	
	@Autowired
	private ChiTietThuocRepository service;
	
	public ChiTietThuoc save(ChiTietThuoc thuoc) {
		return service.save(thuoc);
	}
	
	public boolean saveAll(List<ChiTietThuoc> list) {
		try {
			service.saveAll(list);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
}
