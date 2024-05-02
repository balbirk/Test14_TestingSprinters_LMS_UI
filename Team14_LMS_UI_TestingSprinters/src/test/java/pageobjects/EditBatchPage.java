package pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelReader;

public class EditBatchPage {
	
	WebDriver driver;
	
	By edit_button = By.xpath("//button[@icon='pi pi-pencil']");
	By edit_button1 = By.xpath("//tbody/tr/td[7]/div/span/button/span");
	By dialogbox = By.xpath("//div[@class='ng-tns-c132-6 p-dialog-mask p-component-overlay p-dialog-mask-scrollblocker ng-star-inserted']");
	By batchname_input = By.xpath("//input[@id='batchName']");
	 By crossbtn = By.xpath("//span[@class='p-dialog-header-close-icon ng-tns-c132-6 pi pi-times']");
	 By description_input = By.xpath("//input[@id='batchDescription']");
	 By savebtn=By.xpath("//button[@label='Save']");
	 By successmsg=By.xpath("//div [@role='alert']");
	
//	String nameExcelValue;
//	String descriptionExcelValue;
//	String programNameExcelValue;
//	String statusExcelValue;
//	String numberofclassesExcelValue;
//	String expectedmessageExcelValue;
	
	public EditBatchPage(WebDriver driver) {
		this.driver = driver;
		}
	
	
//	
//	public void readDataFromSheet(String sheetName, Integer rowNumber)throws IOException {
//		
//		utilities.ExcelReader reader = new ExcelReader();
//		//List<Map<String, String>> testdata = reader.getData("C:\\Users\\HP\\Desktop\\LMS_Data.xlsx", sheetName);
//		List<Map<String, String>> testdata = reader.getData(sheetName);
//		nameExcelValue = testdata.get(rowNumber).get("Name");
//		descriptionExcelValue =testdata.get(rowNumber).get("Description");
//		programNameExcelValue= testdata.get(rowNumber).get("Program Name");
//		statusExcelValue = testdata.get(rowNumber).get("Status");
//		numberofclassesExcelValue = testdata.get(rowNumber).get("Number of Classes");
//		expectedmessageExcelValue = testdata.get(rowNumber).get("Expected Message");
//
//		
//	}
	
	
public void verifyEditButton() {
		
		List<WebElement> edit_btn = driver.findElements(edit_button);		
		for(WebElement element : edit_btn) {
			
			if(element.isDisplayed()) {
				Assert.assertTrue(element.isDisplayed());
			}
			else {
				System.out.println("Edit button is not dispalyed");
			}
		}
	}
	
public void dialogBox() {
	Assert.assertTrue(driver.findElement(dialogbox).isDisplayed());
	driver.findElement(crossbtn).click();
}

public void updateBatchName() {
	Boolean batch =driver.findElement(batchname_input).isEnabled();
	System.out.println("Unble to edit Batch Name");
	driver.findElement(crossbtn).click();
}


public void clickEditButton() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(edit_button1).click();
}

public void updateBatchDescription() throws InterruptedException {
	driver.findElement(description_input).clear();
	Thread.sleep(5000);
	driver.findElement(description_input).sendKeys("Batch_description");
	Thread.sleep(5000);
	driver.findElement(savebtn).click();
	
}
public void successMessage() {
	
	
	System.out.println(driver.findElement(successmsg).getText());
}



}
