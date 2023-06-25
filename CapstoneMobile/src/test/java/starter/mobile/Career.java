package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Career extends BasePageObject {
    private By careerFeatureButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Articles Counseling Career Forum\"]/android.widget.Button[3]\n");
    }

    private By applyNowButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Apply Now\"]");
    }

    private By applyNowConfirmationButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Yes, Apply Now\"]");
    }

    private By careerInformationLabel() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Career Information\"]");
    }
}
