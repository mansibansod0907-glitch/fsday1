package com.inheritance;

public class ShapesApp {
	public static void main(String [] args) {
		duty(new Triangle1(3,4));
		duty(new Circle1(10));
		duty(new Square1(4));
		
	}
	static void duty(Shapes s) {
		s.findArea();
		s.dispArea();
	}
}
abstract class Shapes{
	double area;
	abstract void findArea();
	abstract void dispArea();
}
class Triangle1 extends Shapes{
	int b;
	int h;
	
public Triangle1(int b,int h) {
	super();
	this.b = b;
	this.h = h;
}
public int getB() {
	return b;
}
public int geth() {
	return h;
}
void findArea() {
	area = 0.5*b*h;
}
void dispArea() {
	findArea();
}

}
class Circle1 extends Shapes{
	int r;
	
public Circle1(int r) {
	super();
	this.r = r;	
}
public int getR() {
	return r;
}
void findArea() {
	area = 3.14*r*r;
}
void dispArea() {
	findArea();
}
}
class Square1 extends Shapes{
	int l;
	
	public Square1(int l) {
		super();
	this.l = l;
} public int getL() {
	return l;
}
void findArea() {
	area = l*l;
}
void dispArea() {
	findArea();
}
}