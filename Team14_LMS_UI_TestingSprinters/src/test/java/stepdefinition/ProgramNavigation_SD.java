package stepdefinition;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import pageobjects.ManageProgramPage;
//import utilities.LoggerLoad;

public class ProgramNavigation_SD {

	DashboardPage dashboardPage = new DashboardPage(Driverfactory.getDriver());
	ManageProgramPage manageProgramPage = new ManageProgramPage(Driverfactory.getDriver());
	LoginPage loginPage = new LoginPage(Driverfactory.getDriver());
	

	
	@When("Admin clicks on Batch link on Manage Program page")
	public void admin_clicks_on_batch_link_on_manage_program_page() {
		manageProgramPage.batchclick();
		
	}

	@Then("Admin is re-directed to Batch page")
	public void admin_is_re_directed_to_batch_page() {
	    
		manageProgramPage.validateBatchPage();
		
	}

	@When("Admin clicks on User link on Manage Program page")
	public void admin_clicks_on_user_link_on_manage_program_page() {
	    
		manageProgramPage.userclick();
	}

	@Then("Admin is re-directed to User page")
	public void admin_is_re_directed_to_user_page() {
		//manageProgramPage.validateUserPage();
		
	}

	@When("Admin clicks on Logout link on Manage Program page")
	public void admin_clicks_on_logout_link_on_manage_program_page() {
	    
		manageProgramPage.logout();
	}

	@Then("Admin is re-directed to Login page")
	public void admin_is_re_directed_to_login_page() {
		loginPage.validateLoginPage();
		
	}
	
}
