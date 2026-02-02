package com.company;

public class QueString10 {

	public static void main(String[] args) {
		//char a = 'C'; //67
//		char a = 'U'; //85
//		int b = a;
//		System.out.println(b);
		
		String S1 = "SACHIN";
		String S2 = "SAURAV";
		
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
