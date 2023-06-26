Feature: Article

  Background:
    Given I am on the landing page
    When I click get into the dashboard button
    And I enter username
    And I enter password
    And I click sign in button
    Then I am on the dashboard

  @ArticleSortByNewest
  Scenario: As Admin, I can see article sort by newest
    Given I click article & forum button
    When I choose sort by article
    And I click sort by newest article
    Then I can see article sort by newest

  @ArticleSortByOldest
  Scenario: As Admin, I can see article sort by oldest
    Given I click article & forum button
    When I choose sort by article
    And I click sort by oldest article
    Then I can see article sort by oldest

  @SearchArticle
  Scenario: As Admin, I can search article
    Given I click article & forum button
    When I enter article
    Then I find article by search box

  @ViewCommentArticle
  Scenario: As Admin, I can view comment article
    Given I click article & forum button
    When I click comment article
    Then I click close comment article

  @DeleteCommentArticle
  Scenario: As Admin, I can delete comment article
    Given I click article & forum button
    When I click delete button comment article
    And I click pop up sure for confirm delete comment article
    Then I success delete comment article

  @CancelDeleteCommentArticle
  Scenario: As Admin, I can cancel delete comment article
    Given I click article & forum button
    When I click delete button comment article
    And I click pop up maybe later for confirm cancel delete comment article
    Then I go back to dashboard comment article

  @DeleteArticle
  Scenario: As Admin, I can delete article
    Given I click article & forum button
    When I click delete button article
    And I click pop up sure for confirm delete article
    Then I success delete article

  @CancelDeleteArticle
  Scenario: As Admin, I can cancel delete article
    Given I click article & forum button
    When I click delete button article
    And I click pop up maybe later for confirm cancel delete article
    Then I go back to dashboard article