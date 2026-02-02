package com.company;

public class QueString14 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.ensureCapacity(31);
		System.out.println(sb.capacity());

	}

}
