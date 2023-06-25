package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ReportPage extends PageObject {
    private By reports(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/h1");
    }
    private By dropdownReportSortBy(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div/div");
    }
    private By chooseReportSortByNewest(){
        return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
    }
    private By chooseReportSortByOldest(){
        return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
    }
    private By searchReport(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div/input");
    }
    private By exportFile(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/a");
    }

    @Step
    public void clickDropdownReportSortBy(){
        $(dropdownReportSortBy()).click();
    }
    @Step
    public void reportSortByNewest(){
        $(chooseReportSortByNewest()).click();
    }
    @Step
    public void reportSortByOldest(){
        $(chooseReportSortByOldest()).click();
    }
    @Step
    public boolean validateAdminReport(){
        return $(reports()).isDisplayed();
    }
    @Step
    public void enterCounselorNameReport(String username){
        $(searchReport()).type(username);
    }
    @Step
    public void validateCounselorNameReport(){
        $(searchReport()).isDisplayed();
    }
    @Step
    public void clickExportFile(){
        $(exportFile()).click();
    }
}
