package com.inheritance;
import java.util.*;
public class KodCalciApp {

	public static void main(String[] args) {
		 duty(new RupeshSoft());
		 duty(new AyushInfoTech());
	}
	static void duty(KodCalci k) {
		k.add();
		k.sub();
		k.mul();
		k.div();
	}
}
class RupeshSoft implements KodCalci{
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
class AyushInfoTech implements KodCalci{
public void add() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the two numbers: ");
	int a = s.nextInt();
	int b = s.nextInt();
	
	System.out.println("Addition ="+(a+b));
	}
    public void sub() {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the two numbers: ");
    	int m = s.nextInt();
    	int n = s.nextInt();
    	
    	System.out.println("Subtraction ="+(m+n));
	}
    public void mul() {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the two numbers: ");
    	int c = s.nextInt();
    	int d = s.nextInt();
    	
    	System.out.println("multiplication ="+(c*d));
    }
    public void div() {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the two numbers: ");
    	int r = s.nextInt();
    	int q = s.nextInt();
    	
    	System.out.println("Division ="+(r/q));
    }
}
	
