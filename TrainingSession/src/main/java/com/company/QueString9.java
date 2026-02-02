package com.company;

public class QueString9 {

	public static void main(String[] args) {
		String S1 = new String("Deep");
		String S2 = S1.intern();
		String S3 = S1.intern();
		
		
		if(S2==S3) { 
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		if(S2.equals(S3)){
			System.out.println("Values are equal");
		}
		else {
			System.out.println("Values are not equal");
		}

	}

}
