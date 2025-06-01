package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {

	@Test
	public void method() {
		
		RestAssured.baseURI="path";
		RequestSpecification reqSpec = RestAssured.given();
		Response response = reqSpec.get();
		
		JsonPath jsonPath = response.jsonPath();
		String cs = jsonPath.getString("ComputerScience.id.cs");
		System.out.println(cs);
		
	
		String business = jsonPath.getString("Business.finance");
		System.out.println(business);

		
	}
}
