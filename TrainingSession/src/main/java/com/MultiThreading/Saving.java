package com.MultiThreading;

public class Saving extends Thread{
	public void run(){
		for(int i = 0; i<10; i++) {
			System.out.println("Saving...........");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
