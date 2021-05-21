package drg.dtt.vn.utils;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLUtil {

	
	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		String urlXML ="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><body><cauhinh><mauBienLai>01BLP-001</mauBienLai><anhNenUrl>/documents/20182/5582828/_1556778088391?version=1.0&amp;fileId=5582949</anhNenUrl></cauhinh></body>";
		System.out.println("is:"+getValue(urlXML, "mauBienLai"));
		System.out.println(getChildXML(urlXML,"body","bienlai"));
		
	}
	

	public static String getValue(String xml,String expression) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		InputSource src = new InputSource();
		src.setCharacterStream(new StringReader(xml));
		Document doc = builder.parse(src);
		return doc.getElementsByTagName(expression).item(0).getTextContent();
	}
	
	public static String getChildXML(String xml,String rootXML,String elementName) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		Document doc = getDocument(xml);
		NodeList nList =doc.getChildNodes();
		if(nList != null){
			for (int i = 0; i < nList.getLength(); i++) {
		      if (nList.item(i) instanceof Element) {
		        Element root = (Element) nList.item(i);
		        if(root.getTagName().equals(rootXML)){
		        	if(root.getChildNodes() != null 
		        			&& root.getChildNodes().getLength()>0){
		        		for(int j=0;j<root.getChildNodes().getLength();j++){
			        		Node n =root.getChildNodes().item(j);
			        		if(n.getNodeName().equals(elementName)){
			        			return parseNodeToString(n);
			        		}
		        		}
		        	}
		        }
		      
		      }
		}
			
	}
		return null;
	}
	public static String parseNodeToString(Node node) {
	    StringWriter sw = new StringWriter();
	    try {
	      Transformer t = TransformerFactory.newInstance().newTransformer();
	      t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	      t.setOutputProperty(OutputKeys.INDENT, "yes");
	      t.transform(new DOMSource(node), new StreamResult(sw));
	    } catch (TransformerException te) {
	      System.out.println("nodeToString Transformer Exception");
	    }
	    return sw.toString();
	  }


	public static String getValue(Document doc,String expression) throws XPathExpressionException{
		XPathExpression expr = null;
        // create an XPathFactory
		XPathFactory xFactory = XPathFactory.newInstance();
		
		// create an XPath object
		XPath xpath = xFactory.newXPath();
		
		// compile the XPath expression
		expr = xpath.compile(expression);
		// run the query and get a nodeset
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		if(result != null){
		    // cast the result to a DOM NodeList
		    NodeList nodes = (NodeList) result;
		    for (int i=0; i<nodes.getLength();i++){
		        return nodes.item(i).getTextContent();
		    }
		   
		}
		return null;
	}


	public static Document getDocument(String xml) throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new InputSource(new StringReader(xml))); 
		
        return doc;
	}
	
	public static Document getDocument(String xml,String tag) throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new InputSource(new StringReader(xml))); 
		
        return doc;
	}
	
	
	
	
	
}
