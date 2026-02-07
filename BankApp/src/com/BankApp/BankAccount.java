package com.BankApp;

abstract class BankAccount {
	 private String name;
	    private int accNo;
	    protected double balance;
	    static String bankName = "ABC Bank";   // Static keyword

	    public BankAccount(String name, int accNo, double balance) {
	        this.name = name;
	        this.accNo = accNo;
	        this.balance = balance;
	    }
	    public String getName() {
	    	return name; 
	    	}
	    
	    public int getAccNo() {
	    	return accNo; 
	    	}
	    
	    public double getBalance() {
	    	return balance; 
	    	}
 
	    // Method Overloading
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void deposit(double amount, String note) {
	        balance += amount;
	        System.out.println("Note: " + note);
	    }

	    // Abstract method (must be implemented by child)
	    public abstract void withdraw(double amount) throws Exception;

	    public void showDetails() {
	        System.out.println("Bank: " + bankName);
	        System.out.println("Name: " + name);
	        System.out.println("Account No: " + accNo);
	        System.out.println("Balance: " + balance);
	    }
}
