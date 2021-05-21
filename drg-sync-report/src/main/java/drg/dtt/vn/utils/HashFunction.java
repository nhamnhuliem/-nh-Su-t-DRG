package drg.dtt.vn.utils;

import java.security.MessageDigest;
import java.util.List;

public class HashFunction {


    static final char[] HEX_TABLE = new char[]{'0', '1', '2', '3', '4', '5',
        '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public String hashAllFields(List<String> fields, String SECURE_SECRET) {
        // create a buffer for the md5 input and add the secure secret first
        StringBuffer buf = new StringBuffer();

        for (String field : fields) {
        	buf.append((field+"|"));
        }
        buf.append(SECURE_SECRET);
        byte[] ba = null;
        // create the md5 hash and UTF-8 encode it
        try {
            MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");
            ba = mdSHA256.digest(buf.toString().getBytes("UTF-8"));
        } catch (Exception e) {
        } // wont happen
        // return buf.toString();
        return hex(ba);

    }

    /**
     * Returns Hex output of byte array
     */
    public static String hex(byte[] input) {
        // create a StringBuffer 2x the size of the hash array
        StringBuffer sb = new StringBuffer(input.length * 2);

        // retrieve the byte array data, convert it to hex
        // and add it to the StringBuffer
        for (int i = 0; i < input.length; i++) {
            sb.append(HEX_TABLE[(input[i] >> 4) & 0xf]);
            sb.append(HEX_TABLE[input[i] & 0xf]);
        }
        return sb.toString().toLowerCase();
    }

}
