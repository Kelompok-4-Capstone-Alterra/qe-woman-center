@User
Feature: User
  As a Admin
  I want to see user data
  So that I see user data

  Background:
    Given I am on the landing page
    When I click get into the dashboard button
    And I enter username
    And I enter password
    And I click sign in button
    Then I am on the dashboard

  @ViewUser
  Scenario: As Admin, I can see user data
    Given I click user and counselor button
    When I choose users
    And I click view button user
    Then I can see detail user

  @CancelDeleteUser
  Scenario: As Admin, I cancel delete user
    Given I click user and counselor button
    When I choose users
    And I click delete button
    And I click pop up maybe later for confirm delete
    Then I go back to dashboard user

  @SuccessDeleteUser
  Scenario: As Admin, I can delete user
    Given I click user and counselor button
    When I choose users
    And I click delete button
    And I click pop up sure for confirm delete
    Then I success delete user

  @FindNameBySearch
  Scenario: As Admin, I can search user
    Given I click user and counselor button
    When I choose users
    And I enter name
    Then I find user by search box

  @SortByNewest
  Scenario: As Admin, I can filter user sort by newest
    Given I click user and counselor button
    When I choose users
    And I click sort by button
    And I choose newest
    Then I find user sort by newest

  @SortByOldest
  Scenario: As Admin, I can filter user sort by oldest
    Given I click user and counselor button
    When I choose users
    And I click sort by button
    And I choose oldest
    Then I find user sort by oldest