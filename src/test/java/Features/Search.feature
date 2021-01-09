Feature:  SearchFeature
  This feature validates that the search is working and intereacts with results
  Scenario: Go to the microsoft page and search for visual studio
    Given I go to the search
    And I search for visual studio
    And I Store the price of the first 3 items in a list
    And I save the first price
    And I click on the first one to go to the details page
    Then I should validate both prices are the same

    Scenario: Add items to the cart
      Given I click on add to cart
      And I verify al 3 price amount are the same
      And on the number of items drop down select
      Then I verify the total amount is a unit price

