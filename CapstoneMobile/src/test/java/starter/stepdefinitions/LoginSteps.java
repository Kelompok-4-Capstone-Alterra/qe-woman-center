package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Login;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    @Steps
    Login login;

    //Scenario: TC12 - Login with invalid email
    @Given("I am on homepage to login")
    public void onHomepage() {
        login.firstOpenApplication();
        login.onTheHomepageToLogin();
    }
    @When("I click button to login")
    public void clickButtonLogin() {
        login.clickWidgetButtonToLogin();
    }
    @And("I enter following credentials:")
    public void enterCredential(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            login.enterUsername(username);
            login.enterPassword(password);
            login.clickLoginButton();
        }
    }
    @Then("I success to login")
    public void successLogin() {
        login.onTheHomepageToLogin();
    }

    //Scenario: TC12 - Login with invalid email
    @Given("I am on the homepage to login")
    public void onHomepageToLogin() {
        login.firstOpenApplication();
        login.onTheHomepageToLogin();
    }
    @When("I click the button to login")
    public void clickButtonToLogin() {
        login.clickWidgetButtonToLogin();
    }
    @And("I enter the following credentials:")
    public void enterCredentials(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            if (username != null && password != null){
                login.enterUsername(username);
                login.enterPassword(password);
                login.clickLoginButton();
                login.failedLoginInvalidData();
                login.clearCredentials();
            }else if (username == null) {
                login.enterPassword(password);
                login.clickLoginButton();
                login.failedLoginUsernameEmpty();
                login.clearCredentials();
            } else if (password == null) {
                login.enterUsername(username);
                login.clickLoginButton();
                login.failedLoginPasswordEmpty();
                login.clearCredentials();
            }
        }
    }
    @Then("I fail to login")
    public void failedLogin() {

    }
}
