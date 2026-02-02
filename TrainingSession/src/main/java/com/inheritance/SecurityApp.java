package com.inheritance;

public class SecurityApp {

	public static void main(String[] args) {
		Army a = new Army();
		Navy n = new Navy();
		AirForce ai = new AirForce();
		System.out.println("<<<<<<<<<<<<<<ARMY>>>>>>>>>>>>>>");
		a.job();
		a.protect();
		a.useTank();
		System.out.println("<<<<<<<<<<<<<<NAVY>>>>>>>>>>>>>>");
		n.job();
		n.protect();
		n.useShips();
		System.out.println("<<<<<<<<<<<<<<AIRFORCE>>>>>>>>>>>>>>");
		ai.job();
		ai.protect();
		ai.useJets();
	}

}
