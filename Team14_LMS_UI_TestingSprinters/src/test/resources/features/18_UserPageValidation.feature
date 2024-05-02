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
    
    
    Scenario: Validate landing in User page in user module 
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin should see the "Manage User" in the URL in user module
    
    Scenario: Validate the heading in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin should see a heading with text "Manage user" on the page in user module
    
    Scenario: Validate the text and pagination icon below the data table in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar
    Then Admin should see the text as ""Showing x to y of z entries"" along with Pagination icon below the table, 
    And x- starting record number on that page 
    And y-ending record number on that page 
    And z-Total number of records
    
    Scenario: Validate data table headers in the User Page in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin Should see the data table with column names Id, Name, location, Phone Number, Edit/Delete in user module
    
    Scenario: Validating the default state of Delete button in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin should see a Delete button on the top left hand side as Disabled in user module
    
    Scenario: Validate "+ A New user" button in User Page in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin should be able to see the "+ A New User" button above the data table in user module
    
    Scenario: Validate "+ Assign staff"  button in User page in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin should be able to see the "+ Assign staff" button above the data table in user module for assign staff
    
    Scenario: Validate "+ Assign Student"  button in User page in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin should be able to see the "+ Assign Student" button above the data table in user module for assign student
    
    Scenario: Validate search box in User page in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin should be able to see the search text box above the data table in user module
    
    Scenario: Validate number of data rows in the data table in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Admin should see two records displayed on the data table in user module
    
    Scenario: Verify Check box on the data table in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Each row in the data table should have a checkbox in user module
    
    Scenario: Verify edit icon on the data table in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Each row in the data table should have a edit icon that is enabled in user module
    
    Scenario: Verify  delete icon on the data table in user module
    Given Admin is on dashboard page after Login in user module
    When Admin clicks "User" from navigation bar in user module
    Then Each row in the data table should have a delete icon that is enabled in user module
    
    
    