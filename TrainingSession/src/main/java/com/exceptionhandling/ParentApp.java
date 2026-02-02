package com.exceptionhandling;
import java .sql.SQLException;
public class ParentApp {

	public static void main(String[] args) {
		disp();
	}
	static void disp() {
		System.out.println("hello from disp");
		try {
			disp();
		}catch(Error e) {
			System.out.println("Error handled");
		}
	}
}
class Parent{
	void disp() throws SQLException{
		
	}
}
class Child extends Parent{
	void disp() {
		
	}
}
class ChildOR extends Parent{
    void disp() throws SQLException{
		
	}
}