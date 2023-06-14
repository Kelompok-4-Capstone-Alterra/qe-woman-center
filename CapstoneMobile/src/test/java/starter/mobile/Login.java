package starter.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.automation.pageobject.BasePageObject;

public class Login extends BasePageObject {

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
    private By allertUsernameEmpty() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"username is required\"]");
    }
    private By allertPasswordEmpty() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"password is required\"]");
    }
    private By allertInvalidCred() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
    }

    @Step
    public void firstOpenApplication() {
        onClick(firstOpenApp());
    }
    @Step
    public void onTheHomepageToLogin() {
        Assert.assertTrue(waitUntilPresence(goToLogin()).isDisplayed());
    }
    @Step
    public void clickWidgetButtonToLogin() {
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
    public void failedLoginUsernameEmpty() {
        {
            waitUntilPresence(allertUsernameEmpty()).isDisplayed();
        }
    }
    @Step
    public void failedLoginPasswordEmpty() {
        {
            waitUntilPresence(allertPasswordEmpty()).isDisplayed();
        }
    }
    @Step
    public void failedLoginInvalidData() {
        {
            waitUntilPresence(allertInvalidCred()).isDisplayed();
        }
    }

    public void clearCredentials() {
        onClick(username());
        waitUntilPresence(username()).clear();
        onClick(password());
        waitUntilPresence(password()).clear();
    }
    public void closeApp() {
        AppiumDriver app = (AppiumDriver) getDriver();
        app.close();
    }
}
