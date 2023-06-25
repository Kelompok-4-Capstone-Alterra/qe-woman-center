Feature: Report

  Background:
    Given I am on the landing page
    When I click get into the dashboard button
    And I enter username
    And I enter password
    And I click sign in button
    Then I am on the dashboard

  @ReportSortByNewest
  Scenario: As Admin, I can see report sort by newest
    Given I click report button
    When I choose sort by report
    And I click sort by newest report
    Then I can see report sort by newest

  @ReportSortByOldest
  Scenario: As Admin, I can see report sort by oldest
    Given I click report button
    When I choose sort by report
    And I click sort by oldest report
    Then I can see report sort by oldest

  @SearchReport
  Scenario: As Admin, I can search report
    Given I click report button
    When I enter counselor name
    Then I find counselor name by search box

  @ExportFileReport
  Scenario: As Admin, I can export file report
    Given I click report button
    When I click export file button
    Then I success export file report