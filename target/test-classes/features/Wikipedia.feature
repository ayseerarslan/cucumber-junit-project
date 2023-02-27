
Feature: Wikipedia Search
  User Story: As a user, I should be able to search on Wikipedia

  Background: User makes search Steve Jobs on wiki search box and clicks search button
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    Then user clicks wiki search button

  Scenario: Verify Wikipedia search functionality title verification
    Given user sees "Steve Jobs" is in the wiki title

  Scenario: Verify Wikipedia search functionality header verification
    Given user sees "Steve Jobs" is in the main header

  Scenario: Verify Wikipedia search functionality image header verification
    Given user sees "Steve Jobs" is in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality with Scenario Outline
    Given user is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    Then user clicks wiki search button
    Given user sees "<expectedTitle>" is in the wiki title
    Given user sees "<expectedMainHeader>" is in the main header
    Given user sees "<expectedImageHeader>" is in the image header

    @ceos
    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Marry Barra     | Marry Barra     | Marry Barra        | Marry Barra         |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |
      | Sundar Pichai   | Sundar Pichai   | Sundar Pichai      | Sundar Pichai       |

    @scientists
    Examples:
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Marie Curie     | Marie Curie     | Marie Curie     | Marie Curie     |
      | Albert Einstein | Albert Einstein | Albert Einstein | Albert Einstein |