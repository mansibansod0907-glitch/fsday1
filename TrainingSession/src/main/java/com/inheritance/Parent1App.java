package com.inheritance;

public class Parent1App {

	public static void main(String[] args) {
		Childs c = new Childs();
		c.disp();
	}

}
class Parents{
	int x=10;
	void disp() {
		System.out.println("this is Parent method");
	}
}
class Childs extends Parents{
	int x=20;
	void disp() {
		super.disp();
		System.out.println("this is Child method");
	}
}