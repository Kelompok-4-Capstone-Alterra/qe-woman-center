package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User;

public class UserSteps {
    @Steps
    User user;

//    View Detail User
    @Given("I click user and counselor button")
    public void clickUserAndCounselorButton(){
        user.openUrl("https://react-women-center.netlify.app/user-counselor");
    }
    @When("I choose users")
    public void chooseUsers(){
        user.clickDropdown();
        user.chooseDropdownUsers();
    }
    @And("I click view button user")
    public void clickViewButtonUser(){
        user.validateAdminUsers();
        user.clickViewButton();
    }
    @Then("I can see detail user")
    public void canSeeDetailUser(){
        user.validateDetailUser();
    }

//    Cancel Delete User
    @And("I click delete button")
    public void clickDeleteButton(){
        user.clickDeleteButton();
    }
    @And("I click pop up maybe later for confirm delete")
    public void clickPopupMaybeLaterConfirmDelete(){
        user.clickPopupMaybeLaterButton();
    }
    @Then("I go back to dashboard user")
    public void goBackToDashboardUser(){
        user.validateAdminUsers();
    }

//    Success Delete User
    @And("I click pop up sure for confirm delete")
    public void clickPopupSureConfirmDelete(){
        user.clickPopupSureButton();
    }
    @Then("I success delete user")
    public void successDeleteUser(){
        user.validateAdminUsers();
    }

//    Search Name
    @And("I enter name")
    public void enterName(){
        user.enterName("kangtesting");
    }
    @Then("I find user by search box")
    public void findUser(){
        user.validateName();
    }


    //    Sort By Oldest
    @And("I choose oldest")
    public void chooseOldest(){
        user.clickOldest();
    }
    @Then("I find user sort by oldest")
    public void findUserSortByOldest(){
        user.validateAdminUsers();
    }
}
