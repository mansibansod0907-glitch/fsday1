package com.inheritance;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
		s = null;
		Bike b = new Bike("Honda",80000, "Black");
		s.hasA(b);
		System.out.println("========================");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		
	}

}
class Student{
	Heart h = new Heart("Pumping",300);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrize());
		System.out.println(b.getColor());
		
	}
}
class Bike{
	String brand;
	int prize;
	String color;
	public Bike(String brand, int prize, String color){
		super();
		this.brand= brand;
		this.prize = prize;
		this.color = color;		
	}
	public  String getBrand() {
		return brand;
	}
	public int getPrize() {
		return prize;
	}
	public  String getColor() {
		return color;
	}
}
class Heart{
	String job;
	int weight;
	public Heart(String job, int weight) {
		super();
		this.job = job;
		this.weight = weight;
	}
	public  String getJob() {
		return job;
	}
	public int getWeight() {
		return weight;
	}
	
}