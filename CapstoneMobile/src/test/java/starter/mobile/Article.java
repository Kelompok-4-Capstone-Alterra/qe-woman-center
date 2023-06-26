package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Article extends BasePageObject {

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
    private By articleButton(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Articles\n" +
                "Counseling\n" +
                "Career\n" +
                "Forum\"]/android.widget.Button[1]");
    }
    private By pointThree() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"kangtesting\n" +
                "23 June 2023\n" +
                "test lagi\"]/android.widget.Button");
    }
    private By deleteButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Delete Comment\"]");
    }
    private By sortByButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sort By\"]");
    }
    private By mostViewed(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Most Viewed\"]");
    }
    private By newest(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Newest\"]");
    }
    private By oldest(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Oldest\"]");
    }
    private By saveButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Save\"]");
    }
    private By valMostViewed(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"MOST VIEWED\"]");
    }
    private By valNewest(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"NEWEST\"]");
    }
    private By valOldest(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"OLDEST\"]");
    }
    private By valArticle(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Article\"]");
    }
    private By readArticle(){
        return MobileBy.accessibilityId("TEST BE\n" +
                "BE\n" +
                "25 June 2023");
    }
    private By iconComment(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
    }
    private By pageComment(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Comments\"]/android.view.View/android.view.View/android.widget.EditText");
    }
    private By iconSaveArticle(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Artikel Update\n" +
                "BE\n" +
                "19 June 2023\"]/android.widget.Button");
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
    public void clickArticleButton(){
        onClick(articleButton());
    }
    @Step
    public void clickSortByButton() {
        onClick(sortByButton());
    }
    @Step
    public void clickMostViewed() {
        onClick(mostViewed());
    }
    @Step
    public void clickNewest() {
        onClick(newest());
    }
    @Step
    public void clickOldest() {
        onClick(oldest());
    }
    @Step
    public void clickSaveButton() {
        onClick(saveButton());
    }
    @Step
    public void verifyMostViewed() {
        Assert.assertTrue(waitUntilPresence(valMostViewed()).isDisplayed());
    }
    @Step
    public void verifyNewest() {
        Assert.assertTrue(waitUntilPresence(valNewest()).isDisplayed());
    }
    @Step
    public void verifyOldest() {
        Assert.assertTrue(waitUntilPresence(valOldest()).isDisplayed());
    }
    @Step
    public void clickArticle() {
        onClick(readArticle());
    }
    @Step
    public void verifyIconComment() {
        Assert.assertTrue(waitUntilPresence(iconComment()).isDisplayed());
    }
    @Step
    public void clickIconComment() {
        onClick(iconComment());
    }
    @Step
    public void verifyPageComment() {
        Assert.assertTrue(waitUntilPresence(pageComment()).isDisplayed());
    }
    @Step
    public void clickIconSaveArticle() {
        onClick(iconSaveArticle());
    }
    @Step
    public void verifyLoginPage() {
        Assert.assertTrue(waitUntilPresence(loginPage()).isDisplayed());
    }
    @Step
    public void clickPointThree() {
        onClick(pointThree());
    }
    @Step
    public void clickDeleteButton() {
        onClick(deleteButton());
    }
    @Step
    public void verifyArticle() {
        Assert.assertTrue(waitUntilPresence(valArticle()).isDisplayed());
    }
}
