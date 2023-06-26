package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.GetForumById;

public class GetForumByIdSteps {
    @Steps
    GetForumById getForumById;

//    Valid Endpoint
    @Given("I set GET forum by id valid endpoint")
    public void setGetForumByIdValidEndpoint(){
        getForumById.setGetForumByIdWithValidEndpoint();
    }
    @When("I send GET forum by id HTTP request with valid endpoint")
    public void sendGetForumByIdValidEndpoint(){
        getForumById.sendGetForumByIdWithValidEndpoint();
    }
    @Then("I received valid GET forum by id HTTP response code 200")
    public void receivedValidGetForumByIdResponseCode200(){
        getForumById.receivedGetForumByIdResponseCode200();
    }

//    Invalid Endpoint
    @Given("I set GET forum by id invalid endpoint")
    public void setCodeForumByIdInvalidEndpoint(){
        getForumById.setGetForumByIdWithInValidEndpoint();
    }
    @When("I send GET forum by id HTTP request with invalid endpoint")
    public void sendGetForumByIdHTTPReqInvalidEndpoint(){
        getForumById.sendGetForumByIdWithInvalidEndpoint();
    }
    @Then("I received GET forum by id HTTP response code 404")
    public void receivedValidGetForumByIdHTTPResponseCode404(){
        getForumById.receivedGetForumByIdResponseCode404();
    }

//    Invalid Id
    @Given("I set GET forum by id invalid Id")
    public void setGetForumByIdInvalidId(){
        getForumById.setGetForumByIdWithInvalidId();
    }
    @When("I send GET forum by id HTTP request with invalid Id")
    public void sendGetForumByIdHTTPReqInvalidId(){
        getForumById.sendGetForumByIdWithInvalidId();
    }
    @Then("I received GET forum by id HTTP response code 400")
    public void receivedGetForumByIdHTTPResponseCode400(){
        getForumById.receivedGetForumByIdResponseCode400();
    }

//    Without Token
    @Given("I set GET forum by id without token")
    public void setGetForumByIdWithoutToken(){
        getForumById.setGetForumByIdWithValidEndpoint();
    }
    @When("I send GET forum by id HTTP request without token")
    public void sendGetForumByIdHTTPReqWithoutToken(){
        getForumById.sendGetForumByIdWithoutToken();
    }
    @Then("I received GET forum by id HTTP response code 401")
    public void receivedGetForumByIdHTTPResponseCode401(){
        getForumById.receivedGetForumByIdResponseCode401();
    }
}
