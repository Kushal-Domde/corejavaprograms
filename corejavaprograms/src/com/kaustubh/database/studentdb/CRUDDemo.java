package com.kaustubh.database.studentdb;
import java.sql.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

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
	public static void main(String[] args) throws SQLException
	{
		CRUDDemo crud=new CRUDDemo(); 
		Book book=new Book("Rich Dad poor Dad","T101",100,"Robert Kiyosaki");
		Book book1=new Book("Secret","T104",170,"Rhonda Byrne");
		Book book2=new Book("Money","T107",205,"BSR");
		Book book3=new Book("Magic","T100",300,"Rhonda Byrne");
		crud.insertValue(book); 
		crud.insertAll(book1, book2, book3);
		crud.display();
		crud.delete();
		crud.deleteAll();
	}
	public void insertValue(Book book) throws SQLException
	{

		CRUDDemo crud=new CRUDDemo(); 
		Connection connection = null;
		try
		{

			connection=crud.getConnection();
			connection.setAutoCommit(false);
			String query=" INSERT INTO book2(bookname,bookid,noofpages,authorname)"+" VALUES(?,?,?,?)";
			PreparedStatement  preparedStatement= connection.prepareStatement(query);
			preparedStatement.setString(1,book.getBookNAME());
			preparedStatement.setString(2,book.getBookID()); 
			preparedStatement.setInt(3,book.getNoofpages());
			preparedStatement.setString(4,book.getAUTHORNAME());
			preparedStatement.addBatch();
			int[] count=preparedStatement.executeBatch();
			System.out.println(count.length+"Records inserted..... into  ");      
			System.out.println("Details for  book is........");
			System.out.println("The book name is "+ book.getBookNAME());	
			System.out.println("The book id is "+ book.getBookID());	
			System.out.println("The No of pages of book is "+ book.getNoofpages());	
			System.out.println("The Author name is "+ book.getAUTHORNAME());	
			System.out.println("----------------------------------------------------");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
		finally
		{
			if(connection!= null)
			{
				connection=crud.getConnection();
//				connection.commit(); 
				connection.close();
			}
		}
	}
	public void insertAll(Book book1,Book book2,Book book3)	 throws SQLException	
	{
		Connection connection = null; 
		Statement statement = null;
		CRUDDemo crud=new CRUDDemo(); 
		try
		{
			connection=crud.getConnection();
			statement=connection.createStatement();
			//				connection.setAutoCommit(false);
			String query=" INSERT INTO Book2(Bookname,Bookid,noofpages,authorname)"+" VALUES(?,?,?,?)";
			PreparedStatement  preparedStatement= connection.prepareStatement(query);
			preparedStatement.setString(1,book1.getBookNAME());
			preparedStatement.setString(2,book1.getBookID()); 
			preparedStatement.setInt(3,book1.getNoofpages());
			preparedStatement.setString(4,book1.getAUTHORNAME());
			preparedStatement.addBatch();
			System.out.println("2nd record inserted sucessfully");
//			System.out.println("Details for  book is........");
//			System.out.println("The book name is "+ book1.getBookNAME());	
//			System.out.println("The book id is "+ book1.getBookID());	
//			System.out.println("The No of pages  is "+ book1.getNoofpages());	
//			System.out.println("The Author name is "+ book1.getAUTHORNAME());	
//			System.out.println("----------------------------------------------------");
//			preparedStatement.setString(1,book2.getBookNAME());
			preparedStatement.setString(2,book2.getBookID()); 
			preparedStatement.setInt(3,book2.getNoofpages());
			preparedStatement.setString(4,book2.getAUTHORNAME());
			preparedStatement.addBatch();
	
			System.out.println("3rd record inserted sucessfully");
//			System.out.println("Details for  book is........");
//			System.out.println("The book name is "+ book2.getBookNAME());	
//			System.out.println("The book id is "+ book2.getBookID());	
//			System.out.println("The No of pages  is "+ book2.getNoofpages());	
//			System.out.println("The Author name is "+ book2.getAUTHORNAME());	
//			System.out.println("----------------------------------------------------");
			
			preparedStatement.setString(1,book3.getBookNAME());
			preparedStatement.setString(2,book3.getBookID()); 
			preparedStatement.setInt(3,book3.getNoofpages());
			preparedStatement.setString(4,book3.getAUTHORNAME());
			preparedStatement.addBatch();
			preparedStatement.executeBatch(); 
			System.out.println("4th record inserted sucessfully");
//			System.out.println("Details for  book is........");
//			System.out.println("The book name is "+ book3.getBookNAME());	
//			System.out.println("The book id is "+ book3.getBookID());	
//			System.out.println("The No of pages  is "+ book3.getNoofpages());	
//			System.out.println("The Author name is "+ book3.getAUTHORNAME());	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
		finally
		{
			if(statement!= null)
			{
				statement.close(); 
			}
			if(connection!= null)
			{
				connection=crud.getConnection();
				//					connection.commit();
				connection.close();
			}
		}
	}
	public void display() 
	{
		ResultSet resultSet=null; 
		try
		{
			Connection connect = null; 
			Singelton single=new Singelton();
			connect=single.getConnection();
			String query="Select*from Book2";
			PreparedStatement  preparedStatement= connect.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
		    while(resultSet.next())
		    {
		    	System.out.println(resultSet.getString(1));
		    	System.out.println(resultSet.getString(2));
		    	System.out.println(resultSet.getInt(3));	
		    	System.out.println(resultSet.getString(4));
		    	System.out.println(" ");
		    }
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
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