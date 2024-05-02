package stepdefinition;

import pageobjects.ManageUserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortUser_SD {

	ManageUserPage MP = new ManageUserPage();
	
	@Given("Admin is on Manage User Page in sort user module")
	public void admin_is_on_manage_user_page_in_sort_user_module() {
		System.out.println("User is on the manage page");
	}

	@When("Admin clicks on ID sort icon in sort user module")
	public void admin_clicks_on_id_sort_icon_in_sort_user_module() {
		MP.sortById();
	}

	@Then("Admin should see User details are sorted by id in sort user module")
	public void admin_should_see_user_details_are_sorted_by_id_in_sort_user_module() {
	}

	@When("Admin clicks on name sort icon in sort user module")
	public void admin_clicks_on_name_sort_icon_in_sort_user_module() {
		MP.sortByName();
	}

	@Then("Admin should see User details are sorted by name in sort user module")
	public void admin_should_see_user_details_are_sorted_by_name_in_sort_user_module() {
	}

	@When("Admin clicks on Location sort icon in sort user module")
	public void admin_clicks_on_location_sort_icon_in_sort_user_module() {
		MP.sortByLocation();
	}

	@Then("Admin should see User details are sorted by Location in sort user module")
	public void admin_should_see_user_details_are_sorted_by_location_in_sort_user_module() {
	}

	@When("Admin clicks on Phone number sort icon in sort user module")
	public void admin_clicks_on_phone_number_sort_icon_in_sort_user_module() {
		MP.sortByPhone();
	}

	@Then("Admin should see User details are sorted by Phone number in sort user module")
	public void admin_should_see_user_details_are_sorted_by_phone_number_in_sort_user_module() {
	}
	
}
