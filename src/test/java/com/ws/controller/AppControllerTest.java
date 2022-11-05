package com.ws.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class AppControllerTest {

    @Test
    public void getPostTest(){

        given()
                .when()
                .get("/v1/users")
                .then()
                .statusCode(200)
                .body(is(""));
    }

}
