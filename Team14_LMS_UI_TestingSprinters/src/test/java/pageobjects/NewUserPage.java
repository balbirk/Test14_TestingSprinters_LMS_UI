package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import hooks.DriverManager;

public class NewUserPage {

	
	public static WebDriver driver=DriverManager.getdriver();
	
	private By userButton = By.xpath("//button/span[text()='User']") ;
	
	
	
	private By userPageTitle = By.xpath("//div[@class='box']");
	private By userPageText = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	private By userPageFooter = By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div");
	private By userPageDelIcon = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	private By userSearch = By.xpath("//*[@id='filterGlobal']");
	private By userLink = By.xpath("//*[@id='user']/span[1]");
	//@FindBy (xpath="") WebElement userDetails;
	
	private By manageUserText = By.xpath("//div[text()=' Manage User']");
	
	
	private By userChkBox = By.xpath("//div[@class='p-checkbox-box']");
	private By userEditIcon = By.xpath("(//button/span[@class='p-button-icon pi pi-pencil'])[1]");
	private By newUserButton =  By.xpath("//span[@class='p-button-label'][contains(text(),'Add New User')]");
	
	private By userId = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[2]") ;
	private By userName = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[3]");
	private By userLocation = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[4]");
	private By userPhone = By.xpath("(//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted']/td)[5]");
		
	
	//WebElements on User Details Page	
	private By userFNameEditBox = By.xpath("//*[@id='mat-input-135']");
	private By userMNameEditBox= By.xpath("//*[@id='mat-input-136']");
	private By userLNameEditBox= By.xpath("//*[@id='mat-input-137']");
	private By userLocationEditBox = By.xpath("//*[@id='mat-input-138']");
	private By userPhoneEditBox = By.xpath("//*[@id='mat-input-139']");
	private By userLinkedinEditBox = By.xpath("//*[@id='mat-input-140']");
	private By userRoleEdit = By.xpath("//*[@id='roleId']/div/span");
	private By userRoleStatusEdit = By.xpath("//*[@id='userRoleStatus']/div/span");
	private By userVisaEdit = By.xpath("//*[@id='userVisaStatus']/div/span");  
	private By userEmailEditBox= By.xpath("//*[@id='mat-input-141']");
	private By userUnderGradEdit = By.xpath("//*[@id='mat-input-142']");
	private By userPostGradEdit = By.xpath("//*[@id='mat-input-143']");
	private By userTimeZoneEdit = By.xpath("//*[@id='mat-input-144']");
	private By userCommentsEditBox=  By.xpath("//*[@id='mat-input-145']");
	private By userCancelBtn = By.xpath("//button/span[contains(text(),'Cancel')]");
	private By userSaveBtn = By.xpath("//button/span[contains(text(),'Submit')]");
	
	
	
	
		  
}
