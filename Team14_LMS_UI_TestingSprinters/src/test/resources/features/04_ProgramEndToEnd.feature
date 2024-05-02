@AddNewProgram
Feature: Add New Program

  Scenario Outline: Validate login with valid credentials
    Given Admin is in Home Page
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to DashBoard Page

    Examples: 
      | sheetName | rowNumber |
      | LoginPage |         0 |

  Scenario: Add User
   Then Admin clicks "+ A New Program" new Program button

  @validateProgramPopUPWindow
  Scenario: Validate Program Details Popup window
    Then The pop up should include fields like program Name Description Status
    Then Admin cancels the pop up

  @ValidateCloseIcon
  Scenario: Validate Close icon on Program Details form
    Then Admin clicks "+ A New Program" new Program button
    When Admin clicks Close Icon on Program Details form
    Then Program Details popup window should be closed without saving

  @EnterOnlyProgramName
  Scenario Outline: Enter only Program Name
    Then Admin clicks "+ A New Program" new Program button
    When Admin clicks Save button after entering only program name "<KeyOption>" and "<Sheetname>"
    Then Admin gets a message alert for program mandatory field 'Description is required'
    Then Admin cancels the pop up

    Examples: 
      | KeyOption                      | Sheetname   |
      | Empty_form_submission          | Add Program | 
      | Enter_only_Program_Name        | Add Program |
      | Enter_only_Program_Description | Add Program |
      | Select_Status_only             | Add Program |

  @AddNewlyCreatedProgram
  Scenario: Save valid program details
    Then Admin clicks "+ A New Program" new Program button
    When Admin clicks Save button after entering all the valid details "Save_Valid_Program_Data" and "Add Program"

  @SearchByNewlyCreatedProgram
  Scenario: Search Program by Newly Created Program Name
    When Admin searches by newly created program name
    
   @EditNewlyCreatedProgram
  Scenario: Edit Newly Created Program Name
    When Admin clicks edit button to update program name
    When Admin clicks Save button after editing description
    When Admin searches by newly created program name
    
   @DeleteNewlyCreatedProgram
  Scenario: delete Newly Created Program Name
    When Admin clicks delete button to delete program name
    When Admin searches by deleted program name
    
