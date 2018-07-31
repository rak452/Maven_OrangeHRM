Feature: OrangeHrm Login
  @login
  Scenario: as user i should be logged in
    Given user is on login page
    When user enters Username and Password
    And user clicks on login page
    Then user should be able to login successfully

    @noLogin
    Scenario Outline: invalid Credentials
      Given user is on login page
      When enters invalid"<username>" and "<password>"
      And user click on login button
      Then user should not be able to login with "<errormessage>"

      Examples:

      |username     |    password|  errormessage                           |
      |Raj          |    raj123  |   Invalid credentials                   |
      |             |            |   Username cannot be empty              |
      |Raj          |            |    Password cannot be empty             |