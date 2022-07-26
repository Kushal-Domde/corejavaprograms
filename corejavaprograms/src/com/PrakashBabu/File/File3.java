//Write code to create a file named with demo.txt in already present directory other than working directory .
package com.PrakashBabu.File;
import java.io.*;
public class File3 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\kaust\\OneDrive\\Desktop\\core_java_programs\\corejavaprograms\\corejavaprograms\\Java practice\\kaustubh.txt");
		boolean filecreated=file.createNewFile();
		System.out.println(file.getAbsolutePath()+"file Created?="+filecreated);
	}
}
