package drg.dtt.vn.utils;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class XSDUtil {
	private static final Logger log = LoggerFactory.getLogger(XSDUtil.class);

	
	public static Object parseToObject(String xmlString, Class<?> ...classes){
		
		if(StringUtils.isEmpty(xmlString)){
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(classes);
				Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
				return jaxbUnMarshaller.unmarshal(new ByteArrayInputStream(xmlString.getBytes()));
			} catch (JAXBException e) {
				log.info(e.getMessage());
			}
		}
		
		return null;
	}
	

	public static String parseToString(Object xmlObj, Class<?> ...classes){
		try{
			StringWriter stringWritter = new StringWriter();
	        Marshaller marshaller = JAXBContext.newInstance(classes).createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	       // marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
	        marshaller.marshal(xmlObj, stringWritter);
	        return stringWritter.toString().replaceAll("&lt;", "<").replaceAll("&gt;", ">");
	        
			
		}catch(JAXBException e){
			log.info(e.getMessage());
		}
		
		return "";
	}
}
