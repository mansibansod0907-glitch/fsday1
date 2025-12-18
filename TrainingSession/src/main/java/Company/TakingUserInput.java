package Company;

import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
	Scanner	sc = new Scanner(System.in);
	System.out.println("Please Enter Your Name");
	String name = sc.nextLine();
	
	
	System.out.println("Please Enter Your Age");
	int Age = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Please Enter Your Gender");
	String Gender = sc.nextLine();
	
	System.out.println("Please Enter Your Mob No.");
	String Mob_No = sc.nextLine();
	
	System.out.println("Please Enter Your Address");
	String Address = sc.nextLine();
	
	System.out.println("Collage Id");
	long Collage_Id = sc.nextLong();
	
	sc.nextLine();
	
	System.out.println("Please Enter Your Collage Name");
	String Collage_Name = sc.nextLine();
	
	System.out.println("Please Enter Your Aadhar No.");
	long Aadhar_No = sc.nextLong();
	 
	sc.nextLine();
	System.out.println("Please Enter Your Email");
	String Email = sc.nextLine();
	
	System.out.println("Please Enter Your Status");
	String Status = sc.nextLine();
	
	
	

	}

}
