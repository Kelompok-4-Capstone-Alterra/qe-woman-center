Feature: Login
  @test1
  Scenario Outline: Login with valid data
    Given I set login endpoint server
    When I send POST request with "<username>" and "<password>"
    Then I success lofin and receive response with a token
    Examples:
    | username           | password       |
    | admin              | admin          |

  @test2
  Scenario Outline: Login with invalid data
    Given I set login endpoint
    When I send POST request "<username>" and "<password>"
    Then I fail login and receive response code 400
    Examples:
      | username        | password       |
      | admin           | admi           |
      |                 |                |
