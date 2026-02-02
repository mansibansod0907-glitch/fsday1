package com.inheritance;

public class TendulkarApp {

	public static void main(String[] args) {
		Tendulkar t = new ArjunTendulkar();
		t.job();
		t.profession();
		((ArjunTendulkar)t).smoke();
	}

}
class Tendulkar{
	void job() {
		System.out.println("Play Cricket");
	}
	void profession() {
		System.out.println("He is Batsman");
	}
}
class ArjunTendulkar extends Tendulkar{
	void profession() {
		System.out.println("He is Baller");
	}
	void smoke() {
		System.out.println("He smoke some time");
	}
}