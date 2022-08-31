//WAJP to create an array of string values. The elements will contain "0", "1", "2" … n-1
package com.w3resources.kaustubh;

import java.util.Arrays;

public class Main41 
{
	public static void main(String[] args) 
	{
		int n=5;
		String []string= new String[n];
	    for(int i = 0; i < n; i++)
	    {
	        string[i] = String.valueOf(i);                                  
		 System.out.println("New Array: "+Arrays.toString(string)); 
		 }
	}
}
