package stepdefinition;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.*;
import pageobjects.DeleteMultipleBatchesPage;

public class DeleteMultipleBatchesSteps {
	
	DeleteMultipleBatchesPage delete_multiple = new DeleteMultipleBatchesPage(Driverfactory.getDriver());
	
@Given(": None of the checkboxes in data table are selected in manage batch page")
public void none_of_the_checkboxes_in_data_table_are_selected_in_manage_batch_page() {
    delete_multiple.checkboxNotSelected();
}

@Then(": The delete icon under the {string} header should be disabled")
public void the_delete_icon_under_the_header_should_be_disabled(String string) {
   delete_multiple.verifyDeleteBtn();
}

@Given(": One of the checkbox row is selected in manage batch page")
public void one_of_the_checkbox_row_is_selected_in_manage_batch_page() throws InterruptedException {
	delete_multiple.singleCheckBox();
}


@When(": Click delete icon below {string} header in manage batch page")
public void click_delete_icon_below_header_in_manage_batch_page(String string) {
   delete_multiple.deleteSingleRow();
   
}

@Then(": The respective row in the data table is deleted in manage batch page")
public void the_respective_row_in_the_data_table_is_deleted_in_manage_batch_page() {
  delete_multiple.successMessage();
}


@Given(": Two or more checkboxes row is selected")
public void two_or_more_checkboxes_row_is_selected() throws InterruptedException {
    delete_multiple.mutipleCheckbox();
}

}
