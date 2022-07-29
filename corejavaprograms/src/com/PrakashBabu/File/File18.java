package com.PrakashBabu.File;

import java.io.FileReader;

public class File18 
{
	public static void main(String[] args) throws Exception
	{
			FileReader fileReader= new FileReader("C:\\Users\\kaust\\OneDrive\\Desktop\\core_java_programs\\corejavaprograms\\corejavaprograms\\names.txt");
			int i=fileReader.read();
			while( i!=-1)
			{
				System.out.print((char)i);
			    i=fileReader.read();
			}
			fileReader.close();
	}

}

