package com.company;

public class QueString11 {

	public static void main(String[] args) {
		String S1 = "VIRAT";
		String S2 = "VIRU";
		
		int res = S1.compareTo(S2);
		System.out.println(res);
		
		if(res > 0) {
			System.out.println("S1 is greater");
		}
		else if(res<0) {
			System.out.println("S2 is greater");
		}
		else {
			System.out.println("Both are equal");
		}
	}

}
