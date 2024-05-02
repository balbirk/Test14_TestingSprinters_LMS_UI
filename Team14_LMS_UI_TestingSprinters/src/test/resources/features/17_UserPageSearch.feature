Feature: User Page Validation

	Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When Admin clicks "User" from navigation bar
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |
	      
	      
	  Scenario: search user by name in user module in search
    Given Admin is on Manage User Page in user module in search
    When Admin enters "user name" into search box in user module in search
    Then Admin should see user displayed with the entered name in user module in search
    
    Scenario: Validating the Search with unrelated keyword in user module in search
    Given Admin is on Manage User Page in user module in search
    When Admin enters the "keywords not present" in the data table on the Search box in user module in search
    Then Admin should see zero entries on the data table in user module in search
    