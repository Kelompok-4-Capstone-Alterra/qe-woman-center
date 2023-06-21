package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Counselor.AddNewCounselor;
import starter.admin.Counselor.GetCounselorByID;
import starter.admin.Counselor.GetAllCounselor;

public class CounselorSteps {
    @Steps
    AddNewCounselor addNewCounselor;
    @Steps
    GetAllCounselor getAllCounselor;
    @Steps
    GetCounselorByID getCounselorByID;

    @Given("I set POST endpoint")
    public void setPostEndpoint(){addNewCounselor.setPostEndpoint();}
    @When("I send POST HTTP request")
    public void sendPostRequest(io.cucumber.datatable.DataTable dataTable) {
        addNewCounselor.data(dataTable);}
    @Then("I receive valid HTTP response code 200 OK")
    public void HttpPostResponse200(){addNewCounselor.HttpPostResponse200();}

    @Given("I set GET all counselor with valid endpoint")
    public void setGetAllCounselorWithValidEndpoint(){getAllCounselor.setGetAllCounselorWithValidEndpoint();}
    @When("I send HTTP GET request with valid endpoint")
    public void sendReqValidEndpoint(){getAllCounselor.sendReqValidEndpoint();}
    @Then("I receive a valid HTTP response code 200 OK")
    public void HttpResponse200(){getAllCounselor.HttpResponse200();}

    @Given("I set GET all counselor with invalid endpoint")
    public void setGetAllCounselorWithInvalidEndpoint(){getAllCounselor.setGetAllCounselorWithInvalidEndpoint();}
    @When("I send HTTP GET request with invalid endpoint")
    public void sendReqInvalidEndpoint(){getAllCounselor.sendReqInvalidEndpoint();}
    @Then("I received HTTP response code 404 Not Found")
    public void HttpResponse404(){getAllCounselor.HttpResponse404();}

    @Given("I set GET valid endpoint by ID")
    public void setGetValidEndpointByID(){getCounselorByID.setGetValidEndpointByID();}
    @When("I send HTTP GET to the request with valid endpoint")
    public void sendIDReqValidEndpoint(){getCounselorByID.sendIDReqValidEndpoint();}
    @Then("I receive a HTTP response code 200 OK")
    public void IDHttpResponse200(){getCounselorByID.IDHttpResponse200();}

    @Given("I set GET counselor valid endpoint with invalid ID")
    public void setGetInvalidID(){getCounselorByID.setGetInvalidID();}
    @When("I send HTTP GET counselor to request with invalid ID")
    public void sendReqInvalidID(){getCounselorByID.sendReqInvalidID();}
    @Then("I receive HTTP response code is 404 Not Found")
    public void IDHttpResponse404(){getCounselorByID.IDHttpResponse404();}

    @Given("I set GET valid endpoint with empty ID")
    public void setGetEmptyID(){getCounselorByID.setGetEmptyID();}
    @When("I send HTTP GET to request with valid endpoint with empty ID")
    public void sendReqEmptyID(){getCounselorByID.sendReqEmptyID();}
    @Then("I receive a HTTP response code 400 Bad Request")
    public void HttpResponse400(){getCounselorByID.HttpResponse400();}
}
