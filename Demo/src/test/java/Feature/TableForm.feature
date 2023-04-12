Feature:TableForm

  @tableform
  Scenario: User navigates to site and performs crud operation in webtable
    Given user goes to site
    And adds new row to the table
    Then updates a row in the table
    And deletes a row in the table
    Then reads all the values from the table
