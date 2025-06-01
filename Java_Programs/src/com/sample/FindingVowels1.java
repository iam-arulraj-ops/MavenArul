package com.sample;

public class FindingVowels1 {

	public static void main(String[] args) {

		String str="Education";
		String s=str.toLowerCase();
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println("Total Number of vowels in the given word is: "+count);
	}

}
