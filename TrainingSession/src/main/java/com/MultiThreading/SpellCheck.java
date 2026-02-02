package com.MultiThreading;

public class SpellCheck extends Thread {
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Spell Check...........");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
