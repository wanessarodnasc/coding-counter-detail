package com.counter.detail.controller;

import static io.restassured.RestAssured.given;

import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

/**
* 
* @author Wanessa Nascimento
*
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CounterDetailControllerTest {

	@LocalServerPort
	protected int port;
	
	@Before
	public void beforeTest() {
		RestAssured.port = port;
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}

	@Test
	public void authentication() {
        given()
            .contentType(ContentType.JSON)
            .param("id", "1")
        .when()
            .get("counter")
        .then()
            .statusCode(HttpStatus.SC_OK);
	}
}
