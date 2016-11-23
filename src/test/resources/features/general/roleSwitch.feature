@t
Feature: Role change
  In order to use site functionality
  As an EPAM admin
  I  want to change role for Employee

  Background:
    Given user is on the home page
    And user logs in with EPAM LOGIN

  Scenario Outline: Search
    Given admin is on the Admin tab
    And on Edit employees subcategory
    When admin picks '<employee>'
    And changes role to Manager
    Then '<employee>'s role is changed to ROLE_MANAGER
    Examples:
      | employee          |
      | Aaatest Fordechev |








