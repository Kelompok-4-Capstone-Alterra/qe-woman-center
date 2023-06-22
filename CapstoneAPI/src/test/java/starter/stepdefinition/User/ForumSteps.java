package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Forum;

public class ForumSteps {
    @Steps
    Forum forum;
    @Given("I set create forum endpoint")
    public void setCreateForumEnd(){forum.setCreateForumEnd();}
    @When("I send POST create forum Request")
    public void sendPostCreateForumReq(){forum.sendPostCreateForumReq();}
    @Then("I success create forum and response code 200")
    public void successCreateForum(){forum.successCreateForum();}
    @When("I send POST create forum Request with empty category id")
    public void sendReqEmptyCategoryId(){forum.sendReqEmptyCategoryId();}
    @Then("I fail create forum and message category is required")
    public void messageCategoryisRequired(){forum.messageCategoryisRequired();}
    @When("I send POST create forum Request with empty link")
    public void sendReqEmptyLink(){forum.sendReqEmptyLink();}
    @Then("I fail create forum and message link is required")
    public void messageLinkIsRequired(){forum.messageLinkIsRequired();}
    @When("I send POST create forum Request with empty topic")
    public void sendReqEmptyTopic(){forum.sendReqEmptyTopic();}
    @Then("I fail create forum and message topic are required")
    public void messageTopicAreRequired(){forum.messageTopicAreRequired();}
    @When("I send POST crete forum Request with invalid token")
    public void sendPostReqInvalidToken(){forum.sendPostReqInvalidToken();;}
    @Then("I fail create forum and message invalid token")
    public void failCreateForum(){forum.failCreateForum();}
    @Given("I set get all forum endpoint")
    public void setGetAllForumEnd(){forum.setGetAllForumEnd();}
    @When("I send GET all forum Request")
    public void sendGetReq(){forum.sendGetReq();}
    @Then("I success get all forum and response code 200")
    public void successGetAllForum(){forum.successGetAllForum();}
    @When("I send GET all forum Request with invalid token")
    public void sendReqInvalidToken(){forum.sendReqInvalidToken();}
    @Then("I fail get all forum and message invalid token")
    public void messageInvalidToken(){forum.messageInvalidToken();}

    // update forum
    @Given("I set PUT forum valid endpoint")
    public void setPutForumValidEndpoint(){forum.setPutForumValidEndpoint();}
    @When("I send HTTP PUT forum to request with valid endpoint")
    public void sendPutReqForumValidEndpoint(){forum.sendPutReqForumValidEndpoint();}
    @Then("I received HTTP forum response code 200 OK")
    public void HttpPutForumResponse200(){forum.HttpPutForumResponse200();}

    // update forum invalid endpoint
    @Given("I set PUT forum invalid endpoint")
    public void setPutForumInvalidEndpoint(){forum.setPutForumInvalidEndpoint();}
    @When("I send HTTP PUT forum to request with invalid endpoint")
    public void sendPutReqForumInvalidEndpoint(){forum.sendPutReqForumInvalidEndpoint();}
    @Then("I received HTTP forum response code 404 Not Found")
    public void HttpPutForumResponse404(){forum.HttpPutForumResponse404();}

    // update forum invalid id
    @Given("I set PUT forum valid endpoint with invalid ID")
    public void setPutForumInvalidID(){forum.setPutForumInvalidID();}
    @When("I send HTTP PUT forum to request with invalid ID")
    public void sendPutReqForumInvalidID(){forum.sendPutReqForumInvalidID();}
    @Then("I received HTTP forum response code 400 Bad Request")
    public void HttpPutForumResponse400(){forum.HttpPutForumResponse400();}

    // update forum invalid token
    @Given("I set PUT forum valid endpoint with invalid token")
    public void setPutForumInvalidToken(){forum.setPutForumInvalidToken();}
    @When("I send HTTP PUT forum to request with invalid token")
    public void sendPutReqForumInvalidToken(){forum.sendPutReqForumInvalidToken();}
    @Then("I received HTTP forum response code 401 Invalid Token")
    public void HttpPutForumResponse401(){forum.HttpPutForumResponse401();}

    // join forum
    @Given("I set POST forum valid endpoint")
    public void setPostForumValidEndpoint(){forum.setPostForumValidEndpoint();}
    @When("I send HTTP POST forum to request with valid endpoint")
    public void sendPostReqForumValidEndpoint(){forum.sendPostReqForumValidEndpoint();}
    @Then("I received HTTP join forum response code 200 OK")
    public void HttpPostForumResponse200(){forum.HttpPostForumResponse200();}

    // join forum invalid endpoint
    @Given("I set POST forum invalid endpoint")
    public void setPostForumInvalidEndpoint(){forum.setPostForumInvalidEndpoint();}
    @When("I send HTTP POST forum to request with invalid endpoint")
    public void sendPostReqForumInvalidEndpoint(){forum.sendPostReqForumInvalidEndpoint();}
    @Then("I received HTTP join forum response code 404 Not Found")
    public void HttpPostForumResponse404(){forum.HttpPostForumResponse404();}

    // join forum invalid id
    @Given("I set POST forum valid endpoint with invalid id")
    public void setPostForumInvalidID(){forum.setPostForumInvalidID();}
    @When("I send HTTP POST forum to request with invalid id")
    public void sendPostReqForumInvalidID(){forum.sendPostReqForumInvalidID();}
    @Then("I received HTTP join forum response code 400 Bad Request")
    public void HttpPostForumResponse400(){forum.HttpPostForumResponse400();}

    // join forum invalid token
    @Given("I set POST forum valid endpoint with invalid token")
    public void setPostForumInvalidToken(){forum.setPostForumInvalidToken();}
    @When("I send HTTP POST forum to request with invalid token")
    public void sendPostReqForumInvalidToken(){forum.sendPostReqForumInvalidToken();}
    @Then("I received HTTP join forum response code 401 Invalid Token")
    public void HttpPostForumResponse401(){forum.HttpPostForumResponse401();}


}
