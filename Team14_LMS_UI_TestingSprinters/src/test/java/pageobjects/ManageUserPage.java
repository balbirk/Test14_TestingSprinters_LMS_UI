package pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import browserlaunch.Driverfactory;
import utilities.AppUtils;
import utilities.ExcelReader;

public class ManageUserPage {

	//********************************************
	
	private WebDriver driver;// = Driverfactory.getDriver();
	// constructor initilize driver and page factory when FINDBY method is used
	public ManageUserPage() {
		this.driver  = Driverfactory.getDriver();
	}

	private By userLink = By.xpath("//*[@id='user']");
	public void navigateToManageUserPage() {
		//<! --  Using By approach
		System.out.println("-- Navigated using using By to User Menu ");
		WebElement user = driver.findElement(userLink);
		user.click();
	}

	private By newUserButton =  By.xpath("//span[@class='p-button-label'][contains(text(),'Add New User')]");
	public void clickAddNewUserBtn() {
		System.out.println("-- using Findby to Add User button "+ newUserButton);
		driver.findElement(newUserButton).click();
		System.out.println("-- Add User popup opened");

	}
	public boolean AddNewUserBtnIsDisplayed() {
		return driver.findElement(newUserButton).isDisplayed();
		
	}
	
	private By assignStudent = By.xpath("//span[@class='p-button-label'][contains(text(),'Assign Student')]");
	public void clickAssignStudent() {
		driver.findElement(assignStudent).click();
	}
	public boolean assignStudentIsDisplayed() {
		return driver.findElement(assignStudent).isDisplayed();
		
	}
	
	private By assignStaff = By.xpath("//span[@class='p-button-label'][contains(text(),'Assign Staff')]");
	public void clickAssignStaff() {
		driver.findElement(assignStaff).click();
	}
	public boolean assignStaffIsDisplayed() {
		return driver.findElement(assignStaff).isDisplayed();
		
	}

	
	
	
	private By userButton = By.xpath("//button/span[text()='User']") ;
	public void clickOnUserBtn() {
		driver.findElement(userButton).click();
	}

	private By userPageTitle = By.xpath("//div[@class='box']");
	public String getUserPageTitle(){
		return driver.findElement(userPageTitle).getText();
	}

	private By userPageText = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	public String getUserPageText(){
		return driver.findElement(userPageText).getText();
	}

	private By userPageFooter = By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div");
	public String getUserPageFooter(){
		return driver.findElement(userPageFooter).getText();
	}

	private By userPageDelIcon = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	public void clickOnUserPageDelIcon() {
		driver.findElement(userPageDelIcon).click();
	}

	public boolean userPageDelIconIsDisplayed() {
		return driver.findElement(userPageDelIcon).isDisplayed();
	}
	
	public boolean userPageDelIconIsEnabled() throws InterruptedException {
		Thread.sleep(Duration.ofMillis(2000));
		if (driver.findElement(userPageDelIcon).isEnabled())
		{
			System.out.println("returning true");
			return true;
			}
		else
			{
			System.out.println("returning false");
			return false;
			}	
		}
	
	
	
	private By userSearch = By.xpath("//*[@id='filterGlobal']");
	public String getUserSearchValue() {
		return driver.findElement(userSearch).getText();
	}

	public boolean UserSearchValueIsDisplayed() {
		return driver.findElement(userSearch).isDisplayed();
	}
	
	public void setUserSearchValue(String val) {
		driver.findElement(userSearch).clear(); 
		driver.findElement(userSearch).sendKeys(val);
	}

	private By userLinkUser = By.xpath("//*[@id='user']/span[1]");
	public void clickOnUserLink() {
		driver.findElement(userLinkUser).click();
	}

	//@FindBy (xpath="") WebElement userDetails;

	private By manageUserText = By.xpath("//div[text()=' Manage User']");
	public String getManageUserText() {
		return driver.findElement(manageUserText).getText();
	}

	//private By userChkBox = By.xpath("//div[@class='p-checkbox-box']");
	private By userChkBox = By.xpath("//p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div/div[2]");
	public void clickOnUserChkBox() {
		driver.findElement(userChkBox).click();
	}
	
	public boolean pageChkBoxSelected() throws InterruptedException {
		//Uncheck the checkbox
		
		Thread.sleep(Duration.ofMillis(3000));
		if (driver.findElement(userChkBox).isSelected())
			{
			System.out.println("returning true");
			return true;
			}
		else
			{
			System.out.println("returning false");
			return false;
			}
	}
	
	
	private By userEditIcon = By.xpath("(//button/span[@class='p-button-icon pi pi-pencil'])[1]");
	public void clickOnUserEditIcon() {
		driver.findElement(userEditIcon).click();
	}

	private By crossButtonUser = By.xpath("//span[@class='p-dialog-header-close-icon ng-tns-c132-6 pi pi-times']");
	public void clickCrossButtonUser() {
		driver.findElement(crossButtonUser).click();
	}

	private By userId = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[2]") ;
	public void setUserId(String uId) {
		driver.findElement(userId).clear();
		driver.findElement(userId).sendKeys(uId);
	}

