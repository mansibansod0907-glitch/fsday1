package com.static1;

public class TriangleStatic {

	int b;
	int h;
	static float half;
		
	static {
		half = 0.5f;
	}
	
public TriangleStatic(int b,int h) {
	this.b = b;
	this.h = h;
}

float disp() {
	float area = half*b*h;
	return area;
}
}
