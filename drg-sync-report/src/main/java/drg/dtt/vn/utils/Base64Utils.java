package drg.dtt.vn.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Base64Utils {

   private Base64Utils() {}

   
   public static boolean  isEncode(String value){
		String pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
	    try{
	    	Pattern r = Pattern.compile(pattern);
		   
		    Matcher m = r.matcher(value);
		    if (m.find()) {
		        return true;
		    } else {
		        return false;
		    }
	    }catch(Exception e){
	    	return false;
	    }
	}
   
   public static String encode(String value) throws Exception {
      return  Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
   }

   public static String decode(String value) throws Exception {
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