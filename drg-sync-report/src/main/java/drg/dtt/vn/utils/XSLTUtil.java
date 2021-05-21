package drg.dtt.vn.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public class XSLTUtil {
	

	
	public static Document getDocument(String xml) throws SAXException, IOException, ParserConfigurationException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    factory.setNamespaceAware(true);
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    return builder.parse(new ByteArrayInputStream(xml.getBytes()));	
	}
	
	public static Document getDocument(String xml, String xslt){
		try{
			Source xmlSource = new DOMSource(getDocument(xml));
	        Source xsltSource = new DOMSource(getDocument(xslt));
	        DOMResult result = new DOMResult();
	
	        TransformerFactory transFact = TransformerFactory.newInstance();
	        Transformer trans = transFact.newTransformer(xsltSource);
	        trans.transform(xmlSource, result);
	        return  (Document) result.getNode();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
        
	}
	
	public static String toHtml(Document document, String xslt) throws TransformerException{
		TransformerFactory factory = TransformerFactory.newInstance();
        Source xsltSource = xslt != null? new StreamSource(new ByteArrayInputStream(xslt.getBytes())) : null;
        Transformer transformer = xsltSource != null?  factory.newTransformer(xsltSource) : factory.newTransformer();
    	StringWriter writer=new StringWriter();
    	DOMSource source= new DOMSource(document);
    	transformer.transform(source, new StreamResult(writer));
    	String result=writer.toString();
    	return result;
	}
	
	public static String toHtml(String xml, String xslt){
		if(xml == null || xslt == null){
			return  null;
		}
		try {
			return toHtml(getDocument(xml), xslt);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	
	

}
