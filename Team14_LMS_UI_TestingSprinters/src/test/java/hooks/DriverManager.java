package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import utilities.LoggerLoad;

public class DriverManager {

static WebDriver driver; 
	
	public WebDriver initDriver(String browser) { 
		
		if (browser.equalsIgnoreCase("firefox")) {
//			driver =WebDriverManager.firefoxdriver().create();
			LoggerLoad.info("Testing on firefox");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			//firefoxOptions.addArguments("--headless");
			driver = new FirefoxDriver(firefoxOptions);

		} else if (browser.equalsIgnoreCase("chrome")) {
//			driver=WebDriverManager.chromedriver().create();
		
			LoggerLoad.info("Testing on chrome");
			ChromeOptions chromeOptions = new ChromeOptions();
			//chromeOptions.addArguments("--headless=new");
			driver = new ChromeDriver(chromeOptions);


		} else if (browser.equalsIgnoreCase("safari")) {
//			driver = WebDriverManager.safaridriver().create();
			LoggerLoad.info("Testing on safari");
			SafariOptions safariOptions = new SafariOptions();
			//safariOptions.addArguments("--headless=NEW");
			driver = new SafariDriver(safariOptions);

		} else if (browser.equalsIgnoreCase("edge")) {
//			driver=WebDriverManager.edgedriver().create();
			LoggerLoad.info("Testing on edge");
			EdgeOptions edgeOptions = new EdgeOptions();
			//edgeOptions.addArguments("--headless=new"); 
			driver = new EdgeDriver(edgeOptions);

	
		}
		// Set Page load timeout
	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.manage().window().maximize();
				

				return driver;
			}
		


	public static WebDriver getdriver() {
		return driver;
	}

	public void closeallDriver() {
		driver.close();
	}
	
}