package com.encapsulation;

public class ThisPointerApp {

	public static void main(String[] args) {
		ThisPointer s = new ThisPointer("Mansi", 22, "Female");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGender());
		
	}

}
