package com.prajakta.mysql_delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Mysql_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id no to delete = ");
			int id = sc.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee1","root","root");
			
			PreparedStatement ps = con.prepareStatement("delete from Detail where id = ?");
		
			ps.setInt(1, id);
			int z = ps.executeUpdate();
			
			if(z>0)
			{
				System.out.println("record deleted successfully");
			}
			else {
				System.out.println("id number not found");
			}
			
			con.close();
		
		}
			catch(Exception e)
			{
				
			}
		

	}

}
