// WAP to copy 50% content of one file to another

package com.PrakashBabu.File;
import java.io.*;
public class File13 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fileInputStream= new FileInputStream("abc1.txt");
		FileOutputStream fileOutputStream=new FileOutputStream("abc3.txt");
		byte[] bt=new byte[fileInputStream.available()/2];	
		fileInputStream.read(bt);
		fileOutputStream.write(bt);
		System.out.println("50% data of File copied");
		fileInputStream.close();
		fileOutputStream.close();
	}
}


