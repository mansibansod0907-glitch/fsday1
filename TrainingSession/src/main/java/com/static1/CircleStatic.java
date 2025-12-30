package com.static1;

class CircleStatic {
	int r;
	static float pi;
		
	
	static {
		pi=3.14f;
	}
public CircleStatic(int r) {
	this.r = r;	
}

float disp() {
	float area = pi*r*r;
	return area;
}
}
