package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.EditProgram;
import pageobjects.LoginPage;

public class EditProgram_SD {
	
	String EditProgName="team14test1";
	String EditProgDesc="test987";
	public WebDriver driver;
	EditProgram ed=new EditProgram();
	
	public EditProgram_SD() {
		this.driver  = Driverfactory.getDriver();
		//			PageFactory.initElements(this.driver, this);
	}
	
	
	
	//static WebDriver driver=new ChromeDriver();	
	
	
	@Given("Admin is logged-in to the LMS Web Application.")
	public void admin_is_logged_in_to_the_lms_web_application() {
		
		driver.manage().window().maximize();
		driver.get("https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/");
	    WebElement Uname=Driverfactory.getDriver().findElement(By.id("username"));
	    Uname.sendKeys("sdetorganizers@gmail.com");
	    WebElement pwd=driver.findElement(By.id("password"));
	    pwd.sendKeys("UIHackathon@02");
	    WebElement BtnLogin=driver.findElement(By.xpath("//button//span[@class='mat-button-wrapper']"));
	    BtnLogin.click();
	}

	@When("Admin clicks Program module on Navigation bar.")
	public void admin_clicks_program_module_on_navigation_bar() {
	     
		WebElement ProgLink= driver.findElement(By.id("program"));
		ProgLink.click();
	     
	}

	@Then("Admin should be on the Manage Program page.")
	public void admin_should_be_on_the_manage_program_page() {
		
		ed.admin_should_be_on_the_manage_program_page();
	}

	@Given("Admin is On the Manage Program Page")
	public void admin_is_on_the_manage_program_page() {
		
		ed.admin_is_on_the_manage_program_page();
	}

	@When("Admin click the Edit button in front of the Program name")
	public void admin_click_the_edit_button_in_front_of_the_program_name() throws InterruptedException {
		ed.admin_click_the_edit_button_in_front_of_the_program_name();
	}

	@Then("Popup form should be opened for editing Program Details")
	public void popup_form_should_be_opened_for_editing_program_details() {
		ed.popup_form_should_be_opened_for_editing_program_details();
	}

	@Given("Admin is on the Program Details popup window for selected Program name.")
	public void admin_is_on_the_program_details_popup_window_for_selected_program_name() throws InterruptedException {
		ed.admin_is_on_the_program_details_popup_window_for_selected_program_name();
	     
	}

	@When("Admin edit the name on Program Details popup window and click on Save")
	public void admin_edit_the_name_on_program_details_popup_window_and_click_on_save() {
		ed.admin_edit_the_name_on_program_details_popup_window_and_click_on_save();
	     
	}

	@Then("Program name should be edited with successful message.")
	public void program_name_should_be_edited_with_successful_message() {
	    
	     
	}

	@When("Admin edit the Program Description on Program Details popup window and click on Save")
	public void admin_edit_the_program_description_on_program_details_popup_window_and_click_on_save() {
		ed.admin_edit_the_program_description_on_program_details_popup_window_and_click_on_save();
	     
	}

	@Then("Program Description should be edited with successful message.")
	public void program_description_should_be_edited_with_successful_message() {
	     
	     
	}

	@When("Admin change the Program Status")
	public void admin_change_the_program_status() throws InterruptedException {
		ed.admin_change_the_program_status();
	     
	}

	@Then("Program staus should be changed with successful message.")
	public void program_staus_should_be_changed_with_successful_message() {
	     
	     
	}

	@When("Admin enter invalid {int} and $%^ and click on Save Button")
	public void admin_enter_invalid_and_$_and_click_on_save_button(String ProgName, String Description) {
		ed.admin_enter_invalid_and_$_and_click_on_save_button(ProgName, Description); 
	     
	}

	@Then("Admin should get error message.")
	public void admin_should_get_error_message() {
	     
	     
	}

	@When("Admin enter invalid %^& and @#$re34 and click on Save Button")
	public void admin_enter_invalid_and_$re34_and_click_on_save_button(String ProgName, String Description ) {
		ed.admin_enter_invalid_and_$re34_and_click_on_save_button(ProgName, Description);
	     
	}

