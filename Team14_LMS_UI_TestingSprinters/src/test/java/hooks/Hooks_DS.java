//package hooks;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import io.cucumber.java.AfterAll;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeAll;
//import io.cucumber.java.Scenario;
//import io.qameta.allure.Allure;
//import utilities.LoggerLoad;
//import utilities.ConfigReader;
//
//public class Hooks_DS extends DriverManager{
//	private static DriverManager dm;
//	static Scenario scenario;
//	//private static WebDriver driver;
//
//	@BeforeAll
//	public static void before() throws Throwable {
//		//Get browser Type from config properties file
//		LoggerLoad.info("Loading Config file");
//		ConfigReader.loadConfig();
//		String browser = ConfigReader.getBrowser();
//		
//		//Initialize driver from base class	
//		dm = new DriverManager();
//		dm.initDriver(browser);
//		LoggerLoad.info("Initializing driver for : "+browser);
//	}
//	@Before
//	public void scenario(Scenario scenario) {
//		LoggerLoad.info("===============================================================================================");
//		LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
//		LoggerLoad.info("-----------------------------------------------------------------------------------------------");
//		
//	}
//	@AfterStep
//	public void afterstep(Scenario scenario) {
//		if (scenario.isFailed()) {
//			LoggerLoad.error("Steps Failed , Taking Screenshot");
//			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot, "image/png", "My screenshot");
//			Allure.addAttachment("Myscreenshot",new String(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//		}
//	}
//
//	@AfterAll
//	public static void after() {
//		LoggerLoad.info("Closing Driver");
//		dm.closeallDriver();
//	}
//	
//}
