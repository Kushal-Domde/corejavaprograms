//WAP to  create the copy one image

package com.PrakashBabu.File;
import java.io.*;
public class File14 {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fileInputStream= new FileInputStream("C:\\Users\\kaust\\Downloads\\Profile.jpg");
		FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\kaust\\Downloads\\dp.jpg");
		byte[] bt=new byte[fileInputStream.available()];	
		fileInputStream.read(bt);
		fileOutputStream.write(bt);
		System.out.println("File copied");
		fileInputStream.close();
		fileOutputStream.close();
	}
}
