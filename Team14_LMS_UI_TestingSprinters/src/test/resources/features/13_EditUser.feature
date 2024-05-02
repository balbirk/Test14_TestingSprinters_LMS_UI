Feature: Edit User Validation

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
	    
	        
    Scenario: Validate row level edit icon in edit user module
    Given Admin is on Manage User Page in edit user module
    When Admin clicks on the edit icon in edit user module
    Then A new pop up with User details appears in edit user module
    
    Scenario: Validate Cancel button on Edit popup in edit user module
    Given Admin is on Manage User Page in edit user module
    When Admin clicks Cancel button on edit popup in edit user module
    Then Admin can see the User details popup disappears and can see nothing changed for particular User in edit user module
    
    Scenario Outline: Check if the fields are updated with valid data in edit user module
    Given Admin is on Manage User Page in edit user module
    When Admin clicks on the edit icon in edit user module
    When Update the fields with valid data and click submit in edit user module "<sheetName>" and rownumber <rowNumber>
    Then Admin gets message "User updated Successfully " and see the updated values in data table of edit user module
    Examples:
      | sheetName | rowNumber |
	    | EditUser 	|     0     |
    
    Scenario Outline: Check if the fields are updated with invalid values in edit user module
    Given Admin is on Manage User Page in edit user module
    When Admin clicks on the edit icon in edit user module
    When Update the fields with invalid values and click submit in edit user module "<sheetName>" and rownumber <rowNumber>
    Then Admin should get Error message in edit user module for invalid values
    Examples:
      | sheetName | rowNumber |
	    | EditUser 	|     1     |
    
    Scenario Outline: Check if the mandatory fields are updated with valid data in edit user module
    Given Admin is on Manage User Page in edit user module
    When Admin clicks on the edit icon in edit user module
    When Update the mandatory fields with valid values and click submit in edit user module "<sheetName>" and rownumber <rowNumber>
    Then Admin gets message "User updated Successfully " and see the updated values in data table in edit user module
    Examples:
      | sheetName | rowNumber |
	    | EditUser 	|     2     |
    
    
    
    Scenario Outline: Check if the optional fields are updated with valid data
    Given Admin is on Manage User Page in edit user module
    When Admin clicks on the edit icon in edit user module
    When Update the optional fields with valid values and click submit in edit user module "<sheetName>" and rownumber <rowNumber>
    Then Admin gets message "User updated Successfully " and see the updated values in data table in edit user module
    Examples:
      | sheetName | rowNumber |
	    | EditUser 	|     3     |
    
    
    #Scenario Outline: Validate invalid values in the text fields in edit user module
    #Given Admin is on Manage User Page in edit user module
    #When Admin clicks on the edit icon in edit user module
    #When Admin enters only numbers or special char in the text fields in edit user module "<sheetName>" and rownumber <rowNumber> 
    #Then Admin should get Error message in edit user module for invalid text fields
    #Examples:
      #| sheetName | rowNumber |
#	    | EditUser 	|     4     |
#	    
    
    