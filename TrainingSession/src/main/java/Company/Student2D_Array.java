package Company;

import java.util.Scanner;
public class Student2D_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of class");
		int n= sc.nextInt();
		System.out.println("Enter the no.of student");
		int m= sc.nextInt();
		int a[][] = new int[n][m];
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.println("Please enter the marks of class " +i+ " student " +j);
				
				a[i][j] = sc.nextInt();
			}
		}
	
		
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}



//int a[][] = new int[3][5];
//for(int i=0; i<3;i++) {
//	for(int j=0; j<5;j++) {
//		System.out.println("Please enter the marks of class "+i+" of the student " +j);
//		
//		a[i][j] = sc.nextInt();
//	}
//}
//
//
//for(int i=0;i<3;i++) {
//	for(int j=0; j<5;j++) {
//		System.out.print(a[i][j]+" ");
//	}
//	System.out.println();
//}




//Class 0 I/P
//System.out.println("Please enter the marks of class 0 student 0");
//a[0][0]=sc.nextInt();
//System.out.println("Please enter the marks of class 0 student 1");
//a[0][1]=sc.nextInt();
//System.out.println("Please enter the marks of class 0 student 2");
//a[0][2]=sc.nextInt();
//System.out.println("Please enter the marks of class 0 student 3");
//a[0][3]=sc.nextInt();
//System.out.println("Please enter the marks of class 0 student 4");
//a[0][4]=sc.nextInt();

//Class 1 I/P
//System.out.println("Please enter the marks of class 1 student 0");
//a[1][0]=sc.nextInt();
//System.out.println("Please enter the marks of class 1 student 1");
//a[1][1]=sc.nextInt();
//System.out.println("Please enter the marks of class 1 student 2");
//a[1][2]=sc.nextInt();
//System.out.println("Please enter the marks of class 1 student 3");
//a[1][3]=sc.nextInt();
//System.out.println("Please enter the marks of class 1 student 4");
//a[1][4]=sc.nextInt();

//Class 2 I/P
//System.out.println("Please enter the marks of class 2 student 0");
//a[2][0]=sc.nextInt();
//System.out.println("Please enter the marks of class 2 student 1");
//a[2][1]=sc.nextInt();
//System.out.println("Please enter the marks of class 2 student 2");
//a[2][2]=sc.nextInt();
//System.out.println("Please enter the marks of class 2 student 3");
//a[2][3]=sc.nextInt();
//System.out.println("Please enter the marks of class 2 student 4");
//a[2][4]=sc.nextInt();	

//			System.out.println(a[i][0]+" ");
//			System.out.println(a[i][1]+" ");
//			System.out.println(a[i][2]+" ");
//			System.out.println(a[i][3]+" ");
//			System.out.println(a[i][4]+" ");
//			System.out.println(); 
		
		
		//Class 0 O/P
//		System.out.print(a[0][0]+" ");
//		System.out.print(a[0][1]+" ");
//		System.out.print(a[0][2]+" ");
//		System.out.print(a[0][3]+" ");
//		System.out.print(a[0][4]+" ");
		//Class 1 O/p
//		System.out.print(a[1][0]+" ");
//		System.out.print(a[1][1]+" ");
//		System.out.print(a[1][2]+" ");
//		System.out.print(a[1][3]+" ");
//		System.out.print(a[1][4]+" ");
		//Class 2 O/P
//		System.out.print(a[2][0]+" ");
//		System.out.print(a[2][1]+" ");
//		System.out.print(a[2][2]+" ");
//		System.out.print(a[2][3]+" ");
//		System.out.print(a[2][4]+" ");
		
		

	

/*a[0][0]=11;
a[0][1]=12;
a[0][2]=13;
a[0][3]=14;
a[0][4]=15;

//Class 1 I/P
a[1][0]=11;
a[1][1]=12;
a[1][2]=13;
a[1][3]=14;
a[1][4]=15;

//Class 2 I/P
a[2][0]=11;
a[2][1]=12;
a[2][2]=13;
a[2][3]=14;
a[2][4]=15;	

//Class 0 O/P
System.out.print(a[0][0]+" ");
System.out.print(a[0][1]+" ");
System.out.print(a[0][2]+" ");
System.out.print(a[0][3]+" ");
System.out.print(a[0][4]+" ");
//Class 1 O/p
System.out.print(a[1][0]+" ");
System.out.print(a[1][1]+" ");
System.out.print(a[1][2]+" ");
System.out.print(a[1][3]+" ");
System.out.print(a[1][4]+" ");
//Class 2 O/P
System.out.print(a[2][0]+" ");
System.out.print(a[2][1]+" ");
System.out.print(a[2][2]+" ");
System.out.print(a[2][3]+" ");
System.out.print(a[2][4]+" ");
*/
//2nd step
/*System.out.println(a[i][0]+" ");
			System.out.println(a[i][1]+" ");
			System.out.println(a[i][2]+" ");
			System.out.println(a[i][3]+" ");
			System.out.println(a[i][4]+" ");
			System.out.println(); 
		
		
		//Class 0 O/P
		System.out.print(a[0][0]+" ");
		System.out.print(a[0][1]+" ");
		System.out.print(a[0][2]+" ");
		System.out.print(a[0][3]+" ");
		System.out.print(a[0][4]+" ");
		//Class 1 O/p
		System.out.print(a[1][0]+" ");
		System.out.print(a[1][1]+" ");
		System.out.print(a[1][2]+" ");
		System.out.print(a[1][3]+" ");
		System.out.print(a[1][4]+" ");
		//Class 2 O/P
		System.out.print(a[2][0]+" ");
		System.out.print(a[2][1]+" ");
		System.out.print(a[2][2]+" ");
		System.out.print(a[2][3]+" ");
		System.out.print(a[2][4]+" ");
		*/
