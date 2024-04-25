Feature: Delete multiple Users

Background: Admin is on dashboard page after Login and clicks User on the navigation bar
	  Given The user opens LMS portal link
    When The user enters userid and password, user clicks "login" button
    Then The user should be redirected to manage program page
    And user clicks on User link in user module
    Then User should be redirected to User page in user module

    Scenario: Validate Common Delete button enabled after clicking on any checkbox in delete users module
    Given Admin is in Manage User page in multiple user delete module
    When Admin clicks any checkbox in the data table in multiple user delete module
    Then Admin should see common delete option enabled under header Manage Program in multiple user delete module
    