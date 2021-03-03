package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import util.WebEventListener;

public class BasePage {

    public static  WebDriver driver;
    public static EventFiringWebDriver eventFiringWebDriver;
    public static WebEventListener eventListener;


    public void setup(){
        System.setProperty("headless","false");
        String headlessBrowser = System.getProperty("headless");

        if("true".equals(headlessBrowser)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        }
        else {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
        }

        eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventListener = new WebEventListener();
        eventFiringWebDriver.register(eventListener);
        driver = eventFiringWebDriver;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://the-internet.herokuapp.com/");
    }

}
