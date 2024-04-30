package stepdefinition;

import org.openqa.selenium.WebDriver;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.NewProgramPage;
import utilities.LoggerLoad;

public class AddNewProgram_SD {

	private WebDriver driver = Driverfactory.getDriver();
	NewProgramPage program = new NewProgramPage();
  
	
	@Then("The pop up should include fields like program Name Description Status")
	public void the_pop_up_should_include_fields_like_program_name_description_status() {
		LoggerLoad.info("Admin clicks on Add program. Veryfing if all form fields are available");
		program.validateProgramForm();
		LoggerLoad.info("Admin clicks on Add program. Veryfing if all form fields are available complete");
	}

	@When("Admin clicks Save button on program details without entering any data")
	public void admin_clicks_save_button_on_program_details_without_entering_any_data() {
		program.clickSaveBtn();
	}

	@Then("Admin gets a Error message alert for program fields")
	public void admin_gets_a_error_message_alert_for_program_fields() {
		
	}
	
	@When("Admin clicks Save button after entering only program name {string} and {string}")
	public void admin_clicks_save_button_after_entering_only_program_name_and(String keyOption, String sheetName) throws Exception {
		program.saveProgramData(keyOption,sheetName,false);
	}

	@Then("Admin gets a message alert for program mandatory field {string}")
	public void admin_gets_a_message_alert_for_program_mandatory_field(String string) {
		
	}
	
	@Then("Admin cancels the pop up")
	public void admin_cancels_the_pop_up() {
		LoggerLoad.info("Start Admin clicks on cancel form on the popup");
		program.cancelForm();
		LoggerLoad.info("Admin clicks on cancel form on the popup complete");
		
	}
	
	@When("Admin clicks Save button after entering all the valid details {string} and {string}")
	public void admin_clicks_save_button_after_entering_all_the_valid_details_and(String keyOption, String sheetName) throws Exception {
		program.saveProgramData(keyOption,sheetName,true);
	}

	@When("Admin clicks Close Icon on Program Details form")
	public void admin_clicks_close_icon_on_program_details_form() throws Exception {
		program.clickBtnX();	
		
	}
	

	@Then("Program Details popup window should be closed without saving")
	public void program_details_popup_window_should_be_closed_without_saving() {
	}
	



}
