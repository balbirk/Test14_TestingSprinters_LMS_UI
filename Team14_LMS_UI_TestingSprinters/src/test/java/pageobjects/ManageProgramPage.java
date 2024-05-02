package pageobjects;

import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Then;
import utilities.AppUtils;
import utilities.LoggerLoad;


public class ManageProgramPage {

	private WebDriver driver = Driverfactory.getDriver();
	String manageProgramPage="https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/user";
	
	
	WebElement programMenu = driver.findElement(By.id("program")); 		;
	WebElement batchMenu = driver.findElement(By.id("batch")); 		;
	WebElement userMenu = driver.findElement(By.id("user")); 		;

	WebElement addProgramBtn = driver.findElement(By.id("new")); 
	//WebElement editProgram=driver.findElement(By.id("editProgram"));
	//WebElement deleteProgram=driver.findElement(By.id("deleteProgram"));
	
	
	
	By batch_btn = By.xpath("//button[@id='batch']");
	By user_btn = By.xpath(" //button[@id='user']");
	By logout = By.xpath(" //button[@id='logout']");
	By header = By.xpath("//mat-card[1]/mat-card-title[1]/div[1]");
	
	WebElement multiCheckBoxProgram = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div"));

			//By.xpath("//div[contains(@class, 'p-d-flex') and contains(@class, 'p-ai-center') and contains(@class, 'p-jc-between') and contains(@class, 'ng-star-inserted')]"));
			//By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div"));
	// /html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[2]/div
	
	//WebElement pagination_text= driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div/span[1])")); 
    //WebElement pagination= driver.findElement(By.xpath("//*p-paginator-current ng-star-inserted']"));
    //WebElement page_title_text= driver.findElement(By.xpath("//*[@class='class=\"p-d-flex p-ai-center p-jc-between ng-star-inserted\']"));	
     	
	boolean status;
   
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

	public void clickEditProgramBtn() throws Exception { 
		Thread.sleep(2000);
		WebElement editButton = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr/td[5]/div/span/button[1]"));
		boolean editProgram = AppUtils.isUIFieldExists(editButton, "Edit button" , "Edit Program pop-up:");
		if(editProgram) {
			AppUtils.click(driver, editButton);
		}
		
	}
	
	public void clickDeleteProgramBtn() throws Exception {
		Thread.sleep(4000);
		WebElement delButton = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr/td[5]/div/span/button[2]"));
		boolean delProgram = AppUtils.isUIFieldExists(delButton, "Delete button" , "Delete Program pop-up:");
		if(delProgram) {
			
			WebElement programText = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr/td[2]"));
			if(AppUtils.isUIFieldExists(programText, "Yes button" , "Alert Pop-up")) {
				AppUtils.NEW_PROGRAM_NAME = programText.getText();
				LoggerLoad.info("AppUtils.NEW_PROGRAM_NAME for delete "+ AppUtils.NEW_PROGRAM_NAME);
			}
			AppUtils.click(driver, delButton);
			WebElement yesButton = driver.findElement(By.xpath("/html/body/app-root/app-program/p-confirmdialog/div/div/div[3]/button[2]"));
			boolean yesDel = AppUtils.isUIFieldExists(yesButton, "Yes button" , "Alert Pop-up");
			if(yesDel) {
				yesButton.click();
			}
			Thread.sleep(1000);
		}
	}
	
