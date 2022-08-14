//WAP to check whether start tag and end tag are same or not

package com.Hackerrank.Kaustubh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hackerrank11 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String line= scanner.nextLine();
		boolean matchfound=false;
		Pattern pattern= Pattern.compile("<(.+)>([^<]+)</\\1>");
		Matcher matcher= pattern.matcher(line);
		scanner.close();
		while(matcher.find())
		{
			matchfound=true;
			System.out.println("Match is found "+matcher.group(2));
		}
		if(!matchfound)
		{
			System.out.println("Match is not found");

		}
	}
}
