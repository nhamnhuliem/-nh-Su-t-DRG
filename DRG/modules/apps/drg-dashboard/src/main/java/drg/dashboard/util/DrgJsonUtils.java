package drg.dashboard.util;

import java.util.Arrays;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;


public class DrgJsonUtils {
	/***
	 * 
	 * @param key
	 *            label cua json
	 * @param data
	 *            mang du lieu String[], Double[], Integer[] ...
	 * @return JsonObject example : "phiDichVu":{ "label":"Phí dịch vụ",
	 *         "data":[] }
	 * @throws Exception
	 */
	public static JsonObject buildDataChiPhiHoatDong(String key, Object[] data, String bgColor, String[] arrOther)
			throws Exception {
		JsonObject joResult = new JsonObject();
		try {
			JsonArray jaData = null;
			if (data instanceof String[]) {
				jaData = new JsonArray();
				String[] dataInstance = Arrays.copyOf(data, data.length,
						String[].class);
				for (String retCol : dataInstance) {
					jaData.add(new JsonPrimitive(retCol));
				}
				joResult.addProperty("label", key);
				joResult.add("data", jaData);
			} else if (data instanceof Double[]) {
				jaData = new JsonArray();
				Double[] dataInstance = Arrays.copyOf(data, data.length,
						Double[].class);
				for (Double retCol : dataInstance) {
					jaData.add(new JsonPrimitive(retCol));
				}
				joResult.addProperty("label", key);
				joResult.add("data", jaData);
			} else if (data instanceof Integer[]) {
				jaData = new JsonArray();
				Integer[] dataInstance = Arrays.copyOf(data, data.length,
						Integer[].class);
				for (Integer retCol : dataInstance) {
					jaData.add(new JsonPrimitive(retCol));
				}
				joResult.addProperty("label", key);
				joResult.add("data", jaData);
			}
			//
//			joResult.add("borderColor", new JsonPrimitive(borderColor));
			//
			jaData = new JsonArray();
			String[] arrBgColor = new String[data.length];
			Arrays.fill(arrBgColor, bgColor);

			String[] bgColorInstance = Arrays.copyOf(arrBgColor, arrBgColor.length,
					String[].class);
			for (String retCol : bgColorInstance) {
				jaData.add(new JsonPrimitive(retCol));
			}
			joResult.add("backgroundColor", jaData);

			jaData = new JsonArray();
			String[] otherInstance = Arrays.copyOf(arrOther, arrOther.length,
					String[].class);
			for (String retCol : otherInstance) {
				jaData.add(new JsonPrimitive(retCol));
			}
			joResult.add("other", jaData);
		} catch (Exception e) {
			throw e;
		}

		return joResult;
	}
}
