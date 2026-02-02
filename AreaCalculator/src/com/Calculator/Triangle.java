package com.Calculator;

public class Triangle extends Shape{
	int b;
	int h;
	static float half;
		
	static {
		half = 0.5f;
	}
	
public Triangle(int b,int h) {
	this.b = b;
	this.h = h;
}
@Override
float disp() {
	return  half*b*h;
	
}

}
