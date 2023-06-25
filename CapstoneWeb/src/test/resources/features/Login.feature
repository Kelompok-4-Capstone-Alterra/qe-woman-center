@login
Feature: login
  As a Admin
  I want to login as admin
  So that I can manage website

  Background:
    Given I am on the landing page
    When I click get into the dashboard button

  @ValidLogin
  Scenario: As Admin, I Login With Valid Credential
    And I enter username
    And I enter password
    And I click sign in button
    Then I am on the dashboard

  @FailedLoginInvalidUsername
  Scenario: As a admin i failed login with invalid username
    And I enter invalid username
    And I enter password
    And I click sign in button
    Then I see error message "You have entered an invalid username and password"

  @FailedLoginInvalidPassword
  Scenario: As a admin i failed login with invalid password
    And I enter username
    And I enter invalid password
    And I click sign in button
    Then I see error message "You have entered an invalid username and password"

  @FailedLoginEmptyUsername
  Scenario: As a admin i failed login with empty username
    And I enter empty username
    And I enter password
    And I click sign in button
    Then I see error message required "The username field is required"

  @FailedLoginEmptyPassword
  Scenario: As a admin i failed login with empty password
    And I enter username
    And I enter empty password
    And I click sign in button
    Then I see error message required "The username field is required"

  @FailedLoginEmptyUserAndPassword
  Scenario: As a admin i failed login with empty username and password
    And I enter empty username
    And I enter empty password
    And I click sign in button
    Then I see error message required "The username field is required"