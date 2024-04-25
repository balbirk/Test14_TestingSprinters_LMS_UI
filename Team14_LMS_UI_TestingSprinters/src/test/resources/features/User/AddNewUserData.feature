Feature: Add New User Data

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module
    And User clicks on "+ A New User" button on user page
    
    Scenario: Check if user is created when only mandatory fields are entered with valid data in user module
    Given Admin is on  User details pop up in user module
    When Admin enters mandatory fields in the form and clicks on submit button in user module
    Then Admin gets message User added Successfully in user module
    
    Scenario: Check if user is created when only optional fields are entered with valid data in user module
    Given Admin is on  User details pop up in user module
    When Admin skips to add value in mandatory field in user module
    Then Admin should see error message below the test field and the field will be highlighed in red color in user module
    
    Scenario: check if user is created when invalid data is entered in all of the fields in user module
    Given Admin is on  User details pop up in user module
    When Admin enters invalid data in all of the  fields in the form and clicks on submit button in user module
    Then Admin gets error message and user is not created in user module
    
    Scenario: Empty form submission
    Given Admin is on  User details pop up in user module
    When Admin clicks on submit button without entering data in user module
    Then user will not be created and Admin gets error message in user module
    
    Scenario: Validate Cancel/Close(X) icon on User Details form
    Given Admin is on  User details pop up in user module
    When Admin clicks Cancel/Close(X) Icon on User Details form
    Then User Details popup window should be closed without saving in user module
    
    Scenario: Validate Cancel button on User Details form
    Given Admin is on  User details pop up in user module
    When Admin clicks Cancel button in user module
    Then Admin can see the User details popup disappears without adding any user in user module
    
    Scenario: Check if the user details are added in data table
    Given Admin is on  User details pop up in user module
    When Fill in all the fields with valid values and click submit in user module
    Then The newly added user should be present in the data table in Manage User page in user module
    
    
    