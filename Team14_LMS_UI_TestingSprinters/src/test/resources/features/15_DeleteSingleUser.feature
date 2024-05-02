Feature: Delete single User

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
       
    Scenario: Validate row level delete icon in delete user module
    Given Admin is on Manage User Page in delete user module
    When Admin clicks the delete icon in delete user module
    Then Admin should see a alert open with heading "Confirm" along with  <YES> and <NO> button for deletion in delete user module
    
    
    Scenario: Click No on deletion window in delete user module
    Given Admin is on Confirm Deletion alert in delete user module
    When Admin clicks  No option in delete user module
    Then Admin can see the deletion alert disappears without deleting in delete user module
  
    Scenario: Click Yes on deletion window in delete user module
    When Admin clicks the delete icon in delete user module
    Given Admin is on Confirm Deletion alert in delete user module
    When Admin clicks yes option in delete user module
    Then Admin gets a message "Successful User Deleted" alert and do not see that user in the data table in delete user module
  
    #Scenario: Validate Close icon on Confirm Deletion alert in delete user module
    #Given Admin is on Confirm Deletion alert in delete user module
    #When Admin clicks on close button in delete user module
    #Then Admin can see the deletion alert disappears without any changes in delete user module
    #
    