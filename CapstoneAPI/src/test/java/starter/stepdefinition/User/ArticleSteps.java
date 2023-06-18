package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Article;

public class ArticleSteps {
    @Steps
    Article article;

    @Given("I set user get article endpoint with {string}")
    public void iSetUserGetArticleEndpointWith(String uuid) {
        article.setUserGetArticleEndpoint(uuid);
    }

    @When("I send GET user get article request")
    public void iSendGETUserGetArticleRequest() {
        article.sendUserGetArticleRequest();
    }

    @Then("I receive user get article status code response {string}")
    public void iReceiveUserGetArticleStatusCodeResponse(String code) {
        int statusCode = Integer.parseInt(code);
        article.verifyUserArticleResponseCode(statusCode);
    }
}
