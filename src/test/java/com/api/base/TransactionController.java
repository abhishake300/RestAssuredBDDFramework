package com.api.base;

import com.api.models.request.TransactionRequest;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TransactionController extends BaseService {

	private final String BASE_PATH = "/api/transactions/";

	public Response getTransactions(String token, String accountNumber) {
		setAuthToken(token);
		return getRequest(BASE_PATH + "history" + "?accountNumber=" + accountNumber + "&page=0&size=10");
	}

	public Response depositTransaction(String token, TransactionRequest payload) {
		setAuthToken(token);
		return postRequest(payload, BASE_PATH + "deposit");
	}

}
