# new feature
# Tags: optional

Feature: Shopping
  As a saucedemo user
  I want to add products
  to be able to buy

  Scenario: Shopping
    Given the user is on the main page
    When he buy products from the shopping cart
    Then it should the successful purchase message

  Scenario: Shopping cart empty
    Given the user is on the main page
    When he enters the shopping cart without products
    Then the total must be 0.0