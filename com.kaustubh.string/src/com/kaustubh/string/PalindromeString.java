// WAJP to check whether the given string is palindrome or not 
package com.kaustubh.string;

public class PalindromeString 
{
	public static void reverse() {
		String string1="Madam"; 
		String reverse = "";
		for(int i =string1.length()- 1; i >= 0; i--)
			reverse = reverse  + string1.charAt(i);
		if(string1.equalsIgnoreCase(reverse))
			System.out.println(string1+" is palindrome.");
		else
			System.out.println(string1+" is not palindrome.");
	}
}
	
		
    

