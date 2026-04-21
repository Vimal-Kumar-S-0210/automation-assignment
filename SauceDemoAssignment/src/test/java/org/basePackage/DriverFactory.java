package org.basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public static WebDriver initDriver(String browser) {

        if (browser == null) {
            throw new RuntimeException("Browser is NULL");
        }

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            return new ChromeDriver(options);
        }

        throw new RuntimeException("Invalid browser");
    }
}