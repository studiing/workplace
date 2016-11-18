Feature: User logs in
  In order to use site functionality
  As an EPAM user
  I want to log in successfully

  Scenario: Sign in
    Given user is on the home page
    When user logs in with EPAM LOGIN
    Then people tab is opened
    And user sees "Hello" greeting
