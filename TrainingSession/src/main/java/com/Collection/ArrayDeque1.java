package com.Collection;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(50);
		ad.addFirst(150);
		ad.addLast(78);
		System.out.println(ad);

	}
}
