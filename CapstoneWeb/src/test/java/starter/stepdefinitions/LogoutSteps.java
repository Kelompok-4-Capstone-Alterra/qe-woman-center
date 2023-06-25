package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.LandingPage;
import starter.pages.LogoutPage;

public class LogoutSteps {
    @Steps
    LogoutPage logoutPage;
    LandingPage landingPage;
    DashboardPage dashboardPage;

//    Success Logout
    @Given("I click icon logout")
    public void clickIconLogout(){
        logoutPage.clickIconLogout();
    }

    @And("I click sure pop up confirm exit")
    public void clickSurePopUpConfirmExit(){
        logoutPage.clickPopUpExit();
    }

    @Then("I redirected to the landing page")
    public void redirectedToTheLandingPage(){
        landingPage.validOnLandingPage();
    }

//    Cancel Logout
    @And("I click pop up maybe later for confirm exit")
    public void clickPopupMaybeLaterConfirmExit(){
        logoutPage.clickPopUpExitForMaybeLetter();
    }
    @Then("I am go back on dashboard")
    public void goBackOnDashBoard(){
        dashboardPage.validOnTheDashboard();
    }
}
