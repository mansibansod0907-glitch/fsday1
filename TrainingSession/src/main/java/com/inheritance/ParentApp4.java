package com.inheritance;

public class ParentApp4 {

	public static void main(String[] args) {
		Child4 c = new Child4(100,99);
		System.out.println(c.a+ " "+c.b);
	}
}

class Parent4{
	int a;
	int b;
	public Parent4() {
		this(99, 99);
		a=10;
		b=20;
	}
	public Parent4(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Child4 extends Parent4{
	public Child4() {
		a = 30;
		b = 40;
	}
	public Child4(int a, int b) {
		this();
		this.a = a;
		this.b = b;

	}

}
