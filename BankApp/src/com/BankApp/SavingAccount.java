package com.BankApp;

class SavingAccount extends BankAccount {
	 public SavingAccount(String name, int accNo, double balance) {
	        super(name, accNo, balance);
	    }

	// Polymorphism (method overriding)
	    @Override
	    public void withdraw(double amount) throws Exception {
	        if (amount > balance)
	            throw new Exception("Insufficient balance!");
	        balance -= amount;
	    }
}
