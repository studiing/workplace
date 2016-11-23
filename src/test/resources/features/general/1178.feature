@t
Feature: Change Direction state
  In order to use site functionality
  As an EPAM admin
  I  want to make state Active/Inactive for Direction

  Background:
    Given user is on the home page
    And user logs in with EPAM LOGIN

  Scenario Outline: Search
    Given admin is on the Admin tab
    And on Edit Directions subcategory
    When admin chooses '<direction>'
    And clicks on Make Active button
    Then notification window appears
    And window contains text '<message>'
    Examples:
      | direction          | message                                                          |
      | JAVA               | Are you sure to do Active state to JAVA direction?               |
      | JAVA, .NET         | Are you sure to do Active state to JAVA, .NET direction?         |
      | JAVA, .NET, FE     | Are you sure to do Active state to FE, JAVA, .NET direction?     |

  Scenario Outline: Search
    Given admin is on the Admin tab
    And on Edit Directions subcategory
    When admin chooses '<direction>'
    And clicks on Make Inactive button
    Then notification window appears
    And window contains text '<message>'
    Examples:
      | direction          | message                                                              |
      | JAVA               | Are you sure to do Not active state to JAVA direction?               |
      | JAVA, .NET         | Are you sure to do Not active state to JAVA, .NET direction?         |
      | JAVA, .NET, FE     | Are you sure to do Not active state to FE, JAVA, .NET direction?     |