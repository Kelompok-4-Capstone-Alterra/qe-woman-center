Feature: Admin article
  Scenario Outline: Admin able to delete article
    Given I set admin delete article endpoint with "<uuid>"
    When I send DELETE admin article request
    Then I receive admin article status code response "<code>"
    Examples:
      | uuid                                 | code |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c0003 | 200  |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c0001 | 400  |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c000  | 400  |
