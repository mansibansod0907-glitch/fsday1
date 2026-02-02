package com.Calculator;

public class Ellipse extends Shape {
	int a;
	int b;
	static float pi;
		
	
	static {
		pi=3.14f;
	}
public Ellipse(int a, int b) {
	this.a = a;
	this.b = b;
}
@Override
float disp() {
	return pi*a*b;
	
}
}
