package com.Collection;

import java.util.Comparator;

class Emp1 implements Comparator{
	int id;
	String name;
	int salary;
	
	public Emp1(int id, String name, int sal){
		super();
		this.id = id;
		this.name = name;
		this.salary = sal;	
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;	
	}
	public int getSal() {
		return salary;
		
	}
	public String toString(){
		return id+" "+name+" "+salary+" ";	
	}
 

	@Override
	public int compare(Object o1, Object o2) {
		if(((Emp1)(o1)).id>((Emp1)(o2)).id)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	
	 
}