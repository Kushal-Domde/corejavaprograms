//Write a Java program to convert seconds to hour, minute and seconds.
package com.w3resources.kaustubh;

public class Main20 
{
	public static void main(String[] args) 
	{
		int seconds=5000;
		int minutes=seconds/60;
		int remainingSeconds=seconds%60;
		int hours=minutes/60;
		int remainingMinutes=minutes%60;
		System.out.println(hours+":"+remainingMinutes+":"+remainingSeconds+"");
	}
}
