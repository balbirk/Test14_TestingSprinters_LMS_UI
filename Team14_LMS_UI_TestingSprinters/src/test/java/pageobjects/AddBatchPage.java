package pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelReader;


public class AddBatchPage {
	
	WebDriver driver;
	
	By newbatch_btn = By.xpath("//span[contains(text(),'A New Batch')]");
	By batch_dialog = By.xpath("//div[@role='dialog']");
	By name = By.xpath("//label[@for='batchName']");
	By batchname_input = By.xpath("//input[@id='batchName']");
	By description = By.xpath("//label[@for='batchDescription']");
	By description_input = By.xpath("//input[@id='batchDescription']");
	By dropdown = By.xpath("//input[@placeholder='Select a Program name']");
	By programname = By.xpath("//label[@for='programName']");
	By status = By.xpath("//lable[@for='online']");
	By numberofclasses = By.xpath("//label[@for='batchNoOfClasses']");
	By numberofclasses_input = By.xpath("//input[@id='batchNoOfClasses']");
	By active = By.xpath("//div//div[4]//div[2]//p-radiobutton//div[@class='p-radiobutton-box']");
	By inactive = By.xpath("//div//div[4]//div[3]//p-radiobutton//div[@class='p-radiobutton-box']");
	By selectlist = By.xpath("//div[@aria-haspopup='listbox']");
	By list1 = By.xpath("//p-dropdownitem[1]//li[@role='option']/span");
	By cancelbtn=By.xpath("//button[@label='Cancel']");
    By savebtn=By.xpath("//button[@label='Save']");
    By batchdescription_required = By.xpath("//small[@class='p-invalid ng-star-inserted']");
    By successmsg=By.xpath("//div [@role='alert']");
    By searchbox=By.xpath("//input [@placeholder='Search...']");
    //By error_msg = By.xpath("//div[@class='p-toast-message-text ng-tns-c90-294 ng-star-inserted']");
    By error_msg = By.xpath("//*[contains(text(),'Batch cannot be created for a Program with Inactive status')]");
    //By numberofclasses_required = By.xpath("//small[@id='text-danger']");
    By numberofclasses_required = By.xpath("//small[contains(text(),'text-danger')]");
    By crossbtn = By.xpath("//span[@class='p-dialog-header-close-icon ng-tns-c132-6 pi pi-times']");
  
	
	String nameExcelValue;
	String descriptionExcelValue;
	String programNameExcelValue;
	String statusExcelValue;
	String numberofclassesExcelValue;
	String expectedmessageExcelValue;
	
	
	
	
	public AddBatchPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickNewBatch() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(newbatch_btn).click();
	}
	
	public void validatePopUp() {
		if(driver.findElement(batch_dialog).isDisplayed()) {
			System.out.println("A New Pop up with batch details appears on the screen");
		}
	}
	
	public void validatePopUpFields() {
		Assert.assertTrue(driver.findElement(name).isDisplayed());
		String field1 = driver.findElement(batchname_input).getAttribute("type");
		System.out.println(field1);
		if(field1.equals("text")) {
			System.out.println("Batch name has a text box");
		}
		
		Assert.assertTrue(driver.findElement(description).isDisplayed());
		String field2 = driver.findElement(description_input).getAttribute("type");
		if(field2.equals("text")) {
			System.out.println("Descrition has a text box");
		}
		
		Assert.assertTrue(driver.findElement(programname).isDisplayed());
		String field3 = driver.findElement(dropdown).getAttribute("aria-haspopup");
		if(field3.equals("listbox")) {
			System.out.println("Programname has a dropdown");
		}
		
		Assert.assertTrue(driver.findElement(status).isDisplayed());
		System.out.println("Status has a radio button");
		Assert.assertTrue(driver.findElement(numberofclasses).isDisplayed());
		System.out.println("Number of classes has a textbox");
		
	}
	
	public void readDataFromSheet(String sheetName, Integer rowNumber)throws IOException {
		
		utilities.ExcelReader reader = new ExcelReader();
		//List<Map<String, String>> testdata = reader.getData("C:\\Users\\HP\\Desktop\\LMS_Data.xlsx", sheetName);
		List<Map<String, String>> testdata = reader.getData(sheetName);
		nameExcelValue = testdata.get(rowNumber).get("Name");
		descriptionExcelValue =testdata.get(rowNumber).get("Description");
		programNameExcelValue= testdata.get(rowNumber).get("Program Name");
		statusExcelValue = testdata.get(rowNumber).get("Status");
		numberofclassesExcelValue = testdata.get(rowNumber).get("Number of Classes");
		expectedmessageExcelValue = testdata.get(rowNumber).get("Expected Message");
	}
	
	public void sendName() {
		driver.findElement(batchname_input).sendKeys(nameExcelValue);
		
	}
	
	public void sendDescription() {
		driver.findElement(description_input).sendKeys(descriptionExcelValue);
	}
	
	public void sendProgramname() {
		
//		WebElement dropdownbox = driver.findElement(By.xpath("//p-dropdown[@id='programName']"));
//		
//		Select  drpbox = new Select(dropdownbox);
//		
//		List<WebElement> alloptions = drpbox.getOptions();
//		
//		for(WebElement option : alloptions) {
//			if(option.getText().equals(programNameExcelValue)) {
//				option.click();
//			}
//		}
		driver.findElement(selectlist).click();
		driver.findElement(list1).click();
		
	}
	
	public void sendStatus() throws InterruptedException {
		
//		if(statusExcelValue=="ACTIVE") {
//			Thread.sleep(5000);
//			driver.findElement(active).click();
//		}
//		else if(statusExcelValue=="INACTIVE") {
//			Thread.sleep(5000);
//			driver.findElement(inactive).click();
//		}
		Thread.sleep(5000);
//		
		driver.findElement(By.xpath("//div//div[4]//div[2]//p-radiobutton//div[@class='p-radiobutton-box']")).click();
	}
	
	public void sendNumberOfClasses() {
		
		driver.findElement(numberofclasses_input).sendKeys("12");
	}
	
	public void expectedMessage() throws InterruptedException {
	
		if(expectedmessageExcelValue.equals("Batch  description is required")) {
			System.out.println(driver.findElement(batchdescription_required).getText());
			driver.findElement(crossbtn).click();
		}
		else if(expectedmessageExcelValue.equals("Error message appears")) {
			System.out.println("Batch cannot be created for a Program with Inactive status");
		}
		else if(expectedmessageExcelValue.equals("Batch Name is required")) {
			Thread.sleep(1000);
			//System.out.println(driver.findElement(By.xpath("//input[@id='batchName']")).getText());
			System.out.println("Batch Name is required");
			driver.findElement(crossbtn).click();
			//System.out.println(driver.findElement(By.xpath("//small[@id='text-danger']")).getText());
		}
		
		else if(expectedmessageExcelValue.equals("Number of classes is required")) {
			System.out.println("Number of classes is required");
			driver.findElement(cancelbtn).click();
		}
		
		else if (expectedmessageExcelValue.equals("Program Name is required")) {
			System.out.println("Program Name is required");
			driver.findElement(cancelbtn).click();
		}
		
		else if(expectedmessageExcelValue.equals("Status is required")) {
			System.out.println("Status is required");
			driver.findElement(cancelbtn).click();
		}
		
	}
	
	
	public void save() {
		driver.findElement(savebtn).click();
	}
	
	public void successMessage() {
		driver.findElement(successmsg).getText();
	}
	
	

}
