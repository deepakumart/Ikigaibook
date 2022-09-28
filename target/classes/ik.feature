Feature: To search for the ikigai book in amazon site
 Background: Login amazon page
   Given user launch the Amazon website
   When User Enter the UserName "9976188853" 
   And User click on the sign in button and its navigate to password page
   And User Enter the password "9788188673"
   Then User click on the login button and its navigate to my account page
   
   @TestUserName 
   Scenario Outline: Validate Username in Login page
    When User click on signout buttons
    And User Enters the Username "<UserName>"
    And User clicks on the sign in button and its navigate to password page
   
    Examples:
      |UserName|
      |99761888|
      |99761889|
      |9976188853|
    
    @TestUserpassword @reg
    Scenario Outline: Validate password in Login page 
    When User click on signout button in the signout field
    And User Enter the valid Usernames "username" 
    And User clicks on the signin button and its navigates to password page
    And User Enters the passwords "password"
    Then User click on  login button and its navigates to my account page
   
      Examples:
      |password|
      |97881886|
      |9788188|
      |9788188673|
    
    @TestIkigaibook @reg
    Scenario: User Searching ikigai book 
    When user click on the categories drop down and user select on the book option 
    And user enter the ikigai on search box
    And user click the search button 
    And user select  the ikigai book 
    Then user click on  add to cart button and It Navigate to add to cart page
    And User click on log out buttons
    
    @TestUnavailabilty
    Scenario:User enters invalid book name in search box and get unavailability 
    When user enter the ikgi on search box
    And user click on search button
    Then user verify the book and get unavailability message 