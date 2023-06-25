package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ForumPage;

public class ForumSteps {
    @Steps
    ForumPage forumPage;

    // forum sort by newest
    @Given("I click article and forum button")
    public void clickForumButton(){forumPage.openUrl("https://react-women-center.netlify.app/article-forum");}
    @When("I choose sub menu forum discussion")
    public void chooseSubMenuForum(){
        forumPage.clickDropdownForum();
        forumPage.chooseDropdownForum();
    }
    @And("I choose sort by forum")
    public void chooseSortByForum(){
        forumPage.validateForumPage();
        forumPage.clickSortByForum();
    }
    @And("I click sort by newest forum")
    public void forumSortByNewest(){forumPage.forumSortByNewest();}
    @Then("I can see forum sort by newest")
    public void seeForumNewest(){forumPage.validateForumPage();}

    // forum sort by oldest
    @And("I click sort by oldest forum")
    public void forumSortByOldest(){forumPage.forumSortByOldest();}
    @Then("I can see forum sort by oldest")
    public void seeForumOldest(){forumPage.validateForumPage();}

    // search forum
    @When("I enter topic forum")
    public void enterTopicForum(){forumPage.enterTopicForum("woman");}
    @Then("I find topic forum by search box")
    public void findTopicForum(){forumPage.validateTopicForum();}

    // view link forum
    @And("I click view link forum button")
    public void clickViewLinkForum(){forumPage.clickViewLinkForum();}
    @Then("I click close link forum button")
    public void clickCloseLinkForum() {
        forumPage.clickCloseLinkForum();
        forumPage.validateForumPage();
    }

    // cancel delete forum
    @When("I click delete button forum")
    public void clickDeleteForumButton(){forumPage.clickDeleteForumButton();}
    @And("I click pop up maybe later for confirm cancel delete forum")
    public void popUpMaybeLaterForum(){forumPage.popUpMaybeLaterForum();}
    @Then("I go back to dashboard forum")
    public void backToDashboardForum(){forumPage.validateForumPage();}

    // delete forum
    @And("I click pop up sure for confirm delete forum")
    public void popUpSureDeleteForum(){forumPage.popUpSureDeleteForum();}
    @Then("I success delete forum")
    public void successDeleteForum(){forumPage.validateForumPage();}

}
