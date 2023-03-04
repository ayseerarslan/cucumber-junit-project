@regression
Feature: Managing File page
  Agile story: As a user, I should be able to manage what to show in the Files page with the settings.

  Scenario: Verify there are 3 checkboxes are available under the Settings
    Given user on the login page and enter valid credentials
    And user clicks the Files on the Home page.
    And user clicks the Settings in the Files page.
    Then user should see there are three checkboxes under the Settings.


  Scenario: Verify users can check any checkbox option.
    Given user on the login page and enter valid credentials
    And user clicks the Files on the Home page.
    And user clicks the Settings in the Files page.
    Then user checks the Show rich workspaces checkbox.
    Then user checks the Show recommendations checkbox.
    Then user checks the Show hidden files checkbox.

