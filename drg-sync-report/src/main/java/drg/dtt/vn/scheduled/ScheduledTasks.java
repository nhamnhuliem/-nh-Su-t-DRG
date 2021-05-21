package drg.dtt.vn.scheduled;

import java.util.HashMap;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import drg.dtt.vn.model.report.ThongTinGuiHoSo;
import drg.dtt.vn.repository.report.ThongTinGuiHoSoRepository;
import drg.dtt.vn.utils.VariableStatic;

@Component
public class ScheduledTasks {
	@Autowired
	private ThongTinGuiHoSoRepository thongTinGuiHoSoRepository;

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	@Scheduled(fixedRate = 600000)
	public void scheduleTaskWithFixedRate() {
//		log.info("====Ä�á»“ng bá»™ vÃ o db====== "+VariableStatic.activeCode.size());
//		int stt=0;
//		for (Entry<String, Integer> coso : VariableStatic.activeCode.entrySet()) {
//			log.info(++stt+". Key: " + coso.getKey() + " & Value: " + coso.getValue());
//			if (coso.getValue() > 0) {
//				ThongTinGuiHoSo thongTinGuiHoSo = thongTinGuiHoSoRepository.getActivecode(coso.getKey());
//				thongTinGuiHoSo.setTonggui(coso.getValue());
//				thongTinGuiHoSoRepository.save(thongTinGuiHoSo);
//			}
//		}
	}
}
