@GetForumById
Feature: GET - Forum By Id
  As a user
  I want to see forum from id
  So that i can see forum from id

  @GetForumByIdValidEndpoint
  Scenario: Get Forum By Id Valid Endpoint
    Given I set GET forum by id valid endpoint
    When I send GET forum by id HTTP request with valid endpoint
    Then I received valid GET forum by id HTTP response code 200

  @GetForumByIdInvalidEndpoint
  Scenario: Get Forum By Id Invalid Endpoint
    Given I set GET forum by id invalid endpoint
    When I send GET forum by id HTTP request with invalid endpoint
    Then I received GET forum by id HTTP response code 404

  @GetForumByIdInvalidId
  Scenario: Get Forum By Id Invalid Id
    Given I set GET forum by id invalid Id
    When I send GET forum by id HTTP request with invalid Id
    Then I received GET forum by id HTTP response code 400

  @GetForumByIdWithoutToken
  Scenario: Get Forum By Id without token
    Given I set GET forum by id without token
    When I send GET forum by id HTTP request without token
    Then I received GET forum by id HTTP response code 401