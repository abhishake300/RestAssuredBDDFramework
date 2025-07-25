package com.qa.rest.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test
	public void verifyForgotPasswordTest() {
		AuthService authService = new AuthService();
		Response response =authService.forgotPassword("dish1@yahoo.com");
		System.out.println(response.asPrettyString());
		
	}

}
