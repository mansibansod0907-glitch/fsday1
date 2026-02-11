package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OrderTransaction {
public static void main(String[] args) {
		
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/workdb";
		
		 String user ="root";
		 String pass = "Mansi@123";	
		 String sql1 = "insert into orderDetails (o_id, p_id, quantity) values (?,?,?)";
		 String sql2 = "Update products set quantity=quantity-? where p_id=?";
	    
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
		     
	       	System.out.println("please enter your o_id ");
	       	int o_id=sc.nextInt();
	       	System.out.println("please enter your p_id ");
	       	int p_id = sc.nextInt();
	       	System.out.println("please enter your quantity ");
	       	int quantity = sc.nextInt();
		    
	       	pst1.setInt(1, o_id);
	       	pst1.setInt(2, p_id);
	       	
		    pst1.setInt(3, quantity);
		    pst2.setInt(1, quantity);
		    pst2.setInt(2, p_id);
		    
		    
		    
		    pst1.executeUpdate();
		    pst2.executeUpdate();
		    con.commit();
		    
		    con.setAutoCommit(true);
		    System.out.println("Successfully Updated");
		
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
