package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CounselorPage extends PageObject {
    private By counselorButton(){return By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/a[2]/div/p");}
    private By viewButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition w-[90%]']");}
    private By viewCounselor(){return By.xpath("//h2[@class='text-xl font-bold mb-4 mt-[8px]']");}
    private By closeButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition h-fit w-full px-3 py-3 flex items-center justify-center']");}
    private By counselorPage(){return By.xpath("//h2[@class='text-white pt-1']");}
    private By deleteButon(){return By.xpath("//button[@class='box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition w-[90%]']");}
    private By sureButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition w-full']");}
    private By maybeLaterButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition w-full']");}
    private By successDelete(){return By.xpath("//div[@class='MuiAlert-message css-1xsto0d']");}
    private By nameField(){return By.id("name");}
    private By emailField(){return By.id("email");}
    private By usernameField(){return By.id("username");}
    private By descriptionField(){return By.id("description");}
    private By priceField(){return By.id("price");}
    private By saveButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition h-fit w-full px-3 py-3 flex items-center justify-center']");}
    private By successUpdate(){return By.xpath("//div[@class='MuiAlert-message css-1xsto0d']");}
    private By addCounselorButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition flex items-center justify-center text-sm']");}
    private By chooseCategory(){return By.xpath("//div[@class= 'bg-white w-[664px] px-[32px] py-[16px] z-10 rounded-md shadow border-solid border-[1px] border-primaryBorder']//div[@class= 'w-full h-[48px] focus:outline-none px-4 border-solid border-2 rounded mt-2 flex items-center']");}
    private By option(){return By.xpath("//li[@class= 'px-8 py-4 h-[44px] flex items-center hover:bg-primaryHover hover:text-white'][3]");}
    private By counselingPrice(){return By.id("price");}
    private By addNewCounselorButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-primaryMain hover:bg-primaryHover active:bg-primaryPressed py-3 px-3 rounded-[3px] text-white text-xs transition h-fit w-full px-3 py-3 flex items-center justify-center']");}
    private By emptyName(){return By.xpath("//p[@class='mt-2 text-red-800 font-xs font-medium']");}
    private By notNowButton(){return By.xpath("//button[@class='box-border min-h-[45px] bg-white border-2 border-primaryMain hover:bg-[#954E80] hover:text-white hover:border-[#954E80] active:bg-[#913175] py-3 px-3 rounded-[3px] text-primaryMain text-xs transition h-fit w-full px-3 py-3 flex items-center justify-center']");}
    private By sortBy(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[2]/div/div");}
    private By optionSortBy(){return By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");}
    private By listCounselor(){return By.xpath("//h2[@class='text-2xl text-white']");}
    private By searchField(){return By.xpath("//input[@type='text']");}

    //view counselor
    @Step
    public void clickUserAndCounselorButton(){$(counselorButton()).click();}
    @Step
    public void clickViewButton(){$(viewButton()).click();}
    @Step
    public void viewCounselorData(){$(viewCounselor()).isDisplayed();}

    //close view counselor
    @Step
    public void clickClose(){$(closeButton()).click();}
    @Step
    public void onCounselorPage(){$(counselorPage()).isDisplayed();}

    //delete counselor
    @Step
    public void clickDeleteButon(){$(deleteButon()).click();}
    @Step
    public void clickSureButton(){$(sureButton()).click();}

    //cancel delete counselor
    @Step
    public void clickMaybeLater(){$(maybeLaterButton()).click();}

    //update counselor
    @Step
    public void updateName(String name){$(nameField()).type(name);}
    @Step
    public void updateEmail(String email){$(emailField()).type(email);}
    @Step
    public void updateUsername(String username){$(usernameField()).type(username);}
    @Step
    public void updateDescription(String description){$(descriptionField()).type(description);}
    @Step
    public void updatePrice(String price){$(priceField()).type(price);}
    @Step
    public void clickSaveButton(){$(saveButton()).click();}
    @Step
    public boolean seeMessage(){return $(successUpdate()).isDisplayed();}
    @Step
    public boolean iSeeMessage(String message){
        return $(successUpdate()).getText().equalsIgnoreCase(message);}

    //add counselor
    @Step
    public void clickAddCounselorButton(){$(addCounselorButton()).click();}
    @Step
    public void fillName(String name){$(nameField()).type(name);}
    @Step
    public void fillEmail(String email){$(emailField()).type(email);}
    @Step
    public void fillUsername(String username){$(usernameField()).type(username);}
    @Step
    public void clickChooseCategory(){$(chooseCategory()).click();}
    @Step
    public void clickOption(){$(option()).click();}
    @Step
    public void fillDescription(String description){$(descriptionField()).type(description);}
    @Step
    public void fillCounselingPrice(String price){$(counselingPrice()).type(price);}
    @Step
    public void clickAddCounselor(){$(addNewCounselorButton()).click();}
    @Step
    public boolean validateWrningMessageEmptyName(){return $(emptyName()).isDisplayed();}
    @Step
    public boolean iValidateWarningMessageEmptyName(String message){
        return $(emptyName()).getText().equalsIgnoreCase(message);}

    //cancel add counselor
    @Step
    public void clickNotNowButton(){$(notNowButton()).click();}

    //sort by
    @Step
    public void chooseSortBy(){$(sortBy()).click();}
    @Step
    public void chooseOption(){$(optionSortBy()).click();}
    @Step
    public void seeListCounselor(){$(listCounselor()).isDisplayed();}

    //search
    @Step
    public void fillSearchField(String message){$(searchField()).type(message);}
}
