// WAp to read from a file with the help of File reader
package com.PrakashBabu.File;

import java.io.FileReader;

public class File18 {

	public static void main(String[] args) throws Exception
	{
			FileReader fileReader= new FileReader("names.txt");
			int i=fileReader.read();
			while( i!=-1)
			{
				System.out.println((char)i);
			    i=fileReader.read();
			}
			fileReader.close();
	}

}
