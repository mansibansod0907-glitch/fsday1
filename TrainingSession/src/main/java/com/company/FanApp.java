package com.company;

public class FanApp {

	public static void main(String[] args) {
		
		Fan F1 = new Fan();
		
		F1.brandname1 = "Philips";
		System.out.println(F1.brandname1);
		
		F1.cost1 = "7000";
		System.out.println(F1.cost1);
		F1.color1 = "Black";
		System.out.println(F1.color1);
		
		System.out.println();
		
		Fan F2 = new Fan();
		
		F2.brandname2 = "Bajaj";
		System.out.println(F2.brandname2);
		
		F2.cost2 = "5000";
		System.out.println(F2.cost2);
		
		F2.color2 = "White";
		System.out.println(F2.color2);
		

	}

}
