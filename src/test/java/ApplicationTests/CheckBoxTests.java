package ApplicationTests;

import Pages.CheckBoxsPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTest {

    @Test
    public void checkBoxTest() {
        CheckBoxsPage cp = new CheckBoxsPage(getDriver());
        cp.goToCheckBoxPage();
        cp.clickOnCheckBox1();
        cp.clickOnCheckBox1();
    }
}
