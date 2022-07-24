// WAP to validate whether entered number is valid or not 

package com.PrakashBabu.course;

import java.util.Scanner;
import java.util.regex.*;

public class Regex11
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number to validate:");
		String s=sc.nextLine();
		Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
		Matcher matcher=pattern.matcher(s);
		if(matcher.find()&&matcher.group().equals(s))
		{
			System.out.println(s+" is valid mobile number in India");
		}
		else
			System.out.println(s+" is invalid mobile number in India");
	}
}
