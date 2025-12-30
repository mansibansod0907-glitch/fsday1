package com.inheritence;

class SecurityForce {
	void job() {
		System.out.println("To protect Nation");
	}
	void protect() {
		System.out.println("Protect Country");
	}
}

class Army extends SecurityForce{

	void protect() {
		System.out.println("Protect land");
	}
	void useTank() {
		System.out.println("Army uses tanks");
}	
}	
class Navy extends SecurityForce{
	void protect() {
		System.out.println("Protect water");
	}
	void useShips() {
		System.out.println("Navy uses Ships");
}	
}
class AirForce extends SecurityForce{
	void protect() {
		System.out.println("Protect Airways");
	}
	void useJets() {
		System.out.println("AirForce uses Jets");
}	
}