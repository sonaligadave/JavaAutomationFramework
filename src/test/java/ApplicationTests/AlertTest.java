package ApplicationTests;

import Pages.AlertPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test
    public void alertTest(){
        AlertPage ap = new AlertPage(getDriver());
        ap.clickOnAlertLink();
        ap.clickOnJSButton();
        ap.clickOnJsConfirmButton();
        ap.clickOnJsPromptButton();
        ap.validateMessage();
    }
}
