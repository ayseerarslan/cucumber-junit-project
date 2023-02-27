Feature: Links actions feature
  @wip
  Scenario Outline:Getting different responses by different links
    Given Navigate to "links" page
    When the user clicks to "<link>"
    Then the message contains "<statusCode>""<statusText>"
    Examples:
      | link         | statusCode | statusText        |
      | Created      | 201        | Created           |
      | No Content   | 204        | No Content        |
      | Moved        | 301        | Moved Permanently |
      | Bad Request  | 400        | Bad Request       |
      | Unauthorized | 401        | Unauthorized      |
      | Forbidden    | 403        | Forbidden         |
      | Not Found    | 404        | Not Found         |