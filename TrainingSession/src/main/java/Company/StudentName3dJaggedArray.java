package Company;

import java.util.Scanner;

public class StudentName3dJaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no. collages ");
		int n=sc.nextInt();
		sc.nextLine();
        String a[][][]=new String[n][][];
        
        
        for(int i=0;i<n;i++) {
    		System.out.println("Please enter the no. of classes "+i);
    		int m=sc.nextInt();
    		sc.nextLine();
            a[i] = new String[m][];
            
            
        		for(int j=0; j<a[i].length;j++) {
        			System.out.println("Please enter the no. of collage "+i+ " class " +j);
        			int l=sc.nextInt();
        			sc.nextLine();
        			a[i][j] = new String[l];
        			
        			for(int k=0; k<a[i][j].length; k++) {
        				System.out.println("Please enter the names of Student "+k+ " collage "+i+" class "+j);
        				
        			
        			
        			a[i][j][k] = sc.nextLine();
	}

}
}
      //Output marks
      		System.out.println("\nEntered Names:");
      		for(int i=0;i<a.length;i++) {
      			System.out.print("Collage"+":");
      			for(int j=0; j<a[i].length;j++) {
      				System.out.print("Class"+":");
      				for(int k=0; k<a[i][j].length;k++)
      				System.out.print(a[i][j][k]+" ");
      			}
      			System.out.println();
      		}



	}

}
