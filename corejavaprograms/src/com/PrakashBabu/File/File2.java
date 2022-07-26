//Write code to create a directory named with Java Practice in current working directory and create a file named with File.txt in that directory.

package com.PrakashBabu.File;

import java.io.*;

public class File2 
{
	public static void main(String[] args)throws IOException
	{
		File file=new File("Java practice");
		File file1=new File("file.txt");
		boolean directorycreated=file.mkdir();
		boolean filecreated=file1.createNewFile();
		System.out.println(file.getAbsolutePath()+"directory Created?="+directorycreated);
		System.out.println(file.getAbsolutePath()+"file Created?="+filecreated);

	}
}
