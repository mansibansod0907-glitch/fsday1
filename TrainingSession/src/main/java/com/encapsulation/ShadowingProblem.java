
package com.encapsulation;

public class ShadowingProblem {

	String name;
	int age;
	String gender;
	
	public ShadowingProblem(String name, int age, String gender) {
		name = name;
		age = age;
		gender = gender;
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

