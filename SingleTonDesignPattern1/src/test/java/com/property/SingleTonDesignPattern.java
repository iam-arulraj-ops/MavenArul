package com.property;

import java.io.IOException;

public class SingleTonDesignPattern {

	public static ConfigurationReader configReader() throws IOException {
		ConfigurationReader c = new ConfigurationReader();
		return c;
	}
	private SingleTonDesignPattern SingleTonDesignPattern() {

		SingleTonDesignPattern s = new SingleTonDesignPattern();
		return s;
	}
}