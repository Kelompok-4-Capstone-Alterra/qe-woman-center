Feature: User transaction
  Scenario Outline: User able to get transaction by id
    Given I set user get transaction endpoint with "<uuid>"
    When I send GET user get transaction request
    Then I receive user get transaction status code response "<code>"
    Examples:
      | uuid                                 | code |
      | 90657701-0e39-11ee-99a8-0242c0a89003 | 200  |
      | 90657701-0e39-11ee-99a8-0242c0a89005 | 400  |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c000  | 400

  @AddNewTransaction
  Scenario: Add new transaction with valid endpoint
    Given I set POST transaction endpoint
    When I send HTTP POST transaction request with valid endpoint
    Then I receive a valid HTTP transaction response code 200 OK

  @GetAllTransaction
  Scenario: Get all transaction with valid endpoint
    Given I set GET all transaction with valid endpoint
    When I send HTTP GET transaction request with valid endpoint
    Then I receive a valid HTTP all transaction response code 200 OK

  @GetAllTransactionInvalidEndpoint
  Scenario: Get all transaction with invalid endpoint
    Given I set GET all transaction with invalid endpoint
    When I send HTTP GET transaction request with invalid endpoint
    Then I receive a valid HTTP all transaction response code 404 Not Found

  @GetAllTransactionInvalidToken
  Scenario: Get all transaction with invalid token
    Given I set GET all transaction with valid endpoint but invalid token
    When I send HTTP GET transaction request with invalid token
    Then I receive a valid HTTP all transaction response code 401 Invalid Token