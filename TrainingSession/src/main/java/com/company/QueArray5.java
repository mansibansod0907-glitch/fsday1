package com.company;

import java.util.Scanner;

public class QueArray5 {
//Swapping
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("Enter first no.");
		int a = sc.nextInt();
		System.out.println("Enter second no.");
		int b = sc.nextInt();
		
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Entered number a :"+a+" and b :"+b);
		

		sc.close();
	}

}
