package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws Exception  {
		String url = "jdbc:mysql://localhost:3306/student";
		//For Oracle
		//String url1 = "oracle:jdbc:thin@localhost:1521:xe";
		String user ="root";
		String pass = "Mansi@123";
	//	String sql = "create table phone(id int primary key, brand varchar(20), price int)"; 
		String sql = "insert into phone values (11,'nokia',1200),(12, 'samsung',20000)";
		
		// loading The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		
		//Establishing The Connection
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established Sucessfully");
		
		//Create Statement
		Statement st = con.createStatement();
		int i = st.executeUpdate(sql);
		System.out.println(i+" row affected");
		
	}
}
	