package com.kaustubh.database.studentdb.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.kaustubh.database.studentdb.Singelton;
//import com.kaustubh.database.studentdb.controller.CRUDDemo;
import com.kaustubh.database.studentdb.model.Student;
public class StudentDAOImpl implements StudentDAO 
{
	@Override
	public boolean saveStudent(Student student) throws SQLException 
	{
		// TODO write a code here to save student in database
//		if student save is successful return true else false
		CRUDDemo crud=new CRUDDemo();
		int check;
		Connection connection = null;
		connection=crud.getConnection();
		connection.setAutoCommit(false);
		String query="INSERT INTO student2(bookname,bookid,noofpages,authorname)"+" VALUES(?,?,?,?)";
		PreparedStatement  preparedStatement= connection.prepareStatement(query);
		preparedStatement.setString(1,student.getBookNAME());
		preparedStatement.setString(2,student.getBookID()); 
		preparedStatement.setInt(3,student.getNoofpages());
		preparedStatement.setString(4,student.getAUTHORNAME());
		preparedStatement.addBatch();
		check=preparedStatement.executeUpdate();
		if(check==1)
		{
			System.out.println("True");
			connection.commit(); 
			return true;
		}
		else
		{
				System.out.println("false");
				return false;
		}
	}
	@Override
	public void getStudent() 
	{
		ResultSet resultSet=null;
		try
		{
			Statement  statement = null;
			Connection connection = null; 
			Singelton singleton=new Singelton();
			connection=singleton.getConnection();
			statement =connection.createStatement();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Kindly enter the no of pages");
			int pages=scanner.nextInt();
			String query="select * from student2 where noofpages="+pages+"";
			PreparedStatement  preparedStatement= connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
		    while (resultSet.next()) 
		    {
		    	System.out.println(resultSet.getString(1));
		    	System.out.println(resultSet.getString(2));
		    	System.out.println(resultSet.getInt(3));
		    	System.out.println(resultSet.getString(4));
		    }
			statement.close();
			scanner.close();
			connection.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	}
	@Override
	public void deleteStudent(String bookid) 
	{
		try
		{
			Statement statement = null;
			Connection connection = null; 
			Singelton singleton=new Singelton();
			connection=singleton.getConnection();
			statement =connection.createStatement();
			String query="delete from student2 where bookid='"+bookid+"'";
			int affectedrows=0;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			affectedrows = preparedStatement.executeUpdate();
			if(affectedrows==1)
			{
				System.out.println(affectedrows);
				System.out.println("Record deleted");
			}
			else
				System.out.println("No record found");
			statement.close(); 
			connection.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	}
	@Override
	public void deleteAllStudent(Student student) 
	{
		try
		{
			Statement statement = null;
			Connection connection = null; 
			Singelton singleton=new Singelton();
			connection=singleton.getConnection();
			statement =connection.createStatement();
			String query="delete from student2"; 
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.executeUpdate();
			System.out.println("All Record deleted");
			statement.close(); 
			connection.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	}
	@Override
	public void getAllStudent(Student student) 
	{
		ResultSet resultSet=null;
		try
		{
			Statement  statement = null;
			Connection connection = null; 
			Singelton singleton=new Singelton();
			connection=singleton.getConnection();
			statement =connection.createStatement();
			String query="select * from student2";
			PreparedStatement  preparedStatement= connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
		    while (resultSet.next()) 
		    {
		    	System.out.println(resultSet.getString(1));
		    	System.out.println(resultSet.getString(2));
		    	System.out.println(resultSet.getInt(3));
		    	System.out.println(resultSet.getString(4));
		    	System.out.println("----------------------");
		    }
			statement.close();
			connection.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}

	}
}

