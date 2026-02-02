package com.inheritance;

public class Defence {
	void job() {
		System.out.println("To protect Nation");
	}
	void protect() {
		System.out.println("Protect Country");
	}
}

class Army1 extends Defence{
	void protect() {
		System.out.println("Protect land");
	}
	
}

class Navy1 extends Defence{
	void protect() {
		System.out.println("Protect water");
	}
	
}
class AirForce1 extends Defence{
	void protect() {
		System.out.println("Protect Airways");
	}
	
}