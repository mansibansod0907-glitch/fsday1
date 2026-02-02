package com.inheritance;

public class StudentApp1 {

	public static void main(String[] args) {
		Student1 s= new Student1();
		Bike1 bi = new Bike1("Honda",80000, "Black");
		s.hasA(bi);
		Book1 bk = new Book1(200, "White");
		s.hasA(bk);
		System.out.println("========================");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		System.out.println(s.b.getJob());
		System.out.println(s.b.getWeight());
	}
}
class Student1{
	Heart1 h = new Heart1("Pumping",300);
	Brain1 b = new Brain1("Thinking",1300);
	void hasA(Bike1 bi) {
		System.out.println(bi.getBrand());
		System.out.println(bi.getPrize());
		System.out.println(bi.getColor());		
	}
	void hasA(Book1 bk) {
		System.out.println(bk.getPages());
		System.out.println(bk.getColor());
	}
}
class Heart1{
	String job;
	int weight;
	public Heart1(String job, int weight) {
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
class Book1{
	int pages;
	String color;
	public Book1(int pages, String color){
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
class Bike1{
	String brand;
	int prize;
	String color;
	public Bike1(String brand, int prize, String color){
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
class Brain1{
	String job;
	int weight;
	public Brain1(String job, int weight) {
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