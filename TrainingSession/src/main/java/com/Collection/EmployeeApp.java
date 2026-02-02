package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1=new Employee("Mansi",101,45000);
		Employee e2=new Employee("Arsh",102,55000);
		Employee e3=new Employee("Devil",103,65000);
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}
}
