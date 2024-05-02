package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BatchValidationPage {
	
	WebDriver driver;
	
	By batch_header = By.xpath("//span[text()='Batch']");
	By header = By.xpath("//div[contains(text(),'Manage Batch')]");
	By pagination_control = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']");
	By header_tabledata = By.xpath("//div/table/thead/tr/th[2]");
	By delete_btn = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	By newbatch_btn = By.xpath("//span[contains(text(),'A New Batch')]");
	//By checkbox = By.xpath("//div[@role='checkbox']");
	By delete_icon = By.xpath("//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']");
	By edit_button = By.xpath("//button[@icon='pi pi-pencil']");
	By dialog = By.xpath("//div[@role='dialog']"); 
	
	
	public BatchValidationPage(WebDriver driver) {
		
		this.driver = driver ;
	}
	
	public void clickBatch() {
		driver.findElement(batch_header).click();
	}
	
	public String currentURL() {
		
		String url =driver.getCurrentUrl();
		return url;
	}
	
	public String getHeader() {
		String header_text =driver.findElement(header).getText();
		return header_text;
	}
	
	public void paginationControl() {
		
		if(driver.findElement(pagination_control).isDisplayed()) {
			System.out.println("Pagination Control is displayed");
			String text = driver.findElement(pagination_control).getText();
			System.out.println("Pagination: "+text);
		}
		else {
			System.out.println("Pagination control is not displayed");
		}
		
	}
	
	public void tableHeader()  {
		
		for(int i=2 ;i<=7 ;i++) {
			if(driver.findElement(By.xpath("//div/table/thead/tr/th[" + i + "]")).isDisplayed()) {
				
				System.out.println(driver.findElement(By.xpath("//div/table/thead/tr/th["+ i + "]")).getText()  +" is displayed");
				
						
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
	
	
	public String verifyNewBatchBtn() {
		
		String text = driver.findElement(newbatch_btn).getText();
		if(driver.findElement(newbatch_btn).isDisplayed()) {
			System.out.println(driver.findElement(newbatch_btn).getText()+" is displayed");
		}
		return text;
		
	}
	
	public void verifyCheckBox() {
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@role='checkbox']"));
		
		
		for(WebElement element: checkbox) {
			
			if(element.isDisplayed()) {
				Assert.assertTrue(element.isDisplayed());
			}
			else
			{
				System.out.println("Checkbox is not displayed");
			}
		}
	}
	
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
	
	public void deleteEnabled() {
		
		List<WebElement> delete = driver.findElements(delete_icon);
		for(WebElement element : delete) {
			
			if(element.isDisplayed()) {
				Assert.assertTrue(element.isDisplayed());
			}
			else {
				System.out.println("Delete button is not dispalyed");
			}
		
	}
	
	}
	
	public void clickNewBatch() {
		
		driver.findElement(newbatch_btn).click();
	}
	
	
	public void popUp() {
		
		WebElement dialogbox = driver.findElement(dialog);
		Assert.assertTrue(dialogbox.isDisplayed());
	}
}

