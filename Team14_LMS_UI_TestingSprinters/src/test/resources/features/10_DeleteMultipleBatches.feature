Feature: Delete multiple batches 

#Background:
#Given : Logged on the LMS portal
#When : Admin is on dashboard page after Login and admin clicks on the "Batch" from navigation bar

 Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When : Admin is on dashboard page after Login and admin clicks on the "Batch" from navigation bar
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |
	    
@Delete_multiple_batches_01
Scenario: Validate the delete icon below the header 
Given : None of the checkboxes in data table are selected in manage batch page
Then : The delete icon under the "Manage Batch" header should be disabled


@Delete_multiple_batches_02
Scenario: Check for single row delete
Given : One of the checkbox row is selected in manage batch page
When : Click delete icon below "Manage Batch" header in manage batch page
Then : The respective row in the data table is deleted in manage batch page


@Delete_multiple_batches_03
Scenario: Check for multi row delete
Given : Two or more checkboxes row is selected
When : Click delete icon below "Manage Batch" header in manage batch page
Then : The respective row in the data table is deleted in manage batch page






