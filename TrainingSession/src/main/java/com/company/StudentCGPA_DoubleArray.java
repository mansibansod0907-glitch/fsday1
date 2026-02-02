package com.company;

import java.util.Scanner;

public class StudentCGPA_DoubleArray {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("Please enter the no. of students present in the class");
		int n= sc.nextInt();
		double a[] = new double[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Please enter the CGPA of the student "+i);
			a[i] = sc.nextDouble();
		}
		
		//o/p
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		

	}

}
