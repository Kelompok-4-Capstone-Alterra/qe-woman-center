Feature: Admin Get All Topics
  @test1
  Scenario: View All Topics
    Given I set topic endpoint URL
    When I send a get topic request with valid token
    Then I successfully view all topic

  @test2
  Scenario: View All Topics With Wrong Method
    Given I set topic endpoint
    When I send a get topic request with wrong method
    Then I fail to view all topics and receive status code 405