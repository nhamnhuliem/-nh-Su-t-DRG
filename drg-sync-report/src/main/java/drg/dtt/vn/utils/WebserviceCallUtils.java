package drg.dtt.vn.utils;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class WebserviceCallUtils {
	final public static String UTF_8 = "UTF-8";

	public String sendMessagePost(String url, String user, String password,
			Map<String, String> params) throws Exception {
		String response = "";

		String userCredentials = user + ":" + password;
		String basicAuth = "Basic "
				+ new String(Base64Utils.encode(userCredentials.getBytes().toString()));
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader(BasicScheme.authenticate(
				new UsernamePasswordCredentials(user, password), UTF_8, false));
		httpPost.setHeader(HttpHeaders.AUTHORIZATION, basicAuth);

		List<NameValuePair> listNameValuePair = new ArrayList<NameValuePair>();
		for (String key : params.keySet()) {
			listNameValuePair.add(new BasicNameValuePair(key, params.get(key)));
		}

		httpPost.setEntity(new UrlEncodedFormEntity(listNameValuePair, UTF_8));
		final HttpParams httpParams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(httpParams, 15 * 1000);
		HttpClient httpClient = new DefaultHttpClient(httpParams);

		if (url != null && url.contains("https")) {

			String fileName = "/resources/drg.cer";
			InputStream isFile = getFileFromResourceAsStream(fileName);
			if (isFile == null) {
				throw new IllegalArgumentException("URL NOT FOUND: " + fileName);
			}

			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			X509Certificate caCert = (X509Certificate) cf
					.generateCertificate(isFile);

			TrustManagerFactory tmf = TrustManagerFactory
					.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
			ks.load(null); // You don't need the KeyStore instance to come from
							// a file.
			ks.setCertificateEntry("caCert", caCert);

			tmf.init(ks);
			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(null, tmf.getTrustManagers(), null);
			SSLSocketFactory sf = new SSLSocketFactory(sslContext,
					SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			Scheme scheme = new Scheme("https", 443, sf);
			httpClient.getConnectionManager().getSchemeRegistry()
					.register(scheme);

		}

		HttpResponse httpResponse = httpClient.execute(httpPost);

		response = new BasicResponseHandler().handleResponse(httpResponse);
		// System.out.println(response);

		return response;
	}

	public String sendMessageGet(String url, String user, String password,
			Map<String, String> params) throws Exception {
		String response = "";
		try {
			if (StringUtils.isNotEmpty(url) && url.contains("//api")) {
				url = url.replaceAll("//api", "/api");
			}
			String userCredentials = user + ":" + password;
			String basicAuth = "Basic "
					+ new String(Base64Utils.encode(userCredentials.getBytes().toString()));
			HttpGet httpGet = new HttpGet(url + "?maCoSo="
					+ params.get("maCoSo"));
			httpGet.addHeader(BasicScheme.authenticate(
					new UsernamePasswordCredentials(user, password), UTF_8,
					false));
			httpGet.setHeader(HttpHeaders.AUTHORIZATION, basicAuth);
			HttpClient httpClient = new DefaultHttpClient();

			if (url != null && url.contains("https")) {
				try {
					String fileName = "/resources/drg.cer";
					InputStream isFile = getFileFromResourceAsStream(fileName);
					if (isFile == null) {
						throw new IllegalArgumentException("URL NOT FOUND: "
								+ fileName);
					}
					CertificateFactory cf = CertificateFactory
							.getInstance("X.509");
					X509Certificate caCert = (X509Certificate) cf
							.generateCertificate(isFile);

					TrustManagerFactory tmf = TrustManagerFactory
							.getInstance(TrustManagerFactory
									.getDefaultAlgorithm());
					KeyStore ks = KeyStore.getInstance(KeyStore
							.getDefaultType());
					ks.load(null); // You don't need the KeyStore instance to
									// come from a file.
					ks.setCertificateEntry("caCert", caCert);

					tmf.init(ks);
					SSLContext sslContext = SSLContext.getInstance("TLS");
					sslContext.init(null, tmf.getTrustManagers(), null);
					SSLSocketFactory sf = new SSLSocketFactory(sslContext,
							SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
					Scheme scheme = new Scheme("https", 443, sf);
					httpClient.getConnectionManager().getSchemeRegistry()
							.register(scheme);
				} catch (Exception e) {
					throw e;
				}
			}

			HttpResponse httpResponse = httpClient.execute(httpGet);

			response = new BasicResponseHandler().handleResponse(httpResponse);
		} catch (Exception e) {
			throw new Exception("1010 - Gá»�i dá»‹ch vá»¥ khÃ´ng thÃ nh cÃ´ng : "
					+ e.getMessage());
		}
		return response;
	}

	private InputStream getFileFromResourceAsStream(String fileName) {
		InputStream inputStream = WebserviceCallUtils.class
				.getResourceAsStream(fileName);
		if (inputStream == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return inputStream;
		}

	}

}
