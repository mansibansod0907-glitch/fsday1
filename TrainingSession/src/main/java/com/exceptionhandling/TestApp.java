package com.exceptionhandling;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("Main connection Est");
		Test1 t1 = new Test1();
		try {
			t1.alpha();
		}
		catch (Exception e) {
			System.out.println("Exception handled by main");
		}
		System.err.println("Main connection Terminated");

	}
	

}
