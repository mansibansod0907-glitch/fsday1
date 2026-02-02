package com.Collection;

class Student1 {

	String name;
	int age;
	String gender;
	
	public Student1(String name, int age, String gender) {
			this.name= name;
			this.age = age;
			this.gender = gender;
			
		}
	
		String GetName(){
			return name;
		}
		int GetAge(){
			return age;
		}
		String GetGender(){
			return gender;		
		
}
		
		public String toString() {
			return name + " " + age + " "+ gender;
		}
}