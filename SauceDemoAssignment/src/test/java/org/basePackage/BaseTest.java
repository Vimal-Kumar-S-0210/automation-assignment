package org.basePackage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class BaseTest {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected static Properties prop;

    // =============================
    // DRIVER METHODS
    // =============================

    public void loadConfig() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(
                    System.getProperty("user.dir") + "/src/test/resources/config.properties");
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public WebDriver initDriver() {
        String browser = prop.getProperty("browser");

        WebDriver webDriver = DriverFactory.initDriver(browser);
        driver.set(webDriver);

        getDriver().manage().window().maximize();
        getDriver().get(prop.getProperty("baseUrl"));

        return getDriver();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }

    // =============================
    // REUSABLE ACTION METHODS
    // =============================

    public void click(By locator) {
        getDriver().findElement(locator).click();
    }

    public void sendKeys(By locator, String value) {
        WebElement element = getDriver().findElement(locator);
        element.clear();
        element.sendKeys(value);
    }

    public String getText(By locator) {
        return getDriver().findElement(locator).getText();
    }

    public boolean isDisplayed(By locator) {
        return getDriver().findElement(locator).isDisplayed();
    }

    public void clear(By locator) {
        getDriver().findElement(locator).clear();
    }

    // =============================
    // WAIT METHODS
    // =============================

    public WebElement waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // =============================
    // DROPDOWN METHODS
    // =============================

    public void selectByVisibleText(By locator, String text) {
        Select select = new Select(getDriver().findElement(locator));
        select.selectByVisibleText(text);
    }

    public void selectByValue(By locator, String value) {
        Select select = new Select(getDriver().findElement(locator));
        select.selectByValue(value);
    }

    public void selectByIndex(By locator, int index) {
        Select select = new Select(getDriver().findElement(locator));
        select.selectByIndex(index);
    }

    // =============================
    // ALERT METHODS
    // =============================

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
    }

    public void dismissAlert() {
        getDriver().switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return getDriver().switchTo().alert().getText();
    }

    // =============================
    // WINDOW METHODS
    // =============================

    public void switchToWindow(String windowHandle) {
        getDriver().switchTo().window(windowHandle);
    }

    public String getCurrentWindow() {
        return getDriver().getWindowHandle();
    }

    // =============================
    // SCROLL METHODS
    // =============================

    public void scrollToElement(By locator) {
        WebElement element = getDriver().findElement(locator);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollByPixels(int x, int y) {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    // =============================
    // UTILITY METHODS
    // =============================

    public String getTitle() {
        return getDriver().getTitle();
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }
}