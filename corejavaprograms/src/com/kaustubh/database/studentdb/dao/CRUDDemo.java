package com.kaustubh.database.studentdb.dao;
import java.sql.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.kaustubh.database.studentdb.Singelton;

public class CRUDDemo 
{
	public Connection getConnection() 
	{
		Connection connection = null;
		try 
		{
			Properties properties =new Properties();
			FileInputStream fileInputStream=new FileInputStream("db.prop");
			properties.load(fileInputStream);
			String url=properties.getProperty("url");
			String username =properties.getProperty("username");
			String  password= properties.getProperty("password");
			if (connection==null)  
			{
				System.out.println("in Connection try .........");
				Class.forName("org.postgresql.Driver"); 			
				connection = DriverManager.getConnection(url,username,password); 
				System.out.println("connection " + connection);
				System.out.println("Connection to database  Selfbook sucessfully");	
			} 
		}	
		catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return connection;
	}
	 
	

	public void delete()
	{
		try
		{
			Connection connection = null; 
			Statement statement = null;
			Singelton single=new Singelton();
			connection=single.getConnection();
			statement =connection.createStatement();
			statement .executeUpdate("delete from Book2 where BookNAME='Secret'");
			statement .close();	
			connection.close();
			System.out.println("Record Deleted");                 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	}
	public void deleteAll()
	{
		try
		{
			Connection connection = null; 
			Statement statement = null;
			Singelton single=new Singelton();
			connection=single.getConnection();
			statement =connection.createStatement();
			statement.executeUpdate("DELETE FROM Book2");
			statement.close();	
			connection.close();
			System.out.println("All Record Deleted");                 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	}
}