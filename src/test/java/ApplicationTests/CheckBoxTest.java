package ApplicationTests;

import Pages.CheckBoxPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest() {
        CheckBoxPage cp = new CheckBoxPage(getDriver());
        cp.goToCheckBoxPage();
        cp.clickOnCheckBox1();
        cp.clickOnCheckBox1();
    }
}
