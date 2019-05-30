package org.automation.dd.facebook.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	static Properties prop;
	
	public static Object fetchPropertyValue(String key) throws IOException{		
			prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\workspace\\DataDrivenAutomation\\Config\\config.properties");
			prop.load(file);
			return prop.get(key);		
	 	}
	
	public static String fetchLocatorValue(String key) throws IOException{		
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\workspace\\DataDrivenAutomation\\Config\\elements.properties");
		prop.load(file);
		return prop.get(key).toString();		
 	}
	
	
	

}
