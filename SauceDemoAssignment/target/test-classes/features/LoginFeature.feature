Feature: Login
@tags
Scenario Outline: Login test

  Given user is on login page
  When user enters "<username>" and "<password>"
  Then user should be logged in

Examples:
| username        | password      |
| standard_user   | secret_sauce  |
| locked_out_user | secret_sauce  |