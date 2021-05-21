package com.dtt.lgsp.app.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
 
public class PropertieConfiguration {
    private static PropertieConfiguration instance = null;
    private Properties props = new Properties();
 
    /**
     * Use singleton pattern to create ReadConfig object one time and use
     * anywhere
     *
     * @return instance of ReadConfig object
     */
    public static PropertieConfiguration getInstance() {
        if (instance == null) {
            instance = new PropertieConfiguration();
            instance.readConfig();
        }
        return instance;
    }
 
    /**
     * get property with key
     *
     * @param key
     * @return value of key
     */
    public String getProperty(String key) {
        return props.getProperty(key);
    }
 
    /**
     * read file .properties
     */
    private void readConfig() {
        InputStream inputStream = null;
        try {
        	props.load(PropertieConfiguration.class.getResourceAsStream("/resources/drg_config.properties"));
//        	String path = ClassLoader.getSystemClassLoader().getResource(".").getPath() + "/resources/drg_config.properties";
//        	System.out.println(path);
//        	URL url = PropertieConfiguration.class.getResource(
//                    "/resources/drg_config.properties");
//        	System.out.println(url.getFile());
//        	System.out.println(url.getPath());
//        	inputStream = new FileInputStream(new File(url.getFile()));
//            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close objects
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public  String getVersion() {
    	  InputStream inputStream = null;
    	  String version = "";
          try {
          	props.load(PropertieConfiguration.class.getResourceAsStream("/resources/resources.properties"));
          	String path = ClassLoader.getSystemClassLoader().getResource(".").getPath() + "/resources/resources.properties";
          	URL url = PropertieConfiguration.class.getResource(
                      "/resources/resources.properties");
          	inputStream = new FileInputStream(new File(url.getFile()));
          	props.load(inputStream);
          	version =props.getProperty("drg.version");
          } catch (Exception e) {
              e.printStackTrace();
          } finally {
              // close objects
              try {
                  if (inputStream != null) {
                      inputStream.close();
                  }
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return version;
    }
    
//    public void writeConfig(String urlWs, String folderSelected, String username, String password, String secondRun) {
//		 Properties prop = new Properties();
//		OutputStream output = null;
//       try {
//    	   URL url = PropertieConfiguration.class.getResource(
//                   "/resources/drg_config.properties");
//       		System.out.println(url.getFile());
//           output = new FileOutputStream(url.getFile());
//           prop.setProperty("ws.url", urlWs);
//			prop.setProperty("ws.username", username);
//			prop.setProperty("ws.password", password);
//			prop.setProperty("ws.secondrun", secondRun);
//			prop.setProperty("ws.folderselected", folderSelected);
//
//			// save properties to project root folder
//			prop.store(output, null);
//       } catch (Exception e) {
//           e.printStackTrace();
//       } finally {
//           // close objects
//           try {
//               if (output != null) {
//               	output.close();
//               }
//           } catch (IOException e) {
//               e.printStackTrace();
//           }
//       }
//   }
}
