package com.inheritance;

public class FinalParentApp {
	final int b =10;
	public static void main(String [] args){
		
		final int a;
		a = 20;
		System.out.println();
	}
}
class FinalParent{

}
class FinalChild{
	void disp() {
		System.out.println("this is child method");
	}
}