package drg.dtt.vn.utils;


import java.util.ArrayList;
import java.util.List;

public class DataConvertUtil {
	
	public static Object [] convertToArray(List<Object> oList){
		if(oList != null){
			Object result[] = new Object[oList.size()]; 
			for(int i=0;i<oList.size();i++){
				result[i] = oList.get(i);
			}
			return result;
		}
		return null;
	}
	
	
	public static List<Object> convertToList(Object[] objects){
		if(objects != null){
			List<Object> oList = new ArrayList<Object>();
			for(Object obj:objects){
				oList.add(obj);
			}
			return oList;
		}
		return null;
	}

	
	public static String convertLongArrayToString(long[] arr, String seperator){
		StringBuilder builder = new StringBuilder();
		if(arr != null && arr.length>0){
			for(int i = 0; i < arr.length; i++){
				builder.append(arr[i]);
				if(i < arr.length - 1){
					builder.append(seperator);
				}
			}
		}
		return builder.toString();
	}
	
	
	public static String convertIntArrayToString(int[] arr, String seperator){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			builder.append(arr[i]);
			if(i < arr.length - 1){
				builder.append(seperator);
			}
		}
		return builder.toString();
	}
}
