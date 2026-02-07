package com.Collection;

class Emp implements Comparable
{
	int id;
	String name;
	int salary;
	
	public Emp(int id, String name, int sal){
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
	//Ascending on the basis of id
	public int compareTo(Object o) {
		if(this.id>((Emp)(o)).id){
			return 1;
		}
		else {
			return -1;
		}		
	}
}
