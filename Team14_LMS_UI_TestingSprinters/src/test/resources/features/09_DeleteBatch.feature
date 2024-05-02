Feature: Delete Batch

Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When : Admin is on dashboard page after Login and admin clicks on the "Batch" from navigation bar
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |


@Delete_batch_01
Scenario: Validate row level delete icon
Given : The delete icon on row level in data table is enabled
When : The Admin clicks the delete icon in  Manage batch page
Then : Alert appears with yes and No option in manage batch page

@Delete_batch_02
Scenario: Validate accept alert
#Given : Admin clicks the delete icon in manage Batch page
When : You click yes option for the alert in manage batch Page
Then : Batch deleted alert pops and batch is no more available in data table

@Delete_batch_03
Scenario: Validate reject alert
Given : Admin clicks the delete icon in the manage batch page
When : you click No option for the alert in manage batch page
Then : Batch is still listed in data table