	private By userName = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[3]");
	public void setUserName(String uName) {
		driver.findElement(userName).clear();
		driver.findElement(userName).sendKeys(uName);
	}

	private By userLocation = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[4]");
	public void setUserLoc(String uLoc) {
		driver.findElement(userLocation).clear();
		driver.findElement(userLocation).sendKeys(uLoc);
	}

	private By userPhone = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[5]");
	public void setUserPhone(String uPhone) {
		driver.findElement(userPhone).clear();
		driver.findElement(userPhone).sendKeys(uPhone);
	}

	//WebElements on User Details Page	
	private By userFNameEditBox = By.xpath("//*[@data-placeholder='First name']");
	public void setUserFName(String uFname) {
		driver.findElement(userFNameEditBox).clear();
		driver.findElement(userFNameEditBox).sendKeys(uFname);
	}
	public boolean fNameDisplayed() {
		return driver.findElement(userFNameEditBox).isDisplayed();
	}

	private By userMNameEditBox= By.xpath("//*[@data-placeholder='Middle name']"); 
	public void setUserMName(String uMname) {
		driver.findElement(userMNameEditBox).clear();
		driver.findElement(userMNameEditBox).sendKeys(uMname);
	}

	public boolean MNameDisplayed() {
		return driver.findElement(userMNameEditBox).isDisplayed();
	}

	private By userLNameEditBox= By.xpath("//*[@data-placeholder='Last name']"); 
	public void setUserLName(String uLname) {
		driver.findElement(userLNameEditBox).clear();
		driver.findElement(userLNameEditBox).sendKeys(uLname);
	}

	public boolean LNameDisplayed() {
		return driver.findElement(userLNameEditBox).isDisplayed();
	}

	private By userLocationEditBox = By.xpath("//*[@data-placeholder='Location']"); 
	public void setUserLocation(String uLocation) {
		driver.findElement(userLocationEditBox).clear();
		driver.findElement(userLocationEditBox).sendKeys(uLocation);
	}
	public boolean locDisplayed() {
		return driver.findElement(userLocationEditBox).isDisplayed();
	}

	private By userPhoneEditBox = By.xpath("//*[@data-placeholder='Phone no']"); 
	public void setUserPhoneVal(String uPhoneVal) {
		driver.findElement(userPhoneEditBox).clear();
		driver.findElement(userPhoneEditBox).sendKeys(uPhoneVal);
	}
	public boolean phoneDisplayed() {
		return driver.findElement(userPhoneEditBox).isDisplayed();
	}

	private By userLinkedinEditBox = By.xpath("//*[@data-placeholder='LinkedIn Url']"); 
	public void setUserLinkedin(String uLinkedin) {
		driver.findElement(userLinkedinEditBox).clear();
		driver.findElement(userLinkedinEditBox).sendKeys(uLinkedin);
	}
	public boolean linkedinDisplayed() {
		return driver.findElement(userLinkedinEditBox).isDisplayed();
	}

	private By userRoleTxt = By.xpath("//*[@id='roleId']");
	private By userRoleR03 = By.xpath("//*[@id=\"roleId\"]/div/div[3]/div/ul/p-dropdownitem[3]/li");

	public void setUserRoleDropDown(String uRole) throws InterruptedException {

		WebElement userRoleTxtEle = driver.findElement(userRoleTxt);

		new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(driver.findElement(userRoleTxt)));
		userRoleTxtEle.click();

