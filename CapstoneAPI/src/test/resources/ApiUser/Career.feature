@Career
Feature: Career
  As an user
  I want to see all career information
  So that I get information about career

  @SuccessGetAllCareer
  Scenario: Get - As user I have be able to get all career information
    Given I set get all career information endpoint
    When I send GET Request
    Then I receives HTTP response code 200

  @SuccessGetAllCareerSortByNewest
  Scenario: Get - As user I have be able to get all career information sort by newest
    Given I set get all career information sort by newest endpoint
    When I send GET Request sort by newest
    Then I receives HTTP response code 200

  @FailedGetAllCareer
  Scenario: Get - As user I failed get all career information with invalid endpoint
    Given I set invalid get all career information endpoint
    When I send GET Requests
    Then I receives HTTP response code is 404

  @SuccessGetCareerById
  Scenario: Get - As user I have be able to get career information by id
    Given I set get career information by id endpoint
    When I send Request method GET
    Then I receives HTTP response code is 200

  @FailedGetCareerByIdInvEnd
  Scenario: Get - As user I failed to get career information by id with invalid endpoint
    Given I set invalid get career information by id endpoint
    When I send Request method GET with invalid endpoint
    Then I receives HTTP response code is 404

  @FailedGetCareerByIdInvId
  Scenario: Get - As user I failed to get career information by id with invalid id
    Given I set get career information by id endpoint
    When I send Request method GET with invalid id
    Then I receives HTTP response code is 400