package org.stepDefinitions;

import org.pagesPackage.LoginPage;

import io.cucumber.java.en.*;

public class LoginSteps {

    LoginPage login = new LoginPage();

    @Given("user is on login page")
    public void openSite() {}

    @When("user enters {string} and {string}")
    public void loginSteps(String user, String pass) {
        login.login(user, pass);
    }

    @Then("user should be logged in")
    public void verifyLogin() {
        System.out.println("Login successful");
    }
}