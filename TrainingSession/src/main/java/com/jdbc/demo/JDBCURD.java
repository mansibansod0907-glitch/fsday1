package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCURD {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/student";
		
		String user ="root";
		String pass = "Mansi@123";
		
		String query = "INSERT INTO phone (id, brand, price) VALUES (1001, 'LAVA', 3000)";
		String query1 = "INSERT INTO phone (id, brand, price) VALUES (1002, 'CARBON', 4000)";
		String query2 = "INSERT INTO phone (id, brand, price) VALUES (1003, 'MICROMAX', 7000)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		
		Statement st = con.createStatement();
		st.addBatch(query);
		st.addBatch(query1);
		st.addBatch(query2);
		st.executeBatch();
		System.out.println("data added successfully");
		
		

	}

}
