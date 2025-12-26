package com.encapsulation;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String s=sc.next();
		System.out.println("enter your age");
		int a=sc.nextInt();
		System.out.println("enter your gender");
		String g=sc.next();
		
		Student s1 = new Student();
		s1.setData(s, a, g);
		System.out.println("your name is:"+s1.getName());
		System.out.println("your name is:"+s1.getAge());
		System.out.println("your name is:"+s1.getGender());
	}

}
