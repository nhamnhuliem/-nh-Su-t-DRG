package drg.dashboard.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class LanguageUtil {
	private static Log log = LogFactoryUtil.getLog(LanguageUtil.class);
	
	private static Map<String, Properties> propertiesMap = new HashMap<String, Properties>();
	
	public static void main(String arg[]){
		System.out.println(getValue("Language_baocao", "portlet.baocao.label.noidung"));
	}
	
	/**
	 * return value of properties
	 * @param sourceName
	 * @param key
	 * @return
	 */
	public static String getValue(String sourceName,String key){
		Properties prop = propertiesMap.get(sourceName);
		if(prop == null){
			prop = new Properties();
			try {			
				InputStream is =  LanguageUtil.class.getResourceAsStream("/content/"+sourceName+".properties");
				prop.load(is);
				is.close();
				propertiesMap.put(sourceName, prop);
			} catch (IOException e) {
				log.error(e);
			}
		}
		
		try{
			return new String(prop.getProperty(key).getBytes("ISO-8859-1"), "UTF-8");
		}catch(Exception e){
			log.error(e);
		}
		return sourceName;
	}

}
