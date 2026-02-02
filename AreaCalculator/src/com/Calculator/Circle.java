package com.Calculator;

public class Circle extends Shape{
	int r;
	static float pi;
		
	
	static {
		pi=3.14f;
	}
public Circle(int r) {
	this.r = r;	
}
@Override
float disp() {
	return pi*r*r;
	
}

}
