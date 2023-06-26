package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class ReadingList extends BasePageObject {
    private By readingListFeatureButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Saved Tab 3 of 4\"]");
    }

    private By createNewReadingListButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"New List\"]");
    }

    private By listNameField() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Create New List\"]/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By decriptionField() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Create New List\"]/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By addReadingListButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Add\"]");
    }

    private By readingListLabel() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Reading List\"]");
    }

    public void clickReadingListFeature() {
        onClick(readingListFeatureButton());
    }

    public void verifyOnReadingListPage() {
        waitUntilVisible(readingListLabel());
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
