package com.list;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(200);
		System.out.println("List1 is: "+l1);
		
		List<Integer> l2= new ArrayList<>();
		l2.add(400);
		l2.add(500);
		l2.add(600);
		System.out.println("List2 is : "+l2);
		l1.addAll(l2);
		System.out.println("List1 after adding all: "+l1);
		l1.retainAll(l2);
		System.out.println("List1 after retaining all: "+l1);
		l1.removeAll(l2);
		System.out.println("List1 after removing all: "+l1); 
		
		List<String> l3 = new ArrayList<>();
		
		l3.add("Greatest of all Time");
		l3.add("Ronaldo");
		l3.add("Messi");
		l3.add("Virat Kohli");
		l3.add("Neymar Jr.");
		l3.add("LeBron");
		System.out.println("List after using String Wrapper Class: "+l3);
		
		List<Character> l4 = new ArrayList<>();
		l4.add('K');
		l4.add('I');
		l4.add('N');
		l4.add('G');
		System.out.println("List after using Character Wrapper Class: "+l4);
		
		List<Double> l5 = new ArrayList<>();
		l5.add(97.8);
		l5.add(91.25);
		l5.add(67.7);
		System.out.println("List after using Double Wrapper Class: "+l5);
		
		List<Float> l6 = new ArrayList<>();
		l6.add(97.8f);
		l6.add(67.7f);
		l6.add(91.25f);
		System.out.println("List after using Float Wrapper Class: "+l6);
		
		List<Long> l7=  new ArrayList<>();
		l7.add(12345678994515151l);
		l7.add((long) 1233);
		l7.add(9876543210202l);
		System.out.println("List after using Long Wrapper Class: "+l7);
		
		List<Integer> l8= new ArrayList<>();
		
		l8.add(100);
		l8.add(200);
		l8.add(300);
		System.out.println("L8: "+l8);
		
		List<Integer> l9=new ArrayList<>();
		l9.add(400);
		l9.add(300);
		l9.add(500);
		System.out.println("L9: "+l9);
		
		l9.addAll(l8);
		System.out.println("New L9: "+l9);
		l9.retainAll(l8);
		System.out.println(l9);
		l9.removeAll(l8);
		System.out.println(l9);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		int size = list.size();
		System.out.println(size);
		
		Integer integer=list.get(2);
		System.out.println(integer);
		
		list.set(2, 100);
		System.out.println(list);
		
		boolean contains = list.contains(100);
		System.out.println(contains);
	}}