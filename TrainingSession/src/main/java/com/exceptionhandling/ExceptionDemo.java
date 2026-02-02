package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Connection Established");
			System.out.println("Enter Value 1");
			int a=sc.nextInt();
			System.out.println("Enter Value 2");
			int b=sc.nextInt();
			System.out.println(a/b);
			
			//Array exception
			System.out.println("enter the size of array");
			int s= sc.nextInt();
			int arr[]=new int[s];
			System.out.println("enter the index which you want to add");
			int s1=sc.nextInt();
            arr[s1]=65;
		
		}
		catch(ArithmeticException e){
			// e.printStackTrace();
			System.out.println("dividing zero is not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Define the index number within the range");			
		}
		catch(NegativeArraySizeException e) {
			System.out.println("provide the positive array size");
		} // when parent is on first catch block then compiler gives the error
		 catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	        System.out.println("connection terminated");


	}
}
