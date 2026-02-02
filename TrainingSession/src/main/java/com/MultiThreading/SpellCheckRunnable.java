package com.MultiThreading;

public class SpellCheckRunnable implements Runnable {
	@Override
	public void run( ){
		for(int i = 0; i<10; i++) {
			System.out.println("SpellChecking...........");			
			try {
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
