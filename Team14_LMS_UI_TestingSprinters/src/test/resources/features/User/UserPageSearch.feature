Feature: User Page Validation

	Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module
    
    Scenario: search user by name in user module
    Given Admin is on Manage User Page in user module
    When Admin enters user name into search box in user module
    Then Admin should see user displayed with the entered name in user module
    
    Scenario: Validating the Search with unrelated keyword in user module
    Given Admin is on Manage User Page in user module
    When Admin enters the keywords not present in the data table on the Search box in user module
    Then Admin should see zero entries on the data table in user module
    

 