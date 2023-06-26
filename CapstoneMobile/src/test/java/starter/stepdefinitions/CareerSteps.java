package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Career;

import java.util.List;
import java.util.Map;

public class CareerSteps {
    @Steps
    Career career;

    // career
    @And("I click on career feature button")
    public void iClickOnCareerFeatureButton() {
        career.clickCareerFeature();
    }

    @Then("I am career information page")
    public void iAmCareerInformationPage() {
        career.verifyOnCareerPage();
    }

    // login
    @Given("I am on the homepage to login \\(career)")
    public void iAmOnTheHomepageToLoginCareer() {
        career.firstOpenApplication();
        career.onHomepage();
    }

    @When("I click button to login \\(career)")
    public void iClickButtonToLoginCareer() {
        career.clickButtonLogin();
    }

    @And("I enter following credentials \\(career):")
    public void iEnterFollowingCredentialsCareer(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            career.enterUsername(username);
            career.enterPassword(password);
            career.clickLoginButton();
        }
    }

    @And("I success to login \\(career)")
    public void iSuccessToLoginCareer() {
        career.onHomepage();
    }
}
