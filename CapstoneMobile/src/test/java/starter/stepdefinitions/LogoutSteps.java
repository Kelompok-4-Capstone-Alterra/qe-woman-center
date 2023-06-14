package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Login;
import starter.mobile.Logout;

import java.util.List;
import java.util.Map;

public class LogoutSteps {
    @Steps
    Login login;

    @Steps
    Logout logout;

    // User successfully logout
    @Given("I go to login page")
    public void onHomepage() {
        logout.firstOpenApplication();
        logout.toLogin();
    }
    @When("I enter user credential and success login")
    public void enterUserCredential(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            logout.enterUsername(username);
            logout.enterPassword(password);
            logout.clickLoginButton();
        }
    }
    @And("I go to profile page")
    public void toProfile() {
        logout.toProfile();
    }
    @And("Click sign out")
    public void clickSignOut() {
        logout.clickSignOut();
    }
    @And("Click sure")
    public void clickSure(){
        logout.clickSure();
    }
    @Then("I successfully logout")
    public void successLogout() {
        logout.onTheHomepageToLogin();
    }

    // User cancel logout
    @Given("I open login page")
    public void onTheHomepage() {
        logout.firstOpenApplication();
        logout.toLogin();
    }
    @When("I enter user credential and successfully login")
    public void enterUserCredentials(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            logout.enterUsername(username);
            logout.enterPassword(password);
            logout.clickLoginButton();
        }
    }
    @And("I go to user profile page")
    public void toUserProfile() {
        logout.toProfile();
    }
    @And("Click sign out button")
    public void clickSignOutButton() {
        logout.clickSignOut();
    }
    @And("Click maybe later")
    public void clickLater(){
        logout.clickLater();
    }
    @Then("I cancel logout")
    public void cancelLogout() {

    }
}
