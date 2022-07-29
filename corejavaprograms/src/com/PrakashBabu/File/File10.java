//Write a Java program to perform addition of two number and store numbers and result into file. 

package com.PrakashBabu.File;
import java.util.Scanner;
import java.io.*;
public class File10 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the value of 1st number to be added:");
		int a= scanner.nextInt();
		System.out.println("Enter the value of 2nd number to be added:");
		int b=scanner.nextInt();
		int c=a+b;
		System.out.println("The addition of two numbers is:\n"+c);
		String data="a="+a+",b="+b+" and c="+c+"\n";
		FileOutputStream fileOutputStream= new FileOutputStream("addition.txt",true);
		byte[] bt=data.getBytes();
		fileOutputStream.write(bt);
		fileOutputStream.close();
		scanner.close();
	}
}	


