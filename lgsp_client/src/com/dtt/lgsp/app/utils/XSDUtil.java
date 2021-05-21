package com.dtt.lgsp.app.utils;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class XSDUtil {
	static final Logger logger = Logger.getLogger(XSDUtil.class);
	private static final String XML_SPECIAL_CHARACTERS ="[$@!#-*-#!@$]";
	public static String replaceXmlCharacters(String xml,String characters){
		if(xml != null 
				&& xml.indexOf(characters) != -1){
			return replaceAll(xml, characters, XML_SPECIAL_CHARACTERS);
		}
		return xml;
	}
	
	public static Object parseToObject(String xmlString, Class<?>... classes) {
		if (StringUtils.isEmpty(xmlString)) {
			return null;
		}
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(classes);
			Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
			return jaxbUnMarshaller.unmarshal(new ByteArrayInputStream(xmlString.replaceAll("(<\\?xml.*?\\?>)","").getBytes("UTF-8")));
		} catch (JAXBException e) {
			logger.debug(e);
		} catch (UnsupportedEncodingException e1) {
			logger.debug(e1);
		}

		return null;
	}

	public static String parseToString(Object xmlObj, Class<?>... classes) {
		try {
			StringWriter stringWritter = new StringWriter();
			Marshaller marshaller = JAXBContext.newInstance(classes).createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
			marshaller.marshal(xmlObj, stringWritter);
			return stringWritter.toString().replaceAll("&lt;", "<").replaceAll("&gt;", ">");

		} catch (JAXBException e) {
			logger.debug(e);
		}

		return "";
	}
	
	public static String replaceAll(String str, String oldChar,String newChar){
		if(str != null){
			while (str.indexOf(oldChar) != -1) {			
				str =str.replace(oldChar, newChar);
			}
			return str;
		}
		return str;
	}
	
	// add
	
	public static Object parseToObject2(String xmlString, Class<?>... classes) {
		if (xmlString != null && xmlString.trim().length() > 0) {
			XMLInputFactory xif = null;
			XMLStreamReader xsr = null;
			StringReader reader = null;
			try {
				// xmlString = xmlString.replaceAll("[^\\x20-\\x7e]", "");
				// xmlString =xmlString.replaceAll("[\\x00-\\x09\\x11\\x12\\x14-\\x1F\\x7F]",
				// "");
				if (xmlString.indexOf("<?xml") != -1) {
					xmlString = xmlString.substring(xmlString.indexOf("?>") + 2, xmlString.length());
					xmlString = xmlString.trim();
				}
				xif = XMLInputFactory.newInstance();
				reader = new StringReader(xmlString);
				xsr = xif.createXMLStreamReader(reader);

				// xsr.nextTag();

				JAXBContext jaxbContext = JAXBContext.newInstance(classes);
				Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
				return jaxbUnMarshaller.unmarshal(xsr);
			} catch (Exception e) {
				if (e instanceof UnmarshalException) {
					String utf16 = xmlString;
					try {
						utf16 = new String(xmlString.getBytes(), "UTF-16");
						return parseToObjectUTF8(utf16, classes);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else {
					// log.info(classes.getClass().getName()+":"+xmlString);

					xmlString = StringUtil.parseCharsetUTF8(xmlString);
					return parseToObjectUTF8(xmlString, classes);
				}

			} finally {
				if (xsr != null) {

					try {
						xsr.close();
					} catch (XMLStreamException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				if (reader != null) {
					reader.close();
				}
			}

		}
		return null;
	}

	public static Object parseToObjectUTF8(String xmlString, Class<?>... classes) {

		if (xmlString != null && xmlString.trim().length() > 0) {
			XMLInputFactory xif = null;
			XMLStreamReader xsr = null;
			StringReader reader = null;
			try {
				// xmlString = xmlString.replaceAll("[^\\x20-\\x7e]", "");
				// xmlString =xmlString.replaceAll("[\\x00-\\x09\\x11\\x12\\x14-\\x1F\\x7F]",
				// "");
				if (xmlString.indexOf("<?xml") != -1) {
					xmlString = xmlString.substring(xmlString.indexOf("?>") + 2, xmlString.length());
					xmlString = xmlString.trim();
				}
				xif = XMLInputFactory.newInstance();
				reader = new StringReader(xmlString);
				xsr = xif.createXMLStreamReader(reader);

				// xsr.nextTag();

				JAXBContext jaxbContext = JAXBContext.newInstance(classes);
				Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
				return jaxbUnMarshaller.unmarshal(xsr);
			} catch (Exception e) {

			} finally {
				if (xsr != null) {

					try {
						xsr.close();
					} catch (XMLStreamException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				if (reader != null) {
					reader.close();
				}
			}

		}
		return null;
	}
}
