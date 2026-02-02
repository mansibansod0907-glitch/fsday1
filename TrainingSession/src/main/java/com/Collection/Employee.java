package com.Collection;

public class Employee {
	String name;
	int employee_id;
	int salary; 
    
	public Employee(String name, int employee_id, int salary) {
		this.name = name;
		this.employee_id = employee_id;
		this.salary = salary;
	}
	String GetName(){
		return name;
	}
	int GetEmployee_Id(){
		return employee_id;
	}
	int GetSalary(){
		return salary;
	}
	
	public String toString() {
		return name + " " + employee_id + " "+ salary;
	}
}
