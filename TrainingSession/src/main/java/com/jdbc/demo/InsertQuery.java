package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
		
		String user ="root";
		String pass = "Mansi@123";
		
		String query = "insert into phone (id, brand,price) values (100, 'Black Berry', 50000)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established Sucessfully");
		
		Statement st = con.createStatement();
		ResultSet rs  =  st.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
	}

}
