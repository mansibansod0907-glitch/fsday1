package com.company;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = {40,50,30,10,20};for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("<-------------------------------------->");
		
		for(int i=1; i<a.length; i++) {
			int current = a[i];
			int j = i-1;
			while(j>=0 && current < a[j] ) {
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = current;
		}

		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
