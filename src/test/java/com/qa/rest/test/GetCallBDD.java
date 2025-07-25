package com.qa.rest.test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetCallBDD {
	
	
	@Test
	public void test_getStatus() {
	given().
	when().
	get("https://naveenautomationlabs.com/opencart/index.php?route=account/login").
	then().assertThat().statusCode(100);
	
	}
	
	@Test
	public void basic_authetication() {
		
		RestAssured.baseURI ="https://automationexercise.com/api/searchProduct";
		
		RequestSpecification request = RestAssured.given();
		
//		String credentials ="abii@1.com:selenium123";
//		
//		//use encoding so that we dont send this directly to server usign base64
//		
//          byte[] encodedCredentials =org.apache.commons.codec.binary.Base64.encodeBase64(credentials.getBytes());
//              
//           String encodedCredentialsAsString =  new String(encodedCredentials);
//           
//           request.header("Authorization","Basic "+encodedCredentialsAsString);
//           
         Response response=  request.contentType("multipart/form-data").multiPart("search_product","top").post();
        		 
        		 
        		 //body("search_product").post("top");
         
      
       List nameonly = response.jsonPath().getList("products.name");
       System.out.println(nameonly); 
       Assert.assertListContainsObject(nameonly,"Bluer Top", "pass");
        response.prettyPrint();
        int statuscode= response.statusCode();
        System.out.println("Response status code is"+statuscode);
      //Assert.assertEquals("302", statuscode);

	}

}
