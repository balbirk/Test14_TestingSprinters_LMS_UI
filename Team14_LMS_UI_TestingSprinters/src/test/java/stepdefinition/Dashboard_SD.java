package stepdefinition;



import org.junit.Assert;
import browserlaunch.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import utilities.LoggerLoad;
import java.time.Duration;
import java.time.Instant;


public class Dashboard_SD {
	
	DashboardPage dashboardPage = new DashboardPage(Driverfactory.getDriver());
	LoginPage loginPage = new LoginPage(Driverfactory.getDriver());
	
	
	
	/*
	@Given("Admin is in Home Page")
	public void admin_is_in_home_page() {
	  
	}

	@When("Admin enter valid credentials  and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button() {
		
	}
*/

	@Then("Admin should see Manage Program as header")
	public void admin_should_see_manage_program_as_header() {
		
		String actualText=dashboardPage.verifyheader_text();
        Assert.assertEquals("Manage Program", actualText);
         LoggerLoad.info("Validate Manage Program Title" +actualText);
	}
	

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
		
		Instant startTime = Instant.now();
        Instant endTime = Instant.now();
		Duration duration = Duration.between(startTime, endTime);
        long responseTimeMillis = duration.toMillis();
        System.out.println("Response time:  "+ responseTimeMillis +" milliseconds");
    	LoggerLoad.info("Validate Response Time");
		//return driver.manage().timeouts().getPageLoadTimeout().toMillis();
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
		dashboardPage.VerifyBrokenLink();
		LoggerLoad.info("Validate Broken link");


	}

	@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
		String actualTitle=dashboardPage.verifyLMStitle();
		Assert.assertEquals("LMS - Learning Management System", actualTitle);
		LoggerLoad.info("Validate Dashboard Title" +actualTitle);
	

	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
		dashboardPage.lmsLeftAlligned();
		LoggerLoad.info("Validate Alignment of LMS");

		
		
	}

	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
		dashboardPage.spellingCheck();
		LoggerLoad.info("Validate spellings");

	}

	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
	    
         
	}

	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
		 
		dashboardPage.navigationTextAllignment();
		LoggerLoad.info("Validate Alignment of navigation Text");

	}

	@Then("Admin should see program in the 1st place")
	public void admin_should_see_program_in_the_1st_place() {
		dashboardPage.validateProgram();

	}

	@Then("Admin should see batch in the 2nd place")
	public void admin_should_see_batch_in_the_2nd_place() {
		dashboardPage.validateBatch();

	}

	@Then("Admin should see user in the  3rd place")
	public void admin_should_see_user_in_the_3rd_place() {
		dashboardPage.validateUser();
	

	}

	@Then("Admin should see logout in the 4th place")
	public void admin_should_see_logout_in_the_4th_place() {
		dashboardPage.validateLogout();

	}

	
	//Verify Logout  function
	
	@Given("Admin is in dashboard page")
	public void admin_is_in_dashboard_page() {
		
		dashboardPage.validateDashboardPage();
	}

	@When("Admin click Logout button on navigation bar")
	public void admin_click_logout_button_on_navigation_bar() {
		dashboardPage.clickLogoutBtn();
		
	}

	@Then("Admin should land on login in page")
	public void admin_should_land_on_login_in_page() {
	   
		loginPage.validateLoginPage();
	}
	
	

}
