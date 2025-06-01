package com.restassured;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {

	SoftAssert variableName;

	@Test
	public void getRequestMethod() {

		RestAssured.baseURI = "https://reqres.in/";// domain name
		RequestSpecification reqSpec = RestAssured.given();
		Response response = reqSpec.request(Method.GET, "api/users?page=2");
		variableName = new SoftAssert();
		System.out.println("Response of the Get API:" + response.asString());
		int actualStatusCode = response.statusCode();
		System.out.println("Status Code: " + actualStatusCode);
		variableName.assertEquals(actualStatusCode, 201);
		System.out.println("====test case execution even after when it is failed====");
		String responseBodyData = response.body().asString();
		variableName.assertEquals(responseBodyData.contains("Thivakar"), true);
		variableName.assertEquals(responseBodyData.contains("Michael"),false);
		String value= response.header("Content-type");
		System.out.println("Value of the content type: "+value);
		variableName.assertEquals(value, "application/json; charset=utf-8");
		variableName.assertAll();
	}
}