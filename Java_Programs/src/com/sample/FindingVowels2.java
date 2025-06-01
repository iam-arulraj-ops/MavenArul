package com.sample;

public class FindingVowels2 {

	public static void main(String[] args) {

		String s="suuuuueeeeeiiiiiooooooo";
		String s1=s.toLowerCase();
		
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char c= s1.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println("Total number of vowels in the given words is: "+count);
	}

}
