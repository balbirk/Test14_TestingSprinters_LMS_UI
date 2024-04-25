Feature: Add New User Validation

	Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module 
	
  Scenario: Validate User Details Popup window
    Given Admin is on Manage User Page in user module
    When Admin clicks "+ A New User" button in user module
    Then Admin should see a popup open for user details with First Name,Middle name, Last Name, Location, phone, email, linkedin url, User Role, Role status, visa status,Undergraduate, postgraduate,time zone, user comments and user fields along with Cancel , Submit and close buttons
    
        
  Scenario: Validate input fields and text boxes in user details form
    Given Admin is on Manage User Page in user module
    When Admin clicks "+ A New User" button in user module
    Then Admin should see  text boxes for the fields First Name, Middle name, Last Name, Location, phone, email, linkedin url, Undergraduate, postgraduate,time zone ,user comments
    
  Scenario: Validate drop downs in new user form
    Given Admin is on Manage User Page in user module
    When Admin clicks "+ A New User" button in user module
    Then Admin should see drop downs for the fields User Role, Role status, visa status on user details pop up
    
    