package com.sample;

public class FindingVowels {

	public static void main(String[] args) {

		String s="Education";
		String s1=s.toLowerCase();
		
		
		int count=0;
		
		for(int i=0;i<s1.length();i++) {
		char c= s1.charAt(i);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			count++;
		}
		}
		System.out.println("Number of vowels in the given String is: "+count);
	}

}
