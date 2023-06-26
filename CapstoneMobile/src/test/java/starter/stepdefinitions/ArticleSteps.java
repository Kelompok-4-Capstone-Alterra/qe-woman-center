package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Article;

import java.util.List;
import java.util.Map;

public class ArticleSteps {
    @Steps
    Article article;

//    User Find Article Sort By Most Viewed
    @Given("I login application")
    public void loginApplication(){
        article.openApplication();
        article.loginApp();
    }
    @When("I enter valid credential login")
    public void successLoginToApp(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            article.enterUsername(username);
            article.enterPassword(password);
            article.clickLoginButton();
        }
    }
    @And("I click article button")
    public void iClickArticleButton(){
        article.clickArticleButton();
    }
    @And("I click sort by button")
    public void clickSortByButton(){
        article.clickSortByButton();
    }
    @And("I click most viewed")
    public void clickMostViewed(){
        article.clickMostViewed();
    }
    @And("I click save button")
    public void clickSaveButton(){
        article.clickSaveButton();
    }
    @Then("I can see article by most viewed")
    public void canSeeArticleByMostViewed(){
        article.verifyMostViewed();
    }

//    User Find Article Sort By Newest
    @And("I click Newest")
    public void iClickNewest(){
        article.clickNewest();
    }
    @Then("I can see article by Newest")
    public void canSeeArticleByNewest(){
        article.verifyNewest();
    }

//    User find Article Sort By Oldest
    @And("I click Oldest")
    public void iClickOldest(){
        article.clickOldest();
    }
    @Then("I can see article by oldest")
    public void canSeeArticleByOldest(){
        article.verifyOldest();
    }

//    User Read Article
    @Given("I login to my app")
    public void loginToWomenCenterApp(){
        article.openApplication();
        article.loginApp();
    }
    @When("I enter valid credential")
    public void inputValidCredential(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            article.enterUsername(username);
            article.enterPassword(password);
            article.clickLoginButton();
        }
    }
    @And("I click the article button")
    public void clickTheArticleButton(){
        article.clickArticleButton();
    }
    @And("I click article")
    public void iClickArticle(){
        article.clickArticle();
    }
    @Then("I can read article")
    public void canReadArticle(){
        article.verifyIconComment();
    }

//    User Create Comment Article
    @Given("I login to women center my app")
    public void loginToWomenCenterMyApp(){
        article.openApplication();
        article.loginApp();
    }
    @When("I enter valid email password")
    public void enterValidEmailPassword(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            article.enterUsername(username);
            article.enterPassword(password);
            article.clickLoginButton();
        }
    }
    @And("I click button article")
    public void clickButtonArticle(){
        article.clickArticleButton();
    }
    @And("I click an article")
    public void clickAnArticle(){
        article.clickArticle();
    }
    @And("I click icon comment")
    public void clickIconComment(){
        article.clickIconComment();
    }
    @Then("I can create comment the article")
    public void canCreateCommentTheArticle(){
        article.verifyPageComment();
    }

//    Delete Comment Article
    @And("I click point three")
    public void clickPointThree(){
        article.clickPointThree();
    }
    @And("I click delete button")
    public void clickDeleteButton(){
        article.clickDeleteButton();
    }
    @Then("I success delete my comment")
    public void deleteMyComment(){
        article.verifyPageComment();
    }

//    User Save Article
    @Given("I login to my app women center")
    public void loginToMyAooWomenCenter(){
        article.openApplication();
        article.loginApp();
    }
    @When("I enter valid email and password")
    public void enterValidEmailAndPassword(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            article.enterUsername(username);
            article.enterPassword(password);
            article.clickLoginButton();
        }
    }
    @And("I click articles button")
    public void clickArticlesButton(){
        article.clickArticleButton();
    }
    @And("I click icon save")
    public void iClickIconSave(){
        article.clickIconSaveArticle();
    }
    @And("I click button save")
    public void clickButtonSave(){
        article.clickSaveButton();
    }
    @Then("I can save article")
    public void canSaveArticle(){
        article.verifyArticle();
    }

//    Guest Read Article
    @Given("Guest on the homepage")
    public void guestOnTheHomepage(){
        article.openApplication();
    }
    @When("Guest click article button")
    public void guestClickArticleButton(){
        article.clickArticleButton();
    }
    @And("Guest click article")
    public void guestClickArticle(){
        article.clickArticle();
    }
    @Then("Guest can read the article")
    public void guestCanReadTheArticle(){
        article.verifyIconComment();
    }

//    Guest Can't Save Article
    @And("Guest click icon save")
    public void guestClickIconSave(){
        article.clickIconSaveArticle();
    }
    @Then("Guest redirected to the login page")
    public void guestRedirectedToTheLoginPage(){
        article.verifyLoginPage();
    }

//    Guest Can't Comment Article
    @And("Guest click icon comment")
    public void guestClickIconComment(){
        article.clickIconComment();
    }
}