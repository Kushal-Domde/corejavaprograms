// WAP to show program file 
package com.PrakashBabu.File;
import java.io.*;
public class File11 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fileInputStream=new FileInputStream("file10.java");
		byte[] bt=new byte[fileInputStream.available()];
		fileInputStream.read(bt);
		String s= new String(bt);
		System.out.println(s);
		fileInputStream.close();
	}
}
