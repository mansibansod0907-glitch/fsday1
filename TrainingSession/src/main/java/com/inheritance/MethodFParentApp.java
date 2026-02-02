package com.inheritance;

public class MethodFParentApp {
	public static void main(String[]args) {
		MethodParent c = new MetFiChild();
		c.disp();
	}
}
class MethodParent{
	final void disp() {
		System.out.println("this is parent");
	}
}
class MetFiChild extends MethodParent{
//	void disp() { //cannot override the final method from parent
//		System.out.println("this is child method");
//	}
	
}