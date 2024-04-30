package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Then;
import utilities.AppUtils;


public class ManageProgramPage {

	private WebDriver driver = Driverfactory.getDriver();
	String manageuserPage="https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/user";
	
	
	WebElement programMenu = driver.findElement(By.id("program")); 		;
	WebElement batchMenu = driver.findElement(By.id("batch")); 		;
	WebElement userMenu = driver.findElement(By.id("user")); 		;

	WebElement addProgramBtn = driver.findElement(By.id("new")); 
	//WebElement editProgram=driver.findElement(By.id("editProgram"));
	//WebElement deleteProgram=driver.findElement(By.id("deleteProgram"));
	
	WebElement multiCheckBoxProgram = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div"));
	WebElement footer_text= driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[2]"));
	//WebElement pagination_text= driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div/span[1])")); 
    //WebElement pagination= driver.findElement(By.xpath("//*p-paginator-current ng-star-inserted']"));
    //WebElement page_title_text= driver.findElement(By.xpath("//*[@class='class=\"p-d-flex p-ai-center p-jc-between ng-star-inserted\']"));	
     	
     
   
	public ManageProgramPage() {
		//PageFactory.initElements(driver, this);
	}
    		 
    //  /html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div/span[1]
	//@FindBy (xpath="//a[text()='Add New User']") WebElement addNewUserBtn;
	
	
	public void navigateToManageProgramPage() {
		programMenu.click();
		
	}
	public void clickAddNewProgramBtn() {
		addProgramBtn.click();
		
	}	

	@Then("Admin should verify the UI elements title table header and buttons")
	public void admin_should_verify_the_ui_elements_title_table_header_and_buttons() throws Exception {
		AppUtils.isUIFieldExists(this.programMenu, "Program Menu", "Manage User Page");
		Thread.sleep(2000);
		AppUtils.isUIFieldExists(this.batchMenu, "Batch Menu", "Manage User Page");
		Thread.sleep(2000);
		AppUtils.isUIFieldExists(this.userMenu, "User Menu", "Manage User Page");
		Thread.sleep(2000);
		AppUtils.isUIFieldExists(this.multiCheckBoxProgram, "Multi checkbox", "Manage User Page");
		multiCheckBoxProgram.click();
		Thread.sleep(2000);
		multiCheckBoxProgram.click();
		Thread.sleep(2000);
		if(AppUtils.isUIFieldExists(this.footer_text, "Footer Text: In total there are n programs", "Manage User Page")) {
			((JavascriptExecutor) driver).executeScript("arguments[0].select();", this.footer_text);
		}// 
			
		Thread.sleep(5000);
		//AppUtils.isUIFieldExists(this.pagination_text, "Pagination Text: Showing a to b of c entries", "Manage User Page");
		
	}
	
	public void searchByProgram(String searchString) {
	}
}