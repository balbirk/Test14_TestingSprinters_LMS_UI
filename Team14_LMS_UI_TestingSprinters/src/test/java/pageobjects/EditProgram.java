package pageobjects;

import java.sql.Time;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browserlaunch.Driverfactory;

public class EditProgram {
	String EditProgName="team14test92";
	String EditProgDesc="test987";
	String deleteProg="deleteteam14test32";
	String deleteall="deleteteam14test4";
	public WebDriver driver;
	
	public EditProgram() {
		this.driver  = Driverfactory.getDriver();
		//			PageFactory.initElements(this.driver, this);
	}
	
	public void admin_should_be_on_the_manage_program_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement ManageProgText=driver.findElement(By.xpath("//div//mat-card//mat-card-title//div[contains(text(),'Manage Program')]"));
	    Assert.assertTrue(ManageProgText.isDisplayed());
	}
	
	public void admin_is_on_the_manage_program_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ManageProgText=driver.findElement(By.xpath("//div//mat-card//mat-card-title//div[contains(text(),'Manage Program')]"));
	 Assert.assertTrue(ManageProgText.isDisplayed());
	}
	
	public void admin_click_the_edit_button_in_front_of_the_program_name() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     WebElement SearchProg=driver.findElement(By.id("filterGlobal"));
	     SearchProg.click();
	     
	     SearchProg.sendKeys(EditProgName);
	     String xpath1="//div//table//tbody//tr//td[2][text()='"+EditProgName+"']";
	     WebElement foundProgName=driver.findElement(By.xpath(xpath1));
	     Thread.sleep(3000);
	     WebElement checkboxProgname=driver.findElement(By.xpath("//div//div[2][@class='p-checkbox-box p-component']"));
	     checkboxProgname.click();
	     WebElement EditButton=driver.findElement(By.id("editProgram"));
	     EditButton.click();
	}
	
	public void popup_form_should_be_opened_for_editing_program_details() {
		WebElement titleprogdetails=driver.findElement(By.xpath("//div//div//span[@class='p-dialog-title ng-tns-c132-3 ng-star-inserted' and contains(text(),'Program Details')]"));
		System.out.println(titleprogdetails.getText());
		String title=titleprogdetails.getText();
		String ExpectedTitle="Program Details";
		Assert.assertEquals(title, ExpectedTitle);
		WebElement closebtn=driver.findElement(By.xpath("//div//button//span[@class='p-dialog-header-close-icon ng-tns-c132-3 pi pi-times']"));
		closebtn.click();
	}
	
	public void admin_is_on_the_program_details_popup_window_for_selected_program_name() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     WebElement SearchProg=driver.findElement(By.id("filterGlobal"));
	     SearchProg.click();
	     SearchProg.clear();
	     SearchProg.sendKeys(EditProgName);
	     String xpath1="//div//table//tbody//tr//td[2][text()='"+EditProgName+"']";
	     WebElement foundProgName=driver.findElement(By.xpath(xpath1));
	     Thread.sleep(300);
	     WebElement EditButton=driver.findElement(By.id("editProgram"));
	     EditButton.click();
//		WebElement titleprogdetails=Driverfactory.getDriver().findElement(By.xpath("//div//div//span[@class='p-dialog-title ng-tns-c132-3 ng-star-inserted' and contains(text(),'Program Details')]"));
//		Assert.assertTrue(titleprogdetails.isDisplayed());
	     
	}
	
	public void admin_edit_the_name_on_program_details_popup_window_and_click_on_save() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement titleprogdetails=driver.findElement(By.xpath("//div//div//span[@class='p-dialog-title ng-tns-c132-3 ng-star-inserted' and contains(text(),'Program Details')]"));
		System.out.println(titleprogdetails.getText());
		String title=titleprogdetails.getText();
		String ExpectedTitle="Program Details";
		Assert.assertEquals(title, ExpectedTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ProgName=driver.findElement(By.id("programName"));
		ProgName.click();
		 ProgName.clear();
		 ProgName.sendKeys(EditProgName);
		 WebElement SaveButton=driver.findElement(By.id("saveProgram"));
		 SaveButton.click();
	     
	}
	
public void admin_edit_the_program_description_on_program_details_popup_window_and_click_on_save() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement EditButton=Driverfactory.getDriver().findElement(By.id("editProgram"));
//	     EditButton.click();
	     WebElement titleprogdetails=driver.findElement(By.xpath("//div//div//span[@class='p-dialog-title ng-tns-c132-3 ng-star-inserted' and contains(text(),'Program Details')]"));
			Assert.assertTrue(titleprogdetails.isDisplayed());
		WebElement ProgDescription=driver.findElement(By.id("programDescription"));
		ProgDescription.clear();
		ProgDescription.sendKeys(EditProgDesc);
		 WebElement SaveButton=driver.findElement(By.id("saveProgram"));
		 SaveButton.click();
	     
	}
