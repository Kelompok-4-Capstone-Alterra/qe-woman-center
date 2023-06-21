Feature: Admin - Counselor

  @AddNewCounselor
  Scenario: Add new admin counselor with valid data
    Given I set POST endpoint
    When I send POST HTTP request
      | name        | testing777  |
      | email       | testing123@gmail.com  |
      | username    | testing777  |
      | topic       | 2         |
      | description | testing description |
      | price       | 150000    |
      | image       | D:\USER LENOVO\Downloads\profile.png |
    Then I receive valid HTTP response code 200 OK

  @GetAllCounselorWithValidEndpoint
  Scenario: Get all admin counselor with valid endpoint
    Given I set GET all counselor with valid endpoint
    When I send HTTP GET request with valid endpoint
    Then I receive a valid HTTP response code 200 OK

  @GetAllCounselorWithInvalidEndpoint
  Scenario: Get all admin counselor with invalid endpoint
    Given I set GET all counselor with invalid endpoint
    When I send HTTP GET request with invalid endpoint
    Then I received HTTP response code 404 Not Found

  @GetCounselorByIDWithValidEndpoint
  Scenario: Get admin counselor by ID with valid endpoint
    Given I set GET valid endpoint by ID
    When I send HTTP GET to the request with valid endpoint
    Then I receive a HTTP response code 200 OK

  @GetCounselorByIDWithInvalidID
  Scenario: Get admin counselor invalid ID with valid endpoint
    Given I set GET counselor valid endpoint with invalid ID
    When I send HTTP GET counselor to request with invalid ID
    Then I receive HTTP response code is 404 Not Found

  @GetCounselorWithEmptyID
  Scenario: Get admin counselor with empty ID
    Given I set GET valid endpoint with empty ID
    When I send HTTP GET to request with valid endpoint with empty ID
    Then I receive a HTTP response code 400 Bad Request
