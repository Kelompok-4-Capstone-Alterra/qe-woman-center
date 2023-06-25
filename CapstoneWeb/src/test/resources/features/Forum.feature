Feature: Forum Discussion

  Background:
    Given I am on the landing page
    When I click get into the dashboard button
    And I enter username
    And I enter password
    And I click sign in button
    Then I am on the dashboard

  @ForumSortByNewest
  Scenario: As Admin, I can see forum sort by newest
    Given I click article and forum button
    When I choose sub menu forum discussion
    And I choose sort by forum
    And I click sort by newest forum
    Then I can see forum sort by newest

  @ForumSortByOldest
  Scenario: As Admin, I can see forum sort by oldest
    Given I click article and forum button
    When I choose sub menu forum discussion
    And I choose sort by forum
    And I click sort by oldest forum
    Then I can see forum sort by oldest

  @SearchForum
  Scenario: As Admin, I can search forum
    Given I click article and forum button
    When I choose sub menu forum discussion
    And I enter topic forum
    Then I find topic forum by search box

  @ViewLinkForum
  Scenario: As Admin, I can view forum link
    Given I click article and forum button
    When I choose sub menu forum discussion
    And I click view link forum button
    Then I click close link forum button

  @DeleteForum
  Scenario: As Admin, I can delete forum discussion
    Given I click article and forum button
    When I choose sub menu forum discussion
    And I click delete button forum
    And I click pop up sure for confirm delete forum
    Then I success delete forum

  @CancelDeleteForum
  Scenario: As Admin, I can cancel delete forum discussion
    Given I click article and forum button
    When I choose sub menu forum discussion
    And I click delete button forum
    And I click pop up maybe later for confirm cancel delete forum
    Then I go back to dashboard forum