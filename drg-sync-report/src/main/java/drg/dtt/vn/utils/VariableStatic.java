package drg.dtt.vn.utils;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import drg.dtt.vn.model.report.ThongTinGuiHoSo;
import drg.dtt.vn.repository.report.ThongTinGuiHoSoRepository;

@Component
public class VariableStatic implements ApplicationRunner{
	public static HashMap<String, Integer> activeCode = new HashMap<String, Integer>();
	@Autowired
	private ThongTinGuiHoSoRepository thongTinGuiHoSoRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<ThongTinGuiHoSo> thongTinGuiHoSos = thongTinGuiHoSoRepository.getAllTrangThai(1);
		for(ThongTinGuiHoSo thongTinGuiHoSo:thongTinGuiHoSos) {
			activeCode.put(thongTinGuiHoSo.getActivecode(), thongTinGuiHoSo.getTonggui());
		}
	}
	
	
	
}
