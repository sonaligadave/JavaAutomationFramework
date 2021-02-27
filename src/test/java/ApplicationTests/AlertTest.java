package ApplicationTests;

import Basics.BasePage;
import Pages.AlertPage;

import util.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends BasePage implements BaseTest {
    AlertPage ap;

    @BeforeMethod()
    public void setUp(){
        setup();
       ap = new AlertPage();
    }


    @Test
    public void alertTest(){
        ap.clickOnAlertLink();
        ap.clickOnJSButton();
        ap.clickOnJsConfirmButton();
        ap.clickOnJsPromptButton();
        ap.validateMessage();
    }

    @AfterTest
    @Override
    public void close() {
        driver.quit();
    }
}
