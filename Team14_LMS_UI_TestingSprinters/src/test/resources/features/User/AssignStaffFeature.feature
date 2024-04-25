Feature: Assign Staff Feature

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module 
		And User clicks on Assign Staff link
		
	Scenario:  Empty Form Submission in assign staff module
	Given Admin is in Assign staff details pop up page in assign staff module
	When Admin clicks "Save" button with entering any data in assign staff module
	Then Admin gets a Error message alert in assign staff module
	
	Scenario: Validate the Assign staff form page without giving staff Email id in assign staff module
	Given Admin is in Assign staff details pop up page in assign staff module
	When Admin clicks "Save" button without entering staff Email id in assign staff module
	Then Admin gets a Error message alert as "staff Email id is required" in assign staff module
	
	Scenario: Validate the Assign staff form page without selecting Program in assign staff module
	Given Admin is in Assign staff details pop up page in assign staff module
	When Admin clicks "Save" button without selecting program in assign staff module
	Then Admin gets a Error message alert as "Program is required" in assign staff module
	
	Scenario: Validate the Assign staff form page without selecting batch in assign staff module
	Given Admin is in Assign staff details pop up page in assign staff module
	When Admin clicks "Save" button without selecting batch in assign staff module
	Then Admin gets a Error message alert as "Batch is required" in assign staff module
	
	Scenario: Validate the Assign staff form page without giving Status in assign staff module
	Given Admin is in Assign staff details pop up page in assign staff module
	When Admin clicks "Save" button without giving status in assign staff module
	Then Admin gets a Error message alert as "Status is required" in assign staff module
	
	Scenario: Validate Cancel/Close(X) icon on Assign staff form in assign staff module
	Given Admin is in Assign staff details pop up page in assign staff module
	When Admin clicks Cancel/Close(X) Icon on Assign staff form in assign staff module
	Then Assign staff popup window should be closed without saving in assign staff module
	
	Scenario: Validate Save button on Assign staff form in assign staff module
	Given Admin is in Assign staff details pop up page in assign staff module
	When Enter all the required fields with valid values and click Save button in assign staff module
	Then Admin gets a message "Successfully staff Assigned" alert in assign staff module
	
	Scenario: Validate Cancel button on Assign staff form in assign staff module
	Given Admin is in Assign staff details pop up page in assign staff module
	When Admin clicks <Cancel> button in assign staff module in assign staff module
	Then Admin can see the Assign staff popup disappears without assigning in assign staff module
	
