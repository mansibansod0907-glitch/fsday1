package com.BankApp;
//Multithreading
class Transaction extends Thread{
	 BankAccount acc;
	    double amount;

	    Transaction(BankAccount acc, double amount) {
	        this.acc = acc;
	        this.amount = amount;
	    }

	    public void run() {
	        acc.deposit(amount);
	        System.out.println("Deposited " + amount + " by " + Thread.currentThread().getName());
	    }
	}


