Feature: Add New Program

  Scenario: Validate Program Details Popup window
    Given Admin is on Manage Program Page
    When Admin clicks <A New Program>button
    Then Admin should see a popup open for Program details with empty form
    And  <SAVE> button
    And <CANCEL> button 
		And Close(X) Icon on the top right corner of the window
    