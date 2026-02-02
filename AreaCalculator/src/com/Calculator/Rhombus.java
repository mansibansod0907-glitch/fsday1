package com.Calculator;

public class Rhombus extends Shape{
	int d1;
	int d2;
	static float half;
	
	static {
		half = 0.5f;
	}
public Rhombus(int d1,int d2) {
	this.d1= d1;
	this.d2 = d2;
}
@Override
float disp() {
	return half*d1*d2;
	
}
}
