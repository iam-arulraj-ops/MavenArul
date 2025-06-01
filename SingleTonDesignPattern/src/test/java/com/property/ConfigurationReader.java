package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	Properties p;
	
	public ConfigurationReader() throws IOException {

		File f = new File("C:\\Eclipse_Final\\SingleTonDesignPattern\\userdata.properties");
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
	}
	
	public String user() {
		String name = p.getProperty("username");
		return name;
	}
}
