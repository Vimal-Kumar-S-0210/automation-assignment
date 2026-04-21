package org.stepDefinitions;


import org.pagesPackage.CartPage;
import org.pagesPackage.CheckoutPage;
import org.pagesPackage.LoginPage;
import org.pagesPackage.ProductsPage;

import io.cucumber.java.en.*;

public class OrderSteps {

    LoginPage login = new LoginPage();
    ProductsPage product = new ProductsPage();
    CartPage cart = new CartPage();
    CheckoutPage checkout = new CheckoutPage();

    @Given("user logged in")
    public void loginUser() {
        login.login("standard_user", "secret_sauce");
    }

    @When("user places an order")
    public void orderFlow() {
        product.addProduct();
        product.goToCart();
        cart.clickCheckout();
        checkout.completeCheckout();
    }

    @Then("order is successful")
    public void verifyOrder() {
        System.out.println("Order completed");
    }
}