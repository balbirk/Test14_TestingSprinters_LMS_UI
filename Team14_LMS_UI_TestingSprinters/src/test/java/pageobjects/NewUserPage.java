package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import hooks.DriverManager;

public class NewUserPage {
	
	//public static WebDriver driver=DriverManager.getdriver();
	
		private WebDriver driver;
		
	    public NewUserPage(WebDriver webDriver) {
	        super();
	        this.driver = webDriver;
	    }


	
	
	private By userButton = By.xpath("//button/span[text()='User']") ;
	public void clickOnUserBtn() {
		driver.findElement(userButton).click();
	}
	
//	public DashBoardPage clickLoginBtn() {
//        webDriver.findElement(loginBtn).click();
//        return new DashBoardPage(webDriver);

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
	
	
	private By userSearch = By.xpath("//*[@id='filterGlobal']");
	public String getUserSearchValue() {
		return driver.findElement(userSearch).getText();
	}
	
	private By userLink = By.xpath("//*[@id='user']/span[1]");
	public void clickOnUserLink() {
		driver.findElement(userLink).click();
	}
	
	//@FindBy (xpath="") WebElement userDetails;
	
	private By manageUserText = By.xpath("//div[text()=' Manage User']");
	public String getManageUserText() {
		return driver.findElement(manageUserText).getText();
	}
	
	private By userChkBox = By.xpath("//div[@class='p-checkbox-box']");
	public void clickOnUserChkBox() {
		driver.findElement(userChkBox).click();
	}
	
	
	private By userEditIcon = By.xpath("(//button/span[@class='p-button-icon pi pi-pencil'])[1]");
	public void clickOnUserEditIcon() {
		driver.findElement(userEditIcon).click();
	}
	
	private By newUserButton =  By.xpath("//span[@class='p-button-label'][contains(text(),'Add New User')]");
	public void clickOnNewUserButton() {
		driver.findElement(newUserButton).click();
	}
	
	
	private By userId = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[2]") ;
	public void setUserId(String uId) {
		driver.findElement(userId).sendKeys(uId);
	}
	
	private By userName = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[3]");
	public void setUserName(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}
	
	private By userLocation = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[4]");
	public void setUserLoc(String uLoc) {
		driver.findElement(userLocation).sendKeys(uLoc);
	}
	
	private By userPhone = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[5]");
	public void setUserPhone(String uPhone) {
		driver.findElement(userPhone).sendKeys(uPhone);
	}
	
	//WebElements on User Details Page	
	private By userFNameEditBox = By.xpath("//*[@id='mat-input-135']");
	public void setUserFName(String uFname) {
		driver.findElement(userFNameEditBox).sendKeys(uFname);
	}
	
	
	private By userMNameEditBox= By.xpath("//*[@id='mat-input-136']");
	public void setUserMName(String uMname) {
		driver.findElement(userMNameEditBox).sendKeys(uMname);
	}
	
	
	private By userLNameEditBox= By.xpath("//*[@id='mat-input-137']");
	public void setUserLName(String uLname) {
		driver.findElement(userLNameEditBox).sendKeys(uLname);
	}
	
	private By userLocationEditBox = By.xpath("//*[@id='mat-input-138']");
	public void setUserLocation(String uLocation) {
		driver.findElement(userLocationEditBox).sendKeys(uLocation);
	}
	
	
	private By userPhoneEditBox = By.xpath("//*[@id='mat-input-139']");
	public void setUserPhoneVal(String uPhoneVal) {
		driver.findElement(userPhoneEditBox).sendKeys(uPhoneVal);
	}
	
	private By userLinkedinEditBox = By.xpath("//*[@id='mat-input-140']");
	public void setUserLinkedin(String uLinkedin) {
		driver.findElement(userLinkedinEditBox).sendKeys(uLinkedin);
	}
	
	private By userRoleEdit = By.xpath("//*[@id='roleId']/div/span");
	public void setUserRoleDropDown(String uRole) {
		driver.findElement(userRoleEdit).sendKeys(uRole);
	}
	
	private By userRoleStatusEdit = By.xpath("//*[@id='userRoleStatus']/div/span");
	public void setUserRole(String uRole) {
		driver.findElement(userRoleStatusEdit).sendKeys(uRole);
	}
	
	private By userVisaEdit = By.xpath("//*[@id='userVisaStatus']/div/span");  
	public void setUserVisa(String uVisa) {
		driver.findElement(userVisaEdit).sendKeys(uVisa);
	}
	
	private By userEmailEditBox= By.xpath("//*[@id='mat-input-141']");
	public void setUserEmail(String uEmail) {
		driver.findElement(userEmailEditBox).sendKeys(uEmail);
	}
	
	private By userUnderGradEdit = By.xpath("//*[@id='mat-input-142']");
	public void setUserUnderGrad(String uUGrad) {
		driver.findElement(userUnderGradEdit).sendKeys(uUGrad);
	}
	
	private By userPostGradEdit = By.xpath("//*[@id='mat-input-143']");
	public void setUserPostGrad(String uPGrad) {
		driver.findElement(userPostGradEdit).sendKeys(uPGrad);
	}
	
	private By userTimeZoneEdit = By.xpath("//*[@id='mat-input-144']");
	public void setUserTimeZone(String uTZone) {
		driver.findElement(userTimeZoneEdit).sendKeys(uTZone);
	}
	
	private By userCommentsEditBox=  By.xpath("//*[@id='mat-input-145']");
	public void setUserComments(String uComments) {
		driver.findElement(userCommentsEditBox).sendKeys(uComments);
	}
	
	private By userCancelBtn = By.xpath("//button/span[contains(text(),'Cancel')]");
	public void clickUserCancelButton() {
		driver.findElement(userCancelBtn).click();
	}
	
	
	private By userSaveBtn = By.xpath("//button/span[contains(text(),'Submit')]");
	public void clickUserSaveButton() {
		driver.findElement(userSaveBtn).click();
	}
}
