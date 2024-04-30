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


	
}

