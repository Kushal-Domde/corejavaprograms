// Write a Java program to get specific  or all Directories 

package com.PrakashBabu.File;

import java.io.*;

public class File5DisplayAll
{
	public static void main(String[] args)throws IOException 
	{
	      File file = new File("C:\\Users\\kaust\\OneDrive\\Desktop\\core_java_programs\\corejavaprograms\\corejavaprograms");
	      String[] directory = file.list();
	      System.out.println("List of all Folders is:");
	      for(String s1: directory)
	      {
	    	  File file1=new File(file,s1);
	    	  if(file1.isDirectory())
	    		  System.out.println("Directory is :"+s1);
	      }
	}
}

