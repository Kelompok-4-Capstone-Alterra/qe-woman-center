Feature: Profile
  As a user
  I am able to go to profile page
  So that I can edit my data

  Scenario: Edit profile information
    Given I am on the homepage to login (profile)
    When I click button to login (profile)
    And I enter following credentials (profile):
      | Username        | Password      |
      | capstone        | password      |
    And I success to login (profile)
    And I click on profile feature
    And I click on edit profile button
    And I am at edit profile page
    And I enter new profile information:
      | username    | name        | phone             |
      | capstone    | capstone456 | 080987654321      |
    And I click save profile changes button
    And I click on confirmation changes button
    Then I success to update profile information

  Scenario Outline: Failed to edit profile information
    Given I am on the homepage to login (profile)
    When I click button to login (profile)
    And I enter following credentials (profile):
      | Username        | Password      |
      | capstone        | password      |
    And I success to login (profile)
    And I click on profile feature
    And I click on edit profile button
    And I am at edit profile page
    And I enter invalid credential at "<field>" with "<value>" :
    And I click save profile changes button
    Then I receive error message when update profile
      Examples:
        | field           | value           |
        | username        | ranbo           |
        | name            |                 |
        | phone           | 023483!@*Y      |