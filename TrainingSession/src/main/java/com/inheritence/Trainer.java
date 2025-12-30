package com.inheritence;

public class Trainer {
	void teach() {
		System.out.println("Trainer Teaches");
	}
}
class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("Trainer Teaches Java");
	}
}
class AptiTrainer extends Trainer{
void teach() {
	System.out.println("Trainer Teaches Apti");
	}
}
class TestingTrainer extends Trainer{
void teach() {
	System.out.println("Trainer Teaches Testing");
	}
}