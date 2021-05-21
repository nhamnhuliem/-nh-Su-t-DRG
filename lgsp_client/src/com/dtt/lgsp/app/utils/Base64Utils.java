package com.dtt.lgsp.app.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Utils {

   private Base64Utils() {}

   public static String encode(String value) throws Exception {
      return  Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
   }

   public static String decode(String value) throws Exception {
	  value = value.replaceAll("\r", "");
	  value = value.replaceAll("\n", "");
      byte[] decodedValue = Base64.getDecoder().decode(value);  // Basic Base64 decoding
      return new String(decodedValue, StandardCharsets.UTF_8);
   }

   public static byte[] decodeBase64(String value) throws Exception {
	      return Base64.getDecoder().decode(value);  // Basic Base64 decoding
	   }
   
   public static void main(String[] args) throws Exception {
      String test = "try this howto";

      String res1 = Base64Utils.encode(test);
      System.out.println
        (test + " base64 -> " + res1);

      //
      String res2 = Base64Utils.decode(res1);
      System.out.println( res1 + " string --> "  + res2);
      /*
       * output
       *   try this howto base64 -> dHJ5IHRoaXMgaG93dG8=
       *   dHJ5IHRoaXMgaG93dG8= string --> try this howto
       */
      }
}