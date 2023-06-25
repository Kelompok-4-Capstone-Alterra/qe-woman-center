package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CareerPage extends PageObject {
    private By careers(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/h1");
    }
    private By dropdownSortBy(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[2]/div");
    }
    private By chooseSortByNewest(){
        return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
    }
    private By chooseSortByOldest(){
        return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
    }
    private By searchCareer(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[1]/div/input");
    }
    private By deleteCareerButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[3]/div[1]/div[2]/div/button");
    }
    private By popUpSureButtonCareer(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[3]/div[1]/div[2]/div/div/div[2]/div/div[2]/button[1]");
    }
    private By popUpMaybeLaterButtonCareer(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div[3]/div[1]/div[2]/div/div/div[2]/div/div[2]/button[2]");
    }


    @Step
    public void clickDropdownSortBy(){
        $(dropdownSortBy()).click();
    }
    @Step
    public void careerSortByNewest(){
        $(chooseSortByNewest()).click();
    }
    @Step
    public void careerSortByOldest(){
        $(chooseSortByOldest()).click();
    }
    @Step
    public boolean validateAdminCareer(){
        return $(careers()).isDisplayed();
    }
    @Step
    public void enterJobPosition(String username){
        $(searchCareer()).type(username);
    }
    @Step
    public void validateJobPosition(){
        $(searchCareer()).isDisplayed();
    }
    @Step
    public void clickDeleteCareerButton(){
        $(deleteCareerButton()).click();
    }
    @Step
    public void popUpSureDeleteCareer(){
        $(popUpSureButtonCareer()).click();
    }
    @Step
    public void popUpMaybeLaterCareer(){
        $(popUpMaybeLaterButtonCareer()).click();
    }

}
