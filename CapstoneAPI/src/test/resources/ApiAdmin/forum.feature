Feature: Admin Get All Forum

  Scenario: View All Forum
    Given I set forum endpoint URL
    When I send a get forum request with valid auth
    Then I successfully view all forum

  Scenario: View All Forum Invalid Endpoint
    Given I set forum invalid endpoint URL
    When I send a get forum request with invalid endpoint
    Then I fail view all forum 404

  Scenario: View All Forum Invalid Token
    Given I set forum endpoint
    When I send a get forum request with invalid token
    Then I fail view all forum 401