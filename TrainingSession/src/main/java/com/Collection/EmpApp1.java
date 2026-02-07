package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

//Sorting Complex Object Using-----by implementing Comparator interface.
public class EmpApp1 
{
	public static void main(String [] args)
	{
		Emp1 e1 = new Emp1(303,"Noorr",800);
		Emp1 e2 = new Emp1(404,"Nomuu",750);
		Emp1 e3 = new Emp1(101,"Darsh",690);
		Emp1 e4 = new Emp1(202,"Khush",950);
		
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
