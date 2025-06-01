package com.sample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
//Approach1 using FileReader and BufferedReader
//		FileReader fr= new FileReader("C:\\Users\\Intel\\Desktop\\test.txt");
//		BufferedReader br= new BufferedReader(fr);
//		
//		String str;
//		while((str=br.readLine())!=null) {
//			System.out.println(str);
//		}
//		br.close();
//	}

		//Approach2 using Scanner and File
		
//		File f= new File("C:\\Users\\Intel\\Desktop\\test.txt");
//		Scanner sc= new Scanner(f);
//		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		//Approach3 Using Scanner and File
		File f= new File("C:\\Users\\Intel\\Desktop\\test.txt");
		Scanner sc= new Scanner(f);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
}}
