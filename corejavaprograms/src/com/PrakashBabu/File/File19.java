// WAp to read from a file with the help of File reader

package com.PrakashBabu.File;
import java.io.*;
public class File19 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader bufferedReader= new BufferedReader(new FileReader("names.txt"));
		String s=bufferedReader.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=bufferedReader.readLine();
		}
		bufferedReader.close();
	}
}
