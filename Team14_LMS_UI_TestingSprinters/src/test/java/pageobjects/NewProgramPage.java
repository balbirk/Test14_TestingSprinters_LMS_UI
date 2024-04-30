package pageobjects;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.When;
import utilities.AppUtils;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class NewProgramPage {
	
	private WebDriver driver = Driverfactory.getDriver();
	
	WebElement filterGlobalEle = driver.findElement(By.id("filterGlobal")); 		;


	String programName="";
	String programDescription = "";
	boolean statusIsActive = false;
	boolean statusIsInActive = false;
	

	String manageuserPageURL ="https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/user";
	
	WebElement programNameEle = driver.findElement(By.id("programName"));
    WebElement programDescriptionEle = driver.findElement(By.id("programDescription"));
    //By.xpath("//input[@type='radio'][@id='Active']")
    //WebElement activeRadio_btn = driver.findElement(By.id("Active"));
  // //div[input[@id='Active']]
    WebElement activeRadio_btn = driver.findElement(By.xpath("/html/body/app-root/app-program/p-dialog/div/div/div[2]/div[3]/div[2]/p-radiobutton"));
    //By.xpath("//input[@type='radio'][@id='Inactive']")
    //WebElement inActiveRadio_btn = driver.findElement(By.id("Inactive"));
    WebElement inActiveRadio_btn = driver.findElement(By.xpath("/html/body/app-root/app-program/p-dialog/div/div/div[2]/div[3]/div[3]/p-radiobutton"));
    // Save button
    WebElement programSave = driver.findElement(By.id("saveProgram"));
    // Cancel button
    WebElement programCancel = driver.findElement(By.xpath("//button/span[text() = 'Cancel']"));
    // Close (X) icon
    //WebElement programClose = driver.findElement(By.xpath("//button/span[contains(@class, 'p-dialog-header-close-icon')]"));
    WebElement programClose = driver.findElement(By.xpath("/html/body/app-root/app-program/p-dialog/div/div/div[1]/div/button/span"));
    
    

    
    
	public NewProgramPage() {
		//PageFactory.initElements(driver, this);
		
	}
	
	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getProgramDescription() {
		return programDescription;
	}

	public void setProgramDescription(String programDescription) {
		this.programDescription = programDescription;
	}

	public WebElement getActiveRadio_btn() {
		return activeRadio_btn;
	}

	public void setActiveRadio_btn(WebElement activeRadio_btn) {
		this.activeRadio_btn = activeRadio_btn;
	}

	public WebElement getInActiveRadio_btn() {
		return inActiveRadio_btn;
	}

	public void setInActiveRadio_btn(WebElement inActiveRadio_btn) {
		this.inActiveRadio_btn = inActiveRadio_btn;
	}

    
	public void validateProgramForm() {
		// check for program name existance
		AppUtils.isUIFieldExists(programNameEle, "Program Name" , "Add New Program pop-up:");
		// check for program description existance
		AppUtils.isUIFieldExists(programDescriptionEle, "Program Description" , "Add New Program pop-up:");
		// check for Active Radio button exists
		AppUtils.isUIFieldExists(activeRadio_btn, "Active Radio button" , "Add New Program pop-up:");
		// check for In-Active Radio button exists
		AppUtils.isUIFieldExists(inActiveRadio_btn, "In-Active Radio button" , "Add New Program pop-up:");
		// check for Save button exists
		AppUtils.isUIFieldExists(programSave, "Save button" , "Add New Program pop-up:");
		// check for Cancel button exists
		AppUtils.isUIFieldExists(programCancel, "Cancel button" , "Add New Program pop-up:");
		// check for Close icon exists
		AppUtils.isUIFieldExists(programClose, "Close Icon (X)" , "Add New Program pop-up:");

	}
	
	public void clickSaveBtn() {
		LoggerLoad.info("Start - Admin clicked on save without entering program details");
		boolean saveButton = AppUtils.isUIFieldExists(programSave, "Save button" , "Add New Program pop-up:");
		if(saveButton) {
			AppUtils.click(driver, programSave);
		}
		LoggerLoad.info("End - Admin clicked on save without entering program details");
		
	}
	
	public void cancelForm() {
		LoggerLoad.info("Start - Admin clicked on cancel button on the popup");
		boolean cancelButton = AppUtils.isUIFieldExists(programCancel, "Cancel button" , "Add New Program pop-up:");
		if(cancelButton) {
			AppUtils.click(driver, programCancel);
		}
		LoggerLoad.info("End - Admin clicked on cancel button on the popup");
		
	}
	
	
	
	
	
	public void fillProgramData(Map<String, String> xlRow) {
		this.programName = xlRow.get("programName");
		if(this.programName == null) {
			this.programName = "";
		}
		this.programDescription = xlRow.get("programDescription");
		if(this.programDescription == null) {
			this.programDescription = "";
		}
		String status = xlRow.get("Status");
		if("Active".equals(status)) {
			this.statusIsActive = true;
		}else if("InActive".equals(status)) {
			this.statusIsInActive = true;
		}
	}
	
	public void saveProgramData(String keyOption, String sheetName, boolean isValidRow) throws Exception {
		try {
			LoggerLoad.info("Start - Admin clicked on save program data");
			Map<String,String> xl_program_rec = ExcelReader.getData(keyOption, sheetName);
			fillProgramData(xl_program_rec);
			LoggerLoad.info(" Program details - "+xl_program_rec);
			if(isValidRow) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		        String formattedTime = sdf.format(new Date());
				this.programName = this.programName+formattedTime;
				AppUtils.NEW_PROGRAM_NAME = this.programName;
				this.programDescription = this.programDescription+"_"+formattedTime;
				
			}
			AppUtils.fillValue(programNameEle, this.programName);
			AppUtils.fillValue(programDescriptionEle, this.programDescription);
			if(statusIsActive) {
				//activeRadio_btn.click();
				AppUtils.click(driver, activeRadio_btn);
			}else if(statusIsInActive) {
				//inActiveRadio_btn.click();
				AppUtils.click(driver, inActiveRadio_btn);
			}
			AppUtils.click(driver, programSave);
//			Thread.sleep(1000);
//			AppUtils.click(driver, programCancel);
			LoggerLoad.info("End - Admin clicked on save program data");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // save program
	
	public void clickBtnX() throws Exception {
//		try {
//			AppUtils.click(driver, programSave);
//			driver.get(AppUtils.PROGRAM_URL+"/batch");
//			driver.switchTo().window(driver.getWindowHandle());
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		AppUtils.click(driver, programClose);
	
	}

	@When("Admin searches by newly created program name")
	public void admin_searches_by_newly_created_program_name() {
		try {
			AppUtils.fillValue(filterGlobalEle, AppUtils.NEW_PROGRAM_NAME);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
