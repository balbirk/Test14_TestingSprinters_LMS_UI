package stepdefinition;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.*;
import pageobjects.DeleteBatchPage;

public class DeleteBatchSteps {
	
	DeleteBatchPage delete_batch = new DeleteBatchPage(Driverfactory.getDriver());
	
	@When(": Admin is on dashboard page after Login and admin clicks on the {string} from navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_admin_clicks_on_the_from_navigation_bar(String string) {
	   
		delete_batch.clickBatch();
	}

	@Given(": The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
	    
		delete_batch.deleteEnabled();
	}

	@When(": The Admin clicks the delete icon in  Manage batch page")
	public void the_admin_clicks_the_delete_icon_in_manage_batch_page() throws InterruptedException {
	    delete_batch.delete_row();
	}


	@Then(": Alert appears with yes and No option in manage batch page")
	public void alert_appears_with_yes_and_no_option_in_manage_batch_page() throws InterruptedException {
	   
		delete_batch.alertDisplay();
	}


	@When(": You click yes option for the alert in manage batch Page")
	public void you_click_yes_option_for_the_alert_in_manage_batch_page() {
	    delete_batch.alert_accept();
	    
	}

	@Then(": Batch deleted alert pops and batch is no more available in data table")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() {
	 delete_batch.successMessage();
	
	}

	@Given(": Admin clicks the delete icon in the manage batch page")
	public void admin_clicks_the_delete_icon_in_the_manage_batch_page() throws InterruptedException {
		delete_batch.delete_row1();
	}

	@When(": you click No option for the alert in manage batch page")
	public void you_click_no_option_for_the_alert_in_manage_batch_page() {
	   delete_batch.alert_dismiss();
	}

	@Then(": Batch is still listed in data table")
	public void batch_is_still_listed_in_data_table() {
	delete_batch.batch_deleted();
	}

	

	

}