public void admin_change_the_program_status() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement EditButton=Driverfactory.getDriver().findElement(By.id("editProgram"));
//     EditButton.click();
	Thread.sleep(200);
     WebElement ActiveStatus=driver.findElement(By.name("category"));
     WebElement InactiveStatus=driver.findElement(By.xpath("//div//div[2][@class='p-radiobutton-box']"));
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     if (ActiveStatus.isSelected()) {
    	 InactiveStatus.click();
     }
     else if (InactiveStatus.isSelected()) {
    	 ActiveStatus.click();
     }
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     WebElement SaveButton=driver.findElement(By.id("saveProgram"));
	 SaveButton.click();
     
}

public void admin_enter_invalid_and_$_and_click_on_save_button(String ProgName, String Description) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement EditButton=Driverfactory.getDriver().findElement(By.id("editProgram"));
//     EditButton.click();
	WebElement ProgName1=driver.findElement(By.id("programName"));
	 ProgName1.clear();
	 ProgName1.click();
	 ProgName1.sendKeys(ProgName);
	WebElement ProgDescription=driver.findElement(By.id("programDescription"));
	ProgName1.click();
	ProgDescription.clear();
	ProgDescription.sendKeys(Description);
	 WebElement SaveButton=driver.findElement(By.id("saveProgram"));
	 SaveButton.click();      
}
public void admin_enter_invalid_and_$re34_and_click_on_save_button(String ProgName, String Description ) {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement EditButton=Driverfactory.getDriver().findElement(By.id("editProgram"));
//     EditButton.click();
	WebElement ProgName1=driver.findElement(By.id("programName"));
	 ProgName1.clear();
	 ProgName1.sendKeys(ProgName);
	WebElement ProgDescription=driver.findElement(By.id("programDescription"));
	ProgDescription.clear();
	ProgDescription.sendKeys(Description);
	 WebElement SaveButton=driver.findElement(By.id("saveProgram"));
	 SaveButton.click(); 
     
}

public void admin_click_on_the_cancel_button_on_program_window_popup() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement titleprogdetails=driver.findElement(By.xpath("//div//div//span[@class='p-dialog-title ng-tns-c132-3 ng-star-inserted' and contains(text(),'Program Details')]"));
	System.out.println(titleprogdetails.getText());
	String title=titleprogdetails.getText();
	String ExpectedTitle="Program Details";
	Assert.assertEquals(title, ExpectedTitle);
	Thread.sleep(200);
     WebElement CancelBtn=driver.findElement(By.xpath("//div/div//div[3]//button//span[2][@class='p-button-label' and contains(text(),'Cancel')]"));
     CancelBtn.click();
     
}

public void admin_click_on_the_save_button_on_program_window_popup() throws InterruptedException {

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(300);
     WebElement SaveButton=driver.findElement(By.id("saveProgram"));
	 SaveButton.click();
     
}

public void admin_clicks_delete_button_on_the_data_table_for_any_row() throws InterruptedException {
	 Thread.sleep(300);
	WebElement deletebutton=driver.findElement(By.id("deleteProgram"));
     deletebutton.click();
     
}

public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) throws InterruptedException {
    
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(200);
    WebElement ConfirmText=driver.findElement(By.xpath("//div//div//div//span[@class='p-dialog-title ng-tns-c133-4 ng-star-inserted' and contains(text(),'Confirm')]"));
    Assert.assertTrue(ConfirmText.isDisplayed());
    WebElement yesclick=driver.findElement(By.xpath("//div//button[2]//span[2][@class='p-button-label' and contains(text(),'Yes')]"));
    Assert.assertTrue(yesclick.isDisplayed());
    WebElement NoClick=driver.findElement(By.xpath("//div//button[1]//span[2][@class='p-button-label' and contains(text(),'No')]"));
    Assert.assertTrue(NoClick.isDisplayed());
    NoClick.click();
}

