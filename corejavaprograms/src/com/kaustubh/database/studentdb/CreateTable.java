package com.kaustubh.database.studentdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable
{

	public static void main(String[] args)
	{		
		Connection c = null;
		Statement st = null;
		ConnectDB con=new ConnectDB();
		c=con.getConnection();
		try
		{
			String query="CREATE TABLE BOOK(BOOKNAME VARCHAR(200),BOOKID VARCHAR(50),NOOFPAGES INT,AUTHORNAME VARCHAR(50))";
			st=c.createStatement();
			int i=st.executeUpdate(query);
			st.close();	
			c.close();
			System.out.println(i + " record inserted");                 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Table created sucessfully");
	}

}
