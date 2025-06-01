package com.property;

import java.io.IOException;

public class RunnerClass {

	public static void main(String[] args) throws IOException {

		
	//ConfigurationReader c = new ConfigurationReader();
//		
//			System.out.println("Username: "+c.userName());
		
//		SingleTonDesignPattern s = new SingleTonDesignPattern();
//		System.out.println(s.configReader().userName());
//		
		
		System.out.println("Username: "+SingleTonDesignPattern.configReader().userName());

		
	}}