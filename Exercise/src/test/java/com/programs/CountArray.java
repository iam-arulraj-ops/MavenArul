package com.programs;

public class CountArray {

	public static void main(String[] args) {

		String str = "java selenium postman restassured bdd tdd ddd appium playwright";

		String words[] = str.split(" ");

		int length = words.length;

		System.out.println(length);
	}
}