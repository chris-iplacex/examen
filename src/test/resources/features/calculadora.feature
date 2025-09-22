# language: en
Feature: Calculator operations
  In order to ensure quality and avoid regressions,
  As a user I want the calculator to reliably perform basic operations

  Background:
    Given I have a calculator

  Scenario: Add two numbers
    When I add 2 and 3
    Then the result should be 5

  Scenario Outline: Divide numbers correctly
    When I divide <a> by <b>
    Then the result should be <result>

    Examples:
      | a  | b | result |
      | 20 | 5 | 4      |
      | 42 | 7 | 6      |

  Scenario: Division by zero
    When I divide 1 by 0
    Then an error of type "ArithmeticException" should occur

