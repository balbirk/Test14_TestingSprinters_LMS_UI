package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
	 private WebDriver webDriver;
	
    public DashBoardPage(WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }

    private By userLink = By.xpath("//*[@id='user']/span[1]");

	public void clickOnUserLink() {
			webDriver.findElement(userLink).click();
		}
	}


