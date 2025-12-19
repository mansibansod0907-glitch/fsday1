package Company;

import java.util.Scanner;

public class MarksArray {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("Please enter the no. of students present in the class");
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Please enter the marks of student "+i);
			a[i] = sc.nextInt();
		}
		
		//o/p
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		
		}
		
	}


