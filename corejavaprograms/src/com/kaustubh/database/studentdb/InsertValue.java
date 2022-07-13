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
			String query=" INSERT INTO BOOK VALUES(?,?,?,?)";
			PreparedStatement  pstmt= c.prepareStatement(query);
			pstmt.setString(1,"Rich Dad poor Dad");
			pstmt.setString(1,"T101");
			pstmt.setInt(3, 100);
			pstmt.setString(4,"Robert Kiyosaki");
			pstmt.addBatch();
			pstmt.setString(1,"Secret");
			pstmt.setString(1,"T102");
			pstmt.setInt(3, 186);
			pstmt.setString(4,"Rhonda Byrne");
			pstmt.addBatch();
			pstmt.setString(1,"Power of subconsicious mind");
			pstmt.setString(1,"T103");
			pstmt.setInt(3, 100);
			pstmt.setString(4,"Joseph murphy");
			pstmt.addBatch();
			st.executeBatch();
			c.commit();
			st.close(); 
			c.close();
			System.out.println("Records inserted.....");                 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	
}

}