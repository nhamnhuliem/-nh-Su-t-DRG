package com.dtt.lgsp.app.utils;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

import org.apache.tika.parser.txt.CharsetDetector;


public class StringUtil {

	private static final String XML_SPECIAL_CHARACTERS ="[$@!#-*-#!@$]";
	private static CharsetDetector detector = new CharsetDetector();
	public static void  main(String args[]) {
		String str="<";
		System.out.println(getCharset(str));
	}
	
	public static boolean isXML(String xml) {
		if(xml != null && xml.trim().length()>0) {
			// get the bytes for the compressed string
		 	if((xml.indexOf("<") !=-1 
		 			&& xml.indexOf("</") !=-1 
		 			&& xml.indexOf(">") !=-1) 
		 				||(xml.indexOf("![CDATA[")!=-1)) {
		 		return true;
		 	}
		}
		return false;
	}
	
	public static String getCharset(String str) {		
		detector.setText(str.getBytes());		
		return detector.detect().getName();
	}
	
	public static String getCharset(byte[] b) {		
		detector.setText(b);		
		return detector.detect().getName();
	}


	
	public static String parseCharsetUTF8(String str) {
		
		detector.setText(str.getBytes());
		return detector.getString(str.getBytes(), "utf-8");
		
	}

	
	public static boolean isNullOrEmpty(String str){
		if(str== null || str.trim().length()<=0){
			return true;
		}
		return false;
	}
	
	public static String getNgayXuLy(double value){
		    long factor = (long) Math.pow(10,1);
		    value = value * factor;
		    long tmp = Math.round(value);
		    value= (double) tmp / factor;
		    String str = String.valueOf(value);
		    str = str.substring(0,str.indexOf("."));		   
		    if(value> Double.valueOf(str)){
		    	return String.valueOf(value);
		    }else{
		        return str;
		    }
		
	}
	
	public static void print(double d) {
		Locale locale = new Locale("vi", "VN");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		System.out.println(currencyFormatter.format(d));
	}

	public static String toString(Object obj){
		if(obj instanceof int[]){
			return Arrays.toString((int[]) obj);
		}else if(obj instanceof byte[]){
			return Arrays.toString((byte[]) obj);
		}else if(obj instanceof long[]){
			return Arrays.toString((long[]) obj);
		}else if(obj instanceof short[]){
			return Arrays.toString((short[]) obj);
		}else if(obj instanceof char[]){
			return Arrays.toString((char[]) obj);
		}else if(obj instanceof boolean[]){
			return Arrays.toString((boolean[]) obj);
		}else if(obj instanceof float[]){
			return Arrays.toString((float[]) obj);
		}else if(obj instanceof double[]){
			return Arrays.toString((double[]) obj);
		}else if(obj instanceof Object[]){
			return Arrays.toString((Object[]) obj);
		}
		return String.valueOf(obj);
	}
	
	public static String getCurrency(String numberStr){
		if(numberStr == null || numberStr.trim().length()==0 ) {
			return "";
		}
		try{
			Locale locale = new Locale("vi", "VN");      
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
			String cur =currencyFormatter.format(Double.valueOf(numberStr));
			if(cur.indexOf(",") != -1){
				cur =cur.substring(0,cur.indexOf(","));
			}
			return cur;
		}catch(Exception e){
			return "";
		}
	}
	
	public static String format(String message, Object... objs){
		
		int index = 0;
		while(message.indexOf("{}") >= 0){
			if(index < objs.length){
				message = message.replaceFirst("\\{\\}", toString(objs[index++]));
			}else{
				break;
			}
		}
		return message;
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
	
	public static String removeParams(String queryString, String... params) {
		for (String param : params) {
			String keyValue = param + "=[^&]*?";
			queryString = queryString.replaceAll("(&" + keyValue
					+ "(?=(&|$))|^" + keyValue + "(&|$))", "");
		}
		return queryString;
	}
	
	public static String replaceXmlCharacters(String xml,String characters){
		if(xml != null 
				&& xml.indexOf(characters) != -1){
			return replaceAll(xml, characters, XML_SPECIAL_CHARACTERS);
		}
		return xml;
	}
	
	public static String getXmlRecoverCharacters(String xml,String characters){
		if(xml != null 
				&& xml.indexOf(XML_SPECIAL_CHARACTERS) != -1){
			return replaceAll(xml, XML_SPECIAL_CHARACTERS, characters);
		}
		return xml;
	}
	
	
}
