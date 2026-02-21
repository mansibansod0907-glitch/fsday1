package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultipleRowsInBatch {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/Accountdb";
		String user ="root";
		String pass = "Mansi@123";
		
		String sql = "Insert into Accountdb values (?,?,?,?)";
		PreparedStatement pst = null;
		Scanner sc = null;
		
		try {
			 //Loading Driver
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
		
			 
			 //Create Connection
		     con = DriverManager.getConnection(url,user,pass);
		     
		     //Prepared statement
		     sc = new Scanner(System.in);
		     System.out.println("how many row you want to insert");
		     int a= sc.nextInt();
		     pst=con.prepareStatement(sql);
		     
		     while(a>0) {
		    	 
		    	 System.out.println("Please enter your accno");
		    	 int u_acc=sc.nextInt();
		    	 System.out.println("Please enter account holder name");
		    	 sc.nextLine();
		    	 String u_name= sc.nextLine();
		    	 System.out.println("Please enter amount");
		    	 double s_amount= sc.nextDouble();
		    	 System.out.println("Please enter your password");
		    	 String u_pass=sc.next();
		    	 pst.setInt(1, u_acc);
		    	 pst.setString(2, u_name);
		    	 pst.setDouble(3, s_amount);
		    	 pst.setString(4, u_pass);
		    	 pst.addBatch();
		    	 a--;
		    	 
		     }
		     int arr[]=pst.executeBatch();
		     System.out.println(arr.length+" rows affected");
			
		} catch(Exception e){
			
		}

	}

}
