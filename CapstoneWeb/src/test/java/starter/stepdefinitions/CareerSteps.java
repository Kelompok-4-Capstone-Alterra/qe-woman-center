package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CareerPage;

public class CareerSteps {
    @Steps
    CareerPage careerPage;

    // career sort by newest
    @Given("I click career button")
    public void clickCareerButton(){careerPage.openUrl("https://react-women-center.netlify.app/career");}
    @When("I choose sort by career")
    public void chooseSortByCareer(){careerPage.clickDropdownSortBy();}
    @And("I click sort by newest")
    public void careerSortByNewest(){careerPage.careerSortByNewest();}
    @Then("I can see career sort by newest")
    public void seeCareerNewest(){careerPage.validateAdminCareer();}

    // career sort by oldest
    @And("I click sort by oldest")
    public void careerSortByOldest(){careerPage.careerSortByOldest();}
    @Then("I can see career sort by oldest")
    public void seeCareerOldest(){careerPage.validateAdminCareer();}

    // search career
    @When("I enter job position")
    public void enterJobPosition(){careerPage.enterJobPosition("Back End");}
    @Then("I find job position by search box")
    public void findJobPosition(){careerPage.validateJobPosition();}

    // cancel delete career
    @When("I click delete career button")
    public void clickDeleteCareerButton(){careerPage.clickDeleteCareerButton();}
    @And("I click pop up maybe later for confirm cancel delete career")
    public void popUpMaybeLaterCareer(){careerPage.popUpMaybeLaterCareer();}
    @Then("I go back to dashboard career")
    public void backToDashboardCareer(){careerPage.validateAdminCareer();}

    // delete career
    @And("I click pop up sure for confirm delete career")
    public void popUpSureDeleteCareer(){careerPage.popUpSureDeleteCareer();}
    @Then("I success delete career")
    public void successDeleteCareer(){careerPage.validateAdminCareer();}

}
