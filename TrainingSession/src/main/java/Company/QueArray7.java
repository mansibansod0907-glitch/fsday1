package Company;

import java.util.Scanner;

public class QueArray7 {

	public static void main(String[] args) {
		
		int []a= {10,20,30,40,50};
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Please enter Index 1 to Swap");
		        int Idx1 = sc.nextInt();

		        System.out.println("Please enter Index 2 to Swap");
		        int Idx2 = sc.nextInt();
		        
		        int temp = a[Idx1];
		        a[Idx1] = a[Idx2];
		        a[Idx1] = temp;
		        
		        
		        

		           
		        sc.close();
		    }
		


	}


