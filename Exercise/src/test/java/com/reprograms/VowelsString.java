package com.reprograms;

public class VowelsString {

	public static void main(String[] args) {

		String str = "aaaaaabbbeeeEiiiiiooooouuuuenincjkdnckjsnckjkuhclasdbcuasdckbk";

		String s1 = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println("Vowels: " + count);
	}
}