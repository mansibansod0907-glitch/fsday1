package com.inheritance;

public class ParentAppA {

	public static void main(String[] args) {
		ChildA c = new ChildA();
		c.disp();
	}

}
//Rule 1
class ParentA{
	protected void disp() {
		System.out.println("this is parent method");
	}
}
class ChildA extends ParentA{
	public void disp() {
		System.out.println("this is child method");
	}
}
class ParentB{
	void disp() {
		System.out.println("this is parent method");
	}
}
class ChildB extends ParentB{
	protected void disp() {
		System.out.println("this is child method");
	}
}
class ParentC{
	void disp() {
		System.out.println("this is parent method");
	}
}
//rule 2
//the return type should be same Parent class 
//class ChildC extends ParentC{
//	int disp() {
//		System.out.println("this is child method");
//		return 0;
//	}
//}

//Rule 3
class ParentD{
	Animal disp() {
		Animal a = new Animal();
		return a;
	}
}
class ChildD extends ParentD{
	Dog disp() {
		Dog d = new Dog();
		return d;
	}
}
class Animal{
	
}
class Dog extends Animal{
	
}

