package com.BankApp;

class CurrentAccount extends BankAccount{
	 public CurrentAccount(String name, int accNo, double balance) {
	        super(name, accNo, balance);
	    }

	 @Override
	    public void withdraw(double amount) throws Exception {
	        if (amount > balance + 5000)   // overdraft facility
	            throw new Exception("Overdraft limit exceeded!");
	        balance -= amount;
	    }
}
