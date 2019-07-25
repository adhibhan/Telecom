@Regression
Feature: To test the AddCustomer functionality

  @us1
  Scenario: To test the generate customer ID functionality
    Given The user is in add customer page
    When the user fills in the valid details
      | firstName   | abc          |
      | lastName    | xyz          |
      | emailAdress | test@abc.com |
      | adress      | chennai      |
      | phoneNum    |   9874563211 |
    Then the user should see the customer ID generated

  @us2 @Negative
  Scenario: Neg To test the generate customer ID functionality1
    Given The user is in add customer page
    When the user fills in the valid details
      | firstName   | abc          |
      | lastName    | xyz          |
      | emailAdress | test@abc.com |
      | adress      | chennai      |
      | phoneNum    |   9874563211 |
    And the user click the reset button
    And the user click the submit button
    Then the user should see the error message

  @Negative @us3
  Scenario: Neg To test the generate customer ID functionality2
    Given The user is in add customer page
    When the user fills in the valid details
      | firstName   |         |
      | lastName    |         |
      | emailAdress | abc.com |
      | adress      | $$      |
      | phoneNum    | abc     |
    And the user click the reset button
    And the user click the submit button
    Then the user should see the error message
