package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Transaction;

public class TransactionSteps {
    @Steps
    Transaction transaction;

    // show
    @Given("I set user get transaction endpoint with {string}")
    public void iSetUserGetTransactionEndpointWith(String uuid) {
        transaction.setUserGetTransactionDetailEndpoint(uuid);
    }

    @When("I send GET user get transaction request")
    public void iSendGETUserGetTransactionRequest() {
        transaction.sendUserGetTransactionDetailRequest();
    }

    @Then("I receive user get transaction status code response {string}")
    public void iReceiveUserGetTransactionStatusCodeResponse(String code) {
        int statusCode = Integer.parseInt(code);
        transaction.verifyUserGetTransactionDetailResponseCode(statusCode);
    }

    @Given("I set POST transaction endpoint")
    public void setPostTransaction(){transaction.setPostTransaction();}
    @When("I send HTTP POST transaction request with valid endpoint")
    public void sendPostReqTransaction(){transaction.sendPostReqTransaction();}
    @Then("I receive a valid HTTP transaction response code 200 OK")
    public void HttpTransactionResponse200(){transaction.HttpTransactionResponse200();}

    @Given("I set GET all transaction with valid endpoint")
    public void setGetAllTransaction(){transaction.setGetAllTransaction();}
    @When("I send HTTP GET transaction request with valid endpoint")
    public void sendGetReqTransaction(){transaction.sendGetReqTransaction();}
    @Then("I receive a valid HTTP all transaction response code 200 OK")
    public void HttpGetTransactionResponse200(){transaction.HttpGetTransactionResponse200();}

    @Given("I set GET all transaction with invalid endpoint")
    public void setGetTransactionInvalidEndpoint(){transaction.setGetTransactionInvalidEndpoint();}
    @When("I send HTTP GET transaction request with invalid endpoint")
    public void sendGetReqTransactionInvalidEndpoint(){transaction.sendGetReqTransactionInvalidEndpoint();}
    @Then("I receive a valid HTTP all transaction response code 404 Not Found")
    public void HttpGetTransactionResponse404(){transaction.HttpGetTransactionResponse404();}

    @Given("I set GET all transaction with valid endpoint but invalid token")
    public void setGetTransactionInvalidToken(){transaction.setGetTransactionInvalidToken();}
    @When("I send HTTP GET transaction request with invalid token")
    public void sendGetReqTransactionInvalidToken(){transaction.sendGetReqTransactionInvalidToken();}
    @Then("I receive a valid HTTP all transaction response code 401 Invalid Token")
    public void HttpGetTransactionResponse401(){transaction.HttpGetTransactionResponse401();}

}
