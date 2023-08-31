package com.prajakta.Jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Mysql_insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID  = ");
		int id = sc.nextInt();
		System.out.println("Enter name = ");
		String name = sc.next();
		System.out.println("Enter Dept = ");
		String dept = sc.next();
		System.out.println("Enter Salary = ");
		String salary = sc.next();
		System.out.println(" Enter Address = ");
		String address = sc.next();
		
		try
		
		{
			//step1 Load Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2 Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee1","root","root");
			
			//step3 prepare sql query 
			PreparedStatement ps = con.prepareStatement("insert into Detail values (?,?,?,?,?)");
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setString(3, dept);
			ps.setString(4, salary);
			ps.setString(5, address);
			
			//step4 Fire sql query
			int z = ps.executeUpdate();
			if(z>0)
			{
				System.out.println("record saved successfully");
			}
			else
			{
				System.out.println("record not saved ");
			}
			
			//step5 Close connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}
