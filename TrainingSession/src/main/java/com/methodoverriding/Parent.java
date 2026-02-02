package com.methodoverriding;

public class Parent {
	void disp() {
		System.out.println("this is parent method");
	}
}
class Child extends Parent{
	void disp() {
		System.out.println("this is child");
	}
}