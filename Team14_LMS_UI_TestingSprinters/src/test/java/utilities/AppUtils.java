package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import browserlaunch.Driverfactory;

public class AppUtils {
	
	public static final String XL_PATH = "src/test/resources/TestData/LMSTestData.xlsx"; 
	public static final String PROGRAM_URL = "https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com";
	static Actions action = new Actions(Driverfactory.getDriver());
	static Select select;
	public static String NEW_PROGRAM_NAME = "";

	public static String USER_FIRST_NAME = "";
	
	
	// check if the webelement is present or not
	
	private static synchronized boolean isDisplayed(WebDriver driver, WebElement element) {
		try {
			if (element.isDisplayed()) {				
				System.out.println("The Web element is displayed"+ element);
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("The Web element is not displayed"+element);
		return false;
	}
	
	// Get text from the given webelement
	
	public static synchronized String getText(WebElement element) {
		try {
		if(element.isDisplayed()) {
			System.out.println("Text value:- "+element.getText());
			return element.getText();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Element is not visible");
		return "";
	}

	public static synchronized boolean isUIFieldExists(WebElement uiField, String fieldName, String moduleName) {
		if(isDisplayed(Driverfactory.getDriver(), uiField)) {
			System.out.println(fieldName+" is displayed");
			LoggerLoad.info(moduleName + ": "+fieldName + " is displayed");
			JavascriptExecutor js = (JavascriptExecutor) Driverfactory.getDriver();
			js.executeScript("arguments[0].focus();", uiField);			
			return true;
		}else {
			System.out.println(fieldName+" is not displayed");
			LoggerLoad.info(moduleName + ": "+fieldName + " is not displayed");
			return false;
		}
	}

	public static synchronized boolean fillValue(WebElement element, String text) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {

				element.clear();
				element.sendKeys(text);
				flag = true;
				System.out.println("Successfully entered value");

			} else {
				flag = false;
				System.out.println("Unable to enter value");
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return flag;
	
	}
	
	public static synchronized void click(WebDriver driver, WebElement element) {
		try {
			action.moveToElement(element).click().build().perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static synchronized void moveToElement(WebDriver driver, WebElement element) {
		try {
			action.moveToElement(element).click().build().perform();	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}



	public static synchronized void rightclick(WebDriver driver, WebElement element) {
		try {
			action.contextClick(element).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	
	public static synchronized void Alert(WebDriver driver) {
		try {
			driver.switchTo().alert();
		} catch (Exception e) {
			System.out.println(e);
		}
	}



	public static synchronized  String getTitle(WebDriver driver) {
		return driver.getTitle();
	}


	public static synchronized String getCurrentURL(WebDriver driver)  {
		return driver.getCurrentUrl();

	}

	
	public static synchronized boolean selectByIndex(WebElement element, int index) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {

				select = new Select(element);
				select.selectByIndex(index);
				flag = true;
				System.out.println("Option selected by Index");

			} else {
				flag = false;
				System.out.println("Option not selected by Index");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	public static synchronized boolean selectByValue(WebElement element, String value) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {

				select = new Select(element);
				select.selectByValue(value);
				flag = true;
				System.out.println("Option selected by value");

			} else {
				flag = false;
				System.out.println("Option not selected by value");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}




	public static synchronized boolean selectByVisibleText(String visibletext, WebElement element) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {

				select = new Select(element);
				select.selectByVisibleText(visibletext);
				flag = true;
				System.out.println("Option selected by visibletext");

			} else {
				flag = false;
				System.out.println("Option not selected by visibletext");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}


}


