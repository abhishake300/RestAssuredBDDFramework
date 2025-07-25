package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	
	@Test(description = "verify that the profile is updated with new details")
	public void profileupdateTest() {
		AuthService authService = new AuthService();
		Response response =authService.login(new LoginRequest("abhi300", "abhi300"));
		LoginResponse loginResponse= response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println("---------------------------------------------------");
		UserProfileManagementService userprofmanag = new UserProfileManagementService();
		response = userprofmanag.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		userProfileResponse userprofResponse = response.as(userProfileResponse.class);
		Assert.assertEquals(userprofResponse.getUsername(), "abhi300");
		
		System.out.println("---------------------------------------------------");
		
		UserProfileRequest profRequest =new UserProfileRequest.Builder()
				.firstName("abhi2").lastName("g2").email("abhishake300@gmail.com")
				.mobileNumber("6666666666"). build();
		
		
	response =	userprofmanag.updateProfile(loginResponse.getToken(), profRequest);
	
	System.out.println(response.asPrettyString());
		
		
	}

}
