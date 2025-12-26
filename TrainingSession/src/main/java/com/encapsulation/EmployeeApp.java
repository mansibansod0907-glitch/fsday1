package com.encapsulation;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of employees: ");
	        int n = sc.nextInt();

	        Employee[] employees = new Employee[n];

	        for (int i = 0; i < n; i++) {
	        	
	        	System.out.println("Name: ");
	        	String name= sc.next();
	        	
	        	System.out.println("Id: ");
	        	String id= sc.next();
	        	
	        	System.out.println("Salary: ");
	        	int salary= sc.nextInt();
		
	        	employees[i]= new Employee(name, id, salary);
	        }
	        for(Employee e : employees) {
		System.out.println("Name: "+ e.getName());
		System.out.println("Id: "+ e.getId());
		System.out.println("Salary: "+ e.getSalary());

	        }
	        sc.close();
	}

}
