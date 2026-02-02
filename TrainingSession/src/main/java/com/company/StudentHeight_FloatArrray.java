package com.company;

import java.util.Scanner;

public class StudentHeight_FloatArrray {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("Please enter the no. of students present in the class");
		int n= sc.nextInt();
		float a[] = new float[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Please enter the height of the student "+i);
			a[i] = sc.nextFloat();
		}
		
		//o/p
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		

	}

}
