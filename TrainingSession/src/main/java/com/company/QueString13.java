package com.company;

public class QueString13 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Ronaldo");
		
		System.out.println(sb.capacity());
		sb.append("is a great footballer");
		System.out.println(sb.capacity());

//		StringBuffer sb = new StringBuffer(10);
//		System.out.println(sb.capacity());
	}

}
