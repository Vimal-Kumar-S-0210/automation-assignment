Feature: API Testing
@tags
Scenario: Get user details
  Given user sets base URI
  When user sends GET request to "/users/2"
  Then response status code should be 200