Feature: Web Table app login functionality

  Scenario: Positive login scenario (hard coded)
    Given user is on the Web Table app login page
    When user enters correct username
    And user enters correct password
    And user clicks to login button
    Then user should see orders word in the URL
    #Expected: url should end with "orders"


  Scenario: Positive login scenario (parameterized)
    Given user is on the Web Table app login page
    When user enters "Test" username and enters "Tester" password
    And user clicks to login button
    Then user should see orders word in the URL

  Scenario: Positive login scenario (parameterized)
    Given user is on the Web Table app login page
    When user enters below correct credentials
      | username | Test   |
      | password | Tester |
    And user clicks to login button
    Then user should see orders word in the URL


#  Scenario Outline: Positive login scenario (tables)
#    Given user is on the Web Table app login page
#    When user enters "<username>" username and enters "<password>" password
#    And user clicks to login button
#    Then user should see orders word in the URL
#
#    Examples:
#      | username | password |
#      | Test     | Tester   |
