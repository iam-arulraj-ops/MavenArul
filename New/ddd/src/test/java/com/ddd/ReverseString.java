package com.ddd;

public class ReverseString {

	public static void main(String[] args){

		String word="Software Testing";
		String word1="";

		for(int i=word.length()-1;i>=0;i--){
		word1=word1+word.charAt(i);
		}
		System.out.println("Reversal of a String: "+word1);
		}}


