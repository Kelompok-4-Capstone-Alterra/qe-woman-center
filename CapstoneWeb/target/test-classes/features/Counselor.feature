@counselor
Feature: counselor
  As an Admin
  I want to add new counselor
  So that I can manage counselor data

  Background:
    Given I am on the dashboard page
    When I click User and Counselor button

  @ViewCounselor
  Scenario: As Admin, I have be able to view counselor data
    And I click view button
    Then I success view counselor data

  @CloseViewCounselor
  Scenario: As Admin, I have be able to cancel view counselor data
    And I click view button
    And I click close button
    Then I am on counselor page

  @DeleteCounselor
  Scenario: As Admin, I have be able to delete counselor data
    And I click delete buton
    And I click sure button
    Then I see view message success delete

  @CancelDeleteCounselor
  Scenario: As Admin, I have be able to cancel delete counselor data
    And I click delete buton
    And I click Maybe Later button
    Then I am on counselor page

  @UpdateCounselor
  Scenario: As Admin, I have be able to update counselor data
    And I click view button
    And I update name of counselor
    And I update username of counselor
    And I update email
    And I update description
    And I update counseling price
    And I click save button
    Then I see message "Counselor Successfully Updated"

  @FailAddCounselorWithEmptyName
  Scenario: As Admin, I fail to add new counselor with empty name
    And I click add counselor button
    And I fill empty name
    And I fill email
    And I fill username
    And I choose category
    And I fill description
    And I fill counseling price
    And I click Add new counselor button
    Then I see warning message "The name field is required"

  @FailAddCounselorWithEmptyEmail
  Scenario: As Admin, I fail to add new counselor with empty email
    And I click add counselor button
    And I fill name
    And I fill empty email
    And I fill username
    And I choose category
    And I fill description
    And I fill counseling price
    And I click Add new counselor button
    Then I see warning message "The email field is required"

  @FailAddCounselorWithEmptyUsername
  Scenario: As Admin, I fail to add new counselor with empty username
    And I click add counselor button
    And I fill name
    And I fill email
    And I fill empty username
    And I choose category
    And I fill description
    And I fill counseling price
    And I click Add new counselor button
    Then I see warning message "The username field is required"

  @FailAddCounselorWithEmptyDescription
  Scenario: As Admin, I fail to add new counselor with empty description
    And I click add counselor button
    And I fill name
    And I fill email
    And I fill username
    And I choose category
    And I fill empty description
    And I fill counseling price
    And I click Add new counselor button
    Then I see warning message "The description field is required"

  @FailAddCounselorWithEmptyCounselingPrice
  Scenario: As Admin, I fail to add new counselor with empty counseling price
    And I click add counselor button
    And I fill name
    And I fill email
    And I fill username
    And I choose category
    And I fill description
    And I fill empty counseling price
    And I click Add new counselor button
    Then I see warning message "The price field is required"

  @CancelAddCounselor
  Scenario: As Admin, I have be able to cancel add counselor
    And I click add counselor button
    And I click Not Now button
    Then I am on counselor page

  @SortBy
  Scenario: As Admin, I have be able to sort counselor
    And I choose sort by oldest
    Then I see list of counselor sort by oldest

  @Search
  Scenario: As Admin, I have be able to search
    And I fill search field
    Then I see list of counselor by keyword search
