package drg.dtt.vn.utils;

import java.io.File;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class RSAUtil {
	  private static final Logger log = LoggerFactory.getLogger(RSAUtil.class);
	public static PrivateKey getPrivateKey() throws Exception {
		ClassLoader  classloader = Thread.currentThread().getContextClassLoader();
		byte[] keyBytes = Files.readAllBytes(new File(classloader.getResource("private_keypair/privateKey").getFile()).toPath());
		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePrivate(spec);
	}
	
	public static String decrypted(String content) throws Exception {
		Gson gson = new GsonBuilder().setLenient().create();
		Content contentObject = gson.fromJson(Base64Utils.decode(content), Content.class);
		//JsonObject jsonObject = new JsonParser().parse(Base64Utils.decode(content)).getAsJsonObject();
		
		String secKey = contentObject.getKey();
		String value =contentObject.getValue();
		
		//decode RSA seckey
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.PRIVATE_KEY, getPrivateKey());
		byte[] byteSecKey = cipher.doFinal(Base64.getDecoder().decode(secKey));
		
		///Convert bytes to AES SecertKey
		SecretKey originalKey = new SecretKeySpec(byteSecKey , 0, byteSecKey .length, "AES");
		Cipher aesCipher = Cipher.getInstance("AES");
		aesCipher.init(Cipher.DECRYPT_MODE, originalKey);
		byte[] bytePlainText = aesCipher.doFinal(Base64.getDecoder().decode(value));
		
		return new String(bytePlainText);
	}
	
	class Content {
		private String key;
		private String value;
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	}
}
