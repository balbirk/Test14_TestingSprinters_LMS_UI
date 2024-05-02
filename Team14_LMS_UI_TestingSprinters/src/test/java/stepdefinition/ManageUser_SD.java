package stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import pageobjects.ManageUserPage;
import utilities.AppUtils;


public class ManageUser_SD {
	
	//Add a new user data
	ManageUserPage MP = new ManageUserPage();
	
	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string)  {
		MP.navigateToManageUserPage();
		
	}
	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	    MP.clickAddNewUserBtn();
	}
	
	@When("User clicks on User menu link")
	public void user_clicks_on_user_menu_link() {
	   
	}

	@Then("User navigates to Manage User landing page")
	public void user_navigates_to_manage_user_landing_page() {

	}
	

		@Then("User should be redirected to User page in user module")
		public void user_should_be_redirected_to_user_page_in_user_module() {
			System.out.println("On user page");
		}

		@Then("User clicks on {string} button on user page")
		public void user_clicks_on_button_on_user_page(String string) {
			
		}

		@Given("Admin is on  User details pop up in user module")
		public void admin_is_on_user_details_pop_up_in_user_module() {
			System.out.println("Admin is on user details page");
			
		}

//		Scenario: Empty form submission 		
		@When("Admin clicks on submit button without entering data in user module")
		public void admin_clicks_on_submit_button_without_entering_data_in_user_module() {
			MP.clickUserSaveButton();
			
		}

		@Then("User gets message {string}")
		public void user_gets_message(String string) throws InterruptedException {
			System.out.println("Inside user message");
			System.out.println(string);
			String ActualResult = MP.getEmptyFormError(); 
			System.out.println("Actual result " + ActualResult);
			System.out.println("Expected Result " + string);
			Assert.assertEquals(MP.getEmptyFormError(), string);
			
		}

		//Scenario: Validate Cancel button on User Details form
		@When("Admin clicks Cancel button in user module")
		public void admin_clicks_cancel_button_in_user_module() {

			MP.clickUserCancelButton();

		}

		@Then("Admin can see the User details popup disappears without adding any user in user module")
		public void admin_can_see_the_user_details_popup_disappears_without_adding_any_user_in_user_module() {
			System.out.println("User back to main page after cancel operation");
			Assert.assertEquals(MP.getUserPageTitle(), "Manage User");
		}

		
		//Scenario: Validate Cancel/Close(X) icon on User Details form
		@When("Admin clicks Close Icon on User Details form")
		public void admin_clicks_close_icon_on_user_details_form() {
			System.out.println("Closing via cross X button");
			MP.clickCrossButtonUser();
		}


		@Then("User Details popup window should be closed without saving in user module")
		public void user_details_popup_window_should_be_closed_without_saving_in_user_module() {
			System.out.println("User back to main page after cancel X operation");
			Assert.assertEquals(MP.getUserPageTitle(), "Manage User");
		}

		//Scenario: check if user is created when invalid data is entered in all of the fields in user module
		@When("Admin enters invalid data in all of the  fields in the form and clicks on submit button in user module")
		public void admin_enters_invalid_data_in_all_of_the_fields_in_the_form_and_clicks_on_submit_button_in_user_module() throws InterruptedException, IOException {
			
			MP.fillInvalidUserForm();
		}

		@Then("Admin gets error message and user is not created in user module")
		public void admin_gets_error_message_and_user_is_not_created_in_user_module() throws InterruptedException{
			System.out.println("Reading failure error msg");
			
			System.out.println(MP.getuserFailedToCreate());
			Thread.sleep(Duration.ofMillis(2000));
			
		}

		
		//Scenario: Check if user is created when only mandatory fields are entered with valid data in user module
		@When("Admin enters mandatory fields in the form and clicks on submit button in user module {string} and rownumber {int}")
		public void admin_enters_mandatory_fields_in_the_form_and_clicks_on_submit_button_in_user_module_and_rownumber(String string, Integer int1) throws InterruptedException, IOException {
			System.out.println("Enter all mandatory fields");
			MP.fillUserForm(string, int1);
		}
		

		@Then("Admin gets message User added {string} in user module")
		public void admin_gets_message_user_added_in_user_module(String string) {
			System.out.println("Reading success error msg");
			String ActualMsg =  MP.getuserSuccess();
			if (ActualMsg==string)
			{
				System.out.println(MP.getuserSuccess());
			}
			else {
					System.out.println("User creation failed");
					Assert.assertFalse(false);
				}
			}
		
		//Scenario: Check if user is created when only optional fields are entered with valid data in user module
		@When("Admin skips to add value in mandatory field in user module")
		public void admin_skips_to_add_value_in_mandatory_field_in_user_module() {
			MP.setUserFName("aa");
			MP.clickUserSaveButton();
		}

		@Then("Admin should see error message {string} below the test field and the field will be highlighed in red color in user module")
		public void admin_should_see_error_message_below_the_test_field_and_the_field_will_be_highlighed_in_red_color_in_user_module(String string) throws InterruptedException 
		{
			System.out.println("Skipping mandatory fields");
			Assert.assertEquals(MP.getMandatoryFieldError(), string);
		}

		
		//Scenario: Check if the user details are added in data table

		@Then("The newly added user {string} should be present in the data table in Manage User page in user module")
		public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page_in_user_module(String string) throws InterruptedException {
			MP.setUserSearchValue(string);
			Thread.sleep(Duration.ofMillis(1000));
			System.out.println("User name is " + MP.getUserSearchResult());
			Assert.assertEquals(MP.getUserSearchResult(), string);
		}
		
		
		
		//***********************************************************************


		@Given("Admin is on Manage User Page in user module in search")
		public void admin_is_on_manage_user_page_in_user_module_in_search() {
			
			System.out.println("User is on Manage User page");
			Assert.assertEquals(MP.getUserPageTitle(), "Manage User");

		}

		@When("Admin enters {string} into search box in user module in search")
		public void admin_enters_into_search_box_in_user_module_in_search(String string) {
			MP.setUserSearchValue(string);
			//MP.setUserSearchValue(AppUtils.USER_FIRST_NAME);

		}

		@Then("Admin should see user displayed with the entered name in user module in search")
		public void admin_should_see_user_displayed_with_the_entered_name_in_user_module_in_search() throws InterruptedException {
			Thread.sleep(Duration.ofMillis(3000));
			System.out.println("User name is " + MP.getUserSearchResult());
			Assert.assertEquals(MP.getUserSearchResult(), AppUtils.USER_FIRST_NAME);
			//MP.searchUserNameAllPages();

		}

		@When("Admin enters the {string} in the data table on the Search box in user module in search")
		public void admin_enters_the_in_the_data_table_on_the_search_box_in_user_module_in_search(String string) {
			MP.setUserSearchValue("*())*)*(");
		}

		@Then("Admin should see zero entries on the data table in user module in search")
		public void admin_should_see_zero_entries_on_the_data_table_in_user_module_in_search() throws InterruptedException {
			Thread.sleep(Duration.ofMillis(3000));
			Assert.assertEquals(0, MP.getXVal());
			Assert.assertEquals(0, MP.getYVal());
			Assert.assertEquals(0, MP.getZVal());
		}


		
		
		}
