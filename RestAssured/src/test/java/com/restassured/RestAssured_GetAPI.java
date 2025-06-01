package com.restassured;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParser;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.internal.support.FileReader;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssured_GetAPI {

	@Test
	public void getRequest() {

		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification reqSpec = RestAssured.given();
		Response response = reqSpec.get();

		int statusCode = response.getStatusCode();
		System.out
				.println("===================================Response Code==========================================");
		System.out.println("Status Code is: " + statusCode);

		ResponseBody body = response.getBody();
		System.out.println(
				"===================================Response Body============================================");
		System.out.println("Response Body is :" + body.asString());

		String statusLine = response.getStatusLine();
		System.out
				.println("===================================StatusLine Code and Message============================");
		System.out.println("Status Line is:" + statusLine);

		Assert.assertEquals(statusCode, 200);

		System.out.println("===============Response Headers=================");

		Headers headers = response.headers();

		for (Header head : headers) {
			System.out.println(head.getName() + "=" + head.getValue());
		}
	}

	@Test
	public void validateJsonBody() {

		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification reqSpec = RestAssured.given();
		Response response = reqSpec.get();

		JsonPath jsonPath = response.jsonPath();
		System.out.println("======================Validate Json response body======================");
		String fname = jsonPath.getString("data.first_name");

		System.out.println(fname);

		String lname = jsonPath.getString("data.last_name");
		System.out.println(lname);

		String url = jsonPath.getString("support.url");
		System.out.println(url);
		System.out.println("====================================");
	}

	@Test
	public void authentication() {

		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification reqSpec = RestAssured.given();
		// Basic Authentication
		reqSpec.auth().basic("username", "password");
		// BearerToken
		reqSpec.auth().oauth2("BearerToken");
		// to pass Request Headers
		reqSpec.header("Content-Type", "application/json");
		reqSpec.header("Content-Length", "1234");
	}

	@Test
	public void validatePostRequest() {

		RestAssured.baseURI = "https://reqres.in/api/login";
		RequestSpecification reqSpec = RestAssured.given();

		String payload = "{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"\r\n"
				+ "}";

		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(payload);

		Response postResponse = reqSpec.post();
		int statusCode = postResponse.getStatusCode();

		System.out.println(statusCode);

		String body = postResponse.getBody().asString();
		System.out.println(body);
	}
	@Test
	public void  validateInvalidPostRequest() {
	
	RestAssured.baseURI="https://reqres.in/api/login";
	RequestSpecification reqSpec=RestAssured.given();
	
	String payload="{\r\n"
			+ "    \"email\": \"peter@klaven\"\r\n"
			+ "}";
	
	reqSpec.contentType(ContentType.JSON);
	reqSpec.body(payload);
	
	Response postInvalidResponse = reqSpec.post();
	
	int statusCode = postInvalidResponse.getStatusCode();
	System.out.println(statusCode);
			
	String body = postInvalidResponse.getBody().asString();
	System.out.println(body);
}}