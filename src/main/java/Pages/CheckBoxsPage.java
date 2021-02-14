package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckBoxsPage {
    private WebDriver driver;
    @FindBy(linkText = "Checkboxes")
    private WebElement checkBoxPage;
    @FindBy(css = "form#checkboxes > input:nth-of-type(1)")
    private WebElement checkboxe1;
    @FindBy(css = "form#checkboxes > input:nth-of-type(2)")
    private WebElement checkboxe2;

    public CheckBoxsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToCheckBoxPage() {
        checkBoxPage.click();
    }

    public void clickOnCheckBox1() {
        if (!checkboxe1.isSelected()) {
            checkboxe1.click();
        }
    }

    public void clickOnCheckBox2() {
        if (!checkboxe2.isSelected()) {
            checkboxe2.click();
        }
    }

    public void deselectAllCheckBox() {
        if (checkboxe1.isSelected()) {
            checkboxe1.click();
        }
        if (checkboxe2.isSelected()) {
            checkboxe2.click();
        }
    }
}

