package com.dtt.lgsp.app.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.mozilla.universalchardet.UniversalDetector;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		//String content =new String(FileUtils.readFileToString(new File("C:\\Users\\DTT\\Downloads\\KCB_40007_201901010004_1800177431.xml"), StandardCharsets.UTF_16LE));
		//File file1 = new File("E:\\luat.pham\\DRG\\soft\\filemaudongbo\\KETQUA_GUIHOSO\\20201208\\thatbai\\1607437801641_LOI.xml");
		//File file1 = new File("E:\\luat.pham\\DRG\\soft\\filemaudongbo\\KETQUA_GUIHOSO\\20201208\\thatbai\\1607437801641_LOI.xml");
		File file1 = new File("E:\\luat.pham\\DRG\\soft\\filemaudongbo\\19107450_GD4878723001441_BHXH_KCB92000_777BB191-CA0A-441E-AFBC-EB3705E83307.xml");
		
		//InputStreamReader r = new InputStreamReader(new FileInputStream(new File("C:\\Users\\DTT\\Downloads\\KCB_40007_201901010004_1800177431.xml")));
		//System.out.println(r.getEncoding());
		
		String encoding = UniversalDetector.detectCharset(file1);
		if (encoding != null) {
			String content =new String(FileUtils.readFileToString(file1, encoding));
			System.out.println(content);
			System.out.println("Detected encoding = " + encoding);
		} else {
			System.out.println("No encoding detected.");
		}
	}
}
