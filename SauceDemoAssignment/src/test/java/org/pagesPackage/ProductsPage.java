package org.pagesPackage;

import org.basePackage.BaseTest;
import org.openqa.selenium.By;

public class ProductsPage extends BaseTest {

    private By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    private By cart = By.className("shopping_cart_link");

    public void addProduct() {
        click(addToCart);
    }

    public void goToCart() {
        click(cart);
    }
}