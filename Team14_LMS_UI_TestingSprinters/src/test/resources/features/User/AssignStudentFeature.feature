Feature: Assign Student Dialog

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module 
		And User clicks on Assign Student link
		 
		
	Scenario:  Empty Form Submission in assign student module
	Given Admin is in Assign Student details pop up page in assign student module
	When Admin clicks "Save" button with entering any data in assign student module
	Then Admin gets a Error message alert in assign student module
	
	Scenario: Validate the Assign Student form page without giving Student Email id in assign student module
	Given Admin is in Assign Student details pop up page in assign student module
	When Admin clicks "Save" button without entering Student Email id in assign student module
	Then Admin gets a Error message alert as "Student Email id is required" in assign student module
	
	Scenario: Validate the Assign Student form page without selecting Program in assign student module
	Given Admin is in Assign Student details pop up page in assign student module
	When Admin clicks "Save" button without selecting program in assign student module
	Then Admin gets a Error message alert as "Program is required" in assign student module
	
	Scenario: Validate the Assign Student form page without selecting batch in assign student module
	Given Admin is in Assign Student details pop up page in assign student module
	When Admin clicks "Save" button without selecting batch in assign student module
	Then Admin gets a Error message alert as "Batch is required" in assign student module
	
	Scenario: Validate the Assign Student form page without giving Status in assign student module
	Given Admin is in Assign Student details pop up page in assign student module
	When Admin clicks "Save" button without giving status in assign student module
	Then Admin gets a Error message alert as "Status is required" in assign student module
	
	Scenario: Validate Cancel/Close(X) icon on Assign Student form in assign student module
	Given Admin is in Assign Student details pop up page in assign student module
	When Admin clicks Cancel/Close(X) Icon on Assign Student form in assign student module
	Then Assign Student popup window should be closed without saving in assign student module
	
	Scenario: Validate Save button on Assign Student form in assign student module
	Given Admin is in Assign Student details pop up page in assign student module
	When Enter all the required fields with valid values and click Save button in assign student module
	Then Admin gets a message "Successfully Student Assigned" alert in assign student module
	
	Scenario: Validate Cancel button on Assign Student form in assign student module
	Given Admin is in Assign Student details pop up page in assign student module
	When Admin clicks <Cancel> button in assign student module in assign student module
	Then Admin can see the Assign Student popup disappears without assigning in assign student module
	
	