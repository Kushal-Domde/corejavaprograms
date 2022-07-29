// WAP to copy the  content of one file to another file

package com.PrakashBabu.File;
import java.io.*;
public class File12 {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fileInputStream= new FileInputStream("abc1.txt");
		FileOutputStream fileOutputStream=new FileOutputStream("abc2.txt");
		byte[] bt=new byte[fileInputStream.available()];	
		fileInputStream.read(bt);
		fileOutputStream.write(bt);
		System.out.println("File copied");
		fileInputStream.close();
		fileOutputStream.close();
	}
}
