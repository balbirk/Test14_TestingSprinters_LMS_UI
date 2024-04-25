Feature: Sort User Validation

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module
    
    Scenario: Sort user by id in sort user module
    Given Admin is on Manage User Page in sort user module
    When Admin clicks on ID sort icon in sort user module
    Then Admin should see User details are sorted by id in sort user module
    
    Scenario: Sort user by name in sort user module
    Given Admin is on Manage User Page in sort user module
    When Admin clicks on name sort icon in sort user module
    Then Admin should see User details are sorted by name in sort user module
    
    Scenario: Sort user by Location in sort user module
    Given Admin is on Manage User Page in sort user module
    When Admin clicks on Location sort icon in sort user module
    Then Admin should see User details are sorted by Location in sort user module
    
    Scenario: Sort user by Phone number in sort user module
    Given Admin is on Manage User Page in sort user module
    When Admin clicks on Phone number sort icon in sort user module
    Then Admin should see User details are sorted by Phone number in sort user module
    