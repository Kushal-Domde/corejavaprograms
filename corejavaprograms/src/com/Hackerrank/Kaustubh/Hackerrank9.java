/*
WAP to validate username according to following conditions 
a) The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters,then it is invalid .
b) The username can only contain alphanumeric characters and underscores (_).Alphanumeric characters describe the character set consisting of 
   lowercase characters,uppercase characters,and digits [0-9].
c) The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
 
*/
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