	@When("Admin click on the cancel button on Program window popup")
	public void admin_click_on_the_cancel_button_on_program_window_popup() throws InterruptedException {
		ed.admin_click_on_the_cancel_button_on_program_window_popup();
	     
	}

	@Then("Popup window closed with page navigate to Manage Program page. Nothing changed for particular program.")
	public void popup_window_closed_with_page_navigate_to_manage_program_page_nothing_changed_for_particular_program() {
	     
	     
	}

	@When("Admin click on the Save button on Program window popup")
	public void admin_click_on_the_save_button_on_program_window_popup() throws InterruptedException {
		ed.admin_click_on_the_save_button_on_program_window_popup();
	     
	}

	@Then("Nothing changed for particular program.")
	public void nothing_changed_for_particular_program() {
	     
	     
	}
	
	@When("Admin clicks Delete button on the data table for any row")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
		ed.admin_clicks_delete_button_on_the_data_table_for_any_row();
	     
	}
	
	@Given("Admin is On the Manage Program Page and select single Program to delete")
	public void admin_is_on_the_manage_program_page_and_select_single_program_to_delete() {
	
	}

	@Then("Admin should see a alert open with heading {string} along with YES and NO button for deletion")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
	     
	     ed.admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(string);
	}

	@Then("Admin should see a message {string} Testing\"?\"")
	public void admin_should_see_a_message_testing(String string) {
	     
	     
	}

	@Given("Admin is on Confirm Deletion alert")
	public void admin_is_on_confirm_deletion_alert() {
	     
	     
	}

	@When("Admin clicks YES button on the deletion alert")
	public void admin_clicks_yes_button_on_the_deletion_alert() {
	     
	     
	}

	@Then("Admin gets a message {string} alert and able to see that program deleted in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String string) {
	     
	     
	}

	@When("Admin clicks NO button on the deletion alert")
	public void admin_clicks_no_button_on_the_deletion_alert() {
	     
	     
	}

	@Then("Admin can see the deletion alert disappears without deleting")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
	     
	     
	}

	@When("Admin clicks Close\\(X) Icon on Deletion alert")
	public void admin_clicks_close_x_icon_on_deletion_alert() {
	   
	}

	@Then("Admin can see the deletion alert disappears without any changes")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
	     
	     
	}
	@When("Admin clicks any checkbox in front of targeted Prgram Name")
	public void admin_clicks_any_checkbox_in_front_of_targeted_prgram_name() {
	     
	     
	}

	@Then("Admin should see common delete option enabled under header Manage Program")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
	     
	     
	}

	@When("Admin clicks YES button on the alert")
	public void admin_clicks_yes_button_on_the_alert() {
	     
	     
	}

	@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
	     
	     
	}

	@When("Admin clicks No button on the alert")
	public void admin_clicks_no_button_on_the_alert() {
	     
	     
	}

	@Then("Admin should land on Manage Program page and can see the selected program is not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
	     
	     
	}

	@Then("Admin should land on Manage Program page and can see the selected programs are deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table() {
	     
	     
	}

	@Then("Admin should land on Manage Program page and can see the selected programs are not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
	     
	     
	}

	@When("Admin clicks the sort icon of program name column")
	public void admin_clicks_the_sort_icon_of_program_name_column() {
	     
	     
	}

	@Then("The data get sorted on the table based on the program name column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order() {
	     
	     
	}

	@Given("The data is in the ascending order on the table based on Program Name column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column() {
	     
	     
	}

	@Then("The data get sorted on the table based on the program name column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order() {
	     
	     
	}

	@When("Admin clicks the sort icon of program Description column")
	public void admin_clicks_the_sort_icon_of_program_description_column() {
	     
	     
	}

	@Then("The data get sorted on the table based on the program Description column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order() {
	     
	     
	}

	@Given("The data is in the ascending order on the table based on Program Description column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column() {
	     
	     
	}

	@Then("The data get sorted on the table based on the program Description column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order() {
	     
	     
	}
}
