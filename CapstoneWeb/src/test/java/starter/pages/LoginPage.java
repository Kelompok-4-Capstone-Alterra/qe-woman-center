package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By dashboardButton(){
        return By.xpath("//button[@class= 'box-border min-h-[45px] bg-secondaryMain border-secondaryBorder hover:bg-secondaryHover active:bg-secondaryPressed hover:border-secondaryHover py-3 px-3 rounded-[3px] text-white text-base transition ']");
    }
    private By usernameField(){
        return By.id("username");
    }
    private By passwordField(){
        return By.xpath("//input[@name='password']");
    }
    private By SignInButton(){
        return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition w-full font-medium rounded py-4']");
    }
    private By errorMessageInvalidUsernamePwd(){
        return By.xpath("//div[@class='MuiAlert-message css-1xsto0d']");
    }
    private By errorMessageEmptyUsernamePwd(){
        return By.xpath("//p[@class='mt-2 text-red-800 font-xs font-medium']");
    }

    @Step
    public void clickIntoTheDashboard(){
        $(dashboardButton()).click();
    }
    @Step
    public void enterUsername(String username){
        $(usernameField()).type(username);
    }
    @Step
    public void enterPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickSignInButton(){
        $(SignInButton()).click();
    }
    @Step
    public boolean validateErrorMessageInvalidUsernamePwd(){
        return $(errorMessageInvalidUsernamePwd()).isDisplayed();
    }
    @Step
    public boolean iValidateEqualMessageErrorInvUsernamePwd(String message){
        return $(errorMessageInvalidUsernamePwd()).getText().equalsIgnoreCase(message);
    }
    @Step
    public boolean validateErrorMessageEmptyUsernamePwd(){
        return $(errorMessageEmptyUsernamePwd()).isDisplayed();
    }
    @Step
    public boolean iValidateEqualMessageErrorEmptyUsernamePwd(String message){
        return $(errorMessageEmptyUsernamePwd()).getText().equalsIgnoreCase(message);
    }
}
