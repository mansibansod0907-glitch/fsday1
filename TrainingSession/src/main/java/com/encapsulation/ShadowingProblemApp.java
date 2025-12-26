package com.encapsulation;

public class ShadowingProblemApp {

	public static void main(String[] args) {
		ShadowingProblem s = new ShadowingProblem("Mansi", 22, "Female");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGender());
		

	}

}
