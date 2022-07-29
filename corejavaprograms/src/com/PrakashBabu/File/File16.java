// WAP to read the file content with help of BufferedWriter

package com.PrakashBabu.File;

import java.io.*;
//import java.io.FileWriter;


public class File16 
{
	public static void main(String[] args) throws Exception
	{
		BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("mno2.txt"));
		bufferedWriter.write(98);
		bufferedWriter.newLine();
		bufferedWriter.write('c');
		bufferedWriter.newLine();
		bufferedWriter.write("Kaustubh");
		bufferedWriter.close();
	}
	
}
