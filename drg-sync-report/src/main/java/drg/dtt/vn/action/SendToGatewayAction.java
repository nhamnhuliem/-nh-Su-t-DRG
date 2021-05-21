package drg.dtt.vn.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import drg.dtt.vn.model.nghiepvu.Result;
import drg.dtt.vn.utils.Base64Utils;
import drg.dtt.vn.utils.WebserviceCallUtils;
import drg.dtt.vn.utils.XSDUtil;

public class SendToGatewayAction {
	private static final Logger log = LoggerFactory.getLogger(SendToGatewayAction.class);
	
	
	private static String url_service = "http://localhost:8080/api/4210";
	//private static String url_service = "http://171.244.134.5:8080/drg-sync/api/4210";
	public static boolean sendToGateway(String content, String activeCode, int loaiHoSo) {
		try {
			String url = url_service + "/recive";
			String user = "";
			String password = "";
			
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("activecode", activeCode);
			params.put("content", content);
			params.put("loaihs", String.valueOf(loaiHoSo));
			params.put("soluong", String.valueOf(0));
			
			
			new WebserviceCallUtils().sendMessagePost(url, user,
					password, params);
			log.info("Gui ho sang gateway db 2");
			return true;
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		return false;
	}
}
