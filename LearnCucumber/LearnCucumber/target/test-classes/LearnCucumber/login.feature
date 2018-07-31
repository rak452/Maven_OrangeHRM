@regression
Feature: log in

  @login @smoke
  Scenario: As a User, I should able to log in
  So that, I can use the user functions on the application

    Given user is on log in page
    When he enters username and password
    And he clicks on log in button
    Then he should able to log in successfully

  @nologin
  Scenario Outline: Invalid credentials
    Given user is on log in page
    When he enters invalid "<username>" and "<password>"
    And he clicks on log in button
    Then he should not able to log in with "<error message>"
    Examples:
      | username                           | password         | error message               |
      | testtest91242374582347t85@test.com | testtest         | Authentication failed. rewt |
      | testtest13072018@test.com          | vddchdgugdfulcsg | Authentication failed.      |
      |                                    | testtest         | An email address required.  |
      | testtest13072018@test.com          |                  | Password is required.       |
      |                                    |                  | An email address required.  |


 Scenario: user want to send email
   Given user is on log in page
   When he enters username and password
   And he clicks on log in button

