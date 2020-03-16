package com.jdbc;
import java.sql.*;
public class JDBCExample {
	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306";
	static final String user = "root";
	static final String pass = "root";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pass);
			stmt = conn.createStatement();
			
			String sql = "create database demo";
			
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		}
		catch(SQLException se)
		{
			//Handle errors for JDBC
			se.printStackTrace();
		}
		catch(Exception e)
		{
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally
		{
			//finally block used to close resources
			try
			{
				if(stmt != null)
				{
					stmt.close();
				}
			}
			catch(SQLException se2)
			{
				
			}//nothing we can do
			try
			{
				if(conn != null)
				{
					conn.close();
				}
			}
			catch(SQLException se1)
			{
				se1.printStackTrace();
			}
			//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main

}//end JDBC Example
