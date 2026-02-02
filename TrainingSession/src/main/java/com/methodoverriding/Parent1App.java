package com.methodoverriding;

public class Parent1App {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.disp();
		
		Child1 c = new Child1();
		c.disp();
		
		Parent1 p1 = new Child1();
		p1.disp();

	}

}
