//Write a Java program to check if given pathname is a directory or a file and return true or false.

package com.PrakashBabu.File;
import java.io.*;
public class File9 
{
	public static void main(String[] args) 
	{
		File f1 = new File("Java practice");
		File f2 = new File("abc1.txt");
		System.out.println(f1.isFile());//false
		System.out.println(f2.isFile());//true
		System.out.println(f1.isDirectory());//true
		System.out.println(f2.isDirectory());//false
	}
}
