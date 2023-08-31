package com.prajakta.mysql_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mysql_update {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee1","root","root");
			
			PreparedStatement  ps = con.prepareStatement("update Detail set name = ? , address = ?  where id = ?");
			
			ps.setString(1, "radhika");
			ps.setString(2, "jalna");
			
			ps.setInt(3,104);
			
			int z = ps.executeUpdate();
			if(z>0)
			{
				System.out.println("record updated");
			}
			else
			{
				System.out.println("records not updated");
			}
			
			con.close();
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
