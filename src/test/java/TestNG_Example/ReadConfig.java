package TestNG_Example;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

    public ReadConfig() throws Exception {

        FileInputStream fis = new FileInputStream(".\\Config.properties");

        prop = new Properties();

        prop.load(fis);

    }

    public String getAppURL() {

        return prop.getProperty("app_url_QA");

    }

    public String getBrowser() {

        return prop.getProperty("browser");

    }

    public String getSampleApp() {

        return prop.getProperty("app_SampleApp");

    }
    
    
    public String getadminUser() {

        return prop.getProperty("adminUserName");

    }
    
    public String getadminPass() {

        return prop.getProperty("adminPassword");

    }

}


