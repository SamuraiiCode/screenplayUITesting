@Tag
Feature: As a user certification in Sauce Demo web page
  i need to do a different log ins

  Background:
    Given the user enter to the web page

  @LogInSuccessful
  Scenario: log in successful standard user
    When the user log in with standard user
    Then the user can see products in the web page


  @UnsuccessfulLogin
  Scenario: log in not successful locked out user
    When the user log in with locked out user
    Then the user can see the error message




