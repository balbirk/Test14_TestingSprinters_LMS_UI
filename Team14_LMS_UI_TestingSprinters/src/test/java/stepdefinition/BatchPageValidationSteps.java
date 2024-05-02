package stepdefinition;

import org.junit.Assert;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.*;
import pageobjects.BatchValidationPage;

public class BatchPageValidationSteps {
	
	BatchValidationPage batch = new BatchValidationPage(Driverfactory.getDriver());
	

@When(": Admin is on the dashboard page after Login")
public void admin_is_on_the_dashboard_page_after_login() {
    
	System.out.println("Admin is on Dashboard Page after Login");
	System.out.println("When Step");
}

@When(": Admin clicks {string} from navigation bar")
public void admin_clicks_from_navigation_bar(String string) {
    batch.clickBatch();
    System.out.println("Admin is in Manage Batch Page");
}


@Then(": Admin should see the {string} in the URL")
public void admin_should_see_the_in_the_url(String expected) {
   
	String actual = batch.currentURL();
	
	Assert.assertTrue(actual.contains(expected));

	
}

@Then(": Admin should see the {string} in the header.")
public void admin_should_see_the_in_the_header(String expected) {
  
	String actual = batch.getHeader();
	Assert.assertEquals(actual,expected);
}

@Then(": Admin should see the pagination controls under the data table")
public void admin_should_see_the_pagination_controls_under_the_data_table() {
    batch.paginationControl();
}

@Then(": Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete")
public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
   batch.tableHeader();
}

@Then(": Admin should be able to see the {string} icon button that is disabled")
public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
 batch.verifyDeleteBtn();
	
}

@Then(": Admin should be able to see the {string} button")
public void admin_should_be_able_to_see_the_button(String expected) {
    String actual = batch.verifyNewBatchBtn();
    Assert.assertEquals(actual, expected);
}

@Then(": Each row in the data table should have a checkbox")
public void each_row_in_the_data_table_should_have_a_checkbox() {
  
	batch.verifyCheckBox();
}

@Then(": Each row in the data table should have a edit icon that is enabled")
public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
  batch.verifyEditButton();
}

@Then(": Each row in the data table should have a delete icon that is enabled")
public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
    batch.deleteEnabled();
}

@When(": Admin clicks {string} button in manage batch page")
public void admin_clicks_button_in_manage_batch_page(String string) {
	batch.clickNewBatch();
}

@Then(": A new pop up with Batch details appears")
public void a_new_pop_up_with_batch_details_appears() {
  
	batch.popUp();
}

}
