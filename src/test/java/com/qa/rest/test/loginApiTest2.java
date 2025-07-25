package com.qa.rest.test;

import org.testng.Assert;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class loginApiTest2 {
	public void logintest() {
	//	baseURI = "http://64.227.160.186:8080";

		
		Response response=
				given()
				.baseUri("http://64.227.160.186:8080")
				.header("Content-Type", "application/json")
				.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 200);
	}

}
