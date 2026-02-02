package com.inheritance;

public class AbsTrainerApp {

	public static void main(String[] args) {
		
		    System.out.println("<<<<<<<<<<<<<<JavaTraner1>>>>>>>>>>>>>>");
			duty(new JavaTrainer1());
			System.out.println();
			System.out.println("<<<<<<<<<<<<<<AptiTrainer1>>>>>>>>>>>>>>");
			duty(new AptiTrainer1());
			System.out.println();
			System.out.println("<<<<<<<<<<<<<<TestingTrainer1>>>>>>>>>>>>>>");
			duty(new TestingTrainer1());
			
		}
		static void duty(Trainer1 t) {
			t.teach();
		}	

	}

abstract class Trainer1{
	abstract void teach();
}
class JavaTrainer1 extends Trainer1{
	void teach() {
		System.out.println("Trainer Teaches Java");
	}
}
class AptiTrainer1 extends Trainer1{
void teach() {
	System.out.println("Trainer Teaches Apti");
	}
}
class TestingTrainer1 extends Trainer1{
void teach() {
	System.out.println("Trainer Teaches Testing");
	}
}
