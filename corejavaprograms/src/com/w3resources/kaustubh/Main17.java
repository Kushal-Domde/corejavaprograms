// Write a Java program to count the letters, spaces, numbers and other characters of an input string.
package com.w3resources.kaustubh;
import java.util.Scanner;
public class Main17 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter the sentence: ");
		String sentence=scanner.nextLine();
		scanner.close();
		char[] ch=sentence.toCharArray();
		int letters=0;
		int spaces=0;
		int digits=0;
		int others=0;
		for(int i=0;i<sentence.length();i++)
		{
			if(Character.isDigit(ch[i]))
				digits++;
			else if(Character.isLetter(ch[i]))
				letters++;
			else if (Character.isSpaceChar(ch[i])) 
				spaces++;
			else
				others++;
		}
		System.out.println("The count of letters is"+letters);
		System.out.println("The count of digits is"+digits);
		System.out.println("The count of spaces is"+spaces);
		System.out.println("The count of other is"+others);
	}
}
