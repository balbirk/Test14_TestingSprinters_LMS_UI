Feature: Delete multiple Users

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
    
    Scenario: Validate Common Delete button enabled after clicking on any checkbox in delete users module
    Given Admin is in Manage User page in multiple user delete module
    When Admin clicks any checkbox in the data table in multiple user delete module
    Then Admin should see common delete option enabled under header Manage Program in multiple user delete module
    