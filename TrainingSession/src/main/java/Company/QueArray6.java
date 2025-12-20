package Company;

import java.util.Scanner;
public class QueArray6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no.");
		int a = sc.nextInt();
		System.out.println("Enter second no.");
		int b = sc.nextInt();
		
		//Swapping without third variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping, a: "+ a + " and b: " +b);
 
		sc.close();
	}
 
	
}
