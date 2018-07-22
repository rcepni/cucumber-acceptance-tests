Feature: Product information

  @temp
  Scenario: Display the correct product name
    Given the user is on the home page
    When the user selects Printed Summer Dress
    Then product information page should be displayed
    And product name should be Printed Summer Dress
