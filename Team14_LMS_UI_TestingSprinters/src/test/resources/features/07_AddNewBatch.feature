Feature: Add new Batch


Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    When : Admin is on dashboard page after Login and admin clicks on the "Batch" from navigation bar
    And : Admin clicks "+ A New Batch" button
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |

@Add_Batch_01
Scenario: Check if the fields exist in pop up
Given : A new pop up with Batch details appears on screen
Then : The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down, Status as radio button, Number of classes as text box

@Add_Batch_02
Scenario Outline: Check if description is optional
Given : A new pop up with Batch details appears on screen
When : Admin enters sheetname "<sheetName>" and rownumber <rowNumber> for batch details
Then : Admin enters batchname "<Name>" and description "<Description>" and Programname "<Program Name>" and status "<Status>" and Number of classes "<Number of Classes>" and Expected Message "<Expected Message>"
And : Click on save
Then : The newly added batch should be present in the data table in Manage Batch page

Examples:
		|sheetName | rowNumber|
		|Batch_data|0					|
		
@Add_Batch_03
Scenario Outline: Check if the program details are added in data table
Given : Admin clicks on Add New batch and new pop up with Batch details appears
When : Admin enters sheetname "<sheetName>" and rownumber <rowNumber> for batch details
Then : Admin enters batchname "<Name>" and description "<Description>" and Programname "<Program Name>" and status "<Status>" and Number of classes "<Number of Classes>" and Expected Message "<Expected Message>"
And : Click on save
Then : The newly added batch should be present in the data table in the Manage Batch page

Examples:
		|sheetName | rowNumber|
		|Batch_data|1					|

		
@Add_Batch_04

Scenario Outline: Check for error messages for invalid fields
Given : Admin clicks on Add New batch and new pop up with Batch details appears
When : Admin enters sheetname "<sheetName>" and rownumber <rowNumber> for batch details
Then : Admin enters batchname "<Name>" and description "<Description>" and Programname "<Program Name>" and status "<Status>" and Number of classes "<Number of Classes>" and Expected Message "<Expected Message>"
And : Click on save
Then : Error message should appear

Examples:
		|sheetName | rowNumber|
		|Batch_data|2					|

@Add_Batch_05
Scenario Outline: Any of the mandatory fields are blank
Given : Admin clicks on Add New batch and new pop up with Batch details appears
When : Admin enters sheetname "<sheetName>" and rownumber <rowNumber> for batch details
Then : Admin enters batchname "<Name>" and description "<Description>" and Programname "<Program Name>" and status "<Status>" and Number of classes "<Number of Classes>" and Expected Message "<Expected Message>"
And : Click on save
Then : Error message should appear

Examples:

		|sheetName | rowNumber|
		|Batch_data|3					|
		|Batch_data|5					|

@Add_Batch_06
Scenario Outline: Programme name as blank
Given : Admin clicks on Add New batch and new pop up with Batch details appears
When : Admin enters sheetname "<sheetName>" and rownumber <rowNumber> for batch details
Then : Admin enters batchname "<Name>" and description "<Description>" and Programname "<Program Name>" as null and status "<Status>" and Number of classes "<Number of Classes>" and Expected Message "<Expected Message>"
And : Click on save
Then : Error message should appear

Examples:

		|sheetName | rowNumber|
		|Batch_data|6					|


@Add_Batch_07
Scenario Outline: Status as blank
Given : Admin clicks on Add New batch and new pop up with Batch details appears
When : Admin enters sheetname "<sheetName>" and rownumber <rowNumber> for batch details
Then : Admin enters batchname "<Name>" and description "<Description>" and Programname "<Program Name>"  and status "<Status>" as null and Number of classes "<Number of Classes>" and Expected Message "<Expected Message>"
And : Click on save
Then : Error message should appear

Examples:

		|sheetName | rowNumber|
		|Batch_data|7 				|
	





		



