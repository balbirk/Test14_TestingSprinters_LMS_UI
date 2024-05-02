
 @LogoutPage
Feature: Logout function Validation 

#Background: Admin  is in dashboard page after logged in

Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
  
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |

Scenario: Verify Logout button function
   Given Admin is in dashboard page
   When Admin click Logout button on navigation bar
   Then Admin should land on login in page