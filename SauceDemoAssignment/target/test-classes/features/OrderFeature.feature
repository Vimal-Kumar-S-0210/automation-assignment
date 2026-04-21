Feature: Order
@tags
Scenario: Place Order
  Given user logged in
  When user places an order
  Then order is successful