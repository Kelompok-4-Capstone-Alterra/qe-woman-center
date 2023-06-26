package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Transactions;

import java.util.List;
import java.util.Map;

public class TransactionSteps {
    @Steps
    Transactions transactions;

//    View Ongoing Transaction
    @Given("User login women center")
    public void userLoginWomenCenter(){
       transactions.openApplication();
       transactions.loginApp();
    }
    @When("User enter valid credential")
    public void userEnterCredential(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            transactions.enterUsername(username);
            transactions.enterPassword(password);
            transactions.clickLoginButton();
        }
    }
    @And("User click transaction bar")
    public void userClickTransactionBar(){
        transactions.clickTransactionBar();
    }
    @Then("User can see ongoing transaction")
    public void UserCanSeeOngoingTransaction(){
        transactions.verifyOngoingTransaction();
    }

//    View History Transaction
    @Given("User login women center app")
    public void userLoginWomenCenterApp(){
        transactions.openApplication();
        transactions.loginApp();
    }
    @When("User enter valid credential for login")
    public void userEnterValidCredentialForLogin(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            transactions.enterUsername(username);
            transactions.enterPassword(password);
            transactions.clickLoginButton();
        }
    }
    @And("User click navbar transaction")
    public void userClickNavbarTransaction(){
        transactions.clickTransactionBar();
    }
    @Then("User can see history transaction")
    public void userCanSeeHistoryTransaction(){
        transactions.clickHistoryLink();
        transactions.verifyHistoryLink();
    }
}
