package drg.dtt.vn.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import drg.dtt.vn.model.nghiepvu.TongHop;
import drg.dtt.vn.repository.nghiepvu.TongHopRepository;


@Transactional
@Service
public class TongHopService {
	private static final Logger log = LoggerFactory.getLogger(TongHopService.class);
	
	@Autowired
	private TongHopRepository service;
	
	public TongHop getByMaLKMaCoSo(String malk, String maCoSo) {
		return service.getByMaLKMaCoSo(malk, maCoSo);
	}
	
	public TongHop save(TongHop th) {
		log.debug("Creating {}", th);
		return service.save(th);
	}
	
	public boolean deleteTongHop(long id) {
		boolean exist = service.existsById(id);
		if(exist) {
			service.deleteById(id);
		}
		return exist;
	}
}
