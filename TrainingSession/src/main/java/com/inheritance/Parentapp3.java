package com.inheritance;

public class Parentapp3 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		System.out.println(c.a+ " "+c.b);
	}
}

class Parent3{
	int a;
	int b;
	public Parent3() {
		a=10;
		b=20;
	}
	public Parent3(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Child3 extends Parent3{
	public Child3() {
		a = 30;
		b = 40;
	}
	public Child3(int a, int b) {
		this.a = a;
		this.b = b;
	}
}




