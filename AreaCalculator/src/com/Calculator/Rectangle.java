package com.Calculator;

public class Rectangle extends Shape{
	int l;
	int b;
	
	
public Rectangle (int l,int b) {
	this.l = l;
	this.b = b;
}
@Override
float disp() {
	return l*b;
	
}
}