		//		List<WebElement> listElements = driver.findElements(By.xpath("//ul[@role='listbox']"));
		//		for (WebElement webElement : listElements) {
		//			System.out.println(webElement.getText());
		//			Thread.sleep(Duration.ofMillis(3000));
		//			if(webElement.getText().trim().equals(uRole)) {
		//				webElement.click();
		//				break;
		//			}
		//		}
		//		
		driver.findElement(userRoleR03).click();

	}
	public boolean roleDisplayed() {
		return driver.findElement(userRoleTxt).isDisplayed();

	}

	//private By userRoleStatusEdit = By.xpath("//*[@id='userRoleStatus']/div/span");
	//private By userRoleEditList = By.xpath("//*[@id='roleId']/div/div[3]/div/ul//li");

	private By userRoleStatusTxt = By.xpath("//*[@id='userRoleStatus']");
	private By userRoleRActive = By.xpath("//*[@id='userRoleStatus']/div/div[3]/div/ul/p-dropdownitem[1]/li");

	public void setUserRoleStatus(String uStatus) {
		WebElement userRoleStatusEle = driver.findElement(userRoleStatusTxt);
		new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(driver.findElement(userRoleStatusTxt)));
		userRoleStatusEle.click();
		driver.findElement(userRoleRActive).click();;
	}

	public boolean roleStatusDisplayed() {
		return driver.findElement(userRoleStatusTxt).isDisplayed();
	}

	private By userVisaTxt = By.xpath("//*[@id='userVisaStatus']");
	private By userVisaH4 = By.xpath("//*[@id='userVisaStatus']/div/div[3]/div/ul/p-dropdownitem[4]/li");

	public void setUserVisa(String uVisa) {
		WebElement userVisaTxtEle = driver.findElement(userVisaTxt);
		new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(driver.findElement(userVisaTxt)));
		userVisaTxtEle.click();
		driver.findElement(userVisaH4).click();;
	}

	public boolean visaDisplayed() {
		return driver.findElement(userVisaTxt).isDisplayed();
	}

	private By userEmailEditBox= By.xpath("//*[@data-placeholder='Email address']"); 
	public void setUserEmail(String uEmail) {
		driver.findElement(userEmailEditBox).clear();
		driver.findElement(userEmailEditBox).sendKeys(uEmail);
	}
	public boolean emailDisplayed() {
		return driver.findElement(userEmailEditBox).isDisplayed();
	}

	private By userUnderGradEdit = By.xpath("//*[@data-placeholder='Under Graduate']"); 
	public void setUserUnderGrad(String uUGrad) {
		driver.findElement(userUnderGradEdit).clear();
		driver.findElement(userUnderGradEdit).sendKeys(uUGrad);
	}
	public boolean underGradDisplayed() {
		return driver.findElement(userUnderGradEdit).isDisplayed();
	}

	private By userPostGradEdit = By.xpath("//*[@data-placeholder='Post Graduate']");
	public void setUserPostGrad(String uPGrad) {
		driver.findElement(userPostGradEdit).clear();
		driver.findElement(userPostGradEdit).sendKeys(uPGrad);
	}
	public boolean postGradDisplayed() {
		return driver.findElement(userPostGradEdit).isDisplayed();
	}

	private By userTimeZoneEdit = By.xpath("//*[@data-placeholder='Time Zone']");
	public void setUserTimeZone(String uTZone) {
		driver.findElement(userTimeZoneEdit).clear();
		driver.findElement(userTimeZoneEdit).sendKeys(uTZone);
	}
	public boolean tzDisplayed() {
		return driver.findElement(userTimeZoneEdit).isDisplayed();
	}


	private By userCommentsEditBox=  By.xpath("//*[@data-placeholder='User Comments']");
	public void setUserComments(String uComments) {
		driver.findElement(userCommentsEditBox).clear();
		driver.findElement(userCommentsEditBox).sendKeys(uComments);
	}
	public boolean commentsDisplayed() {
		return driver.findElement(userCommentsEditBox).isDisplayed();
	}

	private By userCancelBtn = By.xpath("//button/span[contains(text(),'Cancel')]");
	public void clickUserCancelButton() {
		System.out.println("clickUserCancelButton");
		driver.findElement(userCancelBtn).click();
	}

	public boolean cancelDisplayed() {
		return driver.findElement(userCancelBtn).isDisplayed();

	}

	private By userSaveBtn = By.xpath("//button/span[contains(text(),'Submit')]");
	public void clickUserSaveButton() {
		System.out.println("clickUserSaveButton");
		driver.findElement(userSaveBtn).click();
	}

	public boolean saveDisplayed() {
		return driver.findElement(userSaveBtn).isDisplayed();

	}

	private By emptyFormError = By.xpath("//div/mat-error[@role='alert'][contains(text(),'First name is ')]");
	public String getEmptyFormError() throws InterruptedException {
		System.out.println("getEmptyFormError");
		WebElement myElement = driver.findElement(emptyFormError); 
		String txt = ((JavascriptExecutor)driver).executeScript("return arguments[0].firstChild.textContent;", myElement).toString();
		String AddTxt = ((JavascriptExecutor)driver).executeScript("return arguments[0].lastChild.textContent;", myElement).toString();
		System.out.println("txt " + txt);
		System.out.println("Add txt " + AddTxt);
		String ret = txt+AddTxt;
		return ret;
	}

	private By mandatoryFieldError = By.xpath("//div/mat-error[@role='alert'][contains(text(),'Last name is')]");
	public String getMandatoryFieldError() throws InterruptedException {
		System.out.println("getMandatoryFieldError");
		WebElement myElement = driver.findElement(mandatoryFieldError); 
		String txt = ((JavascriptExecutor)driver).executeScript("return arguments[0].firstChild.textContent;", myElement).toString();
		String AddTxt = ((JavascriptExecutor)driver).executeScript("return arguments[0].lastChild.textContent;", myElement).toString();
		System.out.println("txt " + txt);
		System.out.println("Add txt " + AddTxt);
		String ret = txt+AddTxt;
		return ret;
	}

	private By emailRequiredMsg = By.xpath("//div/mat-error[@role='alert'][contains(text(),'Email address is')]");
	public String getemailRequiredMsg() throws InterruptedException {
		System.out.println("email required ");
		WebElement myElement = driver.findElement(emailRequiredMsg); 
		String txt = ((JavascriptExecutor)driver).executeScript("return arguments[0].firstChild.textContent;", myElement).toString();
		String AddTxt = ((JavascriptExecutor)driver).executeScript("return arguments[0].lastChild.textContent;", myElement).toString();
		System.out.println("txt " + txt);
		System.out.println("Add txt " + AddTxt);
		String ret = txt+AddTxt;
		return ret;
	}
	
	
	private By userFailedToCreate = By.xpath("//*[contains(text(),'Failed')]");
	public String getuserFailedToCreate() {
		System.out.println("getuserFailedToCreate");
		new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(driver.findElement(userFailedToCreate)));
		return driver.findElement(userFailedToCreate).getText() ;
	}

	private By userSuccess = By.xpath("//*[contains(text(),'Successful')]");
	public String getuserSuccess() {
		System.out.println("getuserSuccess");
		new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(driver.findElement(userSuccess)));
		return driver.findElement(userSuccess).getText() ;
	}

	
	String userFName;
	String userMName;
	String userLName;
	String userLocationVal;
	String userPhoneVal;
	String userLinkedin;
	String userRole;
	String userRoleStatus;
	String userVisa;
	String userEmail;
	String userUnderGrad;
	String userPostGrad;
	String userTimeZone;
	String userComments;

	
	public void readDataFromExcel(String sheetName, Integer rowNumber) throws IOException {
		
		utilities.ExcelReader reader = new ExcelReader();
		System.out.println("sheetname " + sheetName);
		System.out.println("row number " + rowNumber);
		
		List<Map<String, String>> testdata = reader.getData(sheetName);
		
		userFName = testdata.get(rowNumber).get("userFName");
		
		//int randomNum = ThreadLocalRandom.current().nextInt(1001, 9999);
		
		
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		if (userFName.isBlank() || userFName.isEmpty()) {
			
		}
		else
		{
		this.userFName = this.userFName + generatedString;
		}
		
	    System.out.println(generatedString);
	    
		System.out.println("Unique Username is " + this.userFName);
		AppUtils.USER_FIRST_NAME = this.userFName;
		
		userMName =testdata.get(rowNumber).get("userMName");
		userLName= testdata.get(rowNumber).get("userLName");
		userLocationVal = testdata.get(rowNumber).get("userLocationVal");
		userPhoneVal = testdata.get(rowNumber).get("userPhoneVal");
		userLinkedin = testdata.get(rowNumber).get("userLinkedin");
		userRole = testdata.get(rowNumber).get("userRole");
		userRoleStatus =testdata.get(rowNumber).get("userRoleStatus");
		userVisa= testdata.get(rowNumber).get("userVisa");
		userEmail = testdata.get(rowNumber).get("userEmail");
		if (userEmail.isBlank() || (userEmail.isEmpty()) ) {
			
		}
		else {
			userEmail = userFName +"@gmail.com";}
		
		userUnderGrad = testdata.get(rowNumber).get("userUnderGrad");
		userPostGrad = testdata.get(rowNumber).get("userPostGrad");
		userTimeZone = testdata.get(rowNumber).get("userTimeZone");
		userComments = testdata.get(rowNumber).get("userComments");
		
		
	}
	
	public void fillUserForm(String sheetname, Integer rownumber) throws InterruptedException, IOException {
		
		readDataFromExcel(sheetname, rownumber);
		System.out.println("In fillUserForm");
		//setUserFName(userFName);
		setUserFName(AppUtils.USER_FIRST_NAME);
		setUserMName(userMName);
		setUserLName(userLName);
		setUserLocation(userLocationVal);
		setUserPhoneVal(userPhoneVal);
		setUserLinkedin(userLinkedin);
		setUserRoleDropDown(userRole);
		setUserRoleStatus(userRoleStatus);
		setUserVisa(userVisa);
		setUserEmail(userEmail);
		setUserUnderGrad(userUnderGrad);
		setUserPostGrad(userPostGrad);
		setUserTimeZone(userTimeZone);
		setUserComments(userComments);
		clickUserSaveButton();
	}

	public void fillInvalidUserForm() throws InterruptedException, IOException {
		setUserFName("aa");
		setUserMName("aa");
		setUserLName("aa");
		setUserLocation("aa");
		setUserPhoneVal("1111111111");
		setUserLinkedin("aa.www.Linkedin.com");
		setUserRoleDropDown("R03");
		setUserRoleStatus("Active");
		setUserVisa("NA");
		setUserEmail("aa@gmail.com");
		setUserUnderGrad("aa");
		setUserPostGrad("aa");
		setUserTimeZone("aa");
		setUserComments("aa");
		clickUserSaveButton();
	}

	public void editUserForm(String sheetname, Integer rownumber) throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		readDataFromExcel(sheetname, rownumber);
		System.out.println("In editUserForm");
		System.out.println("sheetname "+ sheetname);
		System.out.println("rownumber " + rownumber);
		setUserFName(userFName);
		//setUserFName(AppUtils.USER_FIRST_NAME);
		setUserMName(userMName);
		setUserLName(userLName);
		setUserLocation(userLocationVal);
		setUserPhoneVal(userPhoneVal);
		setUserLinkedin(userLinkedin);
		setUserRoleDropDown(userRole);
		setUserRoleStatus(userRoleStatus);
		setUserVisa(userVisa);
		
		setUserEmail(userEmail);
		
		setUserUnderGrad(userUnderGrad);
		setUserPostGrad(userPostGrad);
		setUserTimeZone(userTimeZone);
		setUserComments(userComments);
		clickUserSaveButton();
	}

	
	
	
	private By userSearchResult = By.xpath("//tbody/tr[1]/td[3]");
	public String getUserSearchResult() {
		System.out.println("In getUserSearchResult");
		String FLnames = driver.findElement(userSearchResult).getText() ;
		int i = FLnames.indexOf(" "); 
		return FLnames.substring(0, i); 
	}

	
	private By showing_text = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	public String getShowingText() {
		String text = driver.findElement(showing_text).getText();
		return text;
	}
	
	public int getXVal() {
		String text = driver.findElement(showing_text).getText();
		String[] total = text.split(" ");
		System.out.println();
		System.out.println(total[0]);
		System.out.println(total[1]);
		System.out.println(total[2]);
		System.out.println(total[3]);
		System.out.println(total[4]);
		System.out.println(total[5]);
		System.out.println(total[6]);
		
		return Integer.parseInt(total[1]);
	}
	
	public int getYVal() {
		String text = driver.findElement(showing_text).getText();
		String[] total = text.split(" ");
		System.out.println();
		return Integer.parseInt(total[3]);
	}
	
	public int getZVal() {
		String text = driver.findElement(showing_text).getText();
		String[] total = text.split(" ");
		System.out.println();
		return Integer.parseInt(total[5]);
	}
	
	public void searchUserNameAllPages() {
		String text = driver.findElement(showing_text).getText();
		System.out.println("labelText is " + text);
		String[] total = text.split(" ");
		System.out.println(total[0]);
		System.out.println(total[1]);
		System.out.println(total[2]);
		System.out.println(total[3]);
		System.out.println(total[4]);
		System.out.println(total[5]);
		System.out.println(total[6]);
	}

	private By nextLinkXpath = By.xpath("//div//span[@class='p-paginator-icon pi pi-angle-right']");
	public boolean isNextLinkDisplayed() {
		WebElement  nextLink = driver.findElement(nextLinkXpath);

		if(!nextLink.isDisplayed())
			return true;
		else
			return false;
	}

	private By prevLinkXpath = By.xpath("//div//span[@class='p-paginator-icon pi pi-angle-left']");
	public boolean isPreviousLinkDisplayed() {
		WebElement prevLink = driver.findElement(prevLinkXpath);

		if(!prevLink.isDisplayed())
			return true;
		else
			return false;
	}

