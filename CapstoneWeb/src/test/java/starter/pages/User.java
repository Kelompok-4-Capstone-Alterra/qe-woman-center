package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class User extends PageObject {

    private By dropdown(){
        return By.xpath("//div[@class= 'w-full h-[48px] focus:outline-none px-4 border-solid border-2 rounded mt-2 flex items-center']");
    }
    private By dropdownUsers(){
        return By.xpath("//li[@class= 'px-8 py-4 h-[44px] flex items-center hover:bg-primaryHover hover:text-white'][2]");
    }
    private By users(){
        return By.xpath("//h2[@class= 'text-2xl text-white']");
    }
    private By viewButton(){
        return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition w-[90%]']");
    }
    private By detailUser(){
        return By.xpath("//h2[@class= 'text-xl font-bold mb-4 mt-[8px]']");
    }
    private By deleteButton(){
        return By.xpath("//button[@class= 'box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition w-[90%]']");
    }
    private By popUpMaybeLetterDelete(){
        return By.xpath("//button[@class= 'box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition w-full']");
    }
    private By popUpSureDelete(){
        return By.xpath("//button[@class= 'box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition w-full']");
    }
    private By search(){
        return By.xpath("//input[@class= 'w-full py-4 ps-16 text-[16px] tracking-[0.5px] placeholder:text-[16px] placeholder:tracking-[0.5px] placeholder:font-normal']");
    }

    @Step
    public void clickDropdown(){
        $(dropdown()).click();
    }
    @Step
    public void chooseDropdownUsers(){
        $(dropdownUsers()).click();
    }
    @Step
    public boolean validateAdminUsers(){
        return $(users()).isDisplayed();
    }
    @Step
    public void clickViewButton(){
        $(viewButton()).click();
    }
    @Step
    public boolean validateDetailUser(){
        return $(detailUser()).isDisplayed();
    }
    @Step
    public void clickDeleteButton(){
        $(deleteButton()).click();
    }
    @Step
    public void clickPopupMaybeLaterButton(){
        $(popUpMaybeLetterDelete()).click();
    }
    @Step
    public void clickPopupSureButton(){
        $(popUpSureDelete()).click();
    }
    @Step
    public void enterName(String username){
        $(search()).type(username);
    }
    @Step
    public void validateName(){
        $(search()).isDisplayed();
    }
}
