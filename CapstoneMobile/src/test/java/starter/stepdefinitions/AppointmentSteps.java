package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Appointment;

import java.util.List;
import java.util.Map;

public class AppointmentSteps {
    @Steps
    Appointment appointment;

//    Make Appointment with schedule Unavailable
    @Given("I login app women center")
    public void iLoginAppWomenCenter(){
        appointment.openApplication();
        appointment.loginApp();
    }
    @When("I input valid credential login")
    public void iInputValidCredentialLogin(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String username = row.get("Username");
            String password = row.get("Password");

            appointment.enterUsername(username);
            appointment.enterPassword(password);
            appointment.clickLoginButton();
        }
    }
    @And("I click counseling button")
    public void iClickCounselingButton(){
        appointment.clickCounselingButton();
    }
    @And("I choose topic counseling")
    public void iChooseTopicCounseling(){
        appointment.chooseTopic();
    }
    @And("I click continue button")
    public void iCLickContinueButton(){
        appointment.clickContinueButton();
    }
    @And("I choose counselor")
    public void iChooseCounselor(){
        appointment.chooseCounselor();
    }
    @Then("I cant make appointment because schedule Unavailable")
    public void redirectedToTheTransactionPage(){
    }

//    Guest Make Appointment
    @Given("Guest on the homepage button for make appointment")
    public void clickCounselingButtonForMakeAppointment(){
        appointment.openApplication();
    }
    @And("Guest click counseling button")
    public void chooseTopicCounseling(){
        appointment.clickCounselingButton();
    }
    @And("Guest choose topic counseling")
    public void guestChooseTopicCounseling(){
        appointment.chooseTopic();
    }
    @And("Guest click continue button")
    public void guestClickContinueButton(){
        appointment.clickContinueButton();
    }
    @And("Guest choose counselor")
    public void guestChooseCounselor(){
        appointment.chooseCounselor();
    }
    @Then("Guest redirected to the login page for make appointment")
    public void redirectedToTheLoginPageForMakeAppointment(){
        appointment.verifyLoginPage();
    }
}
