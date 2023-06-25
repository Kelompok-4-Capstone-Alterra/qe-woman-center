package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    private By dashboardTitle(){
        return By.xpath("//h1[@class='text-2xl text-white']");
    }

    @Step
    public void validOnTheDashboard(){
        $(dashboardTitle()).isDisplayed();
    }
}
