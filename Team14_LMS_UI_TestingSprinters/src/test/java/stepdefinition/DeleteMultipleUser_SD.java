package stepdefinition;

import pageobjects.ManageUserPage;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteMultipleUser_SD {
	
	ManageUserPage MP = new ManageUserPage();
	
	@Given("Admin is in Manage User page in multiple user delete module")
	public void admin_is_in_manage_user_page_in_multiple_user_delete_module() throws InterruptedException {
		System.out.println("calling assert false");
		Assert.assertFalse(MP.pageChkBoxSelected());
		Assert.assertFalse(MP.userPageDelIconIsEnabled());
	}

	@When("Admin clicks any checkbox in the data table in multiple user delete module")
	public void admin_clicks_any_checkbox_in_the_data_table_in_multiple_user_delete_module() throws InterruptedException {
		System.out.println("Calling MP.selectRowChkBox();");
		MP.selectRowChkBox();
		System.out.println("calling assertTrue");
		Assert.assertTrue(MP.userPageDelIconIsEnabled());
	}

	@Then("Admin should see common delete option enabled under header Manage Program in multiple user delete module")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program_in_multiple_user_delete_module() throws InterruptedException {
		MP.clickOnUserPageDelIcon();
		MP.alert_accept();
		MP.mutipleCheckbox();
		MP.delMultipleRowsPageChkbox();
		MP.alert_accept();
		//MP.successMessage();
	}
}
