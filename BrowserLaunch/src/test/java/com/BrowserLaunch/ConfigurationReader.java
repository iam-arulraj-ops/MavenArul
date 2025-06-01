package com.BrowserLaunch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	Properties p;
	
	public ConfigurationReader() throws IOException {

		File f= new File("C:\\Eclipse_Final\\BrowserLaunch\\data.properties");
		FileInputStream fis =  new FileInputStream(f);
		
		 p = new Properties();
		System.out.println("before loading: "+p);
		p.load(fis);
		System.out.println("after loading: "+p);
		
		
	}
	public String url() {
		String url = p.getProperty("url");
		return url;
		
	}
	public String username() {
		String user= p.getProperty("username");
		return user;
	}
	public String pass() {
		String pass = p.getProperty("password");
		return pass;
	}
}
