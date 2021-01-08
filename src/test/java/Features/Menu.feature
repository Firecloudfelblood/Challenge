Feature: ValidateMenu
  This feature validates that al menu items are present and working
  Scenario: Go to the microsoft page and check menu items
    Given I navigate to the microsoft page
    And I should see the menu items
    Then I should validate all menu items are in there
      | items   |
      | Office  |
      | Windows |
      | Surface |
      | Xbox    |
      | Deals   |
      | Support |

    Scenario: Go to windows page and print dropdon menu
      Given I click on the windows link
      And I see the windows page
      And I click on the windows10 menu
      Then I print all the elements from the drop down menu
