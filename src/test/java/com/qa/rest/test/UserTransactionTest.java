package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.TransactionController;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserTransactionResponse;

import io.restassured.response.Response;

public class UserTransactionTest {
	
	
	
	@Test(description = "get user transaction history")
	public void userTransactionTest() {
		
		AuthService authService = new AuthService();
	Response response =	authService.login(new LoginRequest("abhi300", "abhi300"));
	LoginResponse loginResponse = response.as(LoginResponse.class);	
	TransactionController transactionController = new TransactionController();
	response =transactionController.getTransactions(loginResponse.getToken(), "3369048228");
	System.out.println(response.asPrettyString());
	String sourceAccount =response.getBody().jsonPath().getString("content.sourceAccount");
 System.out.println(sourceAccount);
  // Assert.assertEquals(sourceAccount, "3369048228");
   Assert.assertTrue(sourceAccount.contains("3369048228"));
	}

}
