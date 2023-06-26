@Transactions
Feature: Transactions
  As a user
  I want to view transactions
  So that can i view my transactions

  @OngoingTransaction
  Scenario: User Can View Ongoing Transaction
    Given User login women center
    When User enter valid credential
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And User click transaction bar
    Then User can see ongoing transaction

  @HistoryTransaction
  Scenario: User Can View History Transaction
    Given User login women center app
    When User enter valid credential for login
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And User click navbar transaction
    Then User can see history transaction