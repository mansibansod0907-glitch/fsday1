package Company;

import java.util.Scanner;

public class Student3D_Jagged_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no. collages ");
		int n=sc.nextInt();
        int a[][][]=new int[n][][];
        
        for(int i=0;i<n;i++) {
    		System.out.println("Please enter the no. of classes "+i);
    		int m=sc.nextInt();
            a[i] = new int[m][];
            
            
        		for(int j=0; j<a[i].length;j++) {
        			System.out.println("Please enter the no. of collage "+i+ " class " +j);
        			int l=sc.nextInt();
        			a[i][j] = new int[l];
        			
        			for(int k=0; k<a[i][j].length; k++) {
        				System.out.println("Please enter the marks of collage "+i+ " class "+j+" student ");
        				
        			
        			
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
        