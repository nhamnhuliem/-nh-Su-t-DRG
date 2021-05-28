package com.dtt.lgsp.app.business;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;

import com.dtt.lgsp.app.config.PreferencesConfiguration;
import com.dtt.lgsp.app.keys.ResponseKeys;
import com.dtt.lgsp.app.utils.Base64Utils;
import com.dtt.lgsp.app.utils.GzipUtil;
import com.dtt.lgsp.app.utils.RSAUtil;
import com.dtt.lgsp.app.utils.WsApiUtils;
import com.dtt.lgsp.app.utils.XML4210Parser;
import com.dtt.lgsp.app.utils.XSDUtil;
import com.dtt.lgsp.dao.HoSoSynedUtil;
import com.dtt.lgsp.entities.DanhSachKetQua;
import com.dtt.lgsp.entities.DataConfig;
import com.dtt.lgsp.entities.ProfileEntity;
import com.dtt.lgsp.entities.Report;
import com.dtt.lgsp.entities.Result;
import com.dtt.lgsp.entities.TongHopChiTiet;
import com.dtt.lgsp.entities.TongHopThongKe;
import com.dtt.lgsp.model.HoSo;
import com.dtt.lgsp.model.ThongKe;
import com.google.gson.Gson;

public class DttConsumer {
	public static final String success = "00";
	static final Logger logger = Logger.getLogger(DttConsumer.class);
	//private static String url_service = "http://171.244.134.5:8080/drg-report/api/4210";
	private static String url_service = "http://hanoi.dtt.vn:19090/drg-report/api/4210";
	//private static String url_service = "http://localhost:8081/api/4210";
	//private static String url_service = "http://hanoi.dtt.vn:8218/drg-report/api/4210";
	
	public static Result callReceiver(HoSo hoSo, int loaiHsId) {
		String maLk = "";
		try {
			String url = url_service + "/recive";
			String user = "";
			String password = "";
			
			
			Gson gson = new Gson();
			
			String hoSoJSon = "";
			if(hoSo != null) {
				hoSoJSon = gson.toJson(hoSo);
				
				ThongKe thongKe = hoSo.getThongKe();
				if(thongKe != null) {
					maLk = thongKe.getMaLk();
				}
			}else {
				Result r = new Result();
				r.setCode(ResponseKeys.ERROR_HS);
				r.setDescription(maLk);
				return r;
			}
			
			if(HoSoSynedUtil.hoSoMap.get(maLk) != null) {
				Result r = new Result();
				r.setCode(ResponseKeys.WAS_SEND);
				r.setDescription(maLk);
				return r;
			}
			
			String encodeBase64 = Base64Utils.encode(hoSoJSon);
			String zip = GzipUtil.compress(encodeBase64);
			
			Map<String, String> params = new HashMap<String, String>();
			ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
			params.put("activecode", profileEntity.getPrimaryActivecode());
			params.put("jsonData", zip);
			params.put("loaihs", String.valueOf(loaiHsId));
			params.put("soluong", String.valueOf(1));
			params.put("maCoSo", String.valueOf(profileEntity.getMaCoSo()));
			
			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			byte[] byteArray = Base64.decodeBase64(strResult.getBytes("UTF-8"));
			String xml = new String(byteArray);
			Result result = (Result) XSDUtil.parseToObject(xml, Result.class);
			if(ResponseKeys.OK.equals(result.getCode())) {
				result.setDescription(maLk);
			}
			return result;
			
		} catch (Exception e) {
			return null;
		}
	}

