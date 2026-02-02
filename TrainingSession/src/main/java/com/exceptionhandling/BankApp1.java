package com.exceptionhandling;

import java.util.Scanner;

public class BankApp1 {

	public static void main(String[] args) {
		Bank1 b1 = new Bank1();
		b1.banking();
	}

}
class Bank1{
	void banking(){
		ATM1 a = new ATM1();
		try {
		a.acceptInfo();
		a.verify();
		}
		catch(InvalidInputException e) {
			System.out.println("Wrong Pin");
			System.out.println("Attempt 2");
			try {
				a.acceptInfo();
				a.verify();
				}
				catch(InvalidInputException e1) {
					System.out.println("Wrong Pin");
					System.out.println("Final Attempt");
				}
					try {
					a.acceptInfo();
					a.verify();
					}
					catch(InvalidInputException e2) {
						System.out.println("Your ATM is blocked for 24 hr");
					}
		}
	}
}
class ATM1{
	int acc_no = 123456;
	int pass=124;
	int u_acc;
	int u_pass;
	void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your acc_no: ");
		u_acc = sc.nextInt();
		System.out.println("please enter your pass: ");
		u_pass = sc.nextInt();
		
	}
	void verify () throws InvalidInputException  {
		if(acc_no==u_acc && pass==u_pass) {
			System.out.println("collect your cash");
		}
		else {
			InvalidInputException e = new InvalidInputException();
			
			throw e;	
			}
	}
}
class InvalidInputException extends Exception{
	public String getMessage() {
		return "Wrong Credentials";
	}
}