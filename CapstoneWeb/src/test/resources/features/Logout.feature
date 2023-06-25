@logout
Feature: logout
  As a Admin
  I want to logout
  So that I can exit from website

  Background:
    Given I am on the landing page
    When I click get into the dashboard button
    And I enter username
    And I enter password
    And I click sign in button
    Then I am on the dashboard
    Given I click icon logout

  @SuccessLogout
  Scenario: As a admin i success logout from website
    And I click sure pop up confirm exit
    Then I redirected to the landing page

  @SuccessCancelLogout
  Scenario: As a admin i can cancel logout
    And I click pop up maybe later for confirm exit
    Then I am go back on dashboard