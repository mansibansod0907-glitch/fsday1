package com.MultiThreading;

public class KodEditorApp {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Typing...................");
			Thread.sleep(1000);
		}
		for(int i=0;i<10;i++) {
			System.out.println("Spell Check...................");
			Thread.sleep(1000);
		}
		for(int i=0;i<10;i++) {
			System.out.println("Saving...................");
			Thread.sleep(1000);
		}

	}

}
