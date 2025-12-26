package com.encapsulation;

class Employee3 {
	int emp_id;
	String name;
	int salary;

	public Employee3() {
		this(101,"Mansi",20);
		System.out.println("0 parametrize constructor is called");
	}
	public Employee3(int emp_id) {
		System.out.println("1 parametrize constructor is called");
	}
	public Employee3(int emp_id, String name) {
		this(101);
		System.out.println("2 parametrize constructor is called");
	}
	public Employee3(int emp_id, String name, int salary ) {
		this(101,"Mansi");
		System.out.println("3 parametrize constructor is called");
	}
}
