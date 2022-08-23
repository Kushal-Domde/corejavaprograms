package com.kaustubh.database.studentdb.service;

import java.sql.SQLException;

import com.kaustubh.database.studentdb.model.Student;

public interface StudentService 
{
	public boolean saveStudent(Student student) throws SQLException;
	public  void getStudent();
	public  void deleteStudent(int id);
	public  void getAllStudent(Student student);
		
	
	
}
