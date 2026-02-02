package com.inheritance;

import java.util.Scanner;

public class CalciApp {

	public static void main(String[] args) {
		 duty(new KamleshSoft());
		 duty(new AdityaInfoTech());
	}
	static void duty(Calci k) {
		k.add();
		k.sub();
		k.mul();
		k.div();
	}
}
class KamleshSoft implements Calci{
	public void add() {
		int a = 10;
		int b = 20; 
		int c = a+b;
		System.out.println(c);
	}
    public void sub() {
    	int a = 10;
		int b = 20; 
		int l = a-b;
		System.out.println(l);
	}
    public void mul() {
    	int a = 10;
		int b = 20; 
		int d = a*b;
		System.out.println(d);
    }
    public void div() {
    	int a = 10;
		int b = 20; 
		int m = a/b;
		System.out.println(m);
    }
	
}
class AdityaInfoTech implements Calci{
	int a,b;
	char op;
	AdityaInfoTech(){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the first numbers: ");
	 a = s.nextInt();
	System.out.println("Enter the second numbers: ");
	 b = s.nextInt();
	
	System.out.println("Enter the operator(+,-,*,/): ");
	op=s.next().charAt(0);
	
	
	}	
public void add() {
	if(op == '+') {
		System.out.println("result "+ (a+b));
	}
}
    public void sub() {
    	if(op == '-') {
    	System.out.println("result "+(a-b));
	}
    }
    public void mul() {
    	if(op == '*') {
    	System.out.println("result "+(a*b));
    }
    }
    public void div() {
    	if(op == '/') {
    	System.out.println("result "+ (a/b) );
    }
    }

}


