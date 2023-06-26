@counseling
Feature: counseling
  As an Admin
  I want to add new counseling schedule
  So that I can manage counseling schedule and transactions

  Background:
    Given I am on the dashboard page
    When I click Counseling button

  @ViewCounselingSchedule
  Scenario: As Admin, I have be able to view counseling schedule
    And I click on view button
    Then I success view counseling schedule

  @CloseViewCounselingSchedule
  Scenario: As Admin, I have be able to close view counseling schedule
    And I click on view button
    And I click on close button
    Then I am back to counseling schedule page

  @CreateCounselingSchedule
  Scenario: As Admin, I have be able to create counseling schedule
    And I click add schedule
    And I select counselor
    And I choose counseling date
    And I choose counseling time
    And I click add schedule button
    Then I see pop up success

  @CancelCreateCounselingSchedule
  Scenario: As Admin, I have be able to cancel create counseling schedule
    And I click add schedule
    And I click button not now
    Then I am back to counseling schedule page

  @UpdateCounselingSchedule
  Scenario: As Admin, I have be able to update counseling schedule
    And I click update button
    And I update counseling date
    And I click update schedule button
    Then I see pop up success

  @CancelUpdateCounselingSchedule
  Scenario: As Admin, I have be able to cancel update counseling schedule
    And I click add schedule
    And I click button not now
    Then I am back to counseling schedule page

  @DeleteCounselingSchedule
  Scenario: As Admin, I have be able to delete counseling schedule
    And I click button delete
    And I click button sure on pop up
    Then I see pop up success

  @CancelDeleteCounselingSchedule
  Scenario: As Admin, I have be able to cancel delete counseling schedule
    And I click button delete
    And I click button maybe later on pop up
    Then I am back to counseling schedule page

  @ScheduleSortBy
  Scenario: As Admin, I have be able to sort counseling schedule
    And I select sort by oldest
    Then I see counseling schedule sort by oldest

  @SearchSchedule
  Scenario: As Admin, I have be able to search counseling schedule
    And I enter keyword on search field
    Then I see counseling schedule by keyword search

  @ViewCounselingTransaction
  Scenario: As Admin, I have be able to view counseling transaction
    And I choose sub menu counseling transaction
    Then I view counseling transaction

  @SearchTransaction
  Scenario: As Admin, I have be able to search counseling transaction
    And I choose sub menu counseling transaction
    And I enter keyword on search field
    Then I see counseling schedule by keyword search

  @TransactionSortBy
  Scenario: As Admin, I have be able to sort counseling transaction
    And I choose sub menu counseling transaction
    And I select sort by oldest
    Then I see counseling transaction by oldest

  @UpdateStatus
  Scenario: As Admin, I have be able to update status counseling transaction
    And I choose sub menu counseling transaction
    And I click cancel
    And I click button sure on pop up
    Then I see pop up success

  @CancelUpdateStatus
  Scenario: As Admin, I have be able to cancel update status counseling transaction
    And I choose sub menu counseling transaction
    And I click cancel
    And I click button maybe later on pop up
    Then I am back to counseling transaction page

  @SendLink
  Scenario: As Admin, I have be able to send link
    And I choose sub menu counseling transaction
    And I click send link
    And I insert counseling link
    And I click button send link
    Then I see pop up success