package stepdefinition;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.Assert;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginHomePage;

public class LoginHomePage_SD {
	
	LoginHomePage loginHomePage = new LoginHomePage(Driverfactory.getDriver());
	
	@Given("Admin launch the browser for login page")
	public void admin_launch_the_browser_for_login_page() {
	
	}

	@When("Admin gives the correct LMS portal URL for login page")
	public void admin_gives_the_correct_lms_portal_url_for_login_page() {
		Driverfactory.getDriver().get("https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/");
	}
	
	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
		loginHomePage.getPageTitle();
	}

	@Then("HTTP response >= {int} and  the link is broken")
	public void http_response_and_the_link_is_broken(Integer int1) throws URISyntaxException {
	  
		loginHomePage.brokenLink();
	   
	}

	@Then("Admin should see correct spellings in all fields on login page")
	public void admin_should_see_correct_spellings_in_all_fields_on_login_page() {
	  
		loginHomePage.textSpellings();
	}

	@Then("Admin should see logo on the left  side on login page")
	public void admin_should_see_logo_on_the_left_side_on_login_page() {
	  
		loginHomePage.pageLogo();
	   
	}

	@Then("Admin should see company name below the app name on login page")
	public void admin_should_see_company_name_below_the_app_name_on_login_page() {
	  
	   
	}

	@Then("Admin should see {string} on login page")
	public void admin_should_see_on_login_page(String string) {
		
		Assert.assertTrue(loginHomePage.pleaseLoginToLMS());
	   
	}

	@Then("Admin should see two text field on login page")
	public void admin_should_see_two_text_field_on_login_page() {
	  
		Assert.assertTrue(loginHomePage.textFieldPresent());
	}

	@Then("Admin should see {string} in the first text field on login page")
	public void admin_should_see_in_the_first_text_field_on_login_page(String string) {
	  
		loginHomePage.textOnFirstField();
	}

	@Then("Admin should see * symbol next to user text on login page")
	public void admin_should_see_symbol_next_to_user_text_on_login_page() {
	  
		loginHomePage.astericWithUser();
	}

	@Then("Admin should {string} in the second text field on login page")
	public void admin_should_in_the_second_text_field_on_login_page(String string) {
	  
		loginHomePage.textOnSecondField();
	}

	@Then("Admin should see * symbol next to password text on login page")
	public void admin_should_see_symbol_next_to_password_text_on_login_page() {
	  
		loginHomePage.astericWithPwd();
	   
	}

	@Then("Admin should see input field on the centre on button")
	public void admin_should_see_input_field_on_the_centre_on_button() {
	  
		loginHomePage.textOnBtn();
	}

	@Then("Admin should see Login button on login page")
	public void admin_should_see_login_button_on_login_page() {
	  
	   loginHomePage.loginBtnPresent();
	}

	@Then("Admin should see login button on the centre of the login page")
	public void admin_should_see_login_button_on_the_centre_of_the_login_page() {
	  
		 loginHomePage.allignmentOfLoginBtn();
	   
	}

	@Then("Admin should see user in gray color on login page")
	public void admin_should_see_user_in_gray_color_on_login_page() {
	  
		loginHomePage.textColorInUserField();
	}

	@Then("Admin should see password in gray color on login page")
	public void admin_should_see_password_in_gray_color_on_login_page() {
	  
		loginHomePage.textColorInPwdField();
	   
	}

	@Given("Admin is in Home Page of LMS appliaction")
	public void admin_is_in_home_page_of_lms_appliaction() {
	  
	   
	}

	@When("Admin enter valid credentials and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button() {
	  
	   
	}

	@Then("Admin should land on dashboard page of LMS application")
	public void admin_should_land_on_dashboard_page_of_lms_application() {
	  
		loginHomePage.getPageTitle();
	}

	@When("Admin enter invalid username and password and clicks login button")
	public void admin_enter_invalid_username_and_password_and_clicks_login_button() {
		
		loginHomePage.CheckErrorMessage();
		
		
	
	}

	@Then("Error message please check username\\/password on login page")
	public void error_message_please_check_username_password_on_login_page() {
		
		loginHomePage.loginErrorMessage();
	  
	   
	}

	@When("Admin enter value only in password and clicks login button")
	public void admin_enter_value_only_in_password_and_clicks_login_button() {
	  
	   
	}

	@When("Admin enter value only in username and clicks login button")
	public void admin_enter_value_only_in_username_and_clicks_login_button() {
	  
	   
	}
	
	@When("User clicks on Login button with entering valid Username “<SheetName>” and Password <Rownumber>")
	public void user_clicks_on_login_button_with_entering_valid_username_sheet_name_and_password_rownumber() {
		
		
	}
	

	@When("Admin enter valid credentials and clicks login button through keyboard")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_keyboard() throws InterruptedException{
	  
		loginHomePage.keyAction();
	}

	@When("Admin enter valid credentials  and clicks login button through mouse")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_mouse() throws InterruptedException {
	  
		loginHomePage.mouseAction();
	}

}
