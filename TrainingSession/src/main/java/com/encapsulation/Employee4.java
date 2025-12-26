package com.encapsulation;

public class Employee4 {

	int emp_id;
	String name;
	int salary;
	public Employee4 (int emp_id, String name,int salary){
		//super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		}
	
	public Employee4() {
		this(101,"Mansi",20); //method
	}

	public int getemp_id(){
		return emp_id; 
	}

	public String getname(){
		return name; 
	}

	public int getsalary(){
		return salary; 
	}
}
