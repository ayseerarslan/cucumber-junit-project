
Feature: Cucumber Data Tables implementation practices

  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |

    # to beautify the pipes: cmnd + opt + L

  Scenario: List of pets we love
    Then I will share my favorites
      | cat   |
      | dog   |
      | bird  |
      | horse |
      | duck  |

  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane      |
      | surname | Doe       |
      | age     | 29        |
      | address | somewhere |
      | state   | CA        |
      | zipcode | 99999     |

  @dataTable
  Scenario: verify user should be able to see all 12 months in months dropdown
    Given user is on the dropdowns page of practice tool
    Then user should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |


