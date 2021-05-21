package com.dtt.lgsp.app.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.dtt.lgsp.entities.GIAMDINHHS;
public class ReadFileSAX {
	static String hoSoHeaderXML ="";
	static boolean valueHearder =true;
	static String hoSoXML ="";
	public static void main(String[] args) {
		try {
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			SAXParser saxParser = saxParserFactory.newSAXParser();
			
			//final List<Student> students = new ArrayList<Student>();
 
			
			DefaultHandler defaultHandler = new DefaultHandler() {
				//Student student = null;
				int countHoSo =0;
				
				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					if(qName.equalsIgnoreCase("GIAMDINHHS")) {
						hoSoHeaderXML+="<GIAMDINHHS>";
					}else if(qName.equalsIgnoreCase("THONGTINDONVI")) {
						hoSoHeaderXML+="<THONGTINDONVI>";
					}else if(qName.equalsIgnoreCase("MACSKCB")) {
						hoSoHeaderXML+="<MACSKCB>";
					}else if(qName.equalsIgnoreCase("THONGTINHOSO")) {
						hoSoHeaderXML+="<THONGTINHOSO>";
					}else if(qName.equalsIgnoreCase("NGAYLAP")) {
						hoSoHeaderXML+="<NGAYLAP>";
					}else if(qName.equalsIgnoreCase("SOLUONGHOSO")) {
						hoSoHeaderXML+="<SOLUONGHOSO>";
					}else if(qName.equalsIgnoreCase("DANHSACHHOSO")) {
						hoSoHeaderXML+="<DANHSACHHOSO>";
					}else if(qName.equalsIgnoreCase("HOSO")) {
						valueHearder =false;
						hoSoXML+="<HOSO>";
					}else if(qName.equalsIgnoreCase("FILEHOSO")) {
						hoSoXML+="<FILEHOSO>";
					}else if(qName.equalsIgnoreCase("LOAIHOSO")) {
						hoSoXML+="<LOAIHOSO>";
					}else if(qName.equalsIgnoreCase("NOIDUNGFILE")) {
						hoSoXML+="<NOIDUNGFILE>";
					}
					
				}
 
				@Override
				public void characters(char[] ch, int start, int length) throws SAXException {
					String value = new String(ch, start, length);
					if(valueHearder) {
						hoSoHeaderXML+=value;
					}else {
					hoSoXML+=value;
					}
					
				}
 
				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException {
					if(qName.equalsIgnoreCase("GIAMDINHHS")) {
						hoSoHeaderXML+="</GIAMDINHHS>";
						try {
							
							String zip =GzipUtil.compress(hoSoHeaderXML);
							
							System.out.println("end === "+countHoSo);
							BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\luat.pham\\DRG\\soft\\filemaudongbo\\KETQUA_GUIHOSO\\20201214\\end_"+System.currentTimeMillis() +".xml"));
						    writer.write(zip);
						    writer.close();
							}catch (Exception e) {
								// TODO: handle exception
							}
					}else if(qName.equalsIgnoreCase("THONGTINDONVI")) {
						hoSoHeaderXML+="</THONGTINDONVI>";
					}else if(qName.equalsIgnoreCase("MACSKCB")) {
						hoSoHeaderXML+="</MACSKCB>";
					}else if(qName.equalsIgnoreCase("THONGTINHOSO")) {
						hoSoHeaderXML+="</THONGTINHOSO>";
					}else if(qName.equalsIgnoreCase("NGAYLAP")) {
						hoSoHeaderXML+="</NGAYLAP>";
					}else if(qName.equalsIgnoreCase("SOLUONGHOSO")) {
						hoSoHeaderXML+="</SOLUONGHOSO>";
					}else if(qName.equalsIgnoreCase("DANHSACHHOSO")) {
						hoSoHeaderXML += hoSoXML;
						hoSoHeaderXML+="</DANHSACHHOSO>";
					}else if(qName.equalsIgnoreCase("HOSO")) {
						hoSoXML+="</HOSO>";
						countHoSo++;
						if(countHoSo==100) {
							String xml = hoSoHeaderXML+hoSoXML+"</DANHSACHHOSO>\r\n" + 
									"	</THONGTINHOSO>\r\n" + 
									"</GIAMDINHHS>";
							
							try {
							System.out.println("countHoSo "+countHoSo);
							String zip =GzipUtil.compress(xml);
							BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\luat.pham\\DRG\\soft\\filemaudongbo\\KETQUA_GUIHOSO\\20201214\\"+System.currentTimeMillis() +".xml"));
						    writer.write(zip);
						    writer.close();
							}catch (Exception e) {
								// TODO: handle exception
							}
							hoSoXML="";
							countHoSo=0;
							
							
							
						}else {
							
						}
					}else if(qName.equalsIgnoreCase("FILEHOSO")) {
						hoSoXML+="</FILEHOSO>";
					}else if(qName.equalsIgnoreCase("LOAIHOSO")) {
						hoSoXML+="</LOAIHOSO>";
					}else if(qName.equalsIgnoreCase("NOIDUNGFILE")) {
						hoSoXML+="</NOIDUNGFILE>";
					}
				}
			};
 
			//saxParser.parse("E:\\luat.pham\\DRG\\soft\\filemaudongbo\\KETQUA_GUIHOSO\\1607437807392_LOI.xml", defaultHandler);
			//saxParser.parse("E:\\luat.pham\\DRG\\soft\\filemaudongbo\\KETQUA_GUIHOSO\\QD4210_87010_201810.xml", defaultHandler);
			saxParser.parse("E:\\luat.pham\\DRG\\soft\\filemaudongbo\\KETQUA_GUIHOSO\\maunhieuhs.xml", defaultHandler);
			
 
			//System.out.println(hoSoHeaderXML);
			BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\\\luat.pham\\\\DRG\\\\soft\\\\filemaudongbo\\\\KETQUA_GUIHOSO\\\\1607437807392_LOI_new.xml"));
		    writer.write(hoSoHeaderXML);
		    writer.close();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
