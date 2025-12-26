package com.encapsulation;

public class Student { 
	
	private String name;
	private int age;
	private String gender;
	
	public void setData(String n, int a, String g) {
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
