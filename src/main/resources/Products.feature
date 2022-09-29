Feature: To search and verify the product in amazon site
Background: Login amazon page
   Given user launch the Amazon website
   And User should click the signIn Link
   When User Enter the UserName "9976188853" in input field
   And User click on the sign in button and its navigate to password page
   And User Enter the password "9788188673" in input field
   Then User click on the login button and its navigate to my account page
   
   @TestIkigaibook
    Scenario Outline: User Searching ikigai book 
    When user click on the categories drop down and user select on the book option 
    And user enter the "<Bookname>" on search box
    And user click the search button 
    And user select  the ikigai book 
    Then user click on  add to cart button and It Navigate to add to cart page
    And User click on log out buttons
    
     Examples: 
      | Bookname| 
      | ikigai |  
    
    @TestUnavailabilty
    Scenario: User enters invalid book name in search box and get unavailability 
    When user enter the ikgi on search box
    And user click on search button
    Then user verify the book and get unavailability message 