package com.prajakta.mysql_retrieve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysql_retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee1","root","root");
			
			System.out.println("connection created");
		
			Statement stmt = con.createStatement();
			//Query to retrieve records
			
			String query ="select * from detail";
			
			//executing the query
			ResultSet rs =  stmt.executeQuery(query);
				
			
			System.out.println("Contents of the detail Table:");
			
			
			while(rs.next()) {
				System.out.println("id:" +rs.getInt("id")+",");
				System.out.println("Name:" +rs.getString("Name")+",");
				System.out.println("Dept:" +rs.getString("Dept")+",");
				System.out.println("Salary:" +rs.getInt("Salary")+",");
				System.out.println("Address:" +rs.getString("Address")+",");
				System.out.println();
				
			}
			con.close();
			rs.close();
			stmt.close();}	
		

			catch(Exception e) {
				System.out.println("exception="+e);
			
		}
		}}
