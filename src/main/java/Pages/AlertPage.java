package Pages;

import Basics.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AlertPage extends BasePage {

    //WebDriver driver;
    @FindBy(linkText = "JavaScript Alerts")
    private WebElement alertsLink;
    @FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Alert']")
    private WebElement jsAlert;
    @FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Confirm']")
    private WebElement jsConfirmButton;
    @FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Prompt']")
    private WebElement jsPromptButton;
    @FindBy(xpath = ".//p[@id='result']")
    private WebElement messageValidation;

    private final String message = "sending message";

    public AlertPage() {
       // this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAlertLink() {
        alertsLink.click();
    }

    public void clickOnJSButton() {
        jsAlert.click();
        driver.switchTo().alert().accept();
    }

    public void clickOnJsConfirmButton() {
        jsConfirmButton.click();
        driver.switchTo().alert().accept();
    }

    public void clickOnJsPromptButton() {
        jsPromptButton.click();
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }

    public void validateMessage() {
        Assert.assertTrue(messageValidation.getText().contains(message));
    }
}
