package com.Map;

import java.util.HashMap; 
import java.util.LinkedHashMap;

public class StudentApp {
	public static void main(String[] args) {
		Student s1=new Student("Ayush", 20, "Male", 1234567890, 99, 8, "ayush@gmail.com", "Hingna",6.1,80,'B');
		Student s2=new Student("Arsh", 21, "Male", 1234527891, 99, 8, "arsh@gmail.com", "Gondia",5.8,75,'A');
		Student s3=new Student("Rupesh", 22, "Male", 1237967880, 99, 8, "rupa@gmail.com", "Nagpur",5.7,82,'B');
		HashMap hm=new HashMap();
		hm.put(101, s1);
		hm.put(102, s2);
		hm.put(103, s3);
		System.out.println(hm);
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(12, s1);
		lhm.put(13, s2);
		lhm.put(14, s3);
	}
}