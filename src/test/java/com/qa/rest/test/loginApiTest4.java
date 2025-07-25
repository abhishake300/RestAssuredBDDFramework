package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListener.class)
public class loginApiTest4 {

	@Test(description = "Verify if Api is running")
	public void loginTest() {

		LoginRequest loginRequest = new LoginRequest("abhi300", "abhi300");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse= response.as(LoginResponse.class);
		System.out.println(loginResponse.getEmail()+"  Email adress");
		
		Assert.assertEquals(loginResponse.getUsername(), "abhi300");

	}

}
