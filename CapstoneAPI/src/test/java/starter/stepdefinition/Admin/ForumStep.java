package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Forum;

public class ForumStep {
    @Steps
    Forum forum;

    // View All Forum
    @Given("I set forum endpoint URL")
    public void setCareerEndpoint() {
        forum.setForumEndpoint();
    }
    @When("I send a get forum request with valid auth")
    public void sendReq() {
        forum.sendReq();
    }
    @Then("I successfully view all forum")
    public void successViewAllForum() {
        forum.response200();
    }

    // View All Forum Invalid Endpoint
    @Given("I set forum invalid endpoint URL")
    public void setCareerInvEndpoint() {
        forum.setForumInvEndpoint();
    }
    @When("I send a get forum request with invalid endpoint")
    public void sendReqInvEndpoint() {
        forum.sendReqInvEnd();
    }
    @Then("I fail view all forum 404")
    public void failViewForum404() {
        forum.response404();
    }

    // View All Forum Invalid Token
    @Given("I set forum endpoint")
    public void setCareerInvToken() {
        forum.setForumEndpoint();
    }
    @When("I send a get forum request with invalid token")
    public void sendReqInvToken() {
        forum.sendReqInvToken();
    }
    @Then("I fail view all forum 401")
    public void failViewForum401() {
        forum.response401();
    }
}
