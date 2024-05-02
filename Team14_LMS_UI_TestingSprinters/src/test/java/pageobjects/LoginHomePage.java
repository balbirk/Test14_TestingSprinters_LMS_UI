package pageobjects;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class LoginHomePage {
	
	private WebDriver webDriver;
	
	
	
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By loginBtn = By.xpath("//span[@class='mat-button-wrapper']");
	private By btnAllign = By.xpath("//span[text()='Login']");
	private By logo = By.xpath("//img[@class='images']");
	private By pleaseLoginLMSApp = By.xpath("//p[normalize-space()='Please login to LMS application']");
	private By userColour = By.xpath("//span[@class='ng-tns-c78-0 ng-star-inserted']");
	private By pwdColour = By.xpath("//label[@id='mat-form-field-label-3']");
	private By loginBtnAlignment = By.xpath("//button[@id='login']");
	private By userlabel = By.xpath("//label[@id='mat-form-field-label-1']");
	//private By errorMsg = By.xpath("//mat-error[@id='errormessage']");
	
	private By errorMsg = By.xpath("//mat-error[contains(@class,'mat-error ng-star-inserted')]");
	
	//private By navigateBack = By.xpath("//div[normalize-space()='Manage Program']");
	
	
	

	    
	  public LoginHomePage(WebDriver driver) {  
	    	super();
	         this.webDriver= driver;
	       }

	  public String getPageTitle() {
		  String Title= webDriver.getTitle();
		  System.out.println("title of the page:" +Title );
		  return Title;
		 // String eTitle="LMS";
		  //Assert.assertEquals(Title,"LMS");
	  	}
	 
	  public void pageLogo() {
		  int expectedX=85;
		  int expectedY=60;
		  
	
		  WebElement element = webDriver.findElement(logo);
		  Point location = element.getLocation();
		  int actualX = location.getX();
		  int actualY = location.getY();
		  
		  if (actualX == expectedX && actualY == expectedY) {
			    System.out.println("Coordinates match!");
			} else {
			    System.out.println("Coordinates do not match.");
			}
		  
//		  WebElement element = webDriver.findElement(logo);
//		  Point location = element.getLocation();
//		  int xCoordinate = location.getX();
//		  int yCoordinate = location.getY();
	  }
	  
	  
	  public boolean pleaseLoginToLMS() {
		 boolean message =  webDriver.findElement(pleaseLoginLMSApp).isDisplayed();
		  System.out.println("login message" + message);
		 return message;
	  }
	  
	  
	  public void loginBtnPresent() {
		  
		  boolean isEnable = webDriver.findElement(loginBtn).isEnabled();
		  boolean isDisplayed = webDriver.findElement(loginBtn).isDisplayed();
		  
		  if(isEnable) {
			  System.out.println("Button is Enable");
		  }
		  else {
			  System.out.println("Button is Disable");
		  }
		  
		  if(isDisplayed) {
			  System.out.println("Button is Displayed");
		  }
		  else {
			  System.out.println("Button is not Displayed");
		  }
		  
			
		}
	  
	  	public boolean textFieldPresent() {
	  		
	  		boolean UsernamePrsnt = webDriver.findElement(username).isDisplayed();
	  		boolean PasswordPrsnt = webDriver.findElement(password).isDisplayed();
	  		
	  		if(UsernamePrsnt) {
				  System.out.println("Button is Displayed");
			  }
			  else {
				  System.out.println("Button is not Displayed");
			  }
			  
			  if(PasswordPrsnt) {
				  System.out.println("Button is Displayed");
			  }
			  else {
				  System.out.println("Button is not Displayed");
			  }
			return PasswordPrsnt;
			
			  
	  		}
	  	public String textOnFirstField() {
			  
			 String placeholderText = webDriver.findElement(username).getAttribute("data-placeholder");
			 System.out.println("Place Holder Value is:"+ placeholderText);
			 return placeholderText;
		  }
		  
		  
		  public String textOnSecondField() {
			  
				 String placeholderText = webDriver.findElement(password).getAttribute("data-placeholder");
				 System.out.println("Place Holder Value is:"+ placeholderText);
				 return placeholderText;
		  }
		  
		  public String textColorInUserField() {
			  
				 String userColor = webDriver.findElement(userColour).getCssValue("color");
				 System.out.println("User Text Color is:"+ userColor);
				 Assert.assertEquals(userColor.toLowerCase().equals("rgba(0, 0, 0, 0.54)"),true);
				 return userColor; 
			  
		  }
		  
		  public String textColorInPwdField() {
			  
				 String pwdColor = webDriver.findElement(pwdColour).getCssValue("color");
				 System.out.println("User Text Color is:"+ pwdColor);
				 Assert.assertEquals(pwdColor.toLowerCase().equals("rgba(0, 0, 0, 0.54)"),true);
				 return pwdColor; 
			 	  
		  }
		  
		  public void allignmentOfLoginBtn() {
			  
			 String buttonLocation = webDriver.findElement(loginBtnAlignment).getCssValue("text-align");
			 System.out.println("login Button Allignment-" + buttonLocation);
			 Assert.assertEquals(buttonLocation.toLowerCase().equals("center"),true);
			  
		  }
		  
		  public void textSpellings() {
			  
			  String userText = webDriver.findElement(userlabel).getText();
			  String passwordText = webDriver.findElement(pwdColour).getText();
			  String pleaseLoginText = webDriver.findElement(pleaseLoginLMSApp).getText();
			  String loginButton = webDriver.findElement(loginBtn).getText();
			  
			  Assert.assertEquals(userText, "User *");
			  Assert.assertEquals(passwordText, "Password *");
			  Assert.assertEquals(pleaseLoginText, "Please login to LMS application");
		  	  Assert.assertEquals(loginButton,"Login"); 
			  
		  }
		  
		  public void astericWithUser() {
			  
			  String userText = webDriver.findElement(userlabel).getText();
			  Assert.assertEquals(userText.contains("*"),true);
			  
		  }
		  
		  public void astericWithPwd() {
			  
			  String passwordText = webDriver.findElement(pwdColour).getText();
			  Assert.assertEquals(passwordText.contains("*"),true );
			  
		  }
		  
		  public void textOnBtn() {
			  
			 String btnText = webDriver.findElement(btnAllign).getCssValue("text-align");
			 System.out.println("Place Holder Value is:"+ btnText);
			 Assert.assertEquals(btnText, "center");
			 
			  
		  }
		  
		  public void CheckErrorMessage() {
			  
			String errorMessage =  webDriver.findElement(errorMsg).getText();
			System.out.println("Error Message is:" + errorMessage);
			 Assert.assertEquals(errorMessage, " Invalid username and password Please try again ");
			 
		  }
		  
		  public void brokenLink() throws URISyntaxException {
			 
			  List<WebElement> links = webDriver.findElements(By.tagName("iframe"));
				
				for (WebElement link : links) {
					
					String url = link.getAttribute("src");
					if (url== null || url.isEmpty()) {
						System.out.println("URL is empty");
						
						continue;
					}
					try {
						URL appLink = new URI(url).toURL();
						HttpURLConnection huc = (HttpURLConnection) (appLink.openConnection());
						huc.connect();
						if (huc.getResponseCode()>=400 ) {
							
							System.out.println(url + " is broken");
							
						}
						else
						{
							System.out.println(url + " is valid");
						}
						
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					
				}
		  }
				
			public void keyAction() throws InterruptedException {
				Actions actions = new Actions(webDriver);	
			        WebElement userField = webDriver.findElement(username);
			        
			        //userField.clear();
			        Thread.sleep(2000);
			        userField.sendKeys("sdetorganizers@gmail.com"+Keys.TAB);
			        Thread.sleep(2000);
			        WebElement pwdField = webDriver.findElement(password);
			        pwdField.clear();
			        Thread.sleep(2000);
			        pwdField.sendKeys("UIHackathon@02");
			        webDriver.findElement(loginBtn).click();
			        
			        actions.sendKeys(Keys.ALT, Keys.LEFT).perform();
//			       WebElement backArrow =  webDriver.findElement(navigateBack);
//			       backArrow.sendKeys(Keys.ALT,Keys.LEFT);
			      //div[normalize-space()='Manage Program']
			}
			
			public void mouseAction() throws InterruptedException {
				
				Actions actions = new Actions(webDriver);	
				WebElement mouseUserField = webDriver.findElement(username);
				
				actions.sendKeys(Keys.BACK_SPACE).perform();;
				
				actions.click(mouseUserField).perform();
				mouseUserField.sendKeys("sdetorganizers@gmail.com");
				Thread.sleep(2000);
				WebElement mousePwdField = webDriver.findElement(password);
				actions.sendKeys(Keys.BACK_SPACE).perform();;
				Thread.sleep(2000);
				actions.click(mousePwdField).perform();
				mousePwdField.sendKeys("UIHackathon@02");
				webDriver.findElement(loginBtn).click();;
			}
			
			
//			public void appNameOnLogo() throws IOException, TesseractException {
//				
//				String imageURL = webDriver.findElement(logo).getAttribute("src");
//				URL url = new URL(imageURL);
//				BufferedImage image1 = ImageIO.read(url);
//
//				 Tesseract tesseract = new Tesseract();
//				 tesseract.setDatapath("C:\\Git\\Test14_TestingSprinters_LMS_UI\\Team14_LMS_UI_TestingSprinters\\captureImg\\image.png");
//				 tesseract.setLanguage("eng");
//				  String extractedText = tesseract.doOCR(image1);
//		          System.out.println("Extracted Text: " + extractedText);
//				
////				File screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
////				Tesseract image = new Tesseract();
////				image.setDatapath("C:\\Git\\Test14_TestingSprinters_LMS_UI\\Team14_LMS_UI_TestingSprinters\\captureImg\\image.png");
////				image.setLanguage("eng");
////				String text = image.doOCR(screenshot);
////				System.out.println("text from image : " + text);
////				Assert.assertEquals(text.equalsIgnoreCase("LMS - Learning Management System"), true);
//				
//			}
			
			public void loginErrorMessage() {
				
				String errorMessage = webDriver.findElement(errorMsg).getText();
				
				Assert.assertEquals(errorMessage,"Invalid username and password Please try again");
			}
			
			
}	
			
			


			


	  
	  

