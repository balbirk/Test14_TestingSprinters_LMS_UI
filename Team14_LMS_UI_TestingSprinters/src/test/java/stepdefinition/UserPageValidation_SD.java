package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ManageUserPage;

public class UserPageValidation_SD {

	ManageUserPage MP = new ManageUserPage();
	
	@Given("Admin is on dashboard page after Login in user module")
	public void admin_is_on_dashboard_page_after_login_in_user_module() {
		System.out.println("On dashboard page");
		}

	@When("Admin clicks {string} from navigation bar in user module")
	public void admin_clicks_from_navigation_bar_in_user_module(String string) {
		MP.navigateToManageUserPage();
	}

	@Then("Admin should see the {string} in the URL in user module")
	public void admin_should_see_the_in_the_url_in_user_module(String string) {
		System.out.println("User is on Manage User page");
		Assert.assertEquals(MP.getUserPageTitle(), "Manage User");
	}

	@Then("Admin should see a heading with text {string} on the page in user module")
	public void admin_should_see_a_heading_with_text_on_the_page_in_user_module(String string) {
		Assert.assertEquals(MP.getManageUserText(), "Manage User");
	}

	@Then("Admin should see the text as \"\"Showing x to y of z entries\"\" along with Pagination icon below the table,")
	public void admin_should_see_the_text_as_showing_x_to_y_of_z_entries_along_with_pagination_icon_below_the_table() throws InterruptedException {
		Thread.sleep(Duration.ofMillis(3000));
		System.out.println(MP.getShowingText());
		
	}

	@Then("x- starting record number on that page")
	public void x_starting_record_number_on_that_page() throws InterruptedException {
		Thread.sleep(Duration.ofMillis(3000));
		System.out.println(MP.getXVal());
		
	}

	@Then("y-ending record number on that page")
	public void y_ending_record_number_on_that_page() throws InterruptedException {
		Thread.sleep(Duration.ofMillis(3000));
		System.out.println(MP.getYVal());
	}

	@Then("z-Total number of records")
	public void z_total_number_of_records() throws InterruptedException {
		Thread.sleep(Duration.ofMillis(3000));
		System.out.println(MP.getZVal());
	}

	@Then("Admin Should see the data table with column names Id, Name, location, Phone Number, Edit\\/Delete in user module")
	public void admin_should_see_the_data_table_with_column_names_id_name_location_phone_number_edit_delete_in_user_module() {
		System.out.println(MP.checkColumnHeaders());
	}

	@Then("Admin should see a Delete button on the top left hand side as Disabled in user module")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled_in_user_module() {
		Assert.assertTrue(MP.userPageDelIconIsDisplayed());
		
	}

	@Then("Admin should be able to see the {string} button above the data table in user module")
	public void admin_should_be_able_to_see_the_button_above_the_data_table_in_user_module(String string) {
		
		Assert.assertTrue(MP.AddNewUserBtnIsDisplayed());
	}

	@Then("Admin should be able to see the search text box above the data table in user module")
	public void admin_should_be_able_to_see_the_search_text_box_above_the_data_table_in_user_module() {
		Assert.assertTrue(MP.UserSearchValueIsDisplayed());
	}

	@Then("Admin should see two records displayed on the data table in user module")
	public void admin_should_see_two_records_displayed_on_the_data_table_in_user_module() {
		System.out.println("Two records.............");
	}

	//Checkbox icons enabled
	@Then("Each row in the data table should have a checkbox in user module")
	public void each_row_in_the_data_table_should_have_a_checkbox_in_user_module() {
		Assert.assertTrue(MP.checkBoxAllRowsEnabled());
		
	}

	//Edit icons enabled
	@Then("Each row in the data table should have a edit icon that is enabled in user module")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled_in_user_module() {
		Assert.assertTrue(MP.editAllRowsEnabled());
		
	}

	//Delete icons enabled
	@Then("Each row in the data table should have a delete icon that is enabled in user module")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled_in_user_module() {
		Assert.assertTrue(MP.deleteAllRowsEnabled());
	}	
	
	//Assign Staff is displayed
	@Then("Admin should be able to see the {string} button above the data table in user module for assign staff")
	public void admin_should_be_able_to_see_the_button_above_the_data_table_in_user_module_for_assign_staff(String string) {
	 System.out.println("Should see + Assign Staff");
	 Assert.assertTrue(MP.assignStaffIsDisplayed());
	 
	}
	//Assign Student is displayed
	@Then("Admin should be able to see the {string} button above the data table in user module for assign student")
	public void admin_should_be_able_to_see_the_button_above_the_data_table_in_user_module_for_assign_student(String string) {
		System.out.println("Should see + Assign Student");
		Assert.assertTrue(MP.assignStudentIsDisplayed());	
	}
}
