package com.BankApp;
import java.util.Scanner;
public class BankApp {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Array of accounts
	        BankAccount[] accounts = new BankAccount[2];
	        accounts[0] = new SavingAccount("Mansi", 101, 10000);
	        accounts[1] = new CurrentAccount("Rahul", 102, 20000);

	        while (true) {
	            System.out.println("\n1. Show Accounts\n2. Deposit\n3. Withdraw\n4. Multi-thread Deposit\n5. Exit");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    for (BankAccount a : accounts) {
	                        a.showDetails();
	                        System.out.println("------------------");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter Account Index (0/1): ");
	                    int i = sc.nextInt();
	                    System.out.print("Enter Amount: ");
	                    double amt = sc.nextDouble();
	                    accounts[i].deposit(amt, "Cash Deposit");
	                    break;

	                case 3:
	                    try {
	                        System.out.print("Enter Account Index (0/1): ");
	                        int j = sc.nextInt();
	                        System.out.print("Enter Amount: ");
	                        double wamt = sc.nextDouble();
	                        accounts[j].withdraw(wamt);
	                        System.out.println("Withdrawal Successful");
	                    } catch (Exception e) {
	                        System.out.println("Error: " + e.getMessage());
	                    }
	                    break;

	                case 4:
	                    Transaction t1 = new Transaction(accounts[0], 1000);
	                    Transaction t2 = new Transaction(accounts[1], 2000);
	                    t1.start();
	                    t2.start();
	                    break;

	                case 5:
	                    System.out.println("Thank you for using " + BankAccount.bankName);
	                    System.exit(0);
	            }
	        }
	    }
}
