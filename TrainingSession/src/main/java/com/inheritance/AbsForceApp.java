package com.inheritance;

public class AbsForceApp {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<ARMY>>>>>>>>>>>>>>");
		duty(new Army2());
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<NAVY>>>>>>>>>>>>>>");
		duty(new Navy2());
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<AIRFORCE>>>>>>>>>>>>>>");
		duty(new AirForce2());
}
	static void duty(AbsForce af) {
		af.protect();
	}
}
abstract class AbsForce {
	abstract void protect();
}
class Army2 extends AbsForce{

	void protect() {
		System.out.println("Protect land");
	}
	void useTank() {
		System.out.println("Army uses tanks");
}	
}	
class Navy2 extends AbsForce{
	void protect() {
		System.out.println("Protect water");
	}
	void useShips() {
		System.out.println("Navy uses Ships");
}	
}
class AirForce2 extends AbsForce{
	void protect() {
		System.out.println("Protect Airways");
	}
	void useJets() {
		System.out.println("AirForce uses Jets");
}
}