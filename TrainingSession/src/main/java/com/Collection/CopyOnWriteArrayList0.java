package com.Collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList0 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList v2 = new CopyOnWriteArrayList();
		v2.add(100);
		v2.add(50);
		v2.add(150);
		v2.add(25);
		v2.add(75);
		v2.add(125);
		v2.add(175);
		
		Iterator<Integer> itr1 = v2.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next() + " ");
			v2.add(20);
		}
			
	}
}
