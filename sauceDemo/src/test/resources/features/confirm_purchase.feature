@Tag
Feature: As a user certification in Sauce Demo cart page
  i need confirm purchase

  Background:
    Given the user enter to the web page to confirm purchase


  @successfulPurchase
  Scenario: confirm purchase successful standard user
    Given log in to confirm purchase standard user
    And the user adds products in the shopping cart to confirm purchase
    And the user enter the info to confirm purchase
    When the user ends the purchase
    Then the user can see the order complete

  @ConfirmPurchaseWithPerformanceGlitchUser
  Scenario: confirm purchase successful with performance glitch user
    Given log in to confirm purchase performance glitch user
    And the user adds products in the shopping cart to confirm purchase performance glitch user
    And the user enter the info to confirm purchase performance glitch user
    When the user ends the purchase performance glitch user
    Then the user can see the order complete performance glitch user
