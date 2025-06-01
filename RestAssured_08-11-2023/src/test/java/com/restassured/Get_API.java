package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Get_API {

	@Test
	public void getRequest() {

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification reqSpec = RestAssured.given();
		Response response = reqSpec.get();

		System.out.println("============Status Code=========");

		int statusCode = response.getStatusCode();
		System.out.println("Status Code is: " + statusCode);

		System.out.println("============Response Body=========");
		ResponseBody body = response.getBody();

		System.out.println("Response Body is: " + body.asString());

		System.out.println("============Status Line=========");
		String statusLine = response.getStatusLine();

		System.out.println("Status Line is: " + statusLine);

		System.out.println("============Response Headers=========");
		Headers headers = response.headers();

		for (Header head : headers) {
			System.out.println(head.getName() + "=" + head.getValue());
		}
	}

	@Test
	public void getValidateJsonResponseBody() {

		RestAssured.baseURI = "https://reqres.in/api/unknown";
		RequestSpecification reqSpec = RestAssured.given();
		Response response = reqSpec.get();

		JsonPath jsonPath = response.jsonPath();

		String page = jsonPath.getString("page");
		System.out.println(page);

		String fname = jsonPath.getString("data.name[1]");
		System.out.println(fname);

		String year = jsonPath.getString("data.year[0]");
		System.out.println(year);

		String url = jsonPath.getString("support.url");
		System.out.println(url);
	}

	@Test
	public void authentication() {

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification reqSpec = RestAssured.given();
		// Authentication
		// Basic
		reqSpec.auth().basic("username", "password");
		// Bearer Token
		reqSpec.auth().oauth2("Bearer Token");
		// to pass request headers
		reqSpec.header("Content-Type", "application/json");
		reqSpec.header("Content-Length", "1234");
	}
		@Test
		public void validatePostRequest() {
			
			
		}
	}