package com.restassured;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Json_Validation {

	@Test
	public void jsonValidationMethod() throws IOException, ParseException {
		
		File f =  new File("C:\\Eclipse_Final\\RestAssured\\TestData\\Payload.json");
		
		FileReader reader = new FileReader(f);
		JSONParser parser  = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject  jsonObj=  (JSONObject) parse;
		
		Object object = jsonObj.get("first_name");
		String value = object.toString();
		Assert.assertEquals(value, "Janet");
		System.out.println(value);
	}
}