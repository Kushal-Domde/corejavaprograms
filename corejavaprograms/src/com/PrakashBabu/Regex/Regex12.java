// Wap to check whether given Gmail id is valid if or not 
package com.PrakashBabu.course;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex12 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter gmaild id to be checked");
		String s1=sc.nextLine();
		Pattern pattern=Pattern .compile("[a-z][a-z0-9]+@gmail[.]com");
		Matcher matcher=pattern.matcher(s1);
		if(matcher.find()&&matcher.group().equals(s1))
			System.out.println(s1+" is valid gmailid");
		else
			System.out.println(s1+" is invalid gmailid");
		sc.close();
	}
}
