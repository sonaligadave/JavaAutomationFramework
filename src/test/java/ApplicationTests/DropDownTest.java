package ApplicationTests;

import Basics.BasePage;
import Pages.DropDownPage;

import util.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends BasePage implements BaseTest {

    private static final String option1 = "Option 1";
    private static final String option2 = "Option 2";
    DropDownPage dp;

    @BeforeMethod()
    public void setUp(){
        setup();
        dp = new DropDownPage();
    }

    @Test
    public void dropDownTest(){
        //getDriver().get("https://the-internet.herokuapp.com/");
        dp.clickOnDropdownLink();
        dp.validateDropDownPageTitle();
        dp.SelectTheDropDowOption(option2);
        dp.SelectTheDropDowOption(option1);
    }

    @AfterTest
    @Override
    public void close() {
        driver.quit();
    }
}
