package com.encapsulation;

class Employee1 extends Object{
int emp_id;
String name;
int salary;
public Employee1 (int emp_id,String name,int salary){
	//super();
	this.emp_id = emp_id;
	this.name = name;
	this.salary = salary;
	}
public Employee1() {
	super();
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
