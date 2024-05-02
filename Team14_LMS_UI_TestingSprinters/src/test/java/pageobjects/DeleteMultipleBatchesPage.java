package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DeleteMultipleBatchesPage {
	
	WebDriver driver;
	
	By checkbox = By.xpath("//div[@role='checkbox']");
	By delete_btn = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	By singlecheckbox = By.xpath("//tbody/tr[2]/td[1]/p-tablecheckbox[1]/div[1]/div[2]");
	//By checkbox1 = By.xpath("//tbody/tr[1]/td[1]/p-tablecheckbox[1]/div[1]/div[2]");
	//By checkbox2 = By.xpath("//tbody/tr[3]/td[1]/p-tablecheckbox[1]/div[1]/div[2]");
	By checkbox_mutiple = By.xpath("//div[@class='p-checkbox-box']");
	By successmsg = By.xpath("//div[@class='p-toast-message-content ng-tns-c90-8']");
	By batch_firstrow = By.xpath("//tbody/tr//td[2]");
	By alert_no = By.xpath("//span[text()='No']");
	By alert_yes = By.xpath("//span[text()='Yes']");
	By search = By.xpath("//input[@id='filterGlobal']");
	String singlebatch = "Batch520";
	String multiplebatch = "batch351" ;
	
	
	
	
	public DeleteMultipleBatchesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void checkboxNotSelected() {
		
		List<WebElement> check_box = driver.findElements(checkbox);
		
		
		for(WebElement element: check_box) {
			
			if(element.isSelected()) {
				System.out.println("Checkbox is selected");
			}
			else
			{
				System.out.println("Checkbox is not selected");
			}
		}
	}
	
	public void verifyDeleteBtn() {
		if(driver.findElement(delete_btn).isEnabled()) {
			System.out.println("Delete icon is enabled");
		}
		else {
			System.out.println("Delete icon is disabled");
		}
				
	}

	public void singleCheckBox() throws InterruptedException {
		
		//driver.findElement(singlecheckbox).click();
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(singlebatch + Keys.ENTER);
		Thread.sleep(2000);
		String batchname_firstrow = driver.findElement(batch_firstrow).getText();
		System.out.println(batchname_firstrow);
		driver.findElement(checkbox_mutiple).click();
		
		
	}
	
	public void deleteSingleRow() {
		driver.findElement(delete_btn).click();
		driver.findElement(alert_yes).click();
		System.out.println("Batch is deleted");
	}
	
	public void successMessage() {
		String message = driver.findElement(successmsg).getText();
		System.out.println(message);
	}
	
	
	public void mutipleCheckbox() throws InterruptedException {
		
//		driver.findElement(singlecheckbox).click();
//		driver.findElement(checkbox1).click();
//		driver.findElement(checkbox2).click();
		
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(multiplebatch + Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(checkbox_mutiple).click();
		
	}
	
	
	
}
