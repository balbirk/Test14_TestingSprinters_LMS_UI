Feature: Add New User Data

#Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  
  	Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When Admin clicks "User" from navigation bar
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |
    
    Scenario: Add User 
    Then Admin clicks "+ A New User" button
    
    Scenario: Empty form submission
    Given Admin is on  User details pop up in user module
    When Admin clicks on submit button without entering data in user module
    Then User gets message "First name is required"
  
    Scenario: Check if user is created when only optional fields are entered with valid data in user module
    Given Admin is on  User details pop up in user module
    When Admin skips to add value in mandatory field in user module
    Then Admin should see error message "Last name is required" below the test field and the field will be highlighed in red color in user module
   

		Scenario: Validate Cancel button on User Details form
    Given Admin is on  User details pop up in user module
    When Admin clicks Cancel button in user module
    Then Admin can see the User details popup disappears without adding any user in user module
  
    Scenario: Validate Cancel/Close(X) icon on User Details form
    Given Admin is on  User details pop up in user module
    Then Admin clicks "+ A New User" button
    When Admin clicks Close Icon on User Details form
    Then User Details popup window should be closed without saving in user module
    
    Scenario: check if user is created when invalid data is entered in all of the fields in user module
    Given Admin is on  User details pop up in user module
    Then Admin clicks "+ A New User" button
    When Admin enters invalid data in all of the  fields in the form and clicks on submit button in user module
    Then Admin gets error message and user is not created in user module
    
    Scenario Outline: Check if user is created when only mandatory fields are entered with valid data in user module
    Given Admin is on  User details pop up in user module
    Then Admin clicks "+ A New User" button
    When Admin enters mandatory fields in the form and clicks on submit button in user module "<sheetName>" and rownumber <rowNumber>
    Then Admin gets message User added "Successfully" in user module
    Examples:
      | sheetName | rowNumber |
	    | AddUser 	|     0     |
    
    
    #Scenario: Check if the user details are added in data table
    #Given Admin is on  User details pop up in user module
    #Then Admin clicks "+ A New User" button
    #When Fill in all the fields with valid values and click submit in user module
    #Then The newly added user "username" should be present in the data table in Manage User page in user module
    