Feature: Testing Login to the PL site
  

  Scenario: Testing login to the bbc site
    Given user is in home page
    When user clicks Sign in 
    And  user enter user deatils and clicks Sign-in button
    Then user is logged in to the system
    