package drg.dtt.vn.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipUtil {

	public static void main(String[] args) throws Exception {
		String string = "test gzip. this will compress and decompress this stringtest gzip. t gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this wit gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this withis will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this stringtest gzip. this will compress and decompress this string";

		//System.out.println("before compress:" + string.length());
		//System.out.println("after compress:");
       // String compressed = compress(string);
       // System.out.println("Length:"+compressed.length());
       // System.out.println(compressed.toString());
       // System.out.println("after decompress:");
		String folderPath ="E:\\luat.pham\\DRG\\soft\\filemaudongbo\\KETQUA_GUIHOSO\\20201214";
		File folder = new File(folderPath);

        // Populates the array with names of files and directories
		String[]  pathnames = folder.list();

        // For each pathname in the pathnames array
        
		
		
	}
	
	
	 public static String compress(String data) {
	        try {

	            // Create an output stream, and a gzip stream to wrap over.
	            ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length());
	            GZIPOutputStream gzip = new GZIPOutputStream(bos);

	            // Compress the input string
	            gzip.write(data.getBytes("UTF8"));
	            gzip.close();
	            byte[] compressed = bos.toByteArray();
	            bos.close();

	            // Convert to base64
	            compressed = Base64.getEncoder().encode(compressed);

	            // return the newly created string
	            return new String(compressed);
	        } catch(IOException e) {

	            return null;
	        }
	    }



	 public static String decompress(String compressedText) throws IOException {

	        // get the bytes for the compressed string
	        byte[] compressed = compressedText.getBytes(StandardCharsets.UTF_8);

	        // convert the bytes from base64 to normal string
	        Base64.Decoder d = Base64.getDecoder();
	        compressed = d.decode(compressed);

	        // decode.
	        final int BUFFER_SIZE = 32;

	        ByteArrayInputStream is = new ByteArrayInputStream(compressed);

	        GZIPInputStream gis = new GZIPInputStream(is, BUFFER_SIZE);

	        StringBuilder string = new StringBuilder();

	        byte[] data = new byte[BUFFER_SIZE];

	        int bytesRead;

	        while ((bytesRead = gis.read(data)) != -1)
	        {
	            string.append(new String(data, 0, bytesRead));
	        }
	        gis.close();
	        is.close();
	        return string.toString();
	    }

}
