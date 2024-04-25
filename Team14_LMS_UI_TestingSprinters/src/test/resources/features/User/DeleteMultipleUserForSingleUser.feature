Feature: Delete multiple Users checkbox for a single user

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module
		And Admin clicks delete button under header after selecting the check box in the data table
		
    Scenario: Validate multiple users deletion by selecting Single checkbox in delete multiple user
    Given Admin is on Confirm Deletion alert in delete multiple user module for a single user
    When Admin clicks <YES> button on the alert in delete multiple user for a single user
    Then Admin should land on Manage User page and can see the selected user is deleted from the data table

    Scenario: Cancel multiple users deletion by selecting Single checkbox in delete multiple user
    Given Admin is on Confirm Deletion alert in delete multiple user module for a single user
    When Admin clicks <No> button on the alert in delete multiple user for a single user
    Then Admin should land on Manage User page and can see the selected user is not deleted from the data table
    
    