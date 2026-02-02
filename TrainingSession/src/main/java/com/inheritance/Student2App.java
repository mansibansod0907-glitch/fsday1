package com.inheritance;


public class Student2App {
	public static void main(String []args) {
	Student2 s = new Student2();
	System.out.println("***********************");
	Bike2 bi = new Bike2("Honda",80000, "Black");
	s.hasA(bi);
	System.out.println("***********************");
	Book2 bk = new Book2(200, "White");
	s.hasA(bk);
	System.out.println("========================");
	System.out.println("========Brain==========");
	System.out.println(s.h.getJob());
	System.out.println(s.h.getWeight());
	System.out.println("========================");
	System.out.println("========Heart==========");
	System.out.println(s.b.getJob());
	System.out.println(s.b.getWeight());
}
}
class Human{
	Heart2 h = new Heart2("Pump Blood",300);
	Brain2 b = new Brain2("Thinking",1300);
}	
class Student2 extends Human{
	void hasA(Bike2 bi) {
		System.out.println("-----Bike-----");
		System.out.println(bi.getBrand());
		System.out.println(bi.getPrize());
		System.out.println(bi.getColor());		
	}
	void hasA(Book2 bk) {
		System.out.println("-----Book-----");
		System.out.println(bk.getPages());
		System.out.println(bk.getColor());
	}
}	
class Heart2{
	String job;
	int weight;
	public Heart2(String job, int weight) {
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
class Brain2{
	String job;
	int weight;
	public Brain2(String job, int weight) {
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
class Book2{
	int pages;
	String color;
	public Book2(int pages, String color){
		super();
		this.pages = pages;
		this.color = color;
	}
	public int getPages() {
		return pages;
	}
	public String getColor() {
		return color;
	}
}
class Bike2{
	String brand;
	int prize;
	String color;
	public Bike2(String brand, int prize, String color){
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
