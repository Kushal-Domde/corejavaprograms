//Write a Java program to check if a  directory has read and write permission. 
	
package com.PrakashBabu.File;

import java.io.File;

public class File7 
{

	public static void main(String[] args) 
	{
		File mydirectory= new File("C:\\Users\\kaust\\OneDrive\\Desktop\\core_java_programs\\corejavaprograms\\Java practice");
        if (mydirectory.canWrite()) 
        {
           System.out.println(mydirectory.getAbsolutePath() + " can write.");
        } 
        else
        {
           System.out.println(mydirectory.getAbsolutePath() + " cannot write.");
        }
        if (mydirectory.canRead()) 
        {
           System.out.println(mydirectory.getAbsolutePath() + " can Read.");
        } 
        else
        {
           System.out.println(mydirectory.getAbsolutePath() + " cannot Read.");
        }
	}

}
