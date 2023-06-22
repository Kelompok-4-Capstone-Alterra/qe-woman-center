Feature: Counselor

  Scenario: View counselor list based on topic
    Given I login to women center app
    When I enter credential and success login
      | Username       | Password     |
      | rini           | apaaja123    |
    And I go to counselor page
    And Click one of the displayed topic
    Then I can see counselor list based on picked topic

  Scenario: View counselor list with sorting
    Given I login to women center application
    When I enter credential and success login to app
      | Username       | Password     |
      | rini           | apaaja123    |
    And I going to counselor page
    And Click one of the displayed topics and continue step
    And I click sort button
    And Choose desired sorting
    Then I can see counselor list in sorted list

  @test1
  Scenario: View counselor detail
    Given I login to application
    When I enter credential to login
      | Username       | Password     |
      | rini           | apaaja123    |
    And I click counselor counselor
    And Click one of the displayed topics and continue steps
    And Choose desired counselor
    Then I can see counselor detail







