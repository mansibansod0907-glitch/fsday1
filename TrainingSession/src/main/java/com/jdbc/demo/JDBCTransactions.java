package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTransactions {

	public static void main(String[] args) {
		
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/Accountdb";
		
		 String user ="root";
		 String pass = "Mansi@123";	
	     String sql1 = "Update account set Acc_bal=Acc_bal-? where Acc_Id=?" ;
		 String sql2 = "Update account set Acc_bal=Acc_bal+? where Acc_Id=?";
   
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;
		Scanner sc= null;
		try {
			 
			 
			 //Loading Driver
		
			 Class.forName("com.mysql.cj.jdbc.Driver");
		
			 
			 //Create Connection
		     con = DriverManager.getConnection(url,user,pass);
		     
		     //Prepared statement
		     con.setAutoCommit(false);
	       	 pst1 = con.prepareStatement(sql1);
		     pst2 = con.prepareStatement(sql2);
		     sc = new Scanner(System.in);
		     System.out.println("please enter your accno ");
		     int u_acc=sc.nextInt();
		     System.out.println("please enter reciever accno ");
		     int r_acc=sc.nextInt();
		     System.out.println("please enter amount to sent ");
		     double s_amount=sc.nextDouble();
		     
		     pst1.setDouble(1, s_amount);
		     pst1.setInt(2, u_acc);
		     
		     pst2.setDouble(1, s_amount);
		     pst2.setInt(2, r_acc);
		     
		     pst1.executeUpdate();
		     pst2.executeUpdate();
		     con.commit();
		     con.setAutoCommit(true);
		
		} catch (Exception e) {
			try {
				System.out.println("Error occured. Don't worry your money will be refunded within 24hrs");
				con.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			finally{
				
				try {
					sc.close();
					con.close();
				} catch (SQLException e1){
					e1.printStackTrace();
					
				}
			}
		}
	}

}
