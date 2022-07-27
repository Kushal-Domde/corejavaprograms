//Write a Java program to check if a file has read and write permission. 
package com.PrakashBabu.File;
import java.io.File;
public class File8 
{
	public static void main(String[] args) 
	{
		File myfile= new File("C:\\Users\\kaust\\OneDrive\\Desktop\\core_java_programs\\corejavaprograms\\cricket.txt");
        if (myfile.canWrite()) 
        {
           System.out.println(myfile.getAbsolutePath() + " can write.");
        } 
        else
        {
           System.out.println(myfile.getAbsolutePath() + " cannot write.");
        }
        if (myfile.canRead()) 
        {
           System.out.println(myfile.getAbsolutePath() + " can Read.");
        } 
        else
        {
           System.out.println(myfile.getAbsolutePath() + " cannot Read.");
        }
	}
}
