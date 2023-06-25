package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    DashboardPage dashboard;

//    Success Login
    @Given("I am on the landing page")
    public void onTheLandingPage(){
        loginPage.open();
    }
    @When("I click get into the dashboard button")
    public void clickGetIntoTheDashboardButton(){
        loginPage.clickIntoTheDashboard();
    }
    @And("I enter username")
    public void enterUsername(){
        loginPage.enterUsername("admin");
    }
    @And("I enter password")
    public void enterPassword(){
        loginPage.enterPassword("admin");
    }
    @And("I click sign in button")
    public void doClickSignInButton(){
        loginPage.clickSignInButton();
    }
    @Then("I am on the dashboard")
    public void onTheHomePage(){
        dashboard.validOnTheDashboard();
    }

//    Invalid Username
    @And("I enter invalid username")
    public void enterInvalidUsername(){
        loginPage.enterUsername("adm");
    }
    @Then("I see error message {string}")
    public void seeErrorMessage(String message){
        loginPage.validateErrorMessageInvalidUsernamePwd();
        loginPage.iValidateEqualMessageErrorInvUsernamePwd(message);
    }

//    Invalid Password
    @And("I enter invalid password")
    public void enterInvalidPwd(){
        loginPage.enterPassword("adm");
    }

//    Empty Username
    @And("I enter empty username")
    public void enterEmptyUsername(){
        loginPage.enterUsername("");
    }
    @Then("I see error message required {string}")
    public void seeErrorMessageRequired(String message){
        loginPage.validateErrorMessageEmptyUsernamePwd();
        loginPage.iValidateEqualMessageErrorEmptyUsernamePwd(message);
    }

//    Empty Password
    @And("I enter empty password")
    public void enterEmptyPwd(){
        loginPage.enterPassword("");
    }
}
