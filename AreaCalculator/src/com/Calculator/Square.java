package com.Calculator;

public class Square extends Shape {
	
		int a;
		
		
	public Square(int a) {
		this.a = a;	
	}
	
	@Override
	float disp() {
		return  a*a;
	}

	}


