package com.qa.rest.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {

	@Test
	public void getProfileTest() {

		AuthService authService = new AuthService();
		
		Response response = authService.login(new LoginRequest("abhi300", "abhi300"));
		LoginResponse loginResponse =response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		UserProfileManagementService userprofmanag = new UserProfileManagementService();
	    response =userprofmanag.getProfile(loginResponse.getToken());
	    System.out.println(response.asPrettyString());
	    userProfileResponse userprofresp=   response.as(userProfileResponse.class);
        System.out.println(userprofresp.getFirstName());
	}
}
