package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Career extends BasePageObject {
    private By careerFeatureButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Articles Counseling Career Forum\"]/android.widget.Button[3]");
    }

    private By applyNowButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Apply Now\"]");
    }

    private By applyNowConfirmationButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Yes, Apply Now\"]");
    }

    private By careerInformationLabel() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Career Information\"]");
    }

    @Step
    public void clickCareerFeature() {
        onClick(careerFeatureButton());
    }

    @Step
    public void verifyOnCareerPage() {
        waitUntilPresence(careerInformationLabel());
    }

    // login
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

    @Step
    public void firstOpenApplication() {
        onClick(firstOpenApp());
    }

    @Step
    public void onHomepage() {
        Assert.assertTrue(waitUntilPresence(goToLogin()).isDisplayed());
    }

    @Step
    public void clickButtonLogin() {
        onClick(goToLogin());
    }

    public void clickLoginButton() {
        onClick(loginButton());
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
}
