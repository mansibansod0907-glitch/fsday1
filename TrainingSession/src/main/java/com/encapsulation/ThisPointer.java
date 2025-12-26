package com.encapsulation;

public class ThisPointer {

	String name;
	int age;
	String gender;
	
	public ThisPointer(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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
