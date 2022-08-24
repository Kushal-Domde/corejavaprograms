package com.kaustubh.database.studentdb.dao;
import java.sql.SQLException;
import com.kaustubh.database.studentdb.model.Student;
public interface StudentDAO 
{
	public boolean saveStudent(Student student) throws SQLException;
	public  void getStudent();
	public  void deleteStudent(String bookid);
	public  void deleteAllStudent(Student student);
	public  void getAllStudent(Student student);
}
