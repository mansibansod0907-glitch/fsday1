package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateQuery {

	public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
		
		String user ="root";
		String pass = "Mansi@123";
		
		String query = "UPDATE phone SET brand=? WHERE id=?";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter new brand name: ");
		String brand = sc.next();
		System.out.print("Enter id to update: ");
		int id = sc.nextInt();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, brand);
		pst.setInt(2, id);
		int rows = pst.executeUpdate();
		if(rows > 0) {
			System.out.println("Brand updated successfully");
		} else {
			System.out.println("No record found with id" + id);
		}
		
		System.out.println("Brand name updated successfully");

	}
}
