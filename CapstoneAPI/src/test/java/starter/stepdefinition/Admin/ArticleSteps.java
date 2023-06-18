package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Article;

public class ArticleSteps {
    @Steps
    Article article;

    @Given("I set admin delete article endpoint with {string}")
    public void iSetAdminDeleteArticleEndpointWith(String uuid) {
        article.setDeleteAdminArticleEndpoint(uuid);
    }

    @When("I send DELETE admin article request")
    public void iSendDELETEAdminArticleRequest() {
        article.sendDeleteAdminArticleRequest();
    }

    @Then("I receive admin article status code response {string}")
    public void iReceiveAdminArticleStatusCodeResponse(String code) {
        int statusCode = Integer.parseInt(code);
        article.verifyDeleteAdminArticleResponseCode(statusCode);
    }
}
