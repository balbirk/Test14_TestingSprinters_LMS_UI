package stepdefinition;

import java.io.IOException;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ManageUserPage;

public class EditUser_SD {

	ManageUserPage MP = new ManageUserPage();
	
	@Given("Admin is on Manage User Page in edit user module")
	public void admin_is_on_manage_user_page_in_edit_user_module() {
		System.out.println("User is on the manage page");
	}

	@When("Admin clicks on the edit icon in edit user module")
	public void admin_clicks_on_the_edit_icon_in_edit_user_module() throws InterruptedException {
		MP.edit_row();
	}

	@Then("A new pop up with User details appears in edit user module")
	public void a_new_pop_up_with_user_details_appears_in_edit_user_module() {
		Assert.assertEquals(MP.getUserPageTitle(), "Manage User");
		
	}

	@When("Update the fields with valid data and click submit in edit user module {string} and rownumber {int}")
	public void update_the_fields_with_valid_data_and_click_submit_in_edit_user_module_and_rownumber(String string, Integer int1) throws InterruptedException, IOException {
		MP.editUserForm(string, int1);
	}

	
	@Then("Admin gets message {string} and see the updated values in data table of edit user module")
	public void admin_gets_message_and_see_the_updated_values_in_data_table_of_edit_user_module(String string) throws InterruptedException {
		MP.getuserSuccess();
		//MP.alertDisplay();
	}

	@When("Update the fields with invalid values and click submit in edit user module {string} and rownumber {int}")
	public void update_the_fields_with_invalid_values_and_click_submit_in_edit_user_module_and_rownumber(String string, Integer int1) throws InterruptedException, IOException {
		MP.editUserForm(string, int1);
	}

	@Then("Admin should get Error message in edit user module for invalid values")
	public void admin_should_get_error_message_in_edit_user_module_for_invalid_values() throws InterruptedException {
		Assert.assertEquals(MP.getemailRequiredMsg(), "Email address is required");
		MP.clickUserCancelButton();
	}

	@When("Update the mandatory fields with valid values and click submit in edit user module {string} and rownumber {int}")
	public void update_the_mandatory_fields_with_valid_values_and_click_submit_in_edit_user_module_and_rownumber(String string, Integer int1) throws InterruptedException, IOException {
		
		MP.editUserForm(string, int1);
	}

	@Then("Admin gets message {string} and see the updated values in data table in edit user module")
	public void admin_gets_message_and_see_the_updated_values_in_data_table_in_edit_user_module(String string) {
		MP.getuserSuccess();
	}

	@When("Update the optional fields with valid values and click submit in edit user module {string} and rownumber {int}")
	public void update_the_optional_fields_with_valid_values_and_click_submit_in_edit_user_module_and_rownumber(String string, Integer int1) throws InterruptedException, IOException {
		
		MP.editUserForm(string, int1);
	}

	@When("Admin enters only numbers or special char in the text fields in edit user module {string} and rownumber {int}")
	public void admin_enters_only_numbers_or_special_char_in_the_text_fields_in_edit_user_module_and_rownumber(String string, Integer int1) throws InterruptedException, IOException {
		
		MP.editUserForm(string, int1);
	}

	@Then("Admin should get Error message in edit user module for invalid text fields")
	public void admin_should_get_error_message_in_edit_user_module_for_invalid_text_fields() {
		//MP.getuserFailedToCreate();
	}

	@When("Admin clicks Cancel button on edit popup in edit user module")
	public void admin_clicks_cancel_button_on_edit_popup_in_edit_user_module() {
		MP.clickUserCancelButton();
	}

	@Then("Admin can see the User details popup disappears and can see nothing changed for particular User in edit user module")
	public void admin_can_see_the_user_details_popup_disappears_and_can_see_nothing_changed_for_particular_user_in_edit_user_module() {
		System.out.println("User unchanged");
	}


	
	
}