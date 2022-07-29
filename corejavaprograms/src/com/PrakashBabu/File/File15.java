// WAP to read the file content with help of FileWriter
package com.PrakashBabu.File;

import java.io.FileWriter;

public class File15 
{
	public static void main(String[] args) throws Exception
	{
		FileWriter fileWriter=new FileWriter("mnol.txt");
		fileWriter.write('a');
		fileWriter.write(100);
		fileWriter.write("Demo");
		fileWriter.close();
	}
}
	
