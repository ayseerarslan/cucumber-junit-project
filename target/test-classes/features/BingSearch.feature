Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results.

  Background: go to Bing
    When user is on the Bing search page


  Scenario: Search page default title verification
    When user search for "orange" in the Bing
    Then user should see "orange" in the Bing title