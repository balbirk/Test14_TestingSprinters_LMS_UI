Feature: Edit Batch

 Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When : Admin is on dashboard page after Login and admin clicks on the "Batch" from navigation bar
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |

@Edit_batch_01
Scenario: Validate row level edit icon
Given : The edit icon on row level in data table is enabled
When : Admin clicks the edit icon
Then : A new pop up with Batch details appears in Edit screen

@Edit_batch_02
Scenario:  Check if the update throws error with invalid values
Given : Admit clicks on Edit button in Manage Batch Page
And  : Admin updates batchname 
Then : Error message appears after updating

 
@Edit_batch_03
Scenario: Check if the description is updated
Given : Admit clicks on Edit button in Manage Batch Page
And  : Admin updates batch description  
Then : Success Message appears after updating

