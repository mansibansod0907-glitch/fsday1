package Company;

import java.util.Scanner;

public class QueArray4 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        int a[] = {10, 20, 30, 40, 50, 60};

	        System.out.println("Enter the key to search:");
	        int key = sc.nextInt();

	        int low = 0;
	        int high = a.length - 1;
	        boolean found = false;
	        int idx = -1;

	        while (low <= high) {

	            int mid = (low + high) / 2;

	            if (a[mid] == key) {
	                found = true;
	                idx = mid;
	                break;
	            } 
	            else if (key < a[mid]) {
	                high = mid - 1;
	            } 
	            else {
	                low = mid + 1;
	            }
	        }

	        if (found) {
	            System.out.println("Key found at index: " + idx);
	        } else {
	            System.out.println("Key not found in array");
	        }

	        sc.close();

	}
}
