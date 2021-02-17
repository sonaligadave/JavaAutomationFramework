package ApplicationTests;

import Pages.DropDownPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    private static final String option1 = "Option 1";
    private static final String option2 = "Option 2";

    @Test
    public void dropDownTest(){
        DropDownPage dp = new DropDownPage(getDriver());
        dp.clickOnDropdownLink();
        dp.validateDropDownPageTitle();
        dp.SelectTheDropDowOption(option2);
        dp.SelectTheDropDowOption(option1);
    }
}
