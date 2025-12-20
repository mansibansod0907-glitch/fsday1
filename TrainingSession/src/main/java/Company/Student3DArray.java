package Company;

import java.util.Scanner;

public class Student3DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of collages");
		int n= sc.nextInt();
		System.out.println("Enter the no. of classes");
		int m= sc.nextInt();
		System.out.println("Enter the no. of students");
		int l= sc.nextInt();
		int a[][][] = new int[n][m][l];
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				for(int k=0; k<a[i][j].length;k++) {
					System.out.println("Please enter the marks of collage" +i+" class " +j+ " student " +k);		
				a[i][j][k] = sc.nextInt();
	}

			}
}
		//Output marks
		System.out.println("\nEntered Marks:");
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				for(int k=0; k<a[i][j].length;k++)
				System.out.print(a[i][j][k]+" ");
			}
			System.out.println();
		}
		}
	}