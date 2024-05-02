
@tag
Feature: Edit Program
  I want to use this template for my feature file
 
 
Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page
    Examples:
      | sheetName | rowNumber |
	    | LoginPage | 0       |
	      
#@Admin_Login
#Scenario: Admin login and land to Manage Program Page
#Given Admin is logged-in to the LMS Web Application. 
#When Admin clicks Program module on Navigation bar.
#Then Admin should be on the Manage Program page.



@Delete_Program_Feature
Scenario: Validate the delete scenario
Given Admin is On the Manage Program Page and select single Program to delete
When Admin clicks Delete button on the data table for any row
Then Admin should see a alert open with heading "Confirm" along with YES and NO button for deletion

@Confirm_Program_Deletion_window_Validation
Scenario: Validate details for Confirm Deletion form
Given Admin is On the Manage Program Page
When Admin clicks Delete button on the data table for any row
Then Admin should see a message "Are you sure you want to delete" <Program name>"?"



@Deletion_Window_No_Button
Scenario: Admin click No button on Program Deletion window
Given Admin is on Confirm Deletion alert
When Admin clicks NO button on the deletion alert
Then Admin can see the deletion alert disappears without deleting

@Deletion_Window_Close(X)_Icon
Scenario: Admin click close(X) button on Program Deletion window
Given Admin is on Confirm Deletion alert
When Admin clicks Close(X) Icon on Deletion alert
Then Admin can see the deletion alert disappears without any changes

@Deletion_Window_Yes_Button
Scenario: Admin click yes button on Program Deletion window
Given Admin is on Confirm Deletion alert
When Admin clicks YES button on the deletion alert
Then Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table

@Multiple_Delete_Button_Enabled
Scenario: Validate Common Delete button enabled after clicking on any checkbox
Given Admin is On the Manage Program Page
When Admin clicks any checkbox in front of targeted Prgram Name
Then Admin should see common delete option enabled under header Manage Program

@Multiple_Program_Deletion_By_Single_Checkbox_Click_No
Scenario: Validate multiple program deletion by selecting Single checkbox with No Option
Given Admin is on Confirm DeleteAll alert
When Admin clicks No button on the alert
Then Admin should land on Manage Program page and can see the selected program is not deleted from the data table

@Multiple_Program_Deletion_By_Single_Checkbox_Click_Yes
Scenario: Validate multiple program deletion by selecting checkbox with Yes Option
Given Admin is on Confirm DeleteAll alert
When Admin clicks YES button on the alert
Then Admin should land on Manage Program page and can see the selected program is deleted from the data table



@Multiple_Program_Deletion_By_Multiple_Checkbox_Click_Yes
Scenario: Validate multiple program deletion by selecting multiple check boxes with Yes Option
Given Admin is on Confirm DeleteAll alert
When Admin clicks YES button on the alert
Then Admin should land on Manage Program page and can see the selected programs are deleted from the data table

@Multiple_Program_Deletion_By_Multiple_Checkbox_Click_No
Scenario: Validate multiple program deletion by selecting multiple check boxes with No Option
Given Admin is on Confirm DeleteAll alert
When Admin clicks No button on the alert
Then Admin should land on Manage Program page and can see the selected programs are not deleted from the data table  

@Sort_ProgramName_Assending
Scenario: Validate Program name sorting in assending order
Given Admin is On the Manage Program Page
When Admin clicks the sort icon of program name column
Then The data get sorted on the table based on the program name column values in ascending order

@Sort_ProgramName_Descending
Scenario: Validate Program name sorting in descending order
Given The data is in the ascending order on the table based on Program Name column
When Admin clicks the sort icon of program name column
Then The data get sorted on the table based on the program name column values in descending order

@Sort_ProgramDescription_Assending
Scenario: Validate Program Description sorting in assending order
Given Admin is On the Manage Program Page
When Admin clicks the sort icon of program Description column
Then The data get sorted on the table based on the program Description column values in ascending order

@Sort_ProgramDescription_Descending
Scenario: Validate Program Description sorting in descending order
Given The data is in the ascending order on the table based on Program Description column
When Admin clicks the sort icon of program Description column
Then The data get sorted on the table based on the program Description column values in descending order



 
 