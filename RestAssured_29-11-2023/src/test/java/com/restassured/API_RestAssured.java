package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_RestAssured {

	@Test
	public void getRequest() {

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification reqSpec = RestAssured.given();
		Response response = reqSpec.get();

		int statusCode = response.getStatusCode();
		System.out.println("Status Code is: " + statusCode);
		System.out.println("==============================");

		String body = response.getBody().asString();
		System.out.println("Response Body is: " + body);
		System.out.println("===============================");

		String statusLine = response.getStatusLine();
		System.out.println("Status Line is: " + statusLine);
		System.out.println("================================");

		Headers header = response.headers();

		for (Header head : header) {
			System.out.println(head.getName() + "=" + head.getValue());
		}
	}

	@Test
	public void validateResponseJsonBody() {

		RestAssured.baseURI = "https://reqres.in/api/unknown";
		RequestSpecification reqSpec = RestAssured.given();
		Response response = reqSpec.get();

		JsonPath jsonPath = response.jsonPath();
		String fname = jsonPath.getString("data.name[1]");
		System.out.println(fname);
		System.out.println("================================");

		String colorValue = jsonPath.getString("data.color[5]");
		System.out.println(colorValue);
		System.out.println("================================");

		String url = jsonPath.getString("support.url");
		System.out.println(url);
		System.out.println("================================");

		String text = jsonPath.getString("support.text");
		System.out.println(text);
		System.out.println("================================");
	}

	@Test
	public void authentication() {

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification reqSpec = RestAssured.given();
		// basic auth
		reqSpec.auth().basic("username", "password");
		// bearer token
		reqSpec.auth().oauth2("Bearer Token");
		// to pass the headers
		reqSpec.header("Content-Type", "application/json");
		reqSpec.header("Content-Length", "1234");
	}

	@Test
	public void validatePostRequest() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification reqSpec = RestAssured.given();
		String payload = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(payload);

		Response response = reqSpec.post();

		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
	}

	@Test
	public void validateInvalidPostRequest() {

		RestAssured.baseURI = "https://reqres.in/api/login";
		RequestSpecification reqSpec = RestAssured.given();

		String payload = "{\r\n" + "    \"email\": \"peter@klaven\"\r\n" + "}";
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(payload);

		Response invalidResponse = reqSpec.post();

		System.out.println(invalidResponse.getStatusCode());
		System.out.println(invalidResponse.getBody().asString());
	}
}