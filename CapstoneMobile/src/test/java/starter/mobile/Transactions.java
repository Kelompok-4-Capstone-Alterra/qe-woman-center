package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Transactions extends BasePageObject {

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

    private By transactionBar() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Transaction\n" +
                "Tab 2 of 4\"]");
    }
    private By ongoingTransaction(){
        return MobileBy.accessibilityId("Ongoing\n" +
                "Tab 1 of 2");
    }

    private By historyLink() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"History\n" +
                "Tab 2 of 2\"]");
    }
    private By historyVerify() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"History\n" +
                "Tab 2 of 2\"]");
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
    public void clickTransactionBar() {
        onClick(transactionBar());
    }
    @Step
    public void verifyOngoingTransaction() {
        Assert.assertTrue(waitUntilPresence(ongoingTransaction()).isDisplayed());
    }
    @Step
    public void clickHistoryLink() {
        onClick(historyLink());
    }
    @Step
    public void verifyHistoryLink() {
        Assert.assertTrue(waitUntilPresence(historyVerify()).isDisplayed());
    }
}