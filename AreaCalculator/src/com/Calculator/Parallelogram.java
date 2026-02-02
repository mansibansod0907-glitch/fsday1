package com.Calculator;

public class Parallelogram extends Shape{
	int b;
	int h;
	
	
public Parallelogram(int b,int h) {
	this.b = b;
	this.h = h;
}

@Override
float disp() {
	return  b*h;
}
}
