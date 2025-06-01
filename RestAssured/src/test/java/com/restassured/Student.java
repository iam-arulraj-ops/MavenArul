package com.restassured;

 
public class Student { 
    String name; 
    String rollNumber; 
    int[] marks; 
 
    public Student(String name, String rollNumber, int[] marks) { 
        this.name = name; 
        this.rollNumber = rollNumber; 
        this.marks = marks; 
    } 
 
    public int totalMarks() { 
        int total = 0; 
        for (int mark : marks) { 
            total += mark; 
        } 
        return total; 
    } 
} 
 
