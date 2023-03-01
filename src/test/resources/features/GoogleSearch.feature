Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results.

  Background: go to Google
    When user is on the Google search page

  Scenario: Search page default title verification
    When user search for "apple" in Google Search
    Then user should see "apple" in the Google title