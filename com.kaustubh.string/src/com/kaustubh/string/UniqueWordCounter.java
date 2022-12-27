//Write a  Java Program to Count the Number of Unique Words

package com.kaustubh.string;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordCounter 
{
	public static void counter(String string) 
	{
		if(string==null||string.length()==0)
		{
			System.out.println("Given string is empty");
		}
		Set<Character>set= new HashSet<>();
		for(int i=0;i<string.length();i++)
		{
			set.add(string.charAt(i));
		}
		System.out.println(set.size());
	}
}
