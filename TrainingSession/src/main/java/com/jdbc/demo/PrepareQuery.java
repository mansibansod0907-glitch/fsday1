package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareQuery {

	public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
		
		String user ="root";
		String pass = "Mansi@123";
		
		String query = "insert into phone (id, brand,price) values (?, ?, ?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		PreparedStatement pst = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter id");
		int id = sc.nextInt();
		System.out.println("Please enter brand");
		sc.nextLine();
		String brand = sc.nextLine();
		System.out.println("Please enter Price");
		int price = sc.nextInt();
		
		pst.setInt(1, id);
		pst.setString(2, brand);
		pst.setInt(3, price);
		//ResultSet
		//int a=pst.executeUpdate();
	}
}
