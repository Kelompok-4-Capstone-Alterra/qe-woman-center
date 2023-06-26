package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CounselingPage;
import starter.pages.DashboardPage;
import starter.pages.LoginPage;

public class CounselingSteps {
    @Steps
    LoginPage loginPage;
    @Steps
    DashboardPage dashboard;
    @Steps
    CounselingPage counselingPage;
    @Given("I am in the dashboard page")
    public void inDashboardPage(){
        loginPage.open();
        loginPage.clickIntoTheDashboard();
        loginPage.enterUsername("admin");
        loginPage.enterPassword("admin");
        loginPage.clickSignInButton();
        dashboard.validOnTheDashboard();
    }
    @When("I click Counseling button")
    public void clickCounselingButton(){counselingPage.clickCounselingButton();}

    //view counseling schedule
    @And("I click on view button")
    public void clickOnViewButton(){counselingPage.clickViewButton();}
    @Then("I success view counseling schedule")
    public void viewCounselingSchedule(){counselingPage.viewCounselingSchedule();}

    //close counseling schedule
    @And("I click on close button")
    public void clickOnCloseButton(){counselingPage.clickCloseButton();}
    @Then("I am back to counseling schedule page")
    public void counselingSchedulePage(){counselingPage.onCounselingSchedulePage();}

    //create counseling schedule
    @And("I click add schedule")
    public void clickAddSchedule(){counselingPage.clickAddSchedule();}
    @And("I select counselor")
    public void selectCounselor(){
        counselingPage.selectCounselor();
        counselingPage.optionCounselor();
    }
    @And("I choose counseling date")
    public void chooseDate(){counselingPage.clickSelectDate();}
    @And("I choose counseling time")
    public void chooseTime(){
        counselingPage.clickSelectTime();
        counselingPage.optionTime();
    }
    @And("I click add schedule button")
    public void clickAddScheduleButton(){counselingPage.clickAddScheduleButton();}
    @Then("I see pop up success")
    public void seePopUp(){counselingPage.seePopUp();}

    //cancel add counseling schedule
    @And("I click button not now")
    public void clickButtonNotNow(){counselingPage.clickButtonNotNow();}

    //update counseling schedule
    @And("I click update button")
    public void clickUpdateButton(){counselingPage.clickUpdateButton();}
    @And("I update counseling date")
    public void updateDate(){
        counselingPage.updateCounselingSchedule();
    }
    @And("I click update schedule button")
    public void clickUpdateSchedule(){counselingPage.clickUpdateScheduleButton();}

    //delete counseling schedule
    @And("I click button delete")
    public void clickButtonDelete(){counselingPage.clickButtonDelete();}
    @And("I click button sure on pop up")
    public void clickButtonSure(){
        counselingPage.clickButtonSure();}

    //cancel delete schedule
    @And("I click button maybe later on pop up")
    public void clickMaybeLaterButton(){counselingPage.clickMaybeLaterButton();}

    //sort by
    @And("I select sort by oldest")
    public void selectOldest(){
        counselingPage.clickSortBy();
        counselingPage.selectOldestOption();
    }
    @Then("I see counseling schedule sort by oldest")
    public void seeCounselingScheduleSortByOldest(){counselingPage.seeListCounselingSchedule();}

    //search
    @And("I enter keyword on search field")
    public void enterKeyword(){counselingPage.enterKeyword("self");}
    @Then("I see counseling schedule by keyword search")
    public void seeCounselingSchedule(){counselingPage.seeListCounselingSchedule();}

    //view counseling transaction
    @And("I choose sub menu counseling transaction")
    public void chooseSubMenu(){
        counselingPage.clickSubMenu();
        counselingPage.chooseSubMenuCounselingTransaction();
    }
    @And("I view counseling transaction")
    public void viewCounselingTransaction(){counselingPage.seeLisCounselingTransaction();}

    //sort counseling transaction
    @Then("I see counseling transaction by oldest")
    public void counselingTransactionByOldest(){counselingPage.seeLisCounselingTransaction();}

    //update status
    @And("I click cancel")
    public void clickCancel(){counselingPage.clickClose();}

    //cancel update status
    @Then("I am back to counseling transaction page")
    public void onCounselingTransactionPage(){counselingPage.onCounselingTransactionPage();}

    //send link
    @And("I click send link")
    public void clickSendLink(){counselingPage.clickSendLink();}
    @And("I insert counseling link")
    public void insertCounselingLink(){counselingPage.insertCounselingLink("https://t.me/+J2TWk74XVccxN2Nl");}
    @And("I click button send link")
    public void clickButtonSendLink(){counselingPage.clickSendLinkButton();}
}
