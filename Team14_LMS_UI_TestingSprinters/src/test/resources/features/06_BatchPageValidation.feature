Feature: Batch Page Validation

#Background:
#Given : Logged on the LMS portal

Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When : Admin is on the dashboard page after Login
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |



@BatchValidation_01
Scenario: Validate landing in Batch page
When : Admin clicks "Batch" from navigation bar
Then : Admin should see the "batch" in the URL


@BatchValidation_02
Scenario: Validate header in the Batch Page
When : Admin clicks "Batch" from navigation bar
Then : Admin should see the "Manage Batch" in the header.


@BatchValidation_03
Scenario: Validate pagination in the Batch Page
When : Admin clicks "Batch" from navigation bar
Then : Admin should see the pagination controls under the data table

@BatchValidation_04
Scenario: Validate data table headers in the Batch Page
When : Admin clicks "Batch" from navigation bar
Then : Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete

@BatchValidation_05
Scenario: Validate Delete button in Batch Page
When : Admin clicks "Batch" from navigation bar
Then : Admin should be able to see the "Delete" icon button that is disabled


@BatchValidation_06
Scenario: Validate "+ A New batch" in Batch Page
When : Admin clicks "Batch" from navigation bar
Then : Admin should be able to see the "A New Batch" button

@BatchValidation_07
Scenario: Validate checkbox in data rows
When : Admin clicks "Batch" from navigation bar
Then : Each row in the data table should have a checkbox


@BatchValidation_08
Scenario: Validate edit icon in data rows
When : Admin clicks "Batch" from navigation bar
Then : Each row in the data table should have a edit icon that is enabled


@BatchValidation_09
Scenario: Validate delete icon in data rows
When : Admin clicks "Batch" from navigation bar
Then : Each row in the data table should have a delete icon that is enabled	


@BatchValidation_10
Scenario: Validate pop up for adding batch
When : Admin clicks "+ A New Batch" button in manage batch page
Then : A new pop up with Batch details appears


























