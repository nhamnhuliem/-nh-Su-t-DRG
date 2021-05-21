/**
 * Copyright (c) 2015 by Open eGovPlatform (http://http://openegovplatform.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtt.lgsp.app.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/** 
 * Date utility class
 * This class contains method to manipulate date
 * 
 * Version: 1.0
 *  
 * History: 
 *   DATE        AUTHOR      DESCRIPTION 
 *  ------------------------------------------------- 
 *  2-Apr-2015  ThongDV    Create new
 */
public class DateUtil {
	
	public static final String DATE_FORMAT_FULL ="yyyyMMddHH24mmss";
	public static final String DATE_FORMAT_D_M_Y ="dd/MM/yyyy";
	public static final String DATE_FORMAT_D_M_Y_1 ="yyyy-MM-dd";
	public static final String DATE_FORMAT_D_M_Y_H_M_S ="dd/MM/yyyy HH:mm:ss";
	public static final String DATE_FORMAT_D_M_Y_H_M ="dd/MM/yyyy HH:mm";	
	public static final String DATE_FORMAT_Y_M_D="yyyyMMdd";
	public static final String DATE_FORMAT_H_M_D_M_Y="HH:mm dd/MM/yyyy";		
	/** 
	 * This is method parse format date to string
	 * 
	 * Version: OEP 1.1
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  26-March-2015  ThongDV    Create new
	 * @param date
	 * @param format
	 * @return string  
	 */
	public static String parseDateToString(Date date,String format)	{
		try {
			SimpleDateFormat sdf= new SimpleDateFormat(format);
			return sdf.format(date);
		} catch (Exception e) {
		}
		return "";
	}	
	
	
	/** 
	 * This is method parse format string to date
	 * 
	 * Version: OEP 1.1
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  26-March-2015  ThongDV    Create new
	 * @param strDate
	 * @param format
	 * @return Date
	 */
	public static Date parseStringToDate(String strDate,String format){
		try {
			SimpleDateFormat sdf= new SimpleDateFormat(format);
			return sdf.parse(strDate);
		} catch (Exception e) {
		}
		return null;
	}
	
	/** 
	 * This is method get current date time
	 * 
	 * Version: OEP 1.1
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  26-March-2015  ThongDV    Create new
	 * @return Date
	 */
	public static Date getCurrentDateTime(){
		return new Date();
	}
	
	
	public static String fistDayOfQuaterOfYear(int year,int quater,String format){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		if(quater ==1){
			cal.set(Calendar.MONTH, 0);
			return firstDayOfMonth(cal.getTime(), format);
		}else if(quater ==2){
			cal.set(Calendar.MONTH, 3);
			return firstDayOfMonth(cal.getTime(), format);
		}else if(quater ==3){
			cal.set(Calendar.MONTH, 6);
			return firstDayOfMonth(cal.getTime(), format);
		}else if(quater ==4){
			cal.set(Calendar.MONTH, 9);
			return firstDayOfMonth(cal.getTime(), format);
		}
		return "";
	
	}
	
	public static String lastDayOfQuaterOfYear(int year,int quater,String format){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		if(quater ==1){
			cal.set(Calendar.MONTH, 2);
			return lastDayOfMonth(cal.getTime(), format);
		}else if(quater ==2){
			cal.set(Calendar.MONTH, 5);
			return lastDayOfMonth(cal.getTime(), format);
		}else if(quater ==3){
			cal.set(Calendar.MONTH, 8);
			return lastDayOfMonth(cal.getTime(), format);
		}else if(quater ==4){
			cal.set(Calendar.MONTH, 12);
			return lastDayOfMonth(cal.getTime(), format);
		}
		return "";
	
	}
	
	public static String firstDayOfMonth(Date date,String format){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		return parseDateToString(cal.getTime(), format);				
	
	}
	
	public static String lastDayOfMonth(Date date,String format){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return parseDateToString(cal.getTime(), format);				
	
	}
	
	public static String firstDayOfWeek(Date date,String format){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);		
		cal.set(Calendar.DAY_OF_WEEK,2);
		return parseDateToString(cal.getTime(), format);				
	
	}
	
	
	public static String lastDayOfWeek(Date date,String format){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);		
		cal.set(Calendar.DAY_OF_WEEK,7);
		cal.add(Calendar.DAY_OF_YEAR, 1);
		return parseDateToString(cal.getTime(), format);					
	
	}
	
	public static String firstDayOfYear(Date date,String format){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);		
		cal.set(Calendar.DAY_OF_YEAR,1);
		return parseDateToString(cal.getTime(), format);				
	
	}
	
	
	public static String lastDayOfYear(Date date,String format){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);		
		cal.add(Calendar.YEAR,1);
		cal.set(Calendar.DAY_OF_YEAR,1);
		cal.add(Calendar.DAY_OF_YEAR,-1);
		
		return parseDateToString(cal.getTime(), format);					
	
	}
	

	public static String formatDate (String date, String initDateFormat, String endDateFormat){
		try{
		    Date initDate = new SimpleDateFormat(initDateFormat).parse(date);
		    SimpleDateFormat formatter = new SimpleDateFormat(endDateFormat);
		    return formatter.format(initDate);
		}catch(Exception e){
			
		}
	    return "";
	}
	
	public static Date setDate(Date date,int hour,int minute){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		return calendar.getTime();
		
	}
	public static Date setDate(Date date,int hour){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		
		return calendar.getTime();
		
	}
	
	public static String getCurrentDate() {
		try {
			DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_Y_M_D);
			Date date = new Date();
			return dateFormat.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
