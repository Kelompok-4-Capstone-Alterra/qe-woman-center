package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class Voucher extends BasePageObject {
    private By voucherFeatureHomePage() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Check Now\"]");
    }
}
