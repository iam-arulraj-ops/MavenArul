package com.sample;

public class String_IdentityHashCode {

	public static void main(String[] args) {

		String s = "Greens";
		String s1 = "Greens";
		String s2 = "Technologys";

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		s = s + s2;
		System.out.println(System.identityHashCode(s));

		System.out.println("Mutable");

		StringBuffer sb = new StringBuffer("Greens");
		StringBuffer sb1 = new StringBuffer("Greens");
		StringBuffer sb2=  new StringBuffer("Technologys");
		
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		sb=sb.append(sb2);
		System.out.println(sb);
		
		System.out.println(System.identityHashCode(sb));
	}

}
