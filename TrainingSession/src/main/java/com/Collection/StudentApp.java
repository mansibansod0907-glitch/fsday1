package com.Collection;

public class StudentApp{
	public static void main(String [] args) {
		Student s1=new Student("Mansi",22,"female");
		Student s2=new Student("Mrudula",21,"female");
		Student s3=new Student("Chaitali",21,"female");
		
		System.out.println(s1.GetName());
		System.out.println(s1.GetAge());
		System.out.println(s3.GetGender());
		
	}
}
