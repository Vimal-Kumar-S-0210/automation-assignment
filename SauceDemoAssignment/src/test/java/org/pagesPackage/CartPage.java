package org.pagesPackage;

import org.basePackage.BaseTest;
import org.openqa.selenium.By;

public class CartPage extends BaseTest {

    private By checkout = By.id("checkout");

    public void clickCheckout() {
        click(checkout);
    }
}