package com.handles;

public class Vowels {

	public static void main(String[] args) {

		String str= "this topic is all about java and java is a platform independent because java is a object oriented programming language in which the topic deals with selenium";
		String s = str.toLowerCase();
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				
				count++;
		}
	}
		System.out.println(count);
	}
}
