package com.restassured;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Json_Response_Validation {

	@Test
	public void jsonResponseBodyValidation() throws IOException, ParseException {

		File f = new File("C:\\Eclipse_Final\\RestAssured_29-11-2023\\TestData\\Payload.json");

		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonObj = (JSONObject) parse;
		
		Object object = jsonObj.get("first_name");
		String value = object.toString();
		Assert.assertEquals(value, "Janet");
		System.out.println(value);
	}

}