	public void searchByProgramName() {
		try {
			WebElement filterGlobalEle = driver.findElement(By.id("filterGlobal")); 
			AppUtils.fillValue(filterGlobalEle, AppUtils.NEW_PROGRAM_NAME);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Then("Admin should see the top menu program batch user")
	public void Admin_should_see_the_top_menu_program_batch_user() throws Exception {
	}
	
	@Then("Admin should see Manage Program title")
	public void Admin_should_see_Manage_Program_title() throws Exception {
	}

	@Then("Admin should see multicheckbox delete button disabled")
	public void Admin_should_see_multicheckbox_delete_button_disabled() throws Exception {
	}
	
	@Then("Admin should see table header with sort columns")
	public void Admin_should_see_table_header_with_sort_columns() throws Exception {
	}
	
	@Then("Admin should see footer and pagination links")
	public void Admin_should_see_footer_and_pagination_links() throws Exception {
	}
	
	
	@Then("Admin should verify the UI elements title table header and buttons")
	public void admin_should_verify_the_ui_elements_title_table_header_and_buttons() throws Exception {
		AppUtils.isUIFieldExists(this.programMenu, "Program Menu", "Manage User Page");
		Thread.sleep(100);
		AppUtils.isUIFieldExists(this.batchMenu, "Batch Menu", "Manage User Page");
		Thread.sleep(100);
		AppUtils.isUIFieldExists(this.userMenu, "User Menu", "Manage User Page");
		Thread.sleep(100);
		AppUtils.isUIFieldExists(this.multiCheckBoxProgram, "Multi checkbox", "Manage User Page");
		multiCheckBoxProgram.click();
		Thread.sleep(100);
		multiCheckBoxProgram.click();
		Thread.sleep(100);		
		WebElement table = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table"));
        // Find the second column header (index 1, since it's 0-based)
        WebElement columnHeader = table.findElement(By.xpath(".//thead/tr/th[2]"));
        // Click on the column header to trigger sorting
        columnHeader.click();
        Thread.sleep(100);
        columnHeader.click();
        Thread.sleep(100);
        
        columnHeader = table.findElement(By.xpath(".//thead/tr/th[3]"));
        // Click on the column header to trigger sorting
        columnHeader.click();
        Thread.sleep(100);
        columnHeader.click();
        Thread.sleep(100);

		
        columnHeader = table.findElement(By.xpath(".//thead/tr/th[4]"));
        // Click on the column header to trigger sorting
        columnHeader.click();
        Thread.sleep(100);
        columnHeader.click();
        Thread.sleep(100);

        
		WebElement footer_text= driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[2]/div"));
		if(AppUtils.isUIFieldExists(footer_text, "Footer Text: In total there are n programs", "Manage User Page")) {
			System.out.println(" Footer Text click "+footer_text.getText());
			//footer_text.sendKeys(" changing footer");
			LoggerLoad.info(footer_text.getText());
				
		}// 
			
        Thread.sleep(100);
		//AppUtils.isUIFieldExists(this.pagination_text, "Pagination Text: Showing a to b of c entries", "Manage User Page");
		
		WebElement page_right = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[3]/span"));
		if(AppUtils.isUIFieldExists(page_right, " Page right: click on Next Page", "Manage User Page")) {
			System.out.println(" Page right click "+footer_text.getText());
			//footer_text.sendKeys(" changing footer");
			LoggerLoad.info("Page right click ");
			page_right.click();
				
		}// 

        Thread.sleep(100);
		//AppUtils.isUIFieldExists(this.pagination_text, "Pagination Text: Showing a to b of c entries", "Manage User Page");
		
		WebElement page_last = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[4]/span"));
		if(AppUtils.isUIFieldExists(page_last, " Page Last: click on Next Page", "Manage User Page")) {
			LoggerLoad.info("Page Last click ");
			page_last.click();
				
		}// 
		
        Thread.sleep(100);
		//AppUtils.isUIFieldExists(this.pagination_text, "Pagination Text: Showing a to b of c entries", "Manage User Page");
		
		WebElement page_left = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[2]/span"));
		
		if(AppUtils.isUIFieldExists(page_left, " Page left: click on Next Page", "Manage User Page")) {
			System.out.println(" Page left click "+footer_text.getText());
			//footer_text.sendKeys(" changing footer");
			LoggerLoad.info("Page left click ");
			page_left.click();
				
		}// 

        Thread.sleep(100);
		//AppUtils.isUIFieldExists(this.pagination_text, "Pagination Text: Showing a to b of c entries", "Manage User Page");
		
		WebElement page_first = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div/button[1]/span"));
		if(AppUtils.isUIFieldExists(page_first, " Page first: click on Next Page", "Manage User Page")) {
			LoggerLoad.info("Page first click ");
			page_first.click();
				
		}// 
		
	}
	
	public void searchByProgram(String searchString) {
	}
	
	
	
	
	
	public void batchclick()
	{
		if(driver.findElement(batch_btn).isEnabled()) {
			driver.findElement(batch_btn).click();		
			
          System.out.println("Batch page is opened");
      } else {
          System.out.println("Batch page is not  opened");
      }
	}
	public void userclick()
	{
		
		
        if(driver.findElement(user_btn).isEnabled()) {
        	driver.findElement(user_btn).click();		
			
          System.out.println("User page is opened");
      } else {
          System.out.println("User page is not  opened");
      }
	}
	
	public void logout()
	{
		
		if(driver.findElement(logout).isEnabled()) {
			driver.findElement(logout).click();		
			
			
          System.out.println("Logout from page");
      }
	
	}
	
	public void validatePage()
	{
		try {
			status =driver.findElement(header).isDisplayed();
			assertTrue(status);
			System.out.println("page is displayed");
	
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
}