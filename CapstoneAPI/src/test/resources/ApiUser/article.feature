Feature: User article
  Scenario Outline: User able to read article
    Given I set user get article endpoint with "<uuid>"
    When I send GET user get article request
    Then I receive user get article status code response "<code>"
    Examples:
      | uuid                                 | code |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c0003 | 200  |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c0001 | 400  |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c000  | 400  |
