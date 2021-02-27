package ApplicationTests;

import Basics.BasePage;
import util.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicAuthHandelTest extends BasePage implements BaseTest {

    private static final String userName = "admin";
    private static final String password = "admin";

    @Test(priority = 0)
    public void loginWithCredentials(){

    }

    @AfterTest
    @Override
    public void close() {
        driver.quit();
    }
}
