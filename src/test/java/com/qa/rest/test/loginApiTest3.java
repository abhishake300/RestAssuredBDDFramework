package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class loginApiTest3 {

	@Test(description = "verify if login api is working")
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("abhi300", "Push@1234");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);

		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.getId());

		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getEmail(), "abhishake300@gmail.com");

//		AuthService authservice = new AuthService();
////		Response response = authservice
////				.login("{\r\n" + "  \"username\": \"abhi300\",\r\n" + "  \"password\": \"Push@1234\"\r\n" + "}");
//		System.out.println(response.asPrettyString());
	}

}
