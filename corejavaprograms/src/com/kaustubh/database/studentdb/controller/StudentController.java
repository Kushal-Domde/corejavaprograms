package com.kaustubh.database.studentdb.controller;

import java.sql.SQLException;

import com.kaustubh.database.studentdb.dao.StudentDAOImpl;
import com.kaustubh.database.studentdb.model.Student;
import com.kaustubh.database.studentdb.service.StudentService;
import com.kaustubh.database.studentdb.service.StudentServiceImpl;

public class StudentController 
{
	private StudentService studentService;
	void test() throws SQLException
	{
		studentService=new StudentServiceImpl();
		Student student=new Student("Rich Dad poor Dad","T101",100,"Robert Kiyosaki");
		studentService.saveStudent(student);
	}
	public static void main(String[] args) throws SQLException
	{
		Student student=new Student("Rich Dad poor Dad","T101",100,"Robert Kiyosaki");
//		Student student1=new Student("Secret","T104",170,"Rhonda Byrne");
//		Student student2=new Student("Money","T107",205,"BSR");
//		Student student3=new Student("Magic","T109",300,"Rhonda Byrne");
		StudentDAOImpl studentDAOImpl=new StudentDAOImpl();
//		studentDAOImpl.saveStudent(student);
//		studentDAOImpl.saveStudent(student1);
//		studentDAOImpl.saveStudent(student2);
//		studentDAOImpl.saveStudent(student3);
//		studentDAOImpl.getStudent();
//		studentDAOImpl.deleteStudent("T109");
//		studentDAOImpl.deleteAllStudent(student);
		studentDAOImpl.getAllStudent(student);

	}
}
