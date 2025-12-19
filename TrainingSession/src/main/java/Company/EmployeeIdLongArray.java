package Company;

import java.util.Scanner;

public class EmployeeIdLongArray {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("Please enter the no. of Employee present in the Company");
		int n= sc.nextInt();
		long a[] = new long[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Please enter the EmployeeId of Employee "+i);
			a[i] = sc.nextLong();
		}
		
		//o/p
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		

	}
}
