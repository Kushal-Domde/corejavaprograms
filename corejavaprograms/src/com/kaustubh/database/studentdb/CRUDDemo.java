package com.kaustubh.database.studentdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDDemo 
{
	public static void main(String[] args)
	{
		Connection connect = null; // try here new
		Statement stmt = null;
		Singelton single=new Singelton();
		connect=single.getConnection();
		CRUDDemo crud=new CRUDDemo(); 
//		crud.createTable();
//		crud.insert1Value();
		crud.insertAll();
//		crud.display();
//		crud.delete();
//		crud.deleteAll();
		
	}
	public void createTable()
	{
		try
		{
			
			Connection connect = null; // try here new
			Statement stmt = null;
			Singelton single=new Singelton();
			connect=single.getConnection();
			stmt=connect.createStatement();
//	     	stmt.executeUpdate("CREATE TABLE Book( BookNAME VARCHAR(200),BookID VARCHAR(20),NOOFPAGES INT,AUTHORNAME VARCHAR(50))");
			stmt.executeUpdate("CREATE TABLE Book5( BookNAME VARCHAR(200),BookID SERIAL PRIMARY KEY,NOOFPAGES INT,AUTHORNAME VARCHAR(50))");
			stmt.close();	
			connect.close();
			System.out.println("Table created sucessfully");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	}
//	public void insert1Value()	
//	{
//		try
//		{
//			Connection connect = null; // try here new
//			Statement stmt = null;
//			Singelton single=new Singelton();
//			connect=single.getConnection();
//			stmt=connect.createStatement();
//			connect.setAutoCommit(false);
//			String query=" INSERT INTO Book5(Bookname,Bookid,noofpages,authorname)"+" VALUES(?,?,?,?)";
//			PreparedStatement  pstmt= connect.prepareStatement(query);
//			pstmt.setString(1,"Rich Dad poor Dad");
//			pstmt.setInt(2,101);
//			pstmt.setInt(3, 100);
//			pstmt.setString(4,"Robert Kiyosaki");
//			pstmt.addBatch();
//			int[] count=pstmt.executeBatch();
//			connect.commit();
//			stmt.close(); 
//			connect.close();
//			System.out.println(count.length+"Records inserted..... into Book5 ");                 
//		}
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//			System.exit(0);
//		}
//	}
	public void insertAll()	
	{
		try
		{
			
			Connection connect = null; // try here new
			Statement stmt = null;
			Singelton single=new Singelton();
			connect=single.getConnection();

			stmt=connect.createStatement();
			connect.setAutoCommit(false);
//			String query=" INSERT INTO Book5(Bookname,noofpages,authorname)"+" VALUES(?,?,?,?)";
			//The column index is out of range: 4, number of columns: 3.
			String query=" INSERT INTO Book5(Bookname,Bookid,noofpages,authorname)"+" VALUES(?,?,?,?)";
			PreparedStatement  pstmt= connect.prepareStatement(query);
			pstmt.setString(1,"Secret");
//			pstmt.setString(2,"T102"); No value specified for parameter 2.
//			pstmt.setString(2,102);
			pstmt.setInt(2,102);
			pstmt.setInt(3, 186);
			pstmt.setString(4,"Rhonda Byrne");
			pstmt.addBatch();
			pstmt.setString(1,"Power of subconsicious mind");
//			pstmt.setString(2,"T103");
			pstmt.setInt(3, 100);
			pstmt.setString(4,"Joseph murphy");
			pstmt.addBatch();
			pstmt.setString(1, "seven habbits");
//			pstmt.setString(2,"T104");
			pstmt.setInt(3, 100);
			pstmt.setString(4, "Swapnil");
			pstmt.addBatch(); 
			int[] count=pstmt.executeBatch(); 
			connect.commit();
			stmt.close(); 
			connect.close();
			System.out.println(count.length+"Records inserted..... into Book10");                 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
			
	}
//	public void display() 
//	{
//		ResultSet rs=null; // values read by queries are holded with the help of these resultSet
//		try
//		{
//			Connection connect = null; // try here new
//			Statement stmt = null;
//			Singelton single=new Singelton();
//			connect=single.getConnection();
//			String query="Select*from Book10";
//			PreparedStatement  pstmt= connect.prepareStatement(query);
//			rs = pstmt.executeQuery();
//		    while(rs.next())
//		    {
//		    	System.out.println(rs.getString(1));
//		    	System.out.println(rs.getString(2));
//		    	System.out.println(rs.getInt(3));	
//		    	System.out.println(rs.getString(4));
//		    	
//		    	System.out.println(" ");
//		    }
//		}
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//			System.exit(0);
//		}
//	}
//	public void delete()
//	{
//		try
//		{
//			Connection connect = null; // try here new
//			Statement stmt = null;
//			Singelton single=new Singelton();
//			connect=single.getConnection();
//			stmt=connect.createStatement();
//			stmt.executeUpdate("delete from Book6 where BookNAME='Secret'");
//			stmt.close();	
//			connect.close();
//			System.out.println("Record Deleted");                 
//		}
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//			System.exit(0);
//		}
//	}
//	public void deleteAll()
//	{
//		try
//		{
//			Connection connect = null; // try here new
//			Statement stmt = null;
//			Singelton single=new Singelton();
//			connect=single.getConnection();
//			stmt=connect.createStatement();
//			stmt.executeUpdate("DELETE FROM Book6");
//			stmt.close();	
//			connect.close();
//			System.out.println("All Record Deleted");                 
//		}
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//			System.exit(0);
//		}
//	}
//
//	
//
}
