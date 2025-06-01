package com.sample;

public class CountEqualsLength {

	public static void main(String[] args) {

		int count=0;
		String s="Arul Raj";
		
		char ch[]= s.toCharArray();
		for(char c:ch) {
			count++;
		}
		
		System.out.println(count+"="+s.length());
	}

}
