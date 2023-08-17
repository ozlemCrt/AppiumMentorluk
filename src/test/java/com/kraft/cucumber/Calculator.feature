Feature: Calculator Functionality
  Scenario: Sum of several number in calculator
    Given The user is start page
    When The user sum of following numbers
    |1|
    |2|
    |5|
    Then The result should be "= 8"
