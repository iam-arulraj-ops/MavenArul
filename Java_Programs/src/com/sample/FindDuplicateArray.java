package com.sample;

import java.util.HashSet;

public class FindDuplicateArray {

	public static void main(String[] args) {

		String arr[] = {"java","selenium","cucumber","testng","pom","maven","pom"};
		
//		boolean flag=false;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Duplicates found: "+arr[i]);
//					flag=true;
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("No duplicates found");
//		}
//	}
//
//}

		HashSet<String> langs=new HashSet();
		
		boolean flag=false;
		for(String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("Duplicates found: "+l);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Duplicates found");
		}}}