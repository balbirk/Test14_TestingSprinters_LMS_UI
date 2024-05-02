package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ManageUserPage;

public class AddNewUserValidation_SD {
	
	ManageUserPage MP= new ManageUserPage();
	
//Scenario: Validate User Details Popup window
	@Given("Admin is on Manage User Page in user module")
	public void admin_is_on_manage_user_page_in_user_module() {
		System.out.println("User is on Manage User page");
		Assert.assertEquals(MP.getUserPageTitle(), "Manage User");
	}

	@When("Admin clicks {string} button in user module")
	public void admin_clicks_button_in_user_module(String string) {
		MP.clickAddNewUserBtn();
	}

	@Then("Admin should see a popup open for user details with First Name,Middle name, Last Name, Location, phone, email, linkedin url, User Role, Role status, visa status,Undergraduate, postgraduate,time zone, user comments and user fields along with Cancel , Submit and close buttons")
	public void admin_should_see_a_popup_open_for_user_details_with_first_name_middle_name_last_name_location_phone_email_linkedin_url_user_role_role_status_visa_status_undergraduate_postgraduate_time_zone_user_comments_and_user_fields_along_with_cancel_submit_and_close_buttons() {
		System.out.println(MP.getUserPageTitle());
		Assert.assertEquals(MP.cancelDisplayed(),true);
		Assert.assertEquals(MP.saveDisplayed(),true);
		Assert.assertEquals(MP.fNameDisplayed() ,true);
		Assert.assertEquals(MP.MNameDisplayed(),true);
		Assert.assertEquals(MP.LNameDisplayed(),true);
		
	}

	//Scenario: Validate input fields and text boxes in user details form
	@Then("Admin should see  text boxes for the fields First Name, Middle name, Last Name, Location, phone, email, linkedin url, Undergraduate, postgraduate,time zone ,user comments")
	public void admin_should_see_text_boxes_for_the_fields_first_name_middle_name_last_name_location_phone_email_linkedin_url_undergraduate_postgraduate_time_zone_user_comments() {
		Assert.assertEquals(MP.linkedinDisplayed(),true);
		Assert.assertEquals(MP.locDisplayed() ,true);
		Assert.assertEquals(MP.phoneDisplayed(),true);
		Assert.assertEquals(MP.commentsDisplayed(),true);
		Assert.assertEquals(MP.postGradDisplayed(),true);
		Assert.assertEquals(MP.underGradDisplayed(),true);
		Assert.assertEquals(MP.tzDisplayed(),true);
		Assert.assertEquals(MP.emailDisplayed(),true);
	
	}

	//Scenario: Validate drop downs in new user form
	@Then("Admin should see drop downs for the fields User Role, Role status, visa status on user details pop up")
	public void admin_should_see_drop_downs_for_the_fields_user_role_role_status_visa_status_on_user_details_pop_up() {
		Assert.assertEquals(MP.roleDisplayed() ,true);
		Assert.assertEquals(MP.roleStatusDisplayed() ,true);
		Assert.assertEquals(MP.visaDisplayed(),true);
	}
}
