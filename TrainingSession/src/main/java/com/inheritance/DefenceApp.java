package com.inheritance;

public class DefenceApp {

	public static void main(String[] args) {
		
		Poly(new Army1());
		Poly(new Navy1());
		Poly(new AirForce1());
	}
		static void Poly(Defence d) {
			d.job();
			d.protect();
	}
}
