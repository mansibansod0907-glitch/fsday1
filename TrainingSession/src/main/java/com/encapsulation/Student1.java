package com.encapsulation;

public class Student1 {

	String name;
	int age;
	String gender;
	
	public Student1(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}
	public String getName() {
		return name; 
	}
	
	public int getAge() {
		return age; 
	}
	
	public String getGender() {
		return gender; 
	}
}
