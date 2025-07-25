package com.api.base;
import com.api.filters.LoggingFilter;
import com.api.models.request.LoginRequest;

//can implement static on import
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {// wrapper for RestAssured
//Base URI
// Creating the request
//handling the request
	
	private static final String baseURL="http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
	
	//introduce the static block to execute just once
	static{
		RestAssured.filters(new LoggingFilter());
	}
	
	public BaseService() {
		requestSpecification =RestAssured.given().baseUri(baseURL);
	}
	
	protected Response  postRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
		
	}
	
	protected Response  putRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
		
	}
	
	protected Response  getRequest( String endpoint) {
		return requestSpecification.get(endpoint);
		
	}
	
	protected Response  patchRequest(  Object payload,String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).patch(endpoint);
		
	}
	
	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization","Bearer "+token);
		
	}
}
