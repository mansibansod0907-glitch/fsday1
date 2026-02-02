package com.MultiThreading;

class SpellCheck1 implements Runnable{
	public void run() {
		System.out.println("Spellcheck started....");
		for(int i=0; i<10; i++) {
			System.out.println("Spellcheck...");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("spellcheck terminated....");
	}
}