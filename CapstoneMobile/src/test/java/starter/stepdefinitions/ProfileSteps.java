package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Profile;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ProfileSteps {
    @Steps
    Profile profile;

    public static String fieldName;

    @And("I click on profile feature")
    public void iClickOnProfileFeature() {
        profile.clickprofileFeature();
    }

    @And("I click on edit profile button")
    public void iClickOnEditProfileButton() {
        profile.clickProfileEditProfile();
    }

    @And("I am at edit profile page")
    public void iAmAtEditProfilePage() {
        profile.verifyOnEditProfilePage();
    }

    @And("I enter new profile information:")
    public void iEnterNewProfileInformation(DataTable infoTable) {
        List<Map<String, String>> credentials = infoTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("username");
            String name = row.get("name");
            String phone = row.get("phone");

            profile.enterProfileUsername(username);
            profile.enterProfileName(name);
            profile.enterProfilePhone(phone);
        }
    }

    @And("I click save profile changes button")
    public void iClickSaveProfileChangesButton() {
        profile.clickProfileSaveChanges();

        if (Objects.equals(fieldName, "username")) {
            profile.clickProfileConfirmationButton();
        }
    }

    @And("I click on confirmation changes button")
    public void iClickOnConfirmationChangesButton() {
        profile.clickProfileConfirmationButton();
    }

    @Then("I success to update profile information")
    public void iSuccessToUpdateProfileInformation() {
        profile.verifyUpdateProfileSuccess();
    }

    // login
    @Given("I am on the homepage to login \\(profile)")
    public void iAmOnTheHomepageToLoginProfile() {
        profile.firstOpenApplication();
        profile.onHomepage();
    }

    @When("I click button to login \\(profile)")
    public void iClickButtonToLoginProfile() {
        profile.clickButtonLogin();
    }

    @And("I enter following credentials \\(profile):")
    public void iEnterFollowingCredentialsProfile(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            profile.enterUsername(username);
            profile.enterPassword(password);
            profile.clickLoginButton();
        }
    }

    @And("I success to login \\(profile)")
    public void iSuccessToLoginProfile() {
        profile.onHomepage();
    }

    // invalid
    @And("I enter invalid credential:")
    public void iEnterInvalidCredential(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String field = row.get("field");
            String value = row.get("value");

            fieldName = field;
            if (Objects.equals(field, "username")) {
                profile.enterProfileUsername(value);
            } else if (Objects.equals(field, "name")) {
                profile.enterProfileName(value);
            } else if (Objects.equals(field, "phone")) {
                profile.enterProfilePhone(value);
            }
        }
    }

    @Then("I receive error message when update profile")
    public void iReceiveErrorMessageWhenUpdateProfile() {
        profile.verifyFailedMessage();
    }

    @And("I enter invalid credential at {string} with {string} :")
    public void iEnterInvalidCredentialAtWith(String field, String value) {
        fieldName = field;
        if (Objects.equals(field, "username")) {
            profile.enterProfileUsername(value);
        } else if (Objects.equals(field, "name")) {
            profile.enterProfileName(value);
        } else if (Objects.equals(field, "phone")) {
            profile.enterProfilePhone(value);
        }
    }
}
