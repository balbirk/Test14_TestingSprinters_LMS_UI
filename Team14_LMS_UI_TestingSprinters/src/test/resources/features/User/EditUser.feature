Feature: Edit User Validation

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module
    
    Scenario: Validate row level edit icon in edit user module
    Given Admin is on Manage User Page in edit user module
    When Admin clicks on the edit icon in edit user module
    Then A new pop up with User details appears in edit user module
    
    Scenario: Check if the fields are updated with valid data in edit user module
    Given Admin is on Manage User Page in edit user module
    When Update the fields with valid data and click submit in edit user module
    Then Admin gets message "User updated Successfully " and see the updated values in data table of edit user module
    
    Scenario: Check if the fields are updated with invalid values in edit user module
    Given Admin is on Manage User Page in edit user module
    When Update the fields with invalid values and click submit in edit user module
    Then Admin should get Error message in edit user module for invalid values
    
    Scenario: Check if the mandatory fields are updated with valid data in edit user module
    Given Admin is on Manage User Page in edit user module
    When Update the mandatory fields with valid values and click submit in edit user module
    Then Admin gets message "User updated Successfully " and see the updated values in data table in edit user module
    
    Scenario: Check if the optional fields are updated with valid data
    Given Admin is on Manage User Page in edit user module
    When Update the optional fields with valid values and click submit in edit user module
    Then Admin gets message "User updated Successfully " and see the updated values in data table in edit user module
    
    Scenario: Validate invalid values in the text fields in edit user module
    Given Admin is on Manage User Page in edit user module
    When Admin enters only numbers or special char in the text fields in edit user module
    Then Admin should get Error message in edit user module for invalid text fields
    
    Scenario: Validate Cancel button on Edit popup in edit user module
    Given Admin is on Manage User Page in edit user module
    When Admin clicks Cancel button on edit popup in edit user module
    Then Admin can see the User details popup disappears and can see nothing changed for particular User in edit user module
    