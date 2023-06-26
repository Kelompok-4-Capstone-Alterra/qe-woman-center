package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.ReadingList;

import java.util.List;
import java.util.Map;

public class ReadingListSteps {
    @Steps
    ReadingList readingList;
    // login
    @Given("I am on the homepage to login \\(reading-list)")
    public void iAmOnTheHomepageToLoginCareer() {
        readingList.firstOpenApplication();
        readingList.onHomepage();
    }

    @When("I click button to login \\(reading-list)")
    public void iClickButtonToLoginCareer() {
        readingList.clickButtonLogin();
    }

    @And("I enter following credentials \\(reading-list):")
    public void iEnterFollowingCredentialsCareer(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            readingList.enterUsername(username);
            readingList.enterPassword(password);
            readingList.clickLoginButton();
        }
    }

    @And("I success to login \\(reading-list)")
    public void iSuccessToLoginCareer() {
        readingList.onHomepage();
    }

    // reading list
    @And("I click on reading list feature")
    public void iClickOnReadingListFeature() {
        readingList.clickReadingListFeature();
    }

    @Then("I am on reading list page")
    public void iAmOnReadingListPage() {
        readingList.verifyOnReadingListPage();
    }
}
