Feature: Program Page Validation

Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When Admin clicks "User" from navigation bar
    
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |
	    
Scenario: Add User 
    Then Admin clicks "+ A New User" button
