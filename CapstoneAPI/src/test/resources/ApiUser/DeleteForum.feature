@DeleteForum
Feature: Delete - forum
  As a user
  I want to delete forum from forum id
  So that i can delete forum from forum id

  @DeleteForumValidEndpoint
  Scenario: Delete Forum Valid Endpoint
    Given I set delete forum valid endpoint
    When I send delete forum HTTP request with valid endpoint
    Then I received delete forum HTTP response code 200

  @DeleteForumInvalidEndpoint
  Scenario: Delete Forum Invalid Endpoint
    Given I set delete forum invalid endpoint
    When I send delete forum HTTP request with invalid endpoint
    Then I received delete forum HTTP response code 404

  @DeleteForumInvalidId
  Scenario: Delete Forum Invalid Id
    Given I set delete forum invalid id
    When I send delete forum HTTP request with invalid id
    Then I received delete forum HTTP response code 400

  @DeleteForumWithoutToken
  Scenario: Delete Forum Without Token
    Given I set delete forum without token
    When I send delete forum HTTP request without token
    Then I received delete forum HTTP response code 401