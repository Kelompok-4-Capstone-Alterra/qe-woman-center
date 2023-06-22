package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Counselor;

import java.util.List;
import java.util.Map;

public class CounselorStep {
    @Steps
    Counselor counselor;

    // View counselor list based on topic
    @Given("I login to women center app")
    public void onHomepage() {
        counselor.firstOpenApplication();
        counselor.toLogin();
    }
    @When("I enter credential and success login")
    public void enterUserCredential(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            counselor.enterUsername(username);
            counselor.enterPassword(password);
            counselor.clickLoginButton();
        }
    }
    @And("I go to counselor page")
    public void clickCounselorButton() {
        counselor.clickCounselorButton();
    }
    @And("Click one of the displayed topic")
    public void continueStep() {
        counselor.chooseTopic();
        counselor.continueStep();
    }
    @Then("I can see counselor list based on picked topic")
    public void counselorList() {
        counselor.listCounselor();
    }

    // View counselor list with sorting
    @Given("I login to women center application")
    public void homepage() {
        counselor.firstOpenApplication();
        counselor.toLogin();
    }
    @When("I enter credential and success login to app")
    public void enterCredential(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            counselor.enterUsername(username);
            counselor.enterPassword(password);
            counselor.clickLoginButton();
        }
    }
    @And("I going to counselor page")
    public void clickCounselorButtons() {
        counselor.clickCounselorButton();
    }
    @And("Click one of the displayed topics and continue step")
    public void chooseTopic() {
        counselor.chooseTopic();
        counselor.continueStep();
    }
    @And("I click sort button")
    public void sortButton() {
        counselor.sort();
    }
    @And("Choose desired sorting")
    public void chooseSorting() {
        counselor.highestRatingButton();
        counselor.sort();
        counselor.highestPriceButton();
        counselor.sort();
        counselor.lowestPriceButton();
    }
    @Then("I can see counselor list in sorted list")
    public void sortedCounselorList() {
        counselor.listCounselor();
    }

    // View counselor detail
    @Given("I login to application")
    public void homepages() {
        counselor.firstOpenApplication();
        counselor.toLogin();
    }
    @When("I enter credential to login")
    public void enterCredential1(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            counselor.enterUsername(username);
            counselor.enterPassword(password);
            counselor.clickLoginButton();
        }
    }
    @And("I click counselor counselor")
    public void clickCounselorBtn() {
        counselor.clickCounselorButton();
    }
    @And("Click one of the displayed topics and continue steps")
    public void chooseTopics() {
        counselor.chooseTopic();
        counselor.continueStep();
    }
    @And("Choose desired counselor")
    public void chooseCounselor() {
        counselor.clickCounselor();
    }
    @Then("I can see counselor detail")
    public void counselorDetail() {
        counselor.detail();
    }

}
