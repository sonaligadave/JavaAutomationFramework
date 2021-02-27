package ApplicationTests;

import Basics.BasePage;
import Pages.CheckBoxPage;
import util.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BasePage implements BaseTest {

    CheckBoxPage cp ;
    @BeforeMethod()
    public void setUp(){
        setup();
        cp = new CheckBoxPage();
    }

    @Test
    public void checkBoxTest() {
       // getDriver().get("https://the-internet.herokuapp.com/");
        cp.goToCheckBoxPage();
        cp.clickOnCheckBox1();
        cp.clickOnCheckBox1();
    }

    @AfterTest
    @Override
    public void close() {
        driver.quit();
    }
}
