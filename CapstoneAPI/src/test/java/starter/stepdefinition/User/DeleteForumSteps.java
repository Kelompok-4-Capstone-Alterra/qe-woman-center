package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.DeleteForum;

public class DeleteForumSteps {
    @Steps
    DeleteForum deleteForum;

//    Valid Endpoint
    @Given("I set delete forum valid endpoint")
    public void setDeleteForumValidEndpoint(){
        deleteForum.setDeleteForumWithValidEndpoint();
    }
    @When("I send delete forum HTTP request with valid endpoint")
    public void sendDeleteForumHTTPReqValidEndpoint(){
        deleteForum.sendDeleteForumWithValidEndpoint();
    }
    @Then("I received delete forum HTTP response code 200")
    public void receivedDeleteForumHTTPResponseCode200(){
        deleteForum.receivedDeleteForumResponseCode200();
    }

//    Invalid Endpoint
    @Given("I set delete forum invalid endpoint")
    public void setDeleteForumInvalidEndpoint(){
        deleteForum.setDeleteForumWithInvalidEndpoint();
    }
    @When("I send delete forum HTTP request with invalid endpoint")
    public void sendDeleteForumHTTPReqInvalidEndpoint(){
        deleteForum.sendDeleteForumWithInvalidEndpoint();
    }
    @Then("I received delete forum HTTP response code 404")
    public void receivedDeleteForumHTTPResponseCode404(){
        deleteForum.receivedDeleteForumResponseCode404();
    }

//    Invalid Id
    @Given("I set delete forum invalid id")
    public void setDeleteForumInvalidId(){
        deleteForum.setDeleteForumWithInvalidId();
    }
    @When("I send delete forum HTTP request with invalid id")
    public void sendDeleteForumHTTPReqInvalidId(){
       deleteForum.sendDeleteForumWithInvalidId();
    }
    @Then("I received delete forum HTTP response code 400")
    public void receivedDeleteForumHTTPResponseCode400(){
       deleteForum.receivedDeleteForumResponseCode400();
    }

//    Without Token
    @Given("I set delete forum without token")
    public void setDeleteForumWithoutToken(){
        deleteForum.setDeleteForumWithValidEndpoint();
    }
    @When("I send delete forum HTTP request without token")
    public void sendDeleteForumHTTPReqWithoutToken(){
        deleteForum.sendDeleteForumWithoutToken();
    }
    @Then("I received delete forum HTTP response code 401")
    public void receivedDeleteForumHTTPResponseCode401(){
       deleteForum.receivedDeleteForumResponseCode401();
    }
}
