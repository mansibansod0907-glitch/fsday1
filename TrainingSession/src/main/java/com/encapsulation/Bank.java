package com.encapsulation;

public class Bank {

	private int balance;
	
	public void setBalance(int bal) {
		if(bal>0) {
		balance=bal;
	}
		else {
			System.out.println("invalid input");
		}
	}
	public int getBalance() {
		return balance;
	}
	
}
