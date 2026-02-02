package com.MultiThreading;

public class KodEditorRunnable {

	public static void main(String[] args) {
		Typing type = new Typing();
		SpellCheck spell = new SpellCheck();
		Saving save = new Saving();
		Thread t1 = new Thread(type);
		Thread t2 = new Thread(spell);
		Thread t3 = new Thread(save);
		t1.start();
		t2.start();
		t3.start();

	}

}