	public static Result send4210(String content, int loaiHsId, int soLuong) {
		try {
			HoSo hoSo = XML4210Parser.getJsonData(content);
			return callReceiver(hoSo, loaiHsId);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Result send3360(HoSo hoSo, int loaiHsId) {
		return callReceiver(hoSo, loaiHsId);
	}
	
	public static String getActivecodeByMaCoSo(String ma) {
		try {
			String url = url_service + "/thongtincoso";
			String user = "";
			String password = "";
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("ma", ma);
			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			
			return strResult;
		} catch (Exception e) {
			return null;
		}
	}
	public static String getTimeConfig(String ma) {
		try {
			String url = url_service + "/getConfig";
			String user = "";
			String password = "";
			
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("ma", ma);
			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			return strResult;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static List<DataConfig> getDataConfig(String ma) {
		List<DataConfig> listData = new ArrayList<DataConfig>();
		try {
			String url = url_service + "/getDataConfig";
			String user = "";
			String password = "";
			Map<String, String> params = new HashMap<String, String>();
			params.put("ma", ma);
			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			
			Gson gson =new Gson();
			DataConfig[] configs = gson.fromJson(strResult, DataConfig[].class);  
			for (DataConfig config : configs) {
				listData.add(config);
			}
			
			return listData;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static List<Report> getReport(String maLk, int nam, int thang,String tuNgay, String denNgay, int limit, int offset) throws Exception {
		List<Report> listReport = new ArrayList<Report>();
		try {
			String url = url_service + "/searchreport";
			String user = "";
			String password = "";
			
			ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("maXacThuc", "maXacThuc");
			params.put("maLk", maLk);
			params.put("nam", String.valueOf(nam) );
			params.put("thang", String.valueOf(thang));
			params.put("tuNgay", String.valueOf(tuNgay));
			params.put("denNgay", String.valueOf(denNgay));
			params.put("limit", String.valueOf(limit));
			params.put("offset", String.valueOf(offset));
			params.put("maCoSo", String.valueOf(profileEntity.getMaCoSo()));

			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			Gson gson =new Gson();
			
			Report[] rpArray = gson.fromJson(strResult, Report[].class);  
			
			for (Report report : rpArray) {
				listReport.add(report);
			}
		} catch (Exception e) {
			throw e;
		}
		
		return listReport;
	}
	
	public static int countReport(String maLk, int nam, int thang, String tuNgay, String denNgay) throws Exception {
		int count = 0;
		try {
			String url = url_service + "/countreport";
			String user = "";
			String password = "";
			ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("maXacThuc", "maXacThuc");
			params.put("maLk", maLk);
			params.put("nam", String.valueOf(nam) );
			params.put("thang", String.valueOf(thang));
			params.put("tuNgay", String.valueOf(tuNgay));
			params.put("denNgay", String.valueOf(denNgay));
			params.put("maCoSo", String.valueOf(profileEntity.getMaCoSo()));

			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			
			count = Integer.valueOf(strResult);
			
		} catch (Exception e) {
			throw e;
		}
		
		return count;
	}
	
	
	public static List<TongHopThongKe> getTongHop(int nam, int thang,String maCoSo, int limit, int offset) throws Exception {
		List<TongHopThongKe> listReport = new ArrayList<TongHopThongKe>();
		try {
			String url = url_service + "/searchTongHop";
			String user = "";
			String password = "";
			
			ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("maXacThuc", "maXacThuc");
			params.put("nam", String.valueOf(nam) );
			params.put("thang", String.valueOf(thang));
			params.put("limit", String.valueOf(limit));
			params.put("offset", String.valueOf(offset));
			if(maCoSo.isEmpty()) {
				params.put("maCoSo", String.valueOf(profileEntity.getMaCoSo()));
			}else {
				params.put("maCoSo", maCoSo);
			}

			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			Gson gson =new Gson();
			
			TongHopThongKe[] rpArray = gson.fromJson(strResult, TongHopThongKe[].class);  
			
			for (TongHopThongKe report : rpArray) {
				listReport.add(report);
			}
		} catch (Exception e) {
			throw e;
		}
		
		return listReport;
	}
	
	public static int countTongHop( int nam, int thang, String maCoSo) throws Exception {
		int count = 0;
		try {
			String url = url_service + "/countTongHop";
			String user = "";
			String password = "";
			ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("maXacThuc", "maXacThuc");
			params.put("nam", String.valueOf(nam) );
			params.put("thang", String.valueOf(thang));
			if(maCoSo.isEmpty()) {
				params.put("maCoSo", String.valueOf(profileEntity.getMaCoSo()));
			}else {
				params.put("maCoSo", maCoSo);
			}

			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			
			count = Integer.valueOf(strResult);
			
		} catch (Exception e) {
			throw e;
		}
		
		return count;
	}
	
	
	// api dong bo thong tin ho so ve máy client
	
	public static List<TongHopChiTiet> getChiTietSync(int limit, int offset) throws Exception {
		List<TongHopChiTiet> listReport = new ArrayList<TongHopChiTiet>();
		try {
			String url = url_service + "/getChiTietSync";
			String user = "";
			String password = "";
			
			ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("maXacThuc", "maXacThuc");
			params.put("limit", String.valueOf(limit));
			params.put("maCoSo", String.valueOf(profileEntity.getMaCoSo()));

			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			Gson gson =new Gson();
			
			TongHopChiTiet[] rpArray = gson.fromJson(strResult, TongHopChiTiet[].class);  
			
			for (TongHopChiTiet report : rpArray) {
				listReport.add(report);
			}
		} catch (Exception e) {
			throw e;
		}
		
		return listReport;
	}
	
	public static int countChiTietSync() throws Exception {
		int count = 0;
		try {
			String url = url_service + "/countChiTietSync";
			String user = "";
			String password = "";
			ProfileEntity profileEntity = PreferencesConfiguration.getConfig();
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("maXacThuc", "maXacThuc");
			params.put("maCoSo", String.valueOf(profileEntity.getMaCoSo()));

			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			
			count = Integer.valueOf(strResult);
			
		} catch (Exception e) {
			throw e;
		}
		
		return count;
	}
	//end dong bo

	public static Result callRegister(String value) throws Exception {
		try {
			String url = url_service + "/register";
			String user = "";
			String password = "";
			Map<String, String> params = new HashMap<String, String>();
			params.put("value", value);
			String strResult = new WsApiUtils().sendMessagePost(url, user, password, params);
			byte[] byteArray = Base64.decodeBase64(strResult.getBytes("UTF-8"));
			String xml = new String(byteArray);
			Result result = (Result) XSDUtil.parseToObject(xml, Result.class);
			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public static String pingHost() throws Exception {
		try {
			String url = url_service + "/check";
			URL urlCheck = new URL(url);
			if (url.contains("http://")) {
				HttpURLConnection myURLConnection = (HttpURLConnection) urlCheck.openConnection();
				String userCredentials = "" + ":" + "";
				String basicAuth = "Basic "
						+ new String(java.util.Base64.getEncoder().encode(userCredentials.getBytes()));
				myURLConnection.setConnectTimeout(15 * 1000);
				myURLConnection.setRequestProperty("Authorization", basicAuth);
				myURLConnection.setRequestMethod("GET");
				myURLConnection.connect();
				int responseCode = myURLConnection.getResponseCode();
				if (responseCode != 200) {
					// Not OK.
					return myURLConnection.getResponseCode() + " - " + myURLConnection.getResponseMessage();
				}
				return null;
			} else if (url.contains("https://")) {
				String fileName = "/resources/drg.cer";
				InputStream isFile = getFileFromResourceAsStream(fileName);
				if (isFile == null) {
					throw new IllegalArgumentException("URL NOT FOUND: " + fileName);
				}
				CertificateFactory cf = CertificateFactory.getInstance("X.509");
				X509Certificate caCert = (X509Certificate) cf.generateCertificate(isFile);

				KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
				ks.load(null); // You don't need the KeyStore instance to come from a file.
				ks.setCertificateEntry("caCert", caCert);

				TrustManagerFactory trustFactory = TrustManagerFactory
						.getInstance(TrustManagerFactory.getDefaultAlgorithm());
				trustFactory.init(ks);
				TrustManager[] trustManagers = trustFactory.getTrustManagers();

				SSLContext sslContext = SSLContext.getInstance("SSL");
				sslContext.init(null, trustManagers, null);
				SSLContext.setDefault(sslContext);
				HttpsURLConnection myURLConnection = (HttpsURLConnection) urlCheck.openConnection();
				String userCredentials = "" + ":" + "";
				String basicAuth = "Basic "
						+ new String(java.util.Base64.getEncoder().encode(userCredentials.getBytes()));
				myURLConnection.setRequestProperty("Authorization", basicAuth);
				myURLConnection.setConnectTimeout(15 * 1000);
				myURLConnection.setRequestMethod("GET");
				myURLConnection.connect();
				if (myURLConnection != null) {
					if (myURLConnection.getResponseCode() != 200) {
						return myURLConnection.getResponseCode() + " - " + myURLConnection.getResponseMessage();
					}
				}
				return null;
			}

		} catch (Exception e) {
			// logger.info(e);
			throw e;
		}
		return null;
	}

	private static InputStream getFileFromResourceAsStream(String fileName) {
		InputStream inputStream = WsApiUtils.class.getResourceAsStream(fileName);
		if (inputStream == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return inputStream;
		}

	}
}
