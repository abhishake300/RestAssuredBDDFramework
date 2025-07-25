package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.TransactionController;
import com.api.models.request.LoginRequest;
import com.api.models.request.TransactionRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserTransactionResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class DepositTransactionTest {

	@Test
	public void depositTransactionTest() {
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("abhi300", "abhi300"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		TransactionController transactionController = new TransactionController();
		TransactionRequest transactionRequest = new TransactionRequest.Builder().accountNumber("3369048228").amount(100)
				.description("deposit").build();
		response = transactionController.depositTransaction(loginResponse.getToken(), transactionRequest);
		System.out.println(response.asPrettyString());
		UserTransactionResponse userTransactionResponse = response.as(UserTransactionResponse.class);

		System.out.println(userTransactionResponse.getBalanceAfterTransaction());

		Assert.assertEquals(userTransactionResponse.getSourceAccount(), "3369048228");

	}

}
