package stepdefinition;

import java.io.IOException;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DashBoardPage;
import pageobjects.LoginPage;
import pageobjects.NewUserPage;

public class ManageUser_SD {

	
	//Add a new user data
		
		LoginPage loginPage = new LoginPage(Driverfactory.getDriver());
		DashBoardPage dashboardPage = new DashBoardPage(Driverfactory.getDriver());

		NewUserPage UserPage = new NewUserPage(Driverfactory.getDriver());
		
		
		@Given("The user opens LMS portal link")
		public void the_user_opens_lms_portal_link() {
			Driverfactory.getDriver().get("https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/");
			
		}

		@When("The user enters userid and password, user clicks {string} button")
		public void the_user_enters_userid_and_password_user_clicks_button(String string) throws IOException {
			loginPage.sendUsername();
			loginPage.sendPassword();
			loginPage.clickLoginBtn();
		}
		

		@Then("The user should be redirected to manage program page")
		public void the_user_should_be_redirected_to_manage_program_page() {
			System.out.println("ManageUser - Program Then");
		}

		@Then("user clicks on User link in user module")
		public void user_clicks_on_user_link_in_user_module() {
			
			dashboardPage.clickOnUserLink();
		}

		@Then("User should be redirected to User page in user module")
		public void user_should_be_redirected_to_user_page_in_user_module() {
		}

		@Then("User clicks on {string} button on user page")
		public void user_clicks_on_button_on_user_page(String string) {
		}

		@Given("Admin is on  User details pop up in user module")
		public void admin_is_on_user_details_pop_up_in_user_module() {
		}

		@When("Admin enters mandatory fields in the form and clicks on submit button in user module")
		public void admin_enters_mandatory_fields_in_the_form_and_clicks_on_submit_button_in_user_module() {
		}

		@Then("Admin gets message User added Successfully in user module")
		public void admin_gets_message_user_added_successfully_in_user_module() {
		}

		@When("Admin skips to add value in mandatory field in user module")
		public void admin_skips_to_add_value_in_mandatory_field_in_user_module() {
		}

		@Then("Admin should see error message below the test field and the field will be highlighed in red color in user module")
		public void admin_should_see_error_message_below_the_test_field_and_the_field_will_be_highlighed_in_red_color_in_user_module() {
		}

		@When("Admin enters invalid data in all of the  fields in the form and clicks on submit button in user module")
		public void admin_enters_invalid_data_in_all_of_the_fields_in_the_form_and_clicks_on_submit_button_in_user_module() {
		}

		@Then("Admin gets error message and user is not created in user module")
		public void admin_gets_error_message_and_user_is_not_created_in_user_module() {
		}

		@When("Admin clicks on submit button without entering data in user module")
		public void admin_clicks_on_submit_button_without_entering_data_in_user_module() {
		}

		@Then("user will not be created and Admin gets error message in user module")
		public void user_will_not_be_created_and_admin_gets_error_message_in_user_module() {
		}

		@When("Admin clicks Cancel\\/Close\\(X) Icon on User Details form")
		public void admin_clicks_cancel_close_x_icon_on_user_details_form() {
		}

		@Then("User Details popup window should be closed without saving in user module")
		public void user_details_popup_window_should_be_closed_without_saving_in_user_module() {
		}

		@When("Admin clicks Cancel button in user module")
		public void admin_clicks_cancel_button_in_user_module() {
		}

		@Then("Admin can see the User details popup disappears without adding any user in user module")
		public void admin_can_see_the_user_details_popup_disappears_without_adding_any_user_in_user_module() {
		}

		@When("Fill in all the fields with valid values and click submit in user module")
		public void fill_in_all_the_fields_with_valid_values_and_click_submit_in_user_module() {
		}

		@Then("The newly added user should be present in the data table in Manage User page in user module")
		public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page_in_user_module() {
		}


		
		
		//***********************************************************************
		

	
}
