package stepdefinition;

import pageobjects.ManageUserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteUser_SD {

	
	ManageUserPage MP = new ManageUserPage();
	
	
	@Given("Admin is on Manage User Page in delete user module")
	public void admin_is_on_manage_user_page_in_delete_user_module() {
		System.out.println("User is on the manage page");
	}

	@When("Admin clicks the delete icon in delete user module")
	public void admin_clicks_the_delete_icon_in_delete_user_module() throws InterruptedException {
		MP.delete_row();
	}

	@Then("Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion in delete user module")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion_in_delete_user_module(String string) throws InterruptedException {
		MP.alertDisplay();
		
	}

	@When("Admin clicks  No option in delete user module")
	public void admin_clicks_no_option_in_delete_user_module() {
		MP.alert_dismiss();
	}

	@Then("Admin can see the deletion alert disappears without deleting in delete user module")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting_in_delete_user_module() {
		MP.user_deleted();
	}

	@When("Admin clicks on close button in delete user module")
	public void admin_clicks_on_close_button_in_delete_user_module() {
		MP.user_deleted();
	}

	@Then("Admin can see the deletion alert disappears without any changes in delete user module")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes_in_delete_user_module() {
		MP.user_deleted();
	}

	
	@Given("Admin is on Confirm Deletion alert in delete user module")
	public void admin_is_on_confirm_deletion_alert_in_delete_user_module() {
		System.out.println("Deletion alert dialog is displayed");
	}

	@When("Admin clicks yes option in delete user module")
	public void admin_clicks_yes_option_in_delete_user_module() {
		MP.alert_accept();
	}

	@Then("Admin gets a message {string} alert and do not see that user in the data table in delete user module")
	public void admin_gets_a_message_alert_and_do_not_see_that_user_in_the_data_table_in_delete_user_module(String string) {
		MP.successMessage();
	}
			
}
