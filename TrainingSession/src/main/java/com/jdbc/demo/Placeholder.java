package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Placeholder {
	public static void main(String[] args) throws Exception  {
		String url = "jdbc:mysql://localhost:3306/student";
		
		String user ="root";
		String pass = "Mansi@123";
		
		//String query="create table car(id Number Primary Key, brand varchar(20),priceNumber)";
		String query= "insert into car values(?,?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
		PreparedStatement pst= con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter id ");
		int id = sc.nextInt();
		System.out.println("please enter brand_name: ");
		String brand=sc.next();
		System.out.println("please enter price: ");
		int price=sc.nextInt();
		
		pst.setInt(1, id);
		pst.setString(2, brand);
		pst.setInt(3, price);
		
		pst.executeUpdate();
		
		System.out.println("data insert successfully");
		
		pst.close();
		con.close();
		System.out.println("Connetction Closed.....");
}
}