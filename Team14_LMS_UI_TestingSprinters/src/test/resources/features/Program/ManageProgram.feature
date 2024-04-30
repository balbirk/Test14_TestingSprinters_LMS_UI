Feature: Program Page Validation
Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |
	    
	    @validateBatchTitle
 
  @validateTopLevelMenu
  Scenario: Validate top level menu and UI elements
	Then Admin should verify the UI elements title table header and buttons
    #Then Admin should see the top menu program batch user
    #Then Admin should see Manage Program title
    #Then Admin should see multicheckbox delete button disabled
    #Then Admin should see table header with sort columns
    #Then Admin should see footer and pagination links
  
 
  
 #Scenario: Add new Program
 #Then Admin clicks adding new program by clicking "+ A New Program" button	      

 