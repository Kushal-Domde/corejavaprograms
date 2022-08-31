//Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters. 
package com.w3resources.kaustubh;

public class Main31 
{
	public static void main(String[] args) 
	{
		String string="py";
		if(string.length()==2)
		{
			System.out.println( (string.charAt(0)+""+string.charAt(1))+"#");
		}
		else if(string.length() == 1)
				System.out.println( (string.charAt(0)+"##"));
		else if(string.length() == 0)
				System.out.println("###");
		else
		{
			String newString=string.substring(0,3);
			System.out.println(newString);
		}
	}
}
