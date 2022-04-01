@Tag
Feature: As a user certification in Sauce Demo main page
  i need add products

  Background:
    Given the user enter to the web page to add products


  @successfulAddProducts
  Scenario: add products successful standard user
    Given log in to add products
    When the user adds products in the shopping cart
    Then the user can see the increase in the cart

  @UnsuccessfulAddProducts
  Scenario: unsuccessful add products for a problem user
    Given log in to add products with a problem user
    When the user adds products that are not Sauce Labs Fleece Jacket
    Then the user can see the another products

