package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	// we used design builder pattern here to easily add many fields
	@Test
	public void createAccountTest() {
	SignUpRequest signUpRequest=new SignUpRequest.Builder().username("disha11").password("disha11")
		.email("dish11@yahoo.com").firstName("dish").lastName("alasta")
		.mobileNumber("777777711").build();
	
	
	AuthService authService = new AuthService();
	Response response =authService.signUp(signUpRequest);
	System.out.println(response.asPrettyString());
	}
}
