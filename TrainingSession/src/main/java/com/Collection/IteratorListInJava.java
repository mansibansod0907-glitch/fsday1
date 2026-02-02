package com.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorListInJava {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);     
		al.add(125);
		al.add(175);
		String s = "arsh";
		ListIterator itr = al.listIterator(al.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous()+" ");
		}
	}

}
