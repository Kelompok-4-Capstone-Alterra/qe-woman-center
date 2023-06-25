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

    private By readlingListLabel() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Reading List\"]");
    }
}
