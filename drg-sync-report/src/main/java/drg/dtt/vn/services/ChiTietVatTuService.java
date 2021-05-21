package drg.dtt.vn.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import drg.dtt.vn.model.nghiepvu.ChiTietVatTu;
import drg.dtt.vn.repository.nghiepvu.ChiTietVatTuRepository;

@Transactional
@Service
public class ChiTietVatTuService {
	@Autowired
	private ChiTietVatTuRepository service;

	private static final Logger logger = LoggerFactory.getLogger(ChiTietVatTuService.class);

	public ChiTietVatTu save(ChiTietVatTu vatTu) {
		return service.save(vatTu);
	}

	public boolean saveAll(List<ChiTietVatTu> list) {
		try {
			service.saveAll(list);
			return true;

		} catch (Exception e) {
			return false;
		}

	}
}
