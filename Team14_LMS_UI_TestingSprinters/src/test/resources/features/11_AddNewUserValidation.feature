Feature: Add New User Validation

	Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When Admin clicks "User" from navigation bar
    
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |
     
    
    
  Scenario: Validate User Details Popup window
    Given Admin is on Manage User Page in user module
    When Admin clicks "+ A New User" button in user module
    Then Admin should see a popup open for user details with First Name,Middle name, Last Name, Location, phone, email, linkedin url, User Role, Role status, visa status,Undergraduate, postgraduate,time zone, user comments and user fields along with Cancel , Submit and close buttons
    
  Scenario: Validate input fields and text boxes in user details form
    Then Admin should see  text boxes for the fields First Name, Middle name, Last Name, Location, phone, email, linkedin url, Undergraduate, postgraduate,time zone ,user comments
    
  Scenario: Validate drop downs in new user form
    Then Admin should see drop downs for the fields User Role, Role status, visa status on user details pop up
    
    