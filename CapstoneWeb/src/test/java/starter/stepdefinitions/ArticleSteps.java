package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ArticlePage;

public class ArticleSteps {

    @Steps
    ArticlePage articlePage;

    // article sort by newest
    @Given("I click article & forum button")
    public void clickArticleButton(){articlePage.openUrl("https://react-women-center.netlify.app/article-forum");}
    @When("I choose sort by article")
    public void chooseSortByArticle(){articlePage.clickDropdownArticleSortBy();}
    @And("I click sort by newest article")
    public void chooseArticleSortByNewest(){articlePage.chooseArticleSortByNewest();}
    @Then("I can see article sort by newest")
    public void seeArticleNewest(){articlePage.validateArticlePage();}

    // article sort by oldest
    @And("I click sort by oldest article")
    public void chooseArticleSortByOldest(){articlePage.chooseArticleSortByOldest();}
    @Then("I can see article sort by oldest")
    public void seeArticleOldest(){articlePage.validateArticlePage();}

    // search article
    @When("I enter article")
    public void enterArticle(){articlePage.enterArticle("ibu hamil");}
    @Then("I find article by search box")
    public void findArticle(){articlePage.validateArticle();}

    // view comment article
    @When("I click comment article")
    public void clickCommentArticle(){articlePage.clickCommentArticle();}
    @Then("I click close comment article")
    public void clickCloseCommentArticle(){articlePage.clickCloseCommentArticle();}

    // cancel delete comment article
    @When("I click delete button comment article")
    public void clickDeleteCommentArticleButton(){articlePage.clickDeleteCommentArticleButton();}
    @And("I click pop up maybe later for confirm cancel delete comment article")
    public void popUpMaybeLaterCommentArticle(){articlePage.popUpMaybeLaterCommentArticle();}
    @Then("I go back to dashboard comment article")
    public void backToDashboardCommentArticle(){articlePage.validateArticlePage();}

    // delete comment article
    @And("I click pop up sure for confirm delete comment article")
    public void popUpSureDeleteCommentArticle(){articlePage.popUpSureDeleteCommentArticle();}
    @Then("I success delete comment article")
    public void successDeleteCommentArticle(){articlePage.validateArticlePage();}

    // cancel delete article
    @When("I click delete button article")
    public void clickDeleteArticleButton(){articlePage.clickDeleteArticleButton();}
    @And("I click pop up maybe later for confirm cancel delete article")
    public void popUpMaybeLaterArticle(){articlePage.popUpMaybeLaterArticle();}
    @Then("I go back to dashboard article")
    public void backToDashboardArticle(){articlePage.validateArticlePage();}

    // delete article
    @And("I click pop up sure for confirm delete article")
    public void popUpSureDeleteArticle(){articlePage.popUpSureDeleteArticle();}
    @Then("I success delete article")
    public void successDeleteArticle(){articlePage.validateArticlePage();}

}
