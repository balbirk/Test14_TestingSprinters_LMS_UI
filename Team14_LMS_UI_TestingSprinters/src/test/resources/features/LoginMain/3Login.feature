@signin
Feature: Validating Login page

     #@signin1
  #Scenario: User login with empty username and valid password
    #Given The user is on signin page
    #When The user clicks Login with empty username "" and valid password "sitaraman"
    #Then It should display an error message "Please fill out this field." below Username textbox


     #@signin2
  #Scenario: User login with valid username and empty password
    #Given The user is on signin page
    #When The user clicks Login with username "Sarishshital" and empty password ""
    #Then It should display an error message "Please fill out this field." below Password textbox
#
#
     #@signin3
  #Scenario: User login with invalid username and invalid password 
    #Given The user is on signin page
    #When The user clicks Login with invalid username "lkjhasdf" and invalid password "qpowierur"
    #Then It will display an error message "Invalid Username and Password" 
  #
      #
     #@signin4
  #Scenario: User login with valid username and invalid password
    #Given The user is on signin page
    #When The user clicks Login with valid username "Sarishshital" and invalid password "sjdhfsjkh"
    #Then It should display an error message "Please check your password." password not valid 
#
      #
     @signin5
  Scenario: User login with valid username and valid password
    Given The user is on signin page
    When The user clicks Login with valid username  "sdetorganizers@gmail.com" and valid password "UIHackathon@02"
    Then It should display "You are logged in" message with username in top right corner   

      
     #@signin6
  #Scenario: Sign-Out scenario
    #Given The user is logged in
    #When The user clicks on Sign-Out link
    #Then The user gets the message "Logged out successfully"
      #
      
      
      
      