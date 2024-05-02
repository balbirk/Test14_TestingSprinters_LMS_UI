package stepdefinition;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.*;
import pageobjects.EditBatchPage;

public class EditBatchSteps {
	
	EditBatchPage editBatch = new EditBatchPage(Driverfactory.getDriver());
	

@Given(": The edit icon on row level in data table is enabled")
public void the_edit_icon_on_row_level_in_data_table_is_enabled() {
   editBatch.verifyEditButton();
}

@When(": Admin clicks the edit icon")
public void admin_clicks_the_edit_icon() throws InterruptedException {
    editBatch.clickEditButton();
}

@Then(": A new pop up with Batch details appears in Edit screen")
public void a_new_pop_up_with_batch_details_appears_in_edit_screen() {
    editBatch.dialogBox();
    
}
@Given(": Admit clicks on Edit button in Manage Batch Page")
public void admit_clicks_on_edit_button_in_manage_batch_page() throws InterruptedException {
	editBatch.clickEditButton();
}

@When(": Admin updates batchname {string}")
public void admin_updates_batchname(String string) {
   editBatch.updateBatchName();
   
   
}

@Then(": Error message appears after updating")
public void error_message_appears_after_updating() {
    
}

//@When(": Admin updates batch description ")
//public void admin_updates_batch_description() throws InterruptedException {
//    editBatch.updateBatchDescription();
//}

@Given(": Admin updates batch description")
public void admin_updates_batch_description() throws InterruptedException {
	editBatch.updateBatchDescription();
}
@Then(": Success Message appears after updating")
public void success_message_appears_after_updating() {
    editBatch.successMessage();
}

@And(": Admin updates batchname")
public void admin_updates_batchname() {
	editBatch.updateBatchName();
}


}
