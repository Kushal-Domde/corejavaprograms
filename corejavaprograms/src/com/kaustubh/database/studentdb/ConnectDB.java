package com.kaustubh.database.studentdb;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectDB 
{
		public Connection getConnection() 
		{
			String jdbcUrl="jdbc:postgresql://localhost:5432/Selfbook";
			String username="postgres";
			String password="postgres";
			Connection c = null;
			try 
			{
					if (c== null)
					{
						
						System.out.println("in Connection try .........");
						Class.forName("org.postgresql.Driver");
						c = DriverManager.getConnection(jdbcUrl,username,password);
						System.out.println("connection " + c);
						System.out.println("Connection to database sucessfully");
						
					}
			}
			catch (Exception e) 
			{
					e.printStackTrace();
					System.err.println(e.getClass().getName()+": "+e.getMessage());
			         System.exit(0);
			}
			return c;
		}
}
