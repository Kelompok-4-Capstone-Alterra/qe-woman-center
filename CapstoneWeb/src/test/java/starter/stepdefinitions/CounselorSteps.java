package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CounselorPage;
import starter.pages.DashboardPage;
import starter.pages.LoginPage;

public class CounselorSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    DashboardPage dashboard;
    @Steps
    CounselorPage counselor;

    @Given("I am on the dashboard page")
    public void onDashboardPage(){
        loginPage.open();
        loginPage.clickIntoTheDashboard();
        loginPage.enterUsername("admin");
        loginPage.enterPassword("admin");
        loginPage.clickSignInButton();
        dashboard.validOnTheDashboard();
    }
    @When("I click User and Counselor button")
    public void clickUserAndCounselorButton(){counselor.clickUserAndCounselorButton();}
    @And("I click view button")
    public void clickViewButton(){counselor.clickViewButton();}
    @Then("I success view counselor data")
    public void viewCounselorData(){counselor.viewCounselorData();}

    //close view counselor
    @And("I click close button")
    public void clickClose(){counselor.clickClose();}
    @Then("I am on counselor page")
    public void onCounselorPage(){counselor.onCounselorPage();}

    //delete counselor
    @And("I click delete button")
    public void clickDeleteButton(){counselor.clickDeleteButton();}
    @And("I click sure button")
    public void clickSureButton(){counselor.clickSureButton();}
    @Then("I see view message {string}")
    public void iSeeViewMessage(String message) {
        counselor.viewAlert();
        counselor.iViewAlert(message);
    }

    //cancel delete counselor
    @And("I click Maybe Later button")
    public void clickMaybeLater(){counselor.clickMaybeLater();}

    //update counselor
    @And("I update name of counselor")
    public void updateName(){counselor.updateName("Caccaa Marica");}
    @And("I update username of counselor")
    public void updateUsername(){counselor.updateUsername("CacaaaMari");}
    @And("I update email")
    public void updaeteEmail(){counselor.updateEmail("cacama@gmail.com");}
    @And("I update description")
    public void updateDescription(){counselor.updateDescription("counselor baik sekali");}
    @And("I update counseling price")
    public void updatePrice(){counselor.updatePrice("2000000");}
    @And("I click save button")
    public void clickSaveButton(){counselor.clickSaveButton();}
    @Then("I see message {string}")
    public void seeMessage(String message){
        counselor.seeMessage();
        counselor.iSeeMessage(message);
    }

    //Add  counselor empty name
    @And("I click add counselor button")
    public void clickAddCounselorButton(){counselor.clickAddCounselorButton();}
    @And("I fill empty name")
    public void fillEmptyName(){counselor.fillName("");}
    @And("I fill email")
    public void fillEmail(){counselor.fillEmail("kaka@gmail.com");}
    @And("I fill username")
    public void fillUsername(){counselor.fillUsername("kaka123");}
    @And("I choose category")
    public void chooseCategory(){
        counselor.clickChooseCategory();
        counselor.clickOption();
    }
    @And("I fill description")
    public void fillDescription(){counselor.fillDescription("Counselor Self Development");}
    @And("I fill counseling price")
    public void fillCounselingPrice(){counselor.fillCounselingPrice("120000");}
    @And("I click Add new counselor button")
    public void clickAddNewCounselor(){counselor.clickAddCounselor();}
    @Then("I see warning message {string}")
    public void iSeeWarningMessage(String message) {
        counselor.validateWrningMessageEmptyName();
        counselor.iValidateWarningMessageEmptyName(message);}
    @And("I fill name")
    public void fillName(){counselor.fillName("Rara");}
    @And("I fill empty email")
    public void emptyEmail(){counselor.fillEmail("");}
    @And("I fill empty username")
    public void emptyUsername(){counselor.fillUsername("");}
    @And("I fill empty description")
    public void emptyDescription(){counselor.fillDescription("");}
    @And("I fill empty counseling price")
    public void emptyPrice(){counselor.fillCounselingPrice("");}

    //cancel add counselor
    @And("I click Not Now button")
    public void clickNotNow(){counselor.clickNotNowButton();}

    //sort by
    @And("I choose sort by oldest")
    public void chooseSortBy(){
        counselor.chooseSortBy();
        counselor.chooseOption();
    }
    @And("I see list of counselor sort by oldest")
    public void listCounselor(){counselor.seeListCounselor();}

    //search
    @And("I fill search field")
    public void fillSearch(){counselor.fillSearchField("self");}
    @Then("I see list of counselor by keyword search")
    public void seeListByKeywordSearch(){counselor.seeListCounselor();}
}
