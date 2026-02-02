package com.company;

import java.util.Scanner;

public class EmployeesArray {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("Please enter the no. of Employees present in the Company");
		int n= sc.nextInt();
		 sc.nextLine();
		String a[] = new String[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Please enter the Names of Employee "+i);
			a[i] = sc.nextLine();
			
		}
		
		//o/p
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		

	}

}
