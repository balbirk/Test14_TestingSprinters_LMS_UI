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
    Then Admin clicks "+ A New Program" button

  @validateProgramPopUPWindow
  Scenario: Validate Program Details Popup window
    Then The pop up should include fields like program Name Description Status
    Then Admin cancels the pop up

  @ValidateCloseIcon
  Scenario: Validate Close icon on Program Details form
   Then Admin clicks "+ A New Program" button
    When Admin clicks Close Icon on Program Details form
    Then Program Details popup window should be closed without saving


  @EnterOnlyProgramName
  Scenario Outline: Enter only Program Name
    Then Admin clicks "+ A New Program" button
    When Admin clicks Save button after entering only program name "<KeyOption>" and "<Sheetname>"
    Then Admin gets a message alert for program mandatory field 'Description is required'
    Then Admin cancels the pop up

    Examples: 
      | KeyOption                      | Sheetname   |
      | Empty_form_submission          | Add Program |
      | Enter_only_Program_Name        | Add Program |
      | Enter_only_Program_Description | Add Program |
      | Select_Status_only             | Add Program |

  @SaveValidData
  Scenario: Save valid program details
  	Then Admin clicks "+ A New Program" button
    When Admin clicks Save button after entering all the valid details "Save_Valid_Program_Data" and "Add Program"

    
   @SearchByNewlyCreatedProgram 
  Scenario: Search Program by Newly Created Program Name
    When Admin searches by newly created program name
  
   #@EmptyFormSubmission
  #Scenario: Empty program details form submission
  #When Admin clicks Save button on program details without entering any data
  #Then Admin gets a Error message alert for program fields
  
#
  #@EnterOnlyProgramStatus
  #Scenario Outline: Select Status only
    #When Admin clicks Save button after entering only program status "<KeyOption>" and "<Sheetname>"
    #Then Admin gets a message alert for program mandatory field 'Name and Description required'
#
    #Examples: 
      #| KeyOption              | Sheetname      |
      #| EnterOnlyProgramStatus | programDetails |
#
  #@ValidateInvalidValuesInColumn
  #Scenario Outline: Validate invalid values on the text column
    #When Admin enters only numbers or special char in name and desc column on program details "<KeyOption>" and "<Sheetname>"
    #Then Admin gets a Error message alert for program fields
#
    #Examples: 
      #| KeyOption             | Sheetname      |
      #| InvalidProgramDetails | programDetails |
#
#
  #@ValidateCancelIcon
  #Scenario: Validate Cancel icon on Program Details form
    #When Admin clicks Cancel Icon on Program Details form
    #Then Program Details popup window should be closed without saving
#
  #@EnterAllValidData
  #Scenario Outline: Validate Save button on Program Details form
    #When Enter all the required fields with valid values and click Save button "<KeyOption>" and "<Sheetname>"
    #Then Admin gets a message "Successful Program Created" alert and able to see the new program added in the data table
#
    #Examples: 
      #| KeyOption           | Sheetname      |
      #| ValidProgramDetails | programDetails |
