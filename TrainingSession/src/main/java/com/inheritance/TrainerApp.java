package com.inheritance;

public class TrainerApp {

	public static void main(String[] args) {

		duty(new JavaTrainer());
		duty(new AptiTrainer());
		duty(new TestingTrainer());
		
	}
	static void duty(Trainer t) {
		t.teach();
	}	
}
