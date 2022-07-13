package com.kaustubh.database.studentdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadValue 
{
	public static void main(String[] args) 
	{
		Connection c = null; // try here new
		Statement st = null;
		ResultSet rs=null; // values read by queries are holded with the help of these resultSet
		ConnectDB con=new ConnectDB();
		c=con.getConnection();
		try
		{
			String query="Select*from book";
			PreparedStatement pstmt = c.prepareStatement(query);
	    //  preparedStatement.setInt(1, 1);
		//	System.out.println(preparedStatement);
		    rs = pstmt.executeQuery();
		    while(rs.next())
		    {
		    	System.out.print(rs.getString(1));
		    	System.out.print(rs.getString(2));
		    	System.out.print(rs.getInt(3));	
		    	System.out.print(rs.getString(4));
		    }
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	
	}
}
	