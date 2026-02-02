package com.MultiThreading;

class Saving1 implements Runnable{
	public void run() {
		System.out.println("saving started....");
		for(int i=0; i<10;i++) {
			System.out.println("saving....");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("saving terminated....");
	}
}