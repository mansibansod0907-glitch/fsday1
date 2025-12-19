package Company;

import java.util.Scanner;

public class StudentGrade_CharArray {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("Please enter the no. of students present in the class");
		int n= sc.nextInt();
		char a[] = new char[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Please enter the Grade of the student "+i);
			a[i] = sc.next().charAt(0);
		}
		
		//o/p
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		

	}

}
