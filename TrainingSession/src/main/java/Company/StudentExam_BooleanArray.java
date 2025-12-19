package Company;

import java.util.Scanner;

public class StudentExam_BooleanArray {

	public static void main(String[] args) {
		
			Scanner	sc = new Scanner(System.in);
			System.out.println("Please enter the no. of students present in the class");
			int n= sc.nextInt();
			boolean a[] = new boolean[n];
			for(int i=0;i<a.length;i++) {
				System.out.println("Did student " + (i + 1) + " pass the exam? (true/false)");
				a[i] = sc.nextBoolean();
			}
			
			//o/p
			 System.out.println("\nStudent Exam Results:");
			for(int i=0;i<a.length;i++) {
				System.out.println("Student " + (i + 1) + " Passed: " + a[i]);
			}
			sc.close();
			
	}

}
