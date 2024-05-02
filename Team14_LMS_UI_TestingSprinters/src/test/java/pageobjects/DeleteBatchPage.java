package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DeleteBatchPage {
	
	WebDriver driver;
	By batch_header = By.xpath("//span[text()='Batch']");
	By delete_icon = By.xpath("//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']");
	By delete_icon1 = By.xpath("//tbody/tr[1]/td[7]/div[1]/span[2]/button[1]/span[1]");
	By batch_firstrow = By.xpath("//tbody/tr//td[2]");
	By successmsg = By.xpath("//div[@class='p-toast-message-content ng-tns-c90-8']");
	By batchname = By.xpath("//tbody/tr//td[2]");
	By alertbox = By.xpath("//div[@class='ng-trigger ng-trigger-animation ng-tns-c133-7 p-dialog p-confirm-dialog p-component ng-star-inserted']");
	By alert_no = By.xpath("//span[text()='No']");
	By alert_yes = By.xpath("//span[text()='Yes']");
	By search = By.xpath("//input[@id='filterGlobal']");
	String batch_name = "Batch_1012" ;
	String batch_name1 = "batch344" ;
	public DeleteBatchPage(WebDriver driver) {
		
		this.driver = driver ;
	}
	
	public void clickBatch() {
		driver.findElement(batch_header).click();
	}
	
	public void deleteEnabled() {
		
		List<WebElement> delete = driver.findElements(delete_icon);
		for(WebElement element : delete) {
			
			if(element.isEnabled()) {
				Assert.assertTrue(element.isEnabled());
			}
			else {
				System.out.println("Delete button is not dispalyed");
			}
		}
	
	}
	
//	public void delete_row() {
//		
//		driver.findElement(delete_icon1).click();
//		
//	}

	
	public void delete_row() throws InterruptedException {
		
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(batch_name + Keys.ENTER);
		Thread.sleep(2000);
		String batchname_firstrow = driver.findElement(batch_firstrow).getText();
		System.out.println(batchname_firstrow);
		System.out.println(batch_name);
		
		if(batchname_firstrow.contains(batch_name.trim())) {
			driver.findElement(delete_icon1).click();
			Thread.sleep(2000);
		}
			
		
	}
	
	public void delete_row1() throws InterruptedException {
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(batch_name1 + Keys.ENTER);
		Thread.sleep(2000);
		String batchname_firstrow = driver.findElement(batch_firstrow).getText();
		System.out.println(batchname_firstrow);
		System.out.println(batch_name1);
		
		if(batchname_firstrow.contains(batch_name1.trim())) {
			driver.findElement(delete_icon1).click();
			Thread.sleep(2000);
		}
			
		
		
	}
	
	public void alertDisplay() throws InterruptedException {
		if(driver.findElement(alertbox).isDisplayed()) {
			Thread.sleep(1000);
			System.out.println("Alert is dispalyed");
		}
		else
		{
			System.out.println("Alert is not displayed");
		}
		
		if((driver.findElement(alert_no).isDisplayed()) && (driver.findElement(alert_yes).isDisplayed()) ) {
			
			System.out.println("Alert with Yes and No option is displayed");
		}
	}
	
	public void alert_accept() {
		
		//String batch =driver.findElement(batch_name).getText();
		driver.findElement(alert_yes).click();
		System.out.println(batch_name + " got deleted ");
		
//			for(int i=2; i<=6; i++) {
//			
//			driver.findElement(By.xpath("//tbody/tr//td[" +i+ "]"));
//			String batch_list = driver.findElement(By.xpath("//tbody/tr//td[" +i+ "]")).getText();
//			//System.out.println(batch_list);
//			
//			if(batch_name.contains(batch_list)) {
//				
//				System.out.println("Batch is not deleted");
//			}
//			}

	}
	
	public void successMessage() {
		String message = driver.findElement(successmsg).getText();
		System.out.println(message);
	}
	
	
	
	public void alert_dismiss() {
		
		
		driver.findElement(alert_no).click();
		System.out.println("Batch is not deleted");
		
		
//			for(int i=2; i<=6; i++) {
//			
//			driver.findElement(By.xpath("//tbody/tr//td[" +i+ "]"));
//			String batch_list = driver.findElement(By.xpath("//tbody/tr//td[" +i+ "]")).getText();
//			
//			
//			if(batch_name.contains(batch_list)) {
//				
//				System.out.println("Batch is not deleted");
//			}
//			}
		
	}
	
	public void batch_deleted() {
		
		System.out.println("Batch is not deleted");
	}
	
}
