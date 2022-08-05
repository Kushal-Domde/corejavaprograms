// WAP to returns the day on that date.
package com.Hackerrank.Kaustubh;

import java.io.*;
import java.util.*;
import java.time.LocalDate;
public class Hackerank4 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Month in number:");
		int month =scanner.nextInt(); 		
		System.out.println("Enter the Date in number:");
		int date=scanner.nextInt();
		System.out.println("Enter the Year in number:");
		int year =scanner.nextInt();
		String res = Result.findDay(month,date,year);
		System.out.println(res);
	}
}
class Result
{
	public static String findDay(int month, int day, int year) 
	{
		LocalDate dt = LocalDate.of(year, month, day);
		       return ""+dt.getDayOfWeek();
	}
}


