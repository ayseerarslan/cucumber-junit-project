Feature: Verifying buttons feature of the application

  Scenario: Check different button actions
    Given Navigate to "buttons" page
    When  Double click on button
    Then  Verify double click text :'You have done a double click' should be visible
    And   Right-click on button
    Then  Verify right click text :'You have done a right click' should be visible
    And   Click Me button
    Then  Verify click text :'You have done a dynamic click' should be visible