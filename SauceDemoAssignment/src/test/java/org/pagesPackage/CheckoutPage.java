package org.pagesPackage;

import org.basePackage.BaseTest;
import org.openqa.selenium.By;
public class CheckoutPage extends BaseTest {

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");

    public void completeCheckout() {
        sendKeys(firstName, "Test");
        sendKeys(lastName, "User");
        sendKeys(postalCode, "600001");
        click(continueBtn);
        click(finishBtn);
    }
}