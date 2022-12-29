  Feature: Calculations

  Background: User is on the home page
    Given User is on the home page

  Scenario Outline: Valid User Logins
    When User clicks <number1> button
    When User clicks <operator> button
    When User clicks <number2> button
    When User clicks "=" button
    Then User should see <equals> value in console

    Examples:

    |number1 | operator | number2 | equals |
    |"1"     | "*"      |"5"      | "5"    |
    |"2"     | "-"      |"6"      |"-4"    |
    |"4"     | "/"      |"2"      |"2"     |
    |"2"     | "+"      |"6"      |"8"    |
    |"4"     | "%"      |"2"      |"0"    |



