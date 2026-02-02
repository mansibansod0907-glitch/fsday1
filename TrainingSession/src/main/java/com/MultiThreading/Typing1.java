package com.MultiThreading;

class Typing1 implements Runnable{
	public void run() {
		System.out.println("Typing started....");
		for(int i=0;i<10;i++) {
			System.out.println("typing.....");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("typing terminated....");
	}
}
