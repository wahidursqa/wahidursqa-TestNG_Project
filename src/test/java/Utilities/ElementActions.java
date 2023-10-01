package Utilities;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

import static EnvironmentSetup.BaseEnvironment.driver;
public class ElementActions {
    public static WebElement getElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
    public static void clickElement(By locator) throws InterruptedException {
        getElement(locator).click();
        Thread.sleep(1000);
    }
    public static String getText(By locator) throws InterruptedException {
        Thread.sleep(1000);
        return getElement(locator).getText();
    }
    public static void doEnterValue(By locator, String value) throws InterruptedException {
        getElement(locator).clear();
        Thread.sleep(1000);
        getElement(locator).sendKeys(value);
    }
    public static void hoverValue(By locator) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(getElement(locator)).perform();
    }
    public static String generateEmail()
    {
        Random random = new Random();
        return "wahidur"+random.nextInt()+"@gmail.com";
    }
}
