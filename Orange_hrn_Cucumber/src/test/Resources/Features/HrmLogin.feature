@regression
Feature: User should be Login

  @login
  Scenario: User should be log in with valid credential
  Given User is on the home page
  When user enter username and password
  And  user Click on login button
  Then User should be navigate to dashboard

  Examples:
  | username                           | password         | error message               |
  | Admin                              | admin123         | dashboard page              |