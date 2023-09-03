Feature: Test login functionality

  Scenario: Check login is succssful with valid credentials
  Given browser is open
  And user is on login page
  When user enters username and password
  And user click on login button
  Then user is navigate to the home page
  
 

 

 