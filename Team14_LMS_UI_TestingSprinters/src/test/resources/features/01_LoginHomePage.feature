@Loginpage
Feature: LMS Login Page Verification
  						LMS login page verification with valid and invalid test data set

  @tag1
  Scenario: Verify admin is able to land on home page
    Given Admin launch the browser for login page
    When Admin gives the correct LMS portal URL for login page
    Then Admin should land on the home page

  @tag2
  Scenario: Verify for broken link
  Then HTTP response >= 400 and  the link is broken
  
  @tag3
  Scenario: Verify the text spelling in the page
    Then Admin should see correct spellings in all fields on login page

  @tag4
  Scenario: Verify the company logo
    Then Admin should see logo on the left  side on login page

  #@tag5
  #Scenario: Verify application name
    #Then Admin should see  LMS - Learning Management System on login page

  @tag6
  Scenario: Verify company name
    Then Admin should see company name below the app name on login page

  @tag7
  Scenario: Validate sign in content
    Then Admin should see "Please login to LMS application" on login page

  @tag8
  Scenario: Verify text field is present
    Then Admin should see two text field on login page

  @tag9
  Scenario: Verify text on the first text field
    Then Admin should see "user" in the first text field on login page

  @tag10
  Scenario: Verify asterik next to user text
    Then Admin should see * symbol next to user text on login page

  @tag11
  Scenario: Verify text on the second text field
    Then Admin should "password" in the second text field on login page

  @tag12
  Scenario: Verify asterik next to password text
    Then Admin should see * symbol next to password text on login page

  @tag13
  Scenario: Verify the alignment input field for the login
    Then Admin should see input field on the centre on button

  @tag14
  Scenario: verify Login button is present
    Then Admin should see Login button on login page

  @tag15
  Scenario: Verify the alignment of the login button
    Then Admin should see login button on the centre of the login page

  @tag16
  Scenario: Verify input descriptive test in user field
    Then Admin should see user in gray color on login page

  @tag17
  Scenario: Verify input descriptive test in password field
    Then Admin should see password in gray color on login page


 
 Scenario Outline: Validate login with invalid credentials
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then Error message please check username/password on login page
     Examples:
      | sheetName | rowNumber |
	    | LoginPage | 3      |


  @tag19
  Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |   
	   
	   
