Feature: Assign Student

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module 
	
	Scenario: Validate Assign Student Popup window in assign student module
	Given Admin is in manage user page in assign student module
	When Admin clicks "Assign Student" button in assign student module
	Then Admin should see a pop up open for assign student details with empty form along with Save and Cancel button and close (X) icon on the top right corner of the window
	
	Scenario: Validate input fields and their text boxes in Assign Student form in assign student module
	Given Admin is in manage user page in assign student module
	When Admin clicks "Assign Student" button in assign student module
	Then Admin should see User Role as R03,and other fields Student Email id,Program Name,Batch Name and Status with respective input boxes
	
	Scenario: Validate Dropdown in Assign Student Form in assign student module
	Given Admin is in manage user page in assign student module
	When Admin clicks "Assign Student" button in assign student module
	Then Admin should see drop down boxes with valid datas for Student Email id,Program Name and Batch Name in assign student module
	
	Scenario: Validate radio button in Assign Student Form in assign student module
	Given Admin is in manage user page in assign student module
	When Admin clicks "Assign Student" button in assign student module
	Then Admin should see two radio button for Status in assign student module
	
	