public void admin_is_on_the_manage_program_page_and_select_single_program_to_delete() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(300);
    WebElement SearchProg=driver.findElement(By.id("filterGlobal"));
    SearchProg.click();
    SearchProg.clear();
    SearchProg.sendKeys(deleteProg);
    String xpath1="//div//table//tbody//tr//td[2][text()='"+EditProgName+"']";
    WebElement foundProgName=driver.findElement(By.xpath(xpath1));
    Thread.sleep(200);
   // WebElement checkboxProgname=driver.findElement(By.xpath("//div//div[2][@class='p-checkbox-box p-component']"));
    //checkboxProgname.clear();
    //checkboxProgname.click();
   
    
}
public void nothing_changed_for_particular_program() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement SearchProg=driver.findElement(By.id("filterGlobal"));
    SearchProg.click();
    SearchProg.clear();
    Thread.sleep(200);
    SearchProg.sendKeys(EditProgName);
	WebElement checkboxProgname=driver.findElement(By.xpath("//div//div[2][@class='p-checkbox-box p-component']"));
    checkboxProgname.click();
     
}
public void admin_is_on_confirm_deletion_alert() throws InterruptedException {
	WebElement deletebutton=driver.findElement(By.id("deleteProgram"));
     deletebutton.click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    WebElement ConfirmText=driver.findElement(By.xpath("//div//div//div//span[@class='p-dialog-title ng-tns-c133-4 ng-star-inserted' and contains(text(),'Confirm')]"));
    Assert.assertTrue(ConfirmText.isDisplayed());
    WebElement yesclick=driver.findElement(By.xpath("//div//button[2]//span[2][@class='p-button-label' and contains(text(),'Yes')]"));
    Assert.assertTrue(yesclick.isDisplayed());
    WebElement NoClick=driver.findElement(By.xpath("//div//button[1]//span[2][@class='p-button-label' and contains(text(),'No')]"));
    Assert.assertTrue(NoClick.isDisplayed());
}
public void admin_clicks_no_button_on_the_deletion_alert() throws InterruptedException {

	Thread.sleep(300);
	WebElement NoClick=driver.findElement(By.xpath("//div//button[1]//span[2][@class='p-button-label' and contains(text(),'No')]"));
     NoClick.click();
     
}
public void admin_clicks_close_x_icon_on_deletion_alert() throws InterruptedException {
	Thread.sleep(300);
   WebElement Xclick=driver.findElement(By.xpath("//div//button//span[@class='pi pi-times ng-tns-c133-4']"));
   Xclick.click();
}
public void admin_clicks_any_checkbox_in_front_of_targeted_prgram_name() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     WebElement SearchProg=driver.findElement(By.id("filterGlobal"));
     SearchProg.click();
     
     SearchProg.sendKeys(deleteall);
     WebElement SelectAllButton=driver.findElement(By.xpath("//div//div[2][@class='p-checkbox-box']"));
     SelectAllButton.click();
     //String xpath1="//div//table//tbody//tr//td[2][text()='"+EditProgName+"']";
     //WebElement foundProgName=driver.findElement(By.xpath(xpath1));
//     Thread.sleep(3000);
//     WebElement checkboxProgname=driver.findElement(By.xpath("//div//div[2][@class='p-checkbox-box p-component']"));
//     checkboxProgname.click();
     
     
}

public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     WebElement DeleteAll=driver.findElement(By.xpath("//div//div//button[@class='p-button-danger p-button p-component p-button-icon-only']"));
     Assert.assertTrue(DeleteAll.isDisplayed());
     
}
public void admin_is_on_confirm_delete_all_alert() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     WebElement DeleteAll=driver.findElement(By.xpath("//div//div//button[@class='p-button-danger p-button p-component p-button-icon-only']"));
     DeleteAll.click();
}
public void admin_should_see_a_message_program_name(String string, String string2) {
    WebElement confirmtext=driver.findElement(By.xpath("//div[2]//span[@class='p-confirm-dialog-message ng-tns-c133-4']"));
    Assert.assertTrue(confirmtext.isDisplayed());
}
public void admin_clicks_no_button_on_the_alert() throws InterruptedException {
	Thread.sleep(300);
	WebElement NoClick=driver.findElement(By.xpath("//div//button[1]//span[2][@class='p-button-label' and contains(text(),'No')]"));
     NoClick.click();
     
}
public void admin_clicks_yes_button_on_the_alert() {
	WebElement yesclick=driver.findElement(By.xpath("//div//button[2]//span[2][@class='p-button-label' and contains(text(),'Yes')]"));
     yesclick.click();
     
}
public void admin_clicks_yes_button_on_the_deletion_alert() {
	
    WebElement yesclick=driver.findElement(By.xpath("//div//button[2]//span[2][@class='p-button-label' and contains(text(),'Yes')]"));
    yesclick.click();
    
}
public void admin_should_get_error_message() throws InterruptedException {
    WebElement InvalidProgError=driver.findElement(By.xpath("//div//small[@class='p-invalid ng-star-inserted' and contains(text(),'special')]"));
    Assert.assertTrue(InvalidProgError.isDisplayed());
    Thread.sleep(200);
    WebElement CancelBtn=driver.findElement(By.xpath("//div/div//div[3]//button//span[2][@class='p-button-label' and contains(text(),'Cancel')]"));
    CancelBtn.click();
    
    
}

public void program_staus_should_be_changed_with_successful_message() throws InterruptedException {
	Thread.sleep(200);
	 WebElement SearchProg=driver.findElement(By.id("filterGlobal"));
     SearchProg.click();
     SearchProg.clear();
     
}
public void admin_enter_invalid_prog_name_and_description_and_click_on_save_button() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement EditButton=Driverfactory.getDriver().findElement(By.id("editProgram"));
//     EditButton.click();
     WebElement titleprogdetails=driver.findElement(By.xpath("//div//div//span[@class='p-dialog-title ng-tns-c132-3 ng-star-inserted' and contains(text(),'Program Details')]"));
		Assert.assertTrue(titleprogdetails.isDisplayed());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ProgName=driver.findElement(By.id("programName"));
		ProgName.click();
		 ProgName.clear();
		 ProgName.sendKeys("123");
	WebElement ProgDescription=driver.findElement(By.id("programDescription"));
	ProgDescription.clear();
	ProgDescription.sendKeys("123");
	 WebElement SaveButton=driver.findElement(By.id("saveProgram"));
	 SaveButton.click();
}
}
