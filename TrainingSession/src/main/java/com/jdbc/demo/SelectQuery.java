package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery  {
	public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
		
		String user ="root";
		String pass = "Mansi@123";
		
		String query = "select * from phone";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		Statement st = con.createStatement();
		//ResultSet
		ResultSet rs  =  st.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
		}
	}
}
