package stepdefinition;

import org.junit.Assert;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ManageProgramPage;

public class ManageProgram_SD {
	
	ManageProgramPage manageProgram= new ManageProgramPage();
	
	
	
	@Then("Admin should see the {string} in the header of manage batch page")
	public void admin_should_see_the_in_the_header_of_manage_batch_page(String expectedPageTitle) {

//		String actualTitle=manageProgram.getManageProgramTitle();
//		Assert.assertEquals(expectedPageTitle, actualTitle);
//		Log.logInfo("Validate Manage Batch Title"+actualTitle);
	}
	
	@Then("Admin clicks adding new program by clicking {string} button")
	public void admin_clicks_adding_new_program_by_clicking_button(String string) {
		ManageProgramPage programPage = new ManageProgramPage();
		programPage.clickAddNewProgramBtn();
	}
	
	@When("Admin searches by newly created program name")
	public void admin_searches_by_newly_created_program_name() {
		try {
			manageProgram.searchByProgramName();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@When("Admin clicks edit button to update program name")
	public void admin_clicks_edit_button_to_update_program_name() throws Exception {
		manageProgram.clickEditProgramBtn();
	}
	@When("Admin clicks delete button to delete program name")
	public void Admin_clicks_delete_button_to_delete_program_name() throws Exception {
		manageProgram.clickDeleteProgramBtn();
	}
	
	
	@When("Admin searches by deleted program name")
	public void Admin_searches_by_deleted_program_name() {
		manageProgram.searchByProgramName();
	}
	
	@When("Admin clicks {string} new Program button")
	public void admin_clicks_button(String string) {
		manageProgram.clickAddNewProgramBtn();
	}
	
	
}

