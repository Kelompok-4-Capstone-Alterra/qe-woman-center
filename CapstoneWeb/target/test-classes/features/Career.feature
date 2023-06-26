Feature: Career Information

  Background:
    Given I am on the landing page
    When I click get into the dashboard button
    And I enter username
    And I enter password
    And I click sign in button
    Then I am on the dashboard

  @CareerSortByNewest
  Scenario: As Admin, I can see career sort by newest
    Given I click career button
    When I choose sort by career
    And I click sort by newest
    Then I can see career sort by newest

  @CareerSortByOldest
    Scenario: As Admin, I can see career sort by oldest
    Given I click career button
    When I choose sort by career
    And I click sort by oldest
    Then I can see career sort by oldest

  @SearchCareer
  Scenario: As Admin, I can search career information
    Given I click career button
    When I enter job position
    Then I find job position by search box

  @CancelDeleteCareer
  Scenario: As Admin, I can cancel delete career information
    Given I click career button
    When I click delete career button
    And I click pop up maybe later for confirm cancel delete career
    Then I go back to dashboard career

  @DeleteCareer
  Scenario: As Admin, I can delete career information
    Given I click career button
    When I click delete career button
    And I click pop up sure for confirm delete career
    Then I success delete career

