package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception  {
		String url = "jdbc:mysql://localhost:3306/student";
		//For Oracle
		//String url1 = "oracle:jdbc:thin@localhost:1521:xe";
		String user ="root";
		String pass = "Mansi@123";
		String sql = "Select * from student1"; 
		
		// loading The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		
		//Establishing The Connection
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established Sucessfully");
		
		//Create Statement
		Statement st = con.createStatement();
		ResultSet rs  =  st.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
	}

	private Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

}


