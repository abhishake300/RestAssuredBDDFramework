package com.qa.rest.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.userProfileResponse;

import io.restassured.response.Response;

public class PatchUpdateProfile {
	
	@Test
	public void PatchUpdateTest() {
		AuthService authService = new AuthService();
	Response response=	authService.login(new LoginRequest("abhi300","abhi300"));
	System.out.println(response.asPrettyString());
	System.out.println("-----------------------------------");
	LoginResponse loginResponse =response.as(LoginResponse.class);
	loginResponse.getToken();
	UserProfileManagementService userProfManageService = new UserProfileManagementService();
    response=	userProfManageService.getProfile(loginResponse.getToken());
	System.out.println(response.asPrettyString());
	System.out.println("-----------------------------------");
	
	UserProfileRequest userProfRequest = 
  new UserProfileRequest(null, "g333", null, null);
	
	response = userProfManageService.patchUpdateProfile(loginResponse.getToken(), userProfRequest);
	System.out.println(response.asPrettyString());
	System.out.println("-----------------------------------");
	
	
		
		
		
	}

}
