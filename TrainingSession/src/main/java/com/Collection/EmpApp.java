package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

//Sorting Complex Object Using-----by implementing Comparable interface.
public class EmpApp 
{
	public static void main(String [] args)
	{
		Emp e1 = new Emp(303,"Noorr",800);
		Emp e2 = new Emp(404,"Nomuu",750);
		Emp e3 = new Emp(101,"Darsh",690);
		Emp e4 = new Emp(202,"Khush",950);
		
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);	
	}
}