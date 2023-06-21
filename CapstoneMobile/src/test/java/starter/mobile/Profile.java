package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import starter.stepdefinitions.ProfileSteps;
import test.automation.pageobject.BasePageObject;

import java.util.Objects;

public class Profile extends BasePageObject {
    // edit profile
    private By profileFeature() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Profile\n" +
                "Tab 4 of 4\"]");
    }

    private By usernameProfile() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"ranbo\"]");
    }

    private By EditProfileButton() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button");
    }

    private By EditProfilePage() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Update your profile information here.\"]");
    }

    private By usernameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]");
    }

    private By nameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]");
    }

    private By phoneField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[3]");
    }

    private By saveProfileButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Save Changes\"]");
    }

    private By confirmationProfileButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sure\"]");
    }

    private By duplicateUsernameNotice() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"username already registered\"]");
    }

    private By nameIsRequiredNotice() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"name is required\"]");
    }

    private By invalidPhoneNotice() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"must be a number\"]");
    }

    @Step
    public void clickprofileFeature() {
        onClick(profileFeature());
    }

    @Step
    public void clickProfileEditProfile() {
        onClick(EditProfileButton());
    }

    @Step
    public void verifyOnEditProfilePage() {
        waitUntilPresence(EditProfilePage()).isDisplayed();
    }

    @Step
    public void enterProfileUsername(String username) {
        onClick(usernameField());
        waitUntilPresence(usernameField()).clear();

        onClick(usernameField());
        waitUntilPresence(usernameField()).sendKeys(username);
    }

    @Step
    public void enterProfileName(String name) {
        onClick(nameField());
        waitUntilPresence(nameField()).clear();

        onClick(nameField());
        waitUntilPresence(nameField()).sendKeys(name);
    }

    @Step
    public void enterProfilePhone(String phone) {
        onClick(phoneField());
        waitUntilPresence(phoneField()).clear();

        onClick(phoneField());
        waitUntilPresence(phoneField()).sendKeys(phone);
    }

    @Step
    public void clickProfileSaveChanges() {
        onClick(saveProfileButton());
    }

    @Step
    public void clickProfileConfirmationButton() {
        onClick(confirmationProfileButton());
    }

    @Step
    public void verifyUpdateProfileSuccess() {
        waitUntilPresence(usernameField()).isDisplayed();
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
    
    // invalid
    @Step
    public void verifyFailedMessage() {
        String fieldName = ProfileSteps.fieldName;
        if (Objects.equals(fieldName, "username")) {
            waitUntilPresence(duplicateUsernameNotice());
        } else if (Objects.equals(fieldName, "name")) {
            waitUntilPresence(nameIsRequiredNotice());
        } else if (Objects.equals(fieldName, "phone")) {
            waitUntilPresence(invalidPhoneNotice());
        }
    }
}
