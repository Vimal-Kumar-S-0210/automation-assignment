package org.pagesPackage;


import org.basePackage.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    public void login(String user, String pass) {
        sendKeys(username, user);
        sendKeys(password, pass);
        click(loginBtn);
    }
}
