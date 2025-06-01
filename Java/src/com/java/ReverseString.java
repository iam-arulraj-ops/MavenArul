package com.java;

public class ReverseString {

	public static void main(String[] args) {

		String word="Arul Raj";
		String word1 ="";
		
		for(int i=word.length()-1;i>=0;i--) {
			word1=word1+word.charAt(i);
			
		}
		System.out.println(word1);
		
	
	String word2="Cyril Sebastian";
	for(int i=word2.length()-1;i>=0;i--) {
		System.out.print(word2.charAt(i));
	}
	
	String word3="ABBA";
	
	String word4="";
	for(int i=word3.length()-1;i>=0;i--) {
		word4=word4+word3.charAt(i);
		
	}
	System.out.println(word4);
	
	if(word3.equals(word4))
		System.out.println("Palindrome");
	else System.out.println("Not A Palindrome");
	}

}
