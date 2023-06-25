package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LandingPage extends PageObject {
    private By landingPageTitle(){
        return By.xpath("//p[@class= 'text-[32px] mb-2 font-medium text-[#E3DDB2] ']");
    }

    @Step
    public void validOnLandingPage(){
        $(landingPageTitle()).isDisplayed();
    }
}
