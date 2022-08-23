package com.kaustubh.database.studentdb.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.kaustubh.database.studentdb.controller.CRUDDemo;
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
	public void getStudent() {
		// TODO Auto-generated method stub
	}
	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
	}
	@Override
	public void getAllStudent(Student student) {
		// TODO Auto-generated method stub
	}
}
	

