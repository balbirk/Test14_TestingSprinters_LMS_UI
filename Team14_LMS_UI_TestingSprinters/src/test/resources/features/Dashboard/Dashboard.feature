  
  Feature: Dashboard Page Validation
 
   Background: Admin gives the correct LMS portal URL
      Given Admin is in Home Page
      When Admin enter valid credentials  and clicks login button 
 
   Scenario: Verify after login  admin lands on manage program as dashboard page
      Then Admin should see manage program as header 
      
   Scenario: Verify the response time
      Then Maximum navigation time in milliseconds, defaults to 30 seconds
      
   Scenario: Verify broken link
      Then HTTP response >= 400. Then the link is broken
   
   Scenario: Verify LMS title 
      Then Admin should see LMS -Learning management system  as title  
       
   Scenario: Verify  LMS title alignment
      Then LMS title should be on the top left corner of page
      
   Scenario: Validate navigation bar text
      Then Admin should see correct spelling in navigation bar text
    
   Scenario: Validate LMS title has correct spelling ang space
      Then Admin should see correct spelling and space in LMS title
      
   Scenario: Validate alignment for navigation bar
      Then Admin should see the navigation bar text on the top right side
      
    Scenario: Validate navigation bar order  1st Program
      Then Admin should see program in the 1st place 
    
    Scenario: Validate navigation bar order  2nd Batch
      Then Admin should see batch in the 2nd place 
      
    Scenario: Validate navigation bar order 3rd User
      Then Admin should see user in the  3rd place
      
    Scenario: Validate navigation bar order 4th Logout 
      Then Admin should see logout in the 4th place
      
      
         
       
      
      
       