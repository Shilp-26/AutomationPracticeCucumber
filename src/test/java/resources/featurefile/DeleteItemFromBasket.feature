Feature: Delete item from shopping cart
  As a user I should be able to delete an item from the shopping cart

  Scenario: User should be able to delete an item from shopping cart successfully
    Given There is an item already inside my basket
    When User clicks on Shopping cart
    And User clicks on delete button
    Then User can verify banner message "Your shopping cart is empty."