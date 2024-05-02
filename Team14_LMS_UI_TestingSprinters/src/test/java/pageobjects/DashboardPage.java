package pageobjects;



import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.net.URI;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DashboardPage {

	
	 private WebDriver webDriver;
	
	//WebElements--
	
	By header_text = By.xpath("//div[@class='signin-content']//div[1][@class='box'] ");
	By lms_title = By.xpath("//app-header[1]/mat-toolbar[1]/span[1] ");
	By navigation_program = By.xpath("//button[@id='program']/span[1]");
	By navigation_batch = By.xpath("//button[@id='batch']/span[1]");
	By navigation_user = By.xpath("//button[@id='user']/span[1]");
	By logout = By.xpath("//button[@id='logout']/span[1]");
 
	int responseCode;
	
	public DashboardPage(WebDriver webDriver) {
		
		 super();
	        System.out.println("initialized");
	        this.webDriver = webDriver;
	
	}

	//--------Methods-------
	
	
	public String verifyheader_text() {
		
		return webDriver.findElement(header_text).getText();	
		
	}
	
	public String verifyLMStitle() {
		
		return webDriver.findElement(lms_title).getText();
			
	}

	
	public void lmsLeftAlligned() {
		
		  int expectedX=16;
		  int expectedY=16;
		  
		
		WebElement leftAlignedElement = (webDriver.findElement(lms_title));
		 Point location = leftAlignedElement.getLocation();
		  int actualX = location.getX();
		  int actualY = location.getY();
		  
		  if (actualX == expectedX && actualY == expectedY) {
			   String leftlmsposition = leftAlignedElement.getText();
				System.out.println("Text of the left-aligned element: " + leftlmsposition);
			} else {
			    System.out.println("Text of LMS not left alligned");
			}		
		
	}
	
	public void spellingCheck() {
		
		Assert.assertEquals(webDriver.findElement(lms_title).getText(),"LMS - Learning Management System");
		Assert.assertEquals(webDriver.findElement(navigation_program).getText(),"Program");
		Assert.assertEquals(webDriver.findElement(navigation_batch).getText(),"Batch");
		Assert.assertEquals(webDriver.findElement(navigation_user).getText(),"User");
		Assert.assertEquals(webDriver.findElement(logout).getText(),"Logout");
	}
	
	
		public void navigationTextAllignment() {
			
			
			  int toolbarX=16;
			  int toolbarY=16;

			    int[] Program = {1147, 24}; 
		        int[] Batch = {1233, 24}; 
		        int[] User = {1302, 24}; 
		        int[] Logout = {1365, 24};

		        boolean modulesOnRightTop = validateButtonPosition(Program, toolbarX, toolbarY)
		        		&&
                        validateButtonPosition(Batch, toolbarX, toolbarY ) &&
                        validateButtonPosition(User, toolbarX, toolbarY) &&
                        validateButtonPosition(Logout, toolbarX, toolbarY);

		        if (modulesOnRightTop) {
		            System.out.println("All modules are positioned on the right side of the top of the page.");
		        } else {
		            System.out.println("modules are not on right of toolbar");
		        }
		    }
		      
		        
				private static boolean validateButtonPosition(int[] button, int spaceX, int spaceY) {
		            int xCoordinate = button[0];
		            int yCoordinate = button[1];
		            return xCoordinate > spaceX && yCoordinate > spaceY;     
		        
		}       
	

	
	public void VerifyBrokenLink() {
	
		String url = webDriver.getCurrentUrl();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());

            if (response.statusCode() >= 400) {
                System.out.println(url + " - " + response.statusCode() + " - " + "is a broken link");
            } else {
                System.out.println(url + " - " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(url + " - " + "is a broken link");
        }
    }

		
		
	
	 public void validateProgram() {
	     
		  int expectedX=1147;
		  int expectedY=24;
		  
	
		  WebElement element = webDriver.findElement(navigation_program);
		  Point location = element.getLocation();
		  int actualX = location.getX();
		  int actualY = location.getY();
		  
		  if (actualX == expectedX && actualY == expectedY) {
			    System.out.println("Program is on 1st place");
			} else {
			    System.out.println("program position do not match.");
			}
	
	}		  
	
	 public void validateBatch() {
			
		       int expectedX=1233;
		       int expectedY=24;


		WebElement element = webDriver.findElement(navigation_batch);
		Point location = element.getLocation();
		int actualX = location.getX();
		int actualY = location.getY();

		if (actualX == expectedX && actualY == expectedY) {
			    System.out.println("Batch is on 2nd place");
			} else {
			    System.out.println("batch position do not match");
			}
		}
				  
		  
	
		 
	 public void validateUser() {
			
			 int expectedX=1302;
		     int expectedY=24;


		WebElement element = webDriver.findElement(navigation_user);
		Point location = element.getLocation();
		int actualX = location.getX();
		int actualY = location.getY();

		if (actualX == expectedX && actualY == expectedY) {
		 System.out.println("User is on 3rd place");
		} else {
		 System.out.println("user position do not match");
		}
		}
	 
		
		 
     public void validateLogout() {
			 
    	 
    	     int expectedX=1365;
		     int expectedY=24;


		WebElement element = webDriver.findElement(logout);
		Point location = element.getLocation();
		int actualX = location.getX();
		int actualY = location.getY();

		if (actualX == expectedX && actualY == expectedY) {
		 System.out.println("Logout is on 4th place");
		} else {
		 System.out.println("logout position do not match.");
		}
		}
	 
		 

	
	   public void validateDashboardPage() {
		
		WebElement dashboardtitle = (webDriver.findElement(header_text));
		String dashboard = dashboardtitle.getText();
		System.out.println("Dashboard page: " + dashboard);
	}

	
	
	public void clickLogoutBtn() {
		
		webDriver.findElement(logout).click();
		
	}


}







