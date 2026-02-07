package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PassengerApp 
{
	public static void main(String [] args)
	{
		PassesngerDetails p1 = new PassesngerDetails(203,"Rehaan","Nagpur","Punee","Buss");
		PassesngerDetails p2 = new PassesngerDetails(207,"Khushh","Punee","Nagpur","Train");
		PassesngerDetails p3 = new PassesngerDetails(210,"Darshh","Mumbai","Pune","Train");
		PassesngerDetails p4 = new PassesngerDetails(201,"Nooorr","Nagpur","Mumbai","Aeroplane");
		
		
		ArrayList al = new ArrayList();		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("Entries : ");
		System.out.println(al);
		
		System.out.println("Using Comparable (Sort on the basis of id) : ");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("Using Comparator (Sort on the basis of name) : ");
		SortComplexObject sc = new SortComplexObject();
		Collections.sort(al,sc);
		System.out.println(al); 
		
		System.out.println("Reverse Order Sorting : ");
		Comparator c = Collections.reverseOrder();
		Collections.sort(al,c);
		System.out.println(al);
		
	}

}