package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ArticlePage extends PageObject {
    private By articles(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/h1");
    }
    private By dropdownArticleSortBy(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[2]/div/div");
    }
    private By articleSortByNewest(){
        return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
    }
    private By articleSortByOldest(){
        return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
    }
    private By searchArticle(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[1]/input");
    }
    private By commentArticle(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[4]/div/div/div[5]/div[1]/button/span");
    }
    private By closeComment(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div/div[1]/button");
    }
    private By deleteCommentArticleButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/button");
    }
    private By popUpSureButtonCommentArticle(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/button[1]");
    }
    private By popUpMaybeLaterButtonCommentArticle(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/button[2]");
    }
    private By deleteArticleButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div/div[5]/div[3]/button");
    }
    private By popUpSureButtonArticle(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div/div[5]/div[3]/div/div[2]/div/div[2]/button[1]");}
    private By popUpMaybeLaterButtonArticle(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[3]/div/div[1]/div/div/div[5]/div[3]/div/div[2]/div/div[2]/button[2]");
    }


    @Step
    public void clickDropdownArticleSortBy(){
        $(dropdownArticleSortBy()).click();
    }
    @Step
    public void chooseArticleSortByNewest(){
        $(articleSortByNewest()).click();
    }
    @Step
    public void chooseArticleSortByOldest(){
        $(articleSortByOldest()).click();
    }
    @Step
    public boolean validateArticlePage(){
        return $(articles()).isDisplayed();
    }
    @Step
    public void enterArticle(String username){
        $(searchArticle()).type(username);
    }
    @Step
    public void validateArticle(){
        $(searchArticle()).isDisplayed();
    }
    @Step
    public void clickCommentArticle(){
        $(commentArticle()).click();
    }
    @Step
    public void clickCloseCommentArticle(){
        $(closeComment()).click();
    }
    @Step
    public void clickDeleteCommentArticleButton(){
        $(deleteCommentArticleButton()).click();
    }
    @Step
    public void popUpSureDeleteCommentArticle(){
        $(popUpSureButtonCommentArticle()).click();
    }
    @Step
    public void popUpMaybeLaterCommentArticle(){
        $(popUpMaybeLaterButtonCommentArticle()).click();
    }

    @Step
    public void clickDeleteArticleButton(){
        $(deleteArticleButton()).click();
    }
    @Step
    public void popUpSureDeleteArticle(){
        $(popUpSureButtonArticle()).click();
    }
    @Step
    public void popUpMaybeLaterArticle(){
        $(popUpMaybeLaterButtonArticle()).click();
    }

}