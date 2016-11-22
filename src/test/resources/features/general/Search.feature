Feature: Admin search for students
  In order to use site functionality
  As an EPAM admin
  I want to search for students

  Background:
    Given user is on the home page
    And user logs in with EPAM LOGIN

  Scenario Outline: Search
    Given user is on the people page
    When user search by student's '<name>'
    Then table contains '<amount>' rows

    Examples:
    | name      | amount|
    | Anna      | 2     |
    | Naidonov  | 1     |
    | FORD      | 1     |
    | jhgkjvv   | 0     |
    | DVBEASF   | 0     |
    | Ab DF As  | 0     |
    | An Kurylo | 1     |


