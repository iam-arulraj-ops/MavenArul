package com.property;

import java.io.IOException;

public class SingleTonDesign {

	
	
	
	public static ConfigurationReader configReader() throws IOException {
		
		ConfigurationReader c = new ConfigurationReader();
		return c;
	}
	
	private SingleTonDesign SingleTonDesign() {
		SingleTonDesign s = new SingleTonDesign();
		return s;
	}
}
