package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By iconLogout(){
        return By.xpath("//div[@class= 'flex items-center text-center mt-auto hover:text-primaryMain cursor-pointer flex-col justify-center gap-1']");
    }
    private By popUpExit(){
        return By.xpath("//button[@class= 'box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition w-full']");
    }
    private By popUpExitForMaybeLetter(){
        return By.xpath("//button[@class= 'box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition w-full']");
    }

    @Step
    public void clickIconLogout(){
        $(iconLogout()).click();
    }
    @Step
    public void clickPopUpExit(){
        $(popUpExit()).click();
    }
    @Step
    public void clickPopUpExitForMaybeLetter(){
        $(popUpExitForMaybeLetter()).click();
    }
}
