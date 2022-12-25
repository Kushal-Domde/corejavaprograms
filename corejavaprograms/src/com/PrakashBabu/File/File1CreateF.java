//Write a Java program to create a new file in current working directory. and check whether it exists or not.
package com.PrakashBabu.File;

import java.io.*;

public class File1CreateF 
{
	public static void main(String[] args)throws IOException
	{
		File f=new File("cricket.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}
}




 


