Feature: Etsy Title Verifications
  US: User should be able to type any keyword and see relevant result.

  Background:
    Given user is on etsy home page

  Scenario: Etsy title verification
    Given user sees title is as expected.

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given user types Wooden Spoon in the search box
    When user clicks search button
    Then user sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    #Given user types "Wooden Spoon" in the search box
    When user clicks search button
    #Then user sees "Wooden Spoon" is in the title

  Scenario Outline: search values
    Given user types "<searchValue>" in the search box
    When user clicks search button
    Then user sees "<searchValue>" is in the title

    Examples:
      | searchValue  |
      | Wooden Spoon |
      | Hello        |
      | Flower Types |
      | Peace        |