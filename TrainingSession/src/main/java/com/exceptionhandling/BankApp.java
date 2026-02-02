package com.exceptionhandling;

import java.util.Scanner;

public class BankApp {
	public static void main(String [] args) {
		Bank b = new Bank();
		b.banking();
	}
}
class Bank{
	void banking() {
	System.out.println("Bank Connection established");
	ATM card = new ATM();
	try {
		card.transaction();
	} catch(Exception e) {
		System.out.println("info recieved by the bank your amount  ");
	}
	System.out.println("Bank Connection terminated");
}
}
class ATM{
	void transaction() throws Exception{
		System.out.println("ATM Connection established");
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter v1: ");
		int a = input.nextInt();
		System.out.print("Please enter v2: ");
		int b = input.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("exception handled by ATM");
		}
		System.out.println("ATM Connection terminated");
		input.close();
	}
}