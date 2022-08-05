 package com.Hackerrank.Kaustubh;

import java.util.*;

public class Hackerrank9
{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
    {
    	System.out.println("Please enter the name to be validated");
    	String userName = scan.nextLine();
	            if (userName.matches(UsernameValidator.regularExpression)) 
	                System.out.println("Valid");
	            else 
	                System.out.println("Invalid");
    }
}
class  UsernameValidator
{
	 public static final String regularExpression ="^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
