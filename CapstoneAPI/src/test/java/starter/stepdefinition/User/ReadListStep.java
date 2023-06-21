package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.ReadList;

public class ReadListStep {
    @Steps
    ReadList readList;

    // Create reading list
    @Given("I set reading list endpoint server")
    public void setReadListEndpointUrl() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list POST request with {string} and {string}")
    public void sendPostRequest(String name, String description) {
        readList.sendPostRequest(name, description);
    }
    @Then("I success create reading list and receive response 200")
    public void fail404() {
        readList.success();
    }

    // Create reading list invalid endpoint
    @Given("I set create reading list endpoint server")
    public void setCreateReadListEndpointUrl() {
        readList.setReadListInvEndpoint();
    }
    @When("I send reading list POST request with {string} and {string} with invalid endpoint")
    public void sendPostRequestInvEnd(String name, String description) {
        readList.sendPostRequestInvEnd(name, description);
    }
    @Then("I fail create reading list and receive response 404")
    public void verifyResponse() {
        readList.failCreateReadList404();
    }

    // Create reading list invalid token
    @Given("I set reading list endpoint")
    public void setLoginEndpoint() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list POST request with {string} and {string} with invalid token")
    public void sendPostRequestInvToken(String name, String description) {
        readList.sendPostRequestInvToken(name, description);
    }
    @Then("I fail create reading list and receive response 401")
    public void fail401() {
        readList.failCreateReadList401();
    }

    // Create reading list empty data
    @Given("I set reading list endpoint url server")
    public void setLoginEndpointUrlServer() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list POST request with {string} and {string} with empty field")
    public void sendPostRequestInvData(String name, String description) {
        readList.sendPostRequest(name, description);
    }
    @Then("I fail create reading list and receive response 400")
    public void fail400() {
        readList.failCreateReadList400();
    }

    // Get all reading list user
    @Given("I set reading list endpoints")
    public void setLoginEndpoints() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list GET request")
    public void sendGetRequest() {
        readList.sendGetRequest();
    }
    @Then("I success get user reading list")
    public void successGetReadList() {
        readList.successGet();
    }

    // Get all reading list user invalid token
    @Given("I set reading list endpoints url")
    public void setLoginEndpointsUrl() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list GET request with invalid token")
    public void sendGetRequestInvToken() {
        readList.sendGetRequestInvToken();
    }
    @Then("I fail get user reading list 401")
    public void failGetReadList() {
        readList.failGet();
    }

    // Add article to reading list
    @Given("I set reading list endpoints server")
    public void setSaveToReadListEndpointUrl() {
        readList.setSaveToReadListEndpoint();
    }
    @When("I send add to reading list POST request with {string} and {string}")
    public void sendPostRequestWIthData(String article_id, String reading_list_id) {
        readList.sendSavePostRequest(article_id, reading_list_id);
    }
    @Then("I receive valid response add article")
    public void response() {
        readList.response200();
    }

    // Add article to reading list invalid token
    @Given("I set reading list endpoints server url")
    public void setSaveToReadListEndpointServerUrl() {
        readList.setSaveToReadListEndpoint();
    }
    @When("I send add to reading list POST request with {string} and {string} with invalid token")
    public void sendSavePostRequestInvToken(String article_id, String reading_list_id) {
        readList.sendSavePostRequestInvToken(article_id, reading_list_id);
    }
    @Then("I receive valid response add article 401")
    public void response401() {
        readList.response401();
    }

    // Add article to reading list empty data
    @Given("I set reading list endpoint server url")
    public void setSaveToReadListEndpointsServerUrl() {
        readList.setSaveToReadListEndpoint();
    }
    @When("I send add to reading list POST request with {string} and {string} with empty data")
    public void sendSavePostRequestInvEmptyData(String article_id, String reading_list_id) {
        readList.sendSavePostRequest(article_id, reading_list_id);
    }
    @Then("I receive valid response add article 400")
    public void response400() {
        readList.response400();
    }
}
