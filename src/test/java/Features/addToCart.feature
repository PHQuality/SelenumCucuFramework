Feature: validate Shopping cart
  

  Scenario: User validate adding summer dress to shopping cart
    Given user is at the home page
    When user selects Dresses tab
    And  user selects "Summer Dresses"tab
    And user selects "1" dress item
    And user clicks add to cart button
    And user clicks proceed to checkout button 
    And user clicks proceed to checkout button on cart summary page
    Then authenticaion page is displayed
    
    
    