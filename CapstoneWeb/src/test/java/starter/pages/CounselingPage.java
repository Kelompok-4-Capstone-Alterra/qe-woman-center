package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CounselingPage extends PageObject {
    private By counselingButton(){return By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/a[3]/div");}
    private By viewButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition max-w-[130px] w-[90%]']");}
    private By closeButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition flex items-center justify-center w-full h-[56px] mb-5 text-[17px]']");}
    private By counselingSchedulePage(){return By.xpath("//h2[@class='text-2xl text-white']");}
    private By addSchedule(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/button");}
    private By chooseCounselor(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/form/div[1]/div");}
    private By counselor(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/form/div[1]/ul/li[1]");}
    private By selectDate(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/form/div[2]/div/div/div/div/table/tbody/tr[5]/td[4]/button");}
    private By selectTime(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/form/div[3]/div");}
    private By time(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/form/div[3]/ul/li[2]");}
    private By addScheduleButton(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/form/button[1]");}
    private By buttonNotNow(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/form/button[2]");}
    private By updateButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition max-w-[130px] w-[90%]']");}
    private By updateDate(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/div[2]/form/div[1]/div/div/div/div/table/tbody/tr[5]/td[5]/button");}
    private By updateTime(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/div[2]/form/div[2]/ul/li[3]");}
    private By updateScheduleButton(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/div[2]/form/button[1]");}
    private By buttonDelete(){return By.xpath("//button[@class='box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition max-w-[130px] w-[90%]']");}
    private By buttonSure(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/button[1]");}
    private By maybeLaterButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition w-full']");}
    private By sortByButton(){return By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']");}
    private By selectOldest(){return By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']");}
    private By searchFields(){return By.xpath("//input[@class='w-full py-4 ps-16 text-[16px] tracking-[0.5px] placeholder:text-[16px] placeholder:tracking-[0.5px] placeholder:font-normal']");}
    private By listCounselingSchedule(){return By.xpath("//tr[@class='h-[64px]'][1]");}
    private By subMenu(){return By.xpath("//div[@class='w-full h-[48px] focus:outline-none px-4 border-solid border-2 rounded mt-2 flex items-center']");}
    private By subMenuCounselingTransaction(){return By.xpath("//li[@class='px-8 py-4 h-[44px] flex items-center hover:bg-primaryHover hover:text-white'][2]");}
    private By listCounselingTransaction(){return By.xpath("//tr[@class='h-[64px]'][1]");}
    private By close(){return By.xpath("//span[@class='cursor-pointer text-dangerMain']");}
    private By popUp(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div");}
    private By counselingTransactionPage(){return By.xpath("//h2[@class='text-2xl text-white']");}
    private By sendLink(){return By.xpath("//button[@class='box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition max-w-[130px] w-[90%]']");}
    private By linkField(){return By.id("link");}
    private By sendLinkButton(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/form/button[1]");}


    //view Counseling Schedule
    @Step
    public void clickCounselingButton(){$(counselingButton()).click();}
    @Step
    public void clickViewButton(){$(viewButton()).click();}
    @Step
    public void viewCounselingSchedule(){$(closeButton()).isDisplayed();}

    //close counseling schedule
    @Step
    public void clickCloseButton(){$(closeButton()).click();}
    @Step
    public void onCounselingSchedulePage(){$(counselingSchedulePage()).isDisplayed();}

    //add counseling schedule
    @Step
    public void clickAddSchedule(){$(addSchedule()).click();}
    @Step
    public void selectCounselor(){$(chooseCounselor()).click();}
    @Step
    public void optionCounselor(){$(counselor()).click();}
    @Step
    public void clickSelectDate(){$(selectDate()).click();}
    @Step
    public void clickSelectTime(){$(selectTime()).click();}
    @Step
    public void optionTime(){$(time()).click();}
    @Step
    public void clickAddScheduleButton(){$(addScheduleButton()).click();}
    @Step
    public void seePopUp(){$(popUp()).isDisplayed();}

    //cancel add schedule
    @Step
    public void clickButtonNotNow(){$(buttonNotNow()).click();}

    //update schedule
    @Step
    public void clickUpdateButton(){$(updateButton()).click();}
    @Step
    public void updateCounselingSchedule(){$(updateDate()).click();}
    @Step
    public void clickUpdateScheduleButton(){$(updateScheduleButton()).click();}

    //delete schedule
    @Step
    public void clickButtonDelete(){$(buttonDelete()).click();}
    @Step
    public void clickButtonSure(){$(buttonSure()).click();}

    //cancel delete schedule
    @Step
    public void clickMaybeLaterButton(){$(maybeLaterButton()).click();}

    //sort by
    @Step
    public void clickSortBy(){$(sortByButton()).click();}
    @Step
    public void selectOldestOption(){$(selectOldest()).click();}

    //search
    @Step
    public void enterKeyword(String message){$(searchFields()).type(message);}
    @Step
    public void seeListCounselingSchedule(){$(listCounselingSchedule()).isDisplayed();}
    @Step
    public void clickSubMenu(){$(subMenu()).click();}
    @Step
    public void chooseSubMenuCounselingTransaction(){$(subMenuCounselingTransaction()).click();}
    @Step
    public void seeLisCounselingTransaction(){$(listCounselingTransaction()).isDisplayed();}

    //update
    @Step
    public void clickClose(){$(close()).click();}

    //cancel update
    @Step
    public void onCounselingTransactionPage(){$(counselingTransactionPage()).isDisplayed();}

    //send link
    @Step
    public void clickSendLink(){$(sendLink()).click();}
    @Step
    public void insertCounselingLink(String message){$(linkField()).type(message);}
    @Step
    public void clickSendLinkButton(){$(sendLinkButton()).click();}
}
