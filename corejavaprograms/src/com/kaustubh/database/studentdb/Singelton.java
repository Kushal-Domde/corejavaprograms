package com.kaustubh.database.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class Singelton 
{
	public Connection getConnection() 
	{
		String jdbcUrl = "jdbc:postgresql://localhost:5432/Selfbook";
		String username = "postgres";
		String password = "postgres";
		Connection connect = null;
		try 
		{
			if (connect == null)  
			{

				System.out.println("in Connection try .........");
				Class.forName("org.postgresql.Driver"); 			
				connect = DriverManager.getConnection(jdbcUrl, username, password); 
				System.out.println("connection " + connect);
				System.out.println("Connection to database  Selfbook sucessfully");

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return connect;
	}
}
