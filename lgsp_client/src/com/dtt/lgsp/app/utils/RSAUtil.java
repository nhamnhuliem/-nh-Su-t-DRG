package com.dtt.lgsp.app.utils;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class RSAUtil {
	public static PublicKey getPublicKey() throws Exception {
		byte[] keyBytes = IOUtils.toByteArray(RSAUtil.class.getResourceAsStream("/resources/publicKey"));
		X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePublic(spec);
	}
	
	public static String encrypted(String originalText) throws Exception {
		KeyGenerator generator = KeyGenerator.getInstance("AES");
		generator.init(128); // The AES key size in number of bits
		SecretKey secKey = generator.generateKey();
		
		Cipher aesCipher = Cipher.getInstance("AES");
		aesCipher.init(Cipher.ENCRYPT_MODE, secKey);
		byte[] byteCipher = aesCipher.doFinal(originalText.getBytes());
		String byteCipherText = Base64.getEncoder().encodeToString(byteCipher);
		
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.PUBLIC_KEY, getPublicKey());
		byte[] byteEncrypted = cipher.doFinal(secKey.getEncoded());
		String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("key", encrypted);
		jsonObject.addProperty("value", byteCipherText);
		
		
		return Base64Utils.encode(jsonObject.toString());
	}
	
	public static String decrypted(String content) throws Exception {
		Gson gson = new GsonBuilder().setLenient().create();
		Content contentObject = gson.fromJson(Base64Utils.decode(content), Content.class);
		//JsonObject jsonObject = new JsonParser().parse(Base64Utils.decode(content)).getAsJsonObject();
		
		String secKey = contentObject.getKey();
		String value =contentObject.getValue();
		
		//decode RSA seckey
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.PUBLIC_KEY, getPublicKey());
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
	public static void main(String[] args) throws Exception {
		//PrivateKey privateKey = getPrivateKey();
		PublicKey publicKey = getPublicKey();

		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		
		String original = "dtt.com.vn";
		byte[] byteEncrypted = cipher.doFinal(original.getBytes());
		String encrypted =  Base64.getEncoder().encodeToString(byteEncrypted);


	    System.out.println("original  text: " + original);
	    System.out.println("encrypted text: " + encrypted);
	    //System.out.println("decrypted text: " + decrypted);
	
	}
}
