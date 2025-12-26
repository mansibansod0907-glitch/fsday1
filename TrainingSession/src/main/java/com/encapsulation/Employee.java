package com.encapsulation;

public class Employee {

	private String name;
	private String id;
	private int salary;
	
	public Employee(String n, String d, int s) {
		name = n;
		id = d;
		salary = s;
	}
	public String getName() {
		return name; 
	}
	
	public String getId() {
		return id; 
	}
	
	public int getSalary() {
		return salary; 
	}

}