//	public boolean isNextLinkDisabled() {
//		//Total pages count
//		int paginationSize = driver.findElements(By.xpath("//span/a[class='paginate_button]')).size();"))
//		//click on the last page link
//		driver.findElement(By.xpath("//span/a[@class='paginate_button][" + paginationSize + "]")).click();					));
//		WebElement  nextLink = driver.findElement(nextLinkXpath);
//		//verify the next link is disabled
//		if (!nextLink.isEnabled())
//			return true;
//		else
//			return false;
//	}

	public boolean isFirstLinkDisabled() {
		//click on the first page link
		driver.findElement(By.xpath("//div//span[@class='p-paginator-pages ng-star-inserted']/button[1]")).click();
		WebElement prevLink = driver.findElement(prevLinkXpath);
		//verify the prev link is disabled
		if (!prevLink.isEnabled())
			return true;
		else
			return false;
	}
	
//	public int getRowCountInPage() {
//		totalRowsInPage = tableRows.size();
//		return totalRowsInPage;
//	
//	}
	
//	public String extractTotalRowCountFromFooter() {
//		totalRowsAllPages = (footer.getText().replace("[^0-9]"),"");
//		return totalRowsAllPages ;
//	}

//	public int findTotalRecordCount() {
//	return count;
//	
//	}

