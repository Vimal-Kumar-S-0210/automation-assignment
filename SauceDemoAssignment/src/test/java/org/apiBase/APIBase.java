package org.apiBase;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIBase {

    protected static Response response;

    public void setBaseURI(String baseURI) {
        RestAssured.baseURI = baseURI;
    }

    public void getRequest(String endpoint) {
        response = RestAssured
                .given()
                .log().all()
                .when()
                .get(endpoint);

        response.then().log().all();
    }

    public void postRequest(String endpoint, String body) {
        response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .log().all()
                .when()
                .post(endpoint);

        response.then().log().all();
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }

    public String getResponseBody() {
        return response.getBody().asString();
    }

    public String getJsonValue(String key) {
        return response.jsonPath().getString(key);
    }
}