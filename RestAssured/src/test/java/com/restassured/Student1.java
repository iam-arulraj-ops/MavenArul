package com.restassured;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student1 {
	    public static void main(String[] args) { 
	        Scanner scanner = new Scanner(System.in); 
	        List<Student> students = new ArrayList<>(); 
	 
	        System.out.print("Enter the number of students: "); 
	        int numberOfStudents = scanner.nextInt(); 
	        scanner.nextLine(); // Consume the newline character 
	 
	        for (int i = 0; i < numberOfStudents; i++) { 
	            System.out.println("Entering details for student " + (i + 1) + ":"); 
	            
	            System.out.print("Enter name: "); 
	            String name = scanner.nextLine(); 
	            
	            System.out.print("Enter roll number: "); 
	            String rollNumber = scanner.nextLine(); 
	             
	            int[] marks = new int[5]; 
	            for (int j = 0; j < 5; j++) { 
	                System.out.print("Enter marks for subject " + (j + 1) + ": "); 
	                marks[j] = scanner.nextInt(); 
	            } 
	            scanner.nextLine(); // Consume the newline character 
	 
	            students.add(new Student(name, rollNumber, marks));
	        } 
	 
	        // Find the student with the highest total marks 
	        Student topStudent = null; 
	        int highestTotal = 0; 
	 
	        for (Student student : students) { 
	            int total = student.totalMarks();
	            if (total > highestTotal) { 
	                highestTotal = total; 
	                topStudent = student; 
	            } 
	        } 
	      
	        // Display the result 
	        if (topStudent != null) { 
	            System.out.println("Student with the highest total marks:"); 
	            System.out.println("Name: " + topStudent.name); 
	            System.out.println("Roll Number: " + topStudent.rollNumber); 
	            System.out.println("Total Marks: " + highestTotal); 
	        } 
	 
	        scanner.close(); 
	    } 
	} 