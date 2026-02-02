package com.methodoverriding;

public class Parent1 {
		static void disp() {
			System.out.println("this is parent method");
		}
	}
	class Child1 extends Parent1{
		static void disp() {
			System.out.println("this is child");
		}
	}

