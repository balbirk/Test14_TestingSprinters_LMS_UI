Feature: Delete multiple Users by selecting multiple checkboxes

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module
		And Admin clicks delete button under header after selecting multiple checkboxes in the data table
		
    Scenario: Validate multiple program deletion by selecting multiple check boxes in delete multiple user
    Given Admin is on Confirm Deletion alert in delete multiple user module for multiple users
    When Admin clicks <YES> button on the alert in delete multiple user for multiple users
    Then Admin should land on Manage User page and can see the selected users are deleted from the data tableA

    Scenario: Cancel multiple users deletion by selecting multiple checkboxes in delete multiple users
    Given Admin is on Confirm Deletion alert in delete multiple user module for a multiple user
    When Admin clicks <No> button on the alert in delete multiple user for multiple users
    Then Admin should land on Manage User page and can see the selected users are not deleted from the data table
    
    