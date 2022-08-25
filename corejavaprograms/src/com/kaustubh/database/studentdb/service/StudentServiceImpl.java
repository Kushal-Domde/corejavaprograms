package com.kaustubh.database.studentdb.service;

import java.sql.SQLException;

import com.kaustubh.database.studentdb.dao.StudentDAO;
import com.kaustubh.database.studentdb.dao.StudentDAOImpl;
import com.kaustubh.database.studentdb.model.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDAO studentDAO;
	@Override
	public boolean saveStudent(Student student) throws SQLException 
	{
		studentDAO= new StudentDAOImpl();
		return studentDAO.saveStudent(student);
	}
	@Override
	public void getStudent() {
		studentDAO.getStudent();
	}
	public void deleteStudent(String id)
	{ 
		studentDAO.deleteStudent(id);
	}
	public void deleteAllStudent(Student student)
	{
		studentDAO.deleteAllStudent(student);
	}
	public void getAllStudent(Student student)
	{
		studentDAO.getAllStudent(student);
	}

		
}

