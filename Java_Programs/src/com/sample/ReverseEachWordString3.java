package com.sample;

public class ReverseEachWordString3 {

	public static void main(String[] args) {

		String word="java cypress python jasmine katalon postman restassured";
		String[] words=word.split(" ");
		
		String reverseString="";
		
		for(String w:words) {
			String reverseWord= "";
			for(int i= w.length()-1;i>=0;i--) {
				reverseWord= reverseWord+w.charAt(i);
			}
			reverseString= reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
	}

}
	