//	public boolean verifyFooter(String moduleName){
//		String actualFooterText = footer.getText();
//		String expectedFooterText = "In total there are " + totalRowsAllPages + " " + moduleName + :" ";
//		
//		if(actualFooterText.equals(expectedFooterText))
//			return true;
//		else
//			return false;
//	}
	
//	public boolean verifyPaginationEntries(String moduleName) {
//		String actualEntriesText = txtNoOfEntries.getText();
//		String expectedEntriesText = "Showing ";
//		
//		if(actualEntriesText.equals(expectedEntriesText))
//			return true;
//		else
//			return false;
//		
//	}

//	public boolean verifyRecordCountInPage(Integer x) {
//		if ((count > x && totalRowsInPage == x) || (count < x && totalRowsInPage ==count))
//			return true;
//		else
//			return false;
//		}
	
	
	
	//DELETE MULTIPLE USERS LOGIC
	//By checkbox = By.xpath("//div[@role='checkbox']");
	By delete_btn = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	By singlecheckbox = By.xpath("//table/tbody/tr/td[1]/p-tablecheckbox/div/div[2][1]");
	//By checkbox1 = By.xpath("//tbody/tr[1]/td[1]/p-tablecheckbox[1]/div[1]/div[2]");
	//By checkbox2 = By.xpath("//tbody/tr[3]/td[1]/p-tablecheckbox[1]/div[1]/div[2]");
	By checkbox_multiple = By.xpath("//div[@class='p-checkbox-box']");
	//By successmsg = By.xpath("//div[@class='p-toast-message-content ng-tns-c90-8']");
	By successmsg = By.xpath("//*[contains(text(),'Successful')]");
	By user_firstrow = By.xpath("//tbody/tr//td[2]");
	By alert_no = By.xpath("//span[text()='No']");
	By alert_yes = By.xpath("//span[text()='Yes']");
	By search = By.xpath("//input[@id='filterGlobal']");
	String singleUser = AppUtils.USER_FIRST_NAME;
	String multipleUsers = "TestingSprinters" ;
	
