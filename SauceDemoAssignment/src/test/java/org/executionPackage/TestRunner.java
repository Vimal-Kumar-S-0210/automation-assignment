package org.executionPackage;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.*;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "org.stepDefinitions",
    plugin = {"pretty"},
    tags = "@tags",
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests  {
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    
}