package com.kaustubh.database.studentdb.model;
public class Student 
{
	public String bookName; 
	public String bookId; 
	public int noOfPages;
	public String authorName;
	public Student(String bookName, String bookId, int noOfPages, String authorName) 
	{
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.noOfPages = noOfPages;
		this.authorName = authorName;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Student [bookName=" + bookName + ", bookId=" + bookId + ", noOfPages=" + noOfPages + ", authorName="
				+ authorName + "]";
	}
}		