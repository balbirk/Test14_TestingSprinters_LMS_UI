Feature: Sort User Validation

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
    