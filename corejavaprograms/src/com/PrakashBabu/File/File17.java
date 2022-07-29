//WAP to read the file content with help of PrintWriter

package com.PrakashBabu.File;

import java.io.*;
//import java.io.FileWriter;
public class File17 
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter printWriter= new PrintWriter("mno3.txt");
		printWriter.println(99);
		printWriter.println('d');
		printWriter.println("Ketu");
		printWriter.close();
	}
	
}
