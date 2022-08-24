package com.kaustubh.database.studentdb.model;
public class Student 
{
		public String bookname; 
		public String bookid; 
		public int noofpages;
		public String authorname;
		public Student(String bookname,String bookid,int noofpages,String authorname)
		{
			this.bookname=bookname; 
			this.bookid=bookid;
			this.noofpages=noofpages;
			this.authorname=authorname;
		}
		public void setBookNAME(String bookname) {
			this.bookname= bookname;
		}
		public String getBookNAME() {
			return bookname;
		} 
		public void setBookID(String bookid) {
			this.bookid= bookid;
		}
		public String getBookID() {
			return bookid;
		}
		public void setNoofpages(int noofpages) {
			this.noofpages = noofpages;
		}
		public int getNoofpages() {
			return noofpages;
		}
		public void setAUTHORNAME(String authorname) {
			this.authorname= authorname;
		}
		public String getAUTHORNAME() {
			return authorname;
		}
}