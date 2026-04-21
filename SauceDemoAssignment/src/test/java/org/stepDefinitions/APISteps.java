package org.stepDefinitions;

import org.apiBase.APIBase;
import io.cucumber.java.en.*;

import static org.testng.Assert.*;

public class APISteps extends APIBase {

    @Given("user sets base URI")
    public void setBase() {
        setBaseURI("https://reqres.in/api");
    }

    @When("user sends GET request to {string}")
    public void sendGet(String endpoint) {
        getRequest(endpoint);
    }

    @Then("response status code should be {int}")
    public void validateStatus(int status) {
        assertEquals(getStatusCode(), status);
    }
}