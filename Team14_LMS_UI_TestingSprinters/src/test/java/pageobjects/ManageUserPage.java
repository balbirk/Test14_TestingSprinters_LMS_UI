package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browserlaunch.Driverfactory;

public class ManageUserPage {
	
	
	private WebDriver driver;// = Driverfactory.getDriver();
	String manageuserPageURL ="https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/user";
	@FindBy (id="user") WebElement userMenu;
	@FindBy (id="new") WebElement addUserButton;
	
	

	// constructor initilize driver and page factory
	public ManageUserPage() {
		this.driver  = Driverfactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	public void navigateToManageUserPage() {
		// using FindBy
		System.out.println("-- using Findby to get User Menu "+userMenu);
		this.userMenu.click();
		System.out.println("-- Navigated using using Findby to User Menu ");
		
		// <! --  Using By approach
		//WebElement user = driver.findElement(By.id("user")); 		;
		//user.click();
		//  By Approach -->
		
	}
	public void clickAddNewUserBtn() {
		//addNewUserBtn.click();
		System.out.println("-- using Findby to Add User button "+addUserButton);
		this.addUserButton.click();
		System.out.println("-- Add User popup opened");

	}
}