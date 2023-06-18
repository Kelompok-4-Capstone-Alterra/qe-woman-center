Feature: Admin Career

  Scenario: View All Career
    Given I set career endpoint URL
    When I send a get career request with valid auth
    Then I successfully view all career

  Scenario: View All Career With Wrong Method
    Given I set career endpoint
    When I send a get career request with wrong method
    Then I fail to view all career and receive status code 404

  Scenario: View All Career With Wrong Endpoint
    Given I set career wrong endpoint
    When I send a get career request with wrong endpoint
    Then I receive status code 404

  Scenario: View All Career With Wrong Token
    Given I set career valid endpoint
    When I send a get career request with wrong token
    Then I receive status code 401

  Scenario: Add new career data
    Given I set add career endpoint
    When I send POST request valid data
      | job_position    | quality engineer    |
      | company_name    | alterra uhuy |
      | location        | semarang               |
      | salary          | 1234     |
      | min_experience  | 1 Tahun     |
      | last_education  | S1     |
      | description     | 123 Main St     |
      | company_email   | 123 Main St     |
      | image           | Users\User\Downloads\Capture.png |
    Then I receive valid response

  @careerSearch
  Scenario Outline: Admin search career based on search input
    Given I set search career based on "<search>" input endpoint
    When I send search career "<search>" input request
    And I receive status code 200
    Examples:
      | search    |
      | quality   |
      | Alta      |
      | Semarang  |
      | abc       |

    Scenario Outline: Admin delete career
      Given I set delete career endpoint with "<uuid>"
      When I send DELETE admin career request
      Then I receive career delete status code "<code>"
      Examples:
        | uuid                                  | code  |
        | 15313b93-0d96-11ee-8368-0242c0a81003  | 200   |
        | 15313b93-0d96-11ee-8368-0242c0a81003  | 400   |
        | 15313b93-0d96-11ee-8368-0242c0a8100   | 400   |