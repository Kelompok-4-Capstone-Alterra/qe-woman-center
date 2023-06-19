Feature: User counselor
  Scenario Outline: User able to get counselor schedule
    Given I set user get counselor schedule endpoint with "<uuid>"
    When I send GET user get counselor schedule request
    Then I receive user get counselor schedule status code response "<code>"
    Examples:
      | uuid                                 | code |
      | 519e50f4-09cd-11ee-b8a9-0242ac140003 | 200  |
      | 519e50f4-09cd-11ee-b8a9-0242ac140002 | 404  |
      | 519e50f4-09cd-11ee-b8a9-0242ac14000  | 400  |