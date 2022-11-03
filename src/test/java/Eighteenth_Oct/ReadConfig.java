package Eighteenth_Oct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Student\\eclipse-workspace\\Sixth_Oct\\Config.properties");
		prop = new Properties();
		prop.load(fis);
	}
	
	public String getURL() {
		return prop.getProperty("URL");
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
	}
	
	public String getNOPhjkURL() {
		return prop.getProperty("NOPURL");
	}

	public String getNOPURL() {
		return prop.getProperty("NOPURL");
	}

}
