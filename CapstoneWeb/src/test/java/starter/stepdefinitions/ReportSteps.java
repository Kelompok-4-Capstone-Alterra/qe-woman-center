package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ReportPage;

public class ReportSteps {

    @Steps
    ReportPage reportPage;

    // report sort by newest
    @Given("I click report button")
    public void clickCareerButton(){reportPage.openUrl("https://react-women-center.netlify.app/report");}
    @When("I choose sort by report")
    public void chooseSortByReport(){reportPage.clickDropdownReportSortBy();}
    @And("I click sort by newest report")
    public void reportSortByNewest(){reportPage.reportSortByNewest();}
    @Then("I can see report sort by newest")
    public void seeReportNewest(){reportPage.validateAdminReport();}

    // report sort by oldest
    @And("I click sort by oldest report")
    public void reportSortByOldest(){reportPage.reportSortByOldest();}
    @Then("I can see report sort by oldest")
    public void seeReportOldest(){reportPage.validateAdminReport();}

    // search report
    @When("I enter counselor name")
    public void enterCounselorNameReport(){reportPage.enterCounselorNameReport("Jordan");}
    @Then("I find counselor name by search box")
    public void findCounselorNameReport(){reportPage.validateCounselorNameReport();}

    // export file report
    @When("I click export file button")
    public void exportFile(){reportPage.clickExportFile();}
    @Then("I success export file report")
    public void successExportFile(){reportPage.validateAdminReport();}

}
