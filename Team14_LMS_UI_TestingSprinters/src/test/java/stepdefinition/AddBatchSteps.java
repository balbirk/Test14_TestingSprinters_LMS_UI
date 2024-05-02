package stepdefinition;

import java.io.IOException;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.*;
import pageobjects.AddBatchPage;

public class AddBatchSteps {

	AddBatchPage addBatch = new AddBatchPage(Driverfactory.getDriver());
	
	@When(": Admin clicks {string} button")
	public void admin_clicks_button(String string) throws InterruptedException {
	    addBatch.clickNewBatch();
	}

	@Given(": A new pop up with Batch details appears on screen")
	public void a_new_pop_up_with_batch_details_appears_on_screen() {
	   addBatch.validatePopUp();
	}

	@Then(": The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down, Status as radio button, Number of classes as text box")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down_status_as_radio_button_number_of_classes_as_text_box() {
	    addBatch.validatePopUpFields();
	}
	
	@When(": Admin enters sheetname {string} and rownumber {int} for batch details")
	public void admin_enters_sheetname_and_rownumber_for_batch_details(String sheetName, Integer rowNumber) throws IOException {
	    addBatch.readDataFromSheet(sheetName, rowNumber);
	}

	@Then(": Admin enters batchname {string} and description {string} and Programname {string} and status {string} and Number of classes {string} and Expected Message {string}")
	public void admin_enters_batchname_and_description_and_programname_and_status_and_number_of_classes_and_expected_message(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
	    addBatch.sendName();
	    addBatch.sendDescription();
	    addBatch.sendProgramname();
	    addBatch.sendStatus();
	    addBatch.sendNumberOfClasses();
	    addBatch.save();
	    addBatch.expectedMessage();
	}

	@Then(": Click on save")
	public void click_on_save() {
	    System.out.println("Clicked on save");
	}

	@Then(": The newly added batch should be present in the data table in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page() {
	  System.out.println("Batch is not created as Batch Description is null");
	}
	@Then(": The newly added batch should be present in the data table in the Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_the_manage_batch_page() {
	    
	}

	@Given(": Admin clicks on Add New batch and new pop up with Batch details appears")
	public void admin_clicks_on_add_new_batch_and_new_pop_up_with_batch_details_appears() throws InterruptedException {
		addBatch.clickNewBatch();
	}
	@Then(": Error message should appear")
	public void error_message_should_appear() throws InterruptedException {
		//addBatch.expectedMessage();
	}
	
	@Then(": Admin enters batchname {string} and description {string} and Programname {string} as null and status {string} and Number of classes {string} and Expected Message {string}")
	public void admin_enters_batchname_and_description_and_programname_as_null_and_status_and_number_of_classes_and_expected_message(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
	    
		 addBatch.sendName();
		    addBatch.sendDescription();
		    addBatch.sendStatus();
		    addBatch.sendNumberOfClasses();
		    addBatch.save();
		    addBatch.expectedMessage();
	}

	@Then(": Admin enters batchname {string} and description {string} and Programname {string}  and status {string} as null and Number of classes {string} and Expected Message {string}")
	public void admin_enters_batchname_and_description_and_programname_and_status_as_null_and_number_of_classes_and_expected_message(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		addBatch.sendName();
	    addBatch.sendDescription();
	    addBatch.sendProgramname();
	    addBatch.sendNumberOfClasses();
	    addBatch.save();
	    addBatch.expectedMessage();
	}

	
}
