package Company;

import java.util.Scanner;

public class QueArray7 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the size of array:");
		        int n = sc.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.println("Enter first index to swap:");
		        int i1 = sc.nextInt();

		        System.out.println("Enter second index to swap:");
		        int i2 = sc.nextInt();

		        // Check index validity
		        if (i1 >= 0 && i1 < n && i2 >= 0 && i2 < n) {

		            int temp = arr[i1];
		            arr[i1] = arr[i2];
		            arr[i2] = temp;

		            System.out.println("Array after swapping:");
		            for (int i = 0; i < n; i++) {
		                System.out.print(arr[i] + " ");
		            }

		        } else {
		            System.out.println("Invalid index entered!");
		        }

		        sc.close();
		    }
		


	}


