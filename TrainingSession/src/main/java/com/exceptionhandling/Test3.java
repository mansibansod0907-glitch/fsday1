package com.exceptionhandling;

import java.util.Scanner;

public class Test3 {
	void gamma() {
		System.out.println("connection 3 Est");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter v1:");
		int a = input.nextInt();
		
		System.out.println("Please enter v2: ");
		int b = input.nextInt();
		
		try {
		int c = a/b;
		System.out.print(c);
		}catch(Exception e) {
			System.out.println("exception handled by gamma");
		}
		System.out.println("connection 3 terminated");
		
		}
}
