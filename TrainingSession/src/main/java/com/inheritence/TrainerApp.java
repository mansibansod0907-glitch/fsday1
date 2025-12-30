package com.inheritence;

public class TrainerApp {

	public static void main(String[] args) {
		Trainer t;
		
		t = new JavaTrainer();
		t.teach();
		t = new AptiTrainer();
		t.teach();
		t = new TestingTrainer();
		t.teach();
	}

}
