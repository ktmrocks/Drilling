package com.demo.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	

	public static String readPropertiesFile( String key) throws IOException{
		
		String value = "none";
		Properties prop = new Properties();
		InputStream input = PropertiesFile.class.getClassLoader().getResourceAsStream("com/demo/config/Config.properties");
		prop.load(input);
		value = prop.getProperty(key);		
		
		return value;
	}
	

}
