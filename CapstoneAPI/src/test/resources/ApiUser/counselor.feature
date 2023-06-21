Feature: Counselor

  @test1
  Scenario: Get counselor by id
    Given I set counselor endpoint
    When I send counselor GET HTTP request with valid id
    Then I success get counselor data

  @test2
  Scenario: Get counselor by invalid id
    Given I set counselor endpoints
    When I send counselor GET HTTP request with invalid id
    Then I fail get counselor data

  @test3
  Scenario: Get counselor by invalid token
    Given I set counselor endpoints url
    When I send counselor GET HTTP request with invalid token
    Then I fail get counselor data 401