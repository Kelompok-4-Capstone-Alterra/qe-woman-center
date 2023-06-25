package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ForumPage extends PageObject {
    private By dropdownArticleForum(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/form/div/div");
    }
    private By dropdownForum(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/form/div/ul/li[2]");
    }
    private By forums(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/h1");
    }
    private By dropdownForumSortBy(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[2]/div/div");
    }
    private By chooseForumSortByNewest(){
        return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
    }
    private By chooseForumSortByOldest(){
        return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
    }
    private By searchForum(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[1]/input");
    }
    private By viewLinkForum(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div[1]/button");
    }
    private By closeLinkForum(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/button");
    }
    private By deleteForumButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div[2]/button");
    }
    private By popUpSureButtonForum(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/button[1]");
    }
    private By popUpMaybeLaterButtonForum(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/button[2]");
    }


    @Step
    public void clickDropdownForum(){
        $(dropdownArticleForum()).click();
    }
    @Step
    public void chooseDropdownForum(){
        $(dropdownForum()).click();
    }
    @Step
    public boolean validateForumPage(){
        return $(forums()).isDisplayed();
    }
    @Step
    public void clickSortByForum(){
        $(dropdownForumSortBy()).click();
    }
    @Step
    public void forumSortByNewest(){
        $(chooseForumSortByNewest()).click();
    }
    @Step
    public void forumSortByOldest(){
        $(chooseForumSortByOldest()).click();
    }
    @Step
    public void enterTopicForum(String username){
        $(searchForum()).type(username);
    }
    @Step
    public void validateTopicForum(){
        $(searchForum()).isDisplayed();
    }
    @Step
    public void clickViewLinkForum(){
        $(viewLinkForum()).click();
    }
    @Step
    public void clickCloseLinkForum(){
        $(closeLinkForum()).click();
    }
    @Step
    public void clickDeleteForumButton(){
        $(deleteForumButton()).click();
    }
    @Step
    public void popUpSureDeleteForum(){
        $(popUpSureButtonForum()).click();
    }
    @Step
    public void popUpMaybeLaterForum(){
        $(popUpMaybeLaterButtonForum()).click();
    }

}
