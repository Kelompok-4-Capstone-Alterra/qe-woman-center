@Article
Feature: Article
  As a user
  I want to see article
  So that can read article

  @FindArticleSortByMostViewed
  Scenario: Find Article Sort By Most Viewed
    Given I login application
    When I enter valid credential login
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And I click article button
    And I click sort by button
    And I click most viewed
    And I click save button
    Then I can see article by most viewed

  @FindArticleSortByNewest
  Scenario: Find Article Sort By Newest
    Given I login application
    When I enter valid credential login
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And I click article button
    And I click sort by button
    And I click Newest
    And I click save button
    Then I can see article by Newest

  @FindArticleSortByOldest
  Scenario: Find Article Sort By Oldest
    Given I login application
    When I enter valid credential login
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And I click article button
    And I click sort by button
    And I click Oldest
    And I click save button
    Then I can see article by oldest

  @ReadArticle
  Scenario: User Can Read Article
    Given I login to my app
    When I enter valid credential
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And I click the article button
    And I click article
    Then I can read article

  @CreateComment
  Scenario: User Can Create Comment Article
    Given I login to women center my app
    When I enter valid email password
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And I click button article
    And I click an article
    And I click icon comment
    Then I can create comment the article

  @DeleteComment
  Scenario: User Can Delete Comment Article
    Given I login to women center my app
    When I enter valid email password
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And I click button article
    And I click an article
    And I click icon comment
    And I click point three
    And I click delete button
    Then I success delete my comment

  @SaveArticle
  Scenario: User Can Save Article
    Given I login to my app women center
    When I enter valid email and password
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And I click articles button
    And I click icon save
    And I click button save
    Then I can save article

  @GuestReadArticle
  Scenario: Guest Read Article
    Given Guest on the homepage
    When Guest click article button
    And Guest click article
    Then Guest can read the article

  @GuestCantSaveArticle
  Scenario: Guest Can't Save Article
    Given Guest on the homepage
    When Guest click article button
    And Guest click icon save
    Then Guest redirected to the login page

  @GuestCantCommentArticle
  Scenario: Guest Can't Comment Article
    Given Guest on the homepage
    When Guest click article button
    And Guest click article
    And Guest click icon comment
    Then Guest redirected to the login page