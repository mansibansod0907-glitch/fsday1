package com.encapsulation;
import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter amount to deposit");
		Bank b = new Bank();
		int bal = sc.nextInt();
		b.setBalance(bal);
		System.out.println("Your current balance : "+b.getBalance());

		System.out.println("Please enter amount to withdraw");
		int w=sc.nextInt();
		int upd_bal=b.getBalance()-w;
		b.setBalance(upd_bal);
		System.out.println("Yoer current balance : "+b.getBalance());
	}

}
