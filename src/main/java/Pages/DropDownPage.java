package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage {

    private WebDriver driver;
    private static final String path = "https://the-internet.herokuapp.com/dropdown";
    @FindBy(linkText = "Dropdown")
    WebElement dropdownLink;
    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnDropdownLink() {
        dropdownLink.isDisplayed();
        dropdownLink.click();
    }

    public void validateDropDownPageTitle() {
        Assert.assertEquals(driver.getCurrentUrl(), path);
    }

    public void SelectTheDropDowOption(String option) {
        Select st = new Select(dropdown);
        st.selectByVisibleText(option);
    }
}
