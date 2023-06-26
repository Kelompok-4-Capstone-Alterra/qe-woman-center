package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Appointment extends BasePageObject {

    private By openApp(){
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
    private By counselingButton(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Articles\n" +
                "Counseling\n" +
                "Career\n" +
                "Forum\"]/android.widget.Button[2]");
    }
    private By topic() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"self-development\"]");
    }
    private By continueButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Continue\"]");
    }
    private By counselor() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"andi\n" +
                "self-development\n" +
                "Rp. 200,000\"]");
    }

    private By loginPage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Log In\"]");
    }

    @Step
    public void openApplication() {
        onClick(openApp());
    }
    @Step
    public void loginApp() {
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
    public void clickCounselingButton(){
        onClick(counselingButton());
    }
    @Step
    public void chooseTopic(){
        onClick(topic());
    }
    @Step
    public void clickContinueButton(){
        onClick(continueButton());
    }
    @Step
    public void chooseCounselor(){
        onClick(counselor());
    }

    @Step
    public void verifyLoginPage() {
        Assert.assertTrue(waitUntilPresence(loginPage()).isDisplayed());
    }
}