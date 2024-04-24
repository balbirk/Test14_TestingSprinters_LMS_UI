package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;
	private static String proppath= "src/test/resources/config/config.properties";
	
	public static void loadConfig()throws Throwable {
	
	try {
		FileInputStream ip= new FileInputStream(proppath);
		prop=new Properties();
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException("config.properties not found at " + proppath);
	}
	
	}
	
	public static String getBrowser() {
		String browser = prop.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("Please specify browser in the config.properties file.");
	}
	
	public static String getApplicationUrl() {
		String appUrl = prop.getProperty("dsportalUrl");
		if (appUrl != null)
			return appUrl;
		else
			throw new RuntimeException("Please specify Application URL in the config.properties file.");
	}
	
	public static String getHomePageUrl() {
		String homepage = prop.getProperty("homepageUrl");
		if (homepage != null)
			return homepage;
		else
			throw new RuntimeException("Please specify HomePage URL in the config.properties file.");
				
	}
	
	public static String getRegisterPageUrl() {
		String register=prop.getProperty("registerUrl");
		if(register!=null)
			return register;
		else
			throw new RuntimeException("Please specify RegisterPage URL in the config.properties file.");
	}
	
	public static String getLoginPageUrl() {
		String login=prop.getProperty("loginpageUrl");
		if(login!=null)
			return login;
		else
			throw new RuntimeException("Please specify Login URL in the config.properties file.");
	}
	
	public static String getExcelFilePath() {
		String excelfilelpath = prop.getProperty("excelfilepath");
		if (excelfilelpath != null)
			return excelfilelpath;
		else
			throw new RuntimeException("Please specify Excel file path in the config.properties file.");
	}

	public static String getUrl(String pageUrl) {
		String url = prop.getProperty(pageUrl);
		if (url != null)
			return url;
		else
			throw new RuntimeException(pageUrl + " Please specify URL in the config.properties file.");
	}
	
	public static String tryEditorURL() {
		String tryEditorUrl = prop.getProperty("tryEditorUrl");
		if (tryEditorUrl != null)
			return tryEditorUrl;
		else
			throw new RuntimeException("tryeditorurl not specified in the config.properties file.");
	}
	
	
}
