package com.Calculator;

public class Trapezium extends Shape{
	int a;
	int b;
	int h;
	static float half;
	
	static {
		half = 0.5f;
	}
public Trapezium(int a,int b,int h) {
	this.a = a;
	this.b = b;
	this.h = h;
}
@Override
float disp() {
	return half*(a+b)*h;
	
}
}
