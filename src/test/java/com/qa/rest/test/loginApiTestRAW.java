package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class loginApiTestRAW {

	@Test
	public void logintest() {
		RestAssured.baseURI = "http://64.227.160.186:8080";
		RequestSpecification x = RestAssured.given();
		RequestSpecification y = x.header("Content-Type", "application/json");
		RequestSpecification z = y
				.body("{\r\n" + "  \"username\": \"abhi300\",\r\n" + "  \"password\": \"Push@1234\"\r\n" + "}");
		Response response=z.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 200);
	}

}
