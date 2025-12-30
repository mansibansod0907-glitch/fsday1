package com.inheritence;

public class ParentApp1 {

	public static void main(String[] args) {
		Child1 c = new Child1();
	}
}

	class Parent1{
		int a = 10;
		public Parent1() {
			System.out.println("this is parent1 constructor");
		}
	}
	class Parent2{
		int b = 20;
		public Parent2() {
			System.out.println("this is parent2 constructor");
		}
	}
	class Child1 extends Parent1{
		public Child1() {
			System.out.println("this is child1 constructor");
		}
	}
	// Syntax error Rule 4
//	class Child1 extends Parent1,Parent2{
//		public Child1() {
//			System.out.println("this is child1 constructor");
//		}
//	}

