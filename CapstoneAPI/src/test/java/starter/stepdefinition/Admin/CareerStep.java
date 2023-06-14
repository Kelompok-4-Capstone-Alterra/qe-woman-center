package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Career;

public class CareerStep {
    @Steps
    Career career;

    // View All Career
    @Given("I set career endpoint URL")
    public void setCareerEndpoint() {
        career.setCareerEndpoint();
    }
    @When("I send a get career request with valid auth")
    public void sendReq() {
        career.sendReq();
    }
    @Then("I successfully view all career")
    public void successViewAllCareer() {
        career.successViewAllCareer();
    }

    // View All Career With Wrong Method
    @Given("I set career endpoint")
    public void setCareerEndpoints() {
        career.setCareerEndpoint();
    }
    @When("I send a get career request with wrong method")
    public void sendPutReq() {
        career.sendReqInvalidMethod();
    }
    @Then("I fail to view all career and receive status code 404")
    public void failViewCareer404() {
        career.failViewCareer404();
    }

    // View All Career With Wrong Endpoint
    @Given("I set career wrong endpoint")
    public void setCareerWrongEndpoints() {
        career.setInvalidCareerEndpoint();
    }
    @When("I send a get career request with wrong endpoint")
    public void sendCareerReq() {
        career.sendReqInvalidEndpoint();
    }
    @Then("I receive status code 404")
    public void responseCode404() {
        career.failViewCareer404();
    }

    // View All Career With Wrong Token
    @Given("I set career valid endpoint")
    public void setCareerValidEndpoints() {
        career.setInvalidCareerEndpoint();
    }
    @When("I send a get career request with wrong token")
    public void sendCareerReqInvToken() {
        career.sendReqInvalidToken();
    }
    @Then("I receive status code 401")
    public void responseCode401() {
        career.failViewCareer401();
    }

    // Add new career data
    @Given("I set add career endpoint")
    public void setLoginEndpointUrl() {
        career.setCareerEndpoint();
    }
    @When("I send POST request valid data")
    public void sendPostRequest(io.cucumber.datatable.DataTable dataTable) {
        career.data(dataTable);
    }
    @Then("I receive valid response")
    public void verifyResponse() {
        career.response();
    }
}
