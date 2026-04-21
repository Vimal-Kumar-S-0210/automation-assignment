package org.stepDefinitions;

import org.basePackage.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks extends BaseTest {

    @Before
    public void setup() {
        loadConfig();
        initDriver();
    }

    @After
    public void tearDown() {
        quitDriver();
    }
}