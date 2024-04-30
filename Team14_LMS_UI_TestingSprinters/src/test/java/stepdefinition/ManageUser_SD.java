package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ManageProgramPage;
import pageobjects.ManageUserPage;

public class ManageUser_SD {

	
	ManageUserPage MP= new ManageUserPage();
	
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
	

}
