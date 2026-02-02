package com.company;

import java.util.Scanner;

public class QueArray3 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int a[] = {10,20,30,40,50};
		System.out.println("Please enter the key to search");
		int key= sc.nextInt();
		
		boolean found = false;
		int Idx = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				found = true;
				Idx = i;
				break;
			}
			
		}
		if(found==true) {
			System.out.println("Key found at Index "+ Idx);
		}
		else {
			System.out.println("Key not found");
		}
		
		sc.close();
	}

}
