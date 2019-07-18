@Regression @sprint2
Feature: To test add tariff plan functionality

  @us2
  Scenario Outline: To test add tariff plan functionality
    Given The user is in add tariff plan page
    When the user fill in valid tariff plan details "<MonthlyRent>", "<FreeLocal>","<FreeInt>","<FreeSMS>","<LocalCharges>","<InternationalCharges>","<SMSCharges>"
    And the user clicks the submit button
    Then the user should asee teh success message

    Examples: 
      | MonthRent | FreeLocal | FreeInt | FreeSMS | LocalCharges | InterCharges | SMSCharges |
      |       100 |       200 |     100 |     750 |          300 |          200 |          2 |
      |       200 |       200 |     100 |     750 |          500 |          200 |          2 |
      |       150 |       200 |     100 |     750 |          865 |          200 |          1 |
      |       250 |       200 |     100 |     750 |          365 |          200 |          1 |
