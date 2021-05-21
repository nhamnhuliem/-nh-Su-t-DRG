package drg.dtt.vn.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drg.dtt.vn.model.report.DataConfigModel;
import drg.dtt.vn.repository.report.DataConfigRepository;

@Transactional
@Service
public class DataConfigService {
	@Autowired 
	private DataConfigRepository r;
	
	public List<DataConfigModel> getAll() {
		return r.getAll();
	}
}
