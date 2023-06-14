package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Logout extends BasePageObject {
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
    private By goToProfile() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Profile\n" +
                "Tab 4 of 4\"]");
    }
    private By signOut() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sign Out\"]");
    }
    private By sure() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sure\"]");
    }
    private By later() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Maybe Latter\"]");
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
    public void onTheHomepageToLogin() {
        Assert.assertTrue(waitUntilPresence(goToLogin()).isDisplayed());
    }
    @Step
    public void toProfile() {
        onClick(goToProfile());
    }
    @Step
    public void clickSignOut() {
        onClick(signOut());
    }
    @Step
    public void clickSure() {
        onClick(sure());
    }
    @Step
    public void clickLater() {
        onClick(later());
    }
}
