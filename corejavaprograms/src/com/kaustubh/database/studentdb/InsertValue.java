package com.kaustubh.database.studentdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertValue
{
	public static void main(String[] args)
	{		
		Connection c = null; // try here new
		Statement st = null;
		ConnectDB con=new ConnectDB();
		c=con.getConnection();
			
		try
		{
			st=c.createStatement();
			c.setAutoCommit(false);
			String query=" INSERT INTO BOOK(bookname,bookid,noofpages,authorname)"+" VALUES(?,?,?,?)";
			PreparedStatement  pstmt= c.prepareStatement(query);
			pstmt.setString(1,"Rich Dad poor Dad");
			pstmt.setString(2,"T101");
			pstmt.setInt(3, 100);
			pstmt.setString(4,"Robert Kiyosaki");
			pstmt.addBatch();
			pstmt.setString(1,"Secret");
			pstmt.setString(2,"T102");
			pstmt.setInt(3, 186);
			pstmt.setString(4,"Rhonda Byrne");
			pstmt.addBatch();
			pstmt.setString(1,"Power of subconsicious mind");
			pstmt.setString(2,"T103");
			pstmt.setInt(3, 100);
			pstmt.setString(4,"Joseph murphy");
			pstmt.addBatch(); 
			int[] count=pstmt.executeBatch(); 
			c.commit();
			st.close(); 
			c.close();
			System.out.println("Records inserted..... into Book"+count.length);                 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	
}

}