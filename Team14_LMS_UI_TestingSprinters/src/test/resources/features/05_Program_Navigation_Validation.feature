
@ProgramNavigationBar
Feature: Verify Program page navigationbar

  #Background: Admin is on dashboard page after Login 
#Given Admin is on Manage Program page
             #When clicks Program on the navigation bar
             
    Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
  
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |
      
  
  @BatchLink
  Scenario: Batch link on navigation bar
   # Given Admin is on Manage Program page
    When Admin clicks on Batch link on Manage Program page
    Then Admin is re-directed to Batch page
  
  
#
  #@UserLink
  #Scenario: User link on navigation bar
   # Given Admin is on Manage Program page
    #When Admin clicks on User link on Manage Program page
    #Then Admin is re-directed to User page
    #
  #@LogoutLink
  #Scenario: Logout link on navigation bar
    #Given Admin is on Manage Program page
    #When Admin clicks on Logout link on Manage Program page
    #Then Admin is re-directed to Login page
    #
    