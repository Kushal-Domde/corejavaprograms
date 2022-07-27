 // Write a Java program to get specific files by extensions from all specified folder. 

package com.PrakashBabu.File;

import java.io.*;

public class File4 
{
	public static void main(String[] args) 
	{
		int count=0;
		File file=new File("C:\\Users\\kaust\\OneDrive\\Desktop\\core_java_programs\\corejavaprograms\\corejavaprograms"); 
		File[] s=file.listFiles();
	 	for(File s1:s) 
		{
			if(s1.isFile()) 
			{
				count++;
				System.out.println("File: "+s1.getName());
			}
		}
		System.out.println("total No of files in specified folder is"+count);
	}
}