//	public boolean checkBoxSelected() throws InterruptedException {
//		Thread.sleep(Duration.ofMillis(2000));
//		List<WebElement> check_box = driver.findElements(checkbox);
//		for(WebElement element: check_box) {
//			if(element.isSelected()) {
//				checkBoxSelected = true;
//				System.out.println("Checkbox is selected");
//			}
//			else
//			{
//				checkBoxSelected = false;
//				System.out.println("Checkbox is not selected");
//			}
//		}
//		driver.findElement(checkbox).isSelected()
//		return checkBoxSelected ;
//	}
	
//	public void verifyDeleteBtn() {
//		if(driver.findElement(delete_btn).isEnabled()) {
//			System.out.println("Delete icon is enabled");
//		}
//		else {
//			System.out.println("Delete icon is disabled");
//		}
//				
//	}

	public void pageCheckBox() throws InterruptedException {
		//driver.findElement(singlecheckbox).click();
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(singleUser + Keys.ENTER);
		Thread.sleep(Duration.ofMillis(2000)) ;
		String userName_firstrow = driver.findElement(user_firstrow).getText();
		System.out.println(userName_firstrow);
		driver.findElement(userPageDelIcon).click();
	}
	
	public void deleteSingleRow() {
		System.out.println("deleteSingleRow()");
		driver.findElement(delete_btn).click();
		driver.findElement(alert_yes).click();
		System.out.println("User is deleted");
	}
	
	public void successMessage() {
		String message = driver.findElement(successmsg).getText();
		System.out.println(message);
	}
	
	
	public void mutipleCheckbox() throws InterruptedException {
		System.out.println("mutipleCheckbox()");
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(multipleUsers + Keys.ENTER);
		Thread.sleep(Duration.ofMillis(2000)) ;
		clickOnUserChkBox();
		//driver.findElement(userPageDelIcon).click();
		
	}
	
	public void delMultipleRowsPageChkbox() throws InterruptedException {
		Thread.sleep(Duration.ofMillis(2000)) ;
		driver.findElement(userPageDelIcon).click();
		
	}
	
	//DELETE LOGIC FOR SINGLE USER
	By user_header = By.xpath("//span[text()='User']");
	By delete_icon = By.xpath("//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']");
	By delete_icon1 = By.xpath("//tbody/tr[1]/td[7]/div[1]/span[2]/button[1]/span[1]");
	By deleteIcons = By.xpath("//tbody/tr/td[5]");
	By editIcons = By.xpath("//tbody/tr/td[4]");
	By checkBoxIcons = By.xpath("//tbody/tr/td[0]");
	//By alertbox = By.xpath("//div[@class='ng-trigger ng-trigger-animation ng-tns-c133-7 p-dialog p-confirm-dialog p-component ng-star-inserted']");
	By alertbox = By.xpath("//div/p-confirmdialog/div/div/div[1]/span");
	//////////////////////////////////////////////
	String user_name = AppUtils.USER_FIRST_NAME ;
	String user_name1 = "TestingSprintersTwo" ;
	
	
	public void clickUser() {
		driver.findElement(user_header).click();
	}
	
	public void deleteEnabled() {
		
		List<WebElement> delete = driver.findElements(delete_icon);
		for(WebElement element : delete) {
			if(element.isEnabled()) {
				Assert.assertTrue(element.isEnabled());
			}
			else {
				System.out.println("Delete button is not dispalyed");
			}
		}
	
	}

	public void selectRowChkBox() throws InterruptedException {
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(user_name + Keys.ENTER);
		Thread.sleep(Duration.ofMillis(2000)) ;
		String username_firstrow = driver.findElement(user_firstrow).getText();
		System.out.println(username_firstrow);
		System.out.println(user_name);
			System.out.println("driver.findElement(singlecheckbox).click();");
			System.out.println("Single check box " + singlecheckbox);
			driver.findElement(singlecheckbox).click();
			Thread.sleep(Duration.ofMillis(2000)) ;
	}
	
	//DELETE USER
	public void delete_row() throws InterruptedException {
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(user_name + Keys.ENTER);
		Thread.sleep(Duration.ofMillis(2000)) ;
		String username_firstrow = driver.findElement(user_firstrow).getText();
		System.out.println(username_firstrow);
		System.out.println(user_name);
			System.out.println("driver.findElement(delete_icon).click();");
			driver.findElement(delete_icon).click();
			
	}
	
	
	
	//EDIT USER CODE
	public void edit_row() throws InterruptedException {
		driver.findElement(search).clear();
		if (user_name == "") {
			user_name = "TestingSprinters";
		}
		driver.findElement(search).sendKeys(user_name + Keys.ENTER);
		Thread.sleep(Duration.ofMillis(2000)) ;
		String username_firstrow = driver.findElement(user_firstrow).getText();
		System.out.println(username_firstrow);
		System.out.println(user_name);
			System.out.println("driver.findElement(userEditIcon).click();");
			driver.findElement(userEditIcon).click();
	}

	
	public void delete_row1() throws InterruptedException {
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys(user_name1 + Keys.ENTER);
		Thread.sleep(Duration.ofMillis(2000)) ;
		String username_firstrow = driver.findElement(user_firstrow).getText();
		System.out.println(username_firstrow);
		System.out.println(user_name1);
			System.out.println("driver.findElement(delete_icon1).click();");
			driver.findElement(delete_icon1).click();
			Thread.sleep(Duration.ofMillis(2000)) ;
	}
	
	public void alertDisplay() throws InterruptedException {
		if(driver.findElement(alertbox).isDisplayed()) {
			Thread.sleep(Duration.ofMillis(2000)) ;
			System.out.println("Alert is dispalyed");
		}
		else
		{
			System.out.println("Alert is not displayed");
		}
		
		if((driver.findElement(alert_no).isDisplayed()) && (driver.findElement(alert_yes).isDisplayed()) ) {
			System.out.println("Alert with Yes and No option is displayed");
		}
	}
	
	public void alert_accept() {
		driver.findElement(alert_yes).click();
		System.out.println(user_name + " got deleted ");
	}
	
	
	public void alert_dismiss() {
		driver.findElement(alert_no).click();
		System.out.println("User is not deleted");
	}
	
	public void user_deleted() {
		System.out.println("User is not deleted");
	}

	//USER PAGE VALIDATION FUNCTIONS
	//Delete Icons
	public boolean deleteAllRowsEnabled() {
		boolean enabledDel = false; 
		List<WebElement> delete = driver.findElements(deleteIcons);
		for(WebElement element : delete) {
			if(element.isEnabled()) {
				enabledDel = true;
			}
			else {
				enabledDel = false;
				System.out.println("Delete button is not enabled");
			}
		}
		return enabledDel;
	
	}
	
	//Edit Icons
	public boolean editAllRowsEnabled() {
		boolean enabledEdit  = false; 
		List<WebElement> edit = driver.findElements(editIcons);
		for(WebElement element : edit) {
			if(element.isEnabled()) {
				enabledEdit = true;
			}
			else {
				enabledEdit = false;
				System.out.println("Edit button is not enabled");
			}
		}
		return enabledEdit;
	}
	
	//Checkbox Icons
	public boolean checkBoxAllRowsEnabled() {
		boolean enabledCheckBox  = false; 
		List<WebElement> check = driver.findElements(checkBoxIcons);
		for(WebElement element : check) {
			if(element.isEnabled()) {
				enabledCheckBox = true;
			}
			else {
				enabledCheckBox = false;
				System.out.println("Checkbox is not enabled");
			}
		}
		return enabledCheckBox;
	
	}

	//Table column header validation
	private By columnID = By.xpath("//p-table/div/div[1]/table/thead/tr/th[2]");
	private By columnName = By.xpath("//p-table/div/div[1]/table/thead/tr/th[3]");
	private By columnLoc = By.xpath("//p-table/div/div[1]/table/thead/tr/th[4]");
	private By columnPhone = By.xpath("//p-table/div/div[1]/table/thead/tr/th[5]");
	private By columnEditDel = By.xpath("//p-table/div/div[1]/table/thead/tr/th[6]");
	
	public boolean checkColumnHeaders() {
		boolean disPlayed  = true; 
//		if driver.findElement(columnID).isDisplayed()
//				{
//				disPlayed  = true;
//				}
//		Assert.assertTrue(driver.findElement(columnName).isDisplayed()) +		 
//		Assert.assertTrue(driver.findElement(columnLoc).isDisplayed()) + 
//		Assert.assertTrue(driver.findElement(columnPhone).isDisplayed()) + 
//		Assert.assertTrue(driver.findElement(columnEditDel).isDisplayed()); 
//		
		return disPlayed;
	
	}

	//Page Sorting Functions
	private By idSort = By.xpath("//table/thead/tr/th[2]/p-sorticon/i");
	private By idSortDown = By.xpath("//table/thead/tr/th[2]/p-sorticon/i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-down']");
	private By idSortUp = By.xpath("//table/thead/tr/th[2]/p-sorticon/i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']");
	
	private By Id_list = By.xpath("//table/tbody/tr/td[2]");
	
	private List<String> listValues = new ArrayList<>();
	//Return List by ID
	public  List<String> getIdList() {
		List<WebElement> list = driver.findElements(Id_list);
		for(WebElement ele : list) {
			listValues.add(ele.getText());
		}
		return listValues;
	}
	//Sort by ID function, store original list, store sorted it and compare them
	public void sortById() {
		List<String> beforeSort = getIdList();
	
		System.out.println("size of beforeSort " + beforeSort.size());
		
		driver.findElement(idSort).click();
		//Sort list
		try {
			Thread.sleep(Duration.ofMillis(2000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (driver.findElement(idSortUp).isDisplayed() ) {
			System.out.println("Ordering list in alphabetical order");
			Collections.sort(beforeSort);
		}
		//Sort list in reverse order
		else if (driver.findElement(idSortDown).isDisplayed() ) {
			System.out.println("sorting list in reverse order");
			Collections.sort(beforeSort, Collections.reverseOrder());
			}
		
		//compare both lists
		List<String> afterSort = getIdList();
		System.out.println("size of afterSort " + afterSort.size());
		System.out.println("Comparing both lists");
		Assert.assertEquals(beforeSort,afterSort);
		}
	
	//////////////////////////////////
	private By userNameSort = By.xpath("//table/thead/tr/th[3]/p-sorticon/i");
	private By nameSortDown = By.xpath("//table/thead/tr/th[3]/p-sorticon/i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-down']");
	private By nameSortUp = By.xpath("//table/thead/tr/th[3]/p-sorticon/i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']");
	
	public  List<String> getNameList() {
		List<WebElement> list = driver.findElements(Id_list);
		for(WebElement ele : list) {
			listValues.add(ele.getText());
		}
		return listValues;
	}
	
	public void sortByName() {
		List<String> beforeSort = getNameList();
	
		System.out.println("size of beforeSort " + beforeSort.size());
		
		driver.findElement(userNameSort).click();
		try {
			Thread.sleep(Duration.ofMillis(2000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (driver.findElement(nameSortUp).isDisplayed() ) {
			System.out.println("Ordering list in alphabetical order");
			Collections.sort(beforeSort);
		}
		else if (driver.findElement(nameSortDown).isDisplayed() ) {
			System.out.println("sorting list in reverse order");
			Collections.sort(beforeSort, Collections.reverseOrder());
			}
		
		List<String> afterSort = getNameList();
		System.out.println("size of afterSort " + afterSort.size());
		System.out.println("Comparing both lists");
		Assert.assertEquals(beforeSort,afterSort);
		}
	
	//////////////////
	
	private By userLocationSort = By.xpath("//table/thead/tr/th[4]/p-sorticon/i");
	private By locSortDown = By.xpath("//table/thead/tr/th[4]/p-sorticon/i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-down']");
	private By locSortUp = By.xpath("//table/thead/tr/th[4]/p-sorticon/i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']");
	
	public  List<String> getLocList() {
		List<WebElement> list = driver.findElements(userLocationSort);
		for(WebElement ele : list) {
			listValues.add(ele.getText());
		}
		return listValues;
	}
	
	public void sortByLocation(){
		List<String> beforeSort = getLocList();
	
		System.out.println("size of beforeSort " + beforeSort.size());
		
		driver.findElement(userLocationSort).click();
		try {
			Thread.sleep(Duration.ofMillis(2000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (driver.findElement(locSortUp).isDisplayed() ) {
			System.out.println("Ordering list in alphabetical order");
			Collections.sort(beforeSort);
		}
		else if (driver.findElement(locSortDown).isDisplayed() ) {
			System.out.println("sorting list in reverse order");
			Collections.sort(beforeSort, Collections.reverseOrder());
			}
		
		List<String> afterSort = getLocList();
		System.out.println("size of afterSort " + afterSort.size());
		System.out.println("Comparing both lists");
		Assert.assertEquals(beforeSort,afterSort);
		}
	
	/////////////////////
	
	private By userPhoneSort = By.xpath("//table/thead/tr/th[5]/p-sorticon/i");
	private By phoneSortDown = By.xpath("//table/thead/tr/th[5]/p-sorticon/i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-down']");
	private By phoneSortUp = By.xpath("//table/thead/tr/th[5]/p-sorticon/i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']");
	
	public  List<String> getPhoneList() {
		List<WebElement> list = driver.findElements(userPhoneSort);
		for(WebElement ele : list) {
			listValues.add(ele.getText());
		}
		return listValues;
	}
		
	public void sortByPhone() {
		List<String> beforeSort = getPhoneList();
	
		System.out.println("size of beforeSort " + beforeSort.size());
		
		driver.findElement(userPhoneSort).click();
		try {
			Thread.sleep(Duration.ofMillis(2000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (driver.findElement(phoneSortUp).isDisplayed() ) {
			System.out.println("Ordering list in alphabetical order");
			Collections.sort(beforeSort);
		}
		else if (driver.findElement(phoneSortDown).isDisplayed() ) {
			System.out.println("sorting list in reverse order");
			Collections.sort(beforeSort, Collections.reverseOrder());
			}
		
		List<String> afterSort = getPhoneList();
		System.out.println("size of afterSort " + afterSort.size());
		System.out.println("Comparing both lists");
		Assert.assertEquals(beforeSort,afterSort);
		}
	
	
	
	
	
}
