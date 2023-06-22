package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Counselor extends BasePageObject {
    private By firstOpenApp(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
    }
    private By goToLogin() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Profile\n" +
                "Tab 4 of 4\"]");
    }
    private By username() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]");
    }
    private By password() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]");
    }
    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }
    private By counselorButton(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Articles\n" +
                "Counseling\n" +
                "Career\n" +
                "Forum\"]/android.widget.Button[2]");
    }
    private By topicSelf(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"self-development\"]");
    }
    private By continueButton(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Continue\"]");
    }
    private By counselorList(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Jordan Peterson\n" +
                "self-development\n" +
                "Rp. 140,000\"]");
    }
    private By sortButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sort By\"]");
    }
    private By highestRating(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Highest Rating\"]");
    }
    private By highestPrice(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Highest Price\"]");
    }
    private By lowestPrice(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Lowest Price\"]");
    }
    private By counselor(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Jordan Peterson\n" +
                "self-development\n" +
                "Rp. 140,000\"]");
    }
    private By counselorDetail(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");
    }

    @Step
    public void firstOpenApplication() {
        onClick(firstOpenApp());
    }
    @Step
    public void toLogin() {
        onClick(goToLogin());
    }
    @Step
    public void enterUsername(String username) {
        onClick(username());
        waitUntilPresence(username()).sendKeys(username);
    }
    @Step
    public void enterPassword(String password) {
        onClick(password());
        waitUntilPresence(password()).sendKeys(password);
    }
    @Step
    public void clickLoginButton() {
        onClick(loginButton());
    }
    @Step
    public void clickCounselorButton(){onClick(counselorButton());}
    @Step
    public void chooseTopic(){onClick(topicSelf());}
    @Step
    public void continueStep(){onClick(continueButton());}
    @Step
    public void listCounselor() {
        Assert.assertTrue(waitUntilPresence(counselorList()).isDisplayed());
    }
    @Step
    public void sort(){onClick(sortButton());}
    @Step
    public void highestRatingButton(){onClick(highestRating());}
    @Step
    public void highestPriceButton(){onClick(highestPrice());}
    @Step
    public void lowestPriceButton(){onClick(lowestPrice());}

    @Step
    public void clickCounselor(){onClick(counselor());}
    @Step
    public void detail(){Assert.assertTrue(waitUntilPresence(counselorDetail()).isDisplayed());}

}
