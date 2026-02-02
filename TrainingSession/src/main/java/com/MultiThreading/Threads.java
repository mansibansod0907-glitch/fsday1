 package com.MultiThreading;

public class Threads {

	public static void main(String[] args) throws InterruptedException {
		Typing1 type = new Typing1();
		SpellCheck1 spell = new SpellCheck1();
		Saving1 save = new Saving1();
		
		Thread t1 = new Thread(type);
		Thread t2 = new Thread(spell);
		Thread t3 = new Thread(save);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();//hold the main method
		t2.join();
		t3.join();
	}
}


