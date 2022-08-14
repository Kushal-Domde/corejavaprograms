//Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

package com.Hackerrank.Kaustubh;

import java.util.Scanner;

public class Hackerrank8 
{
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the ip address to be validated:"); 
       while(scanner.hasNext())
       {
           String ip=scanner.next();
           System.out.println(ip.matches(new MyRegex().pattern));
       }       
       scanner.close();
    }
}
class MyRegex 
{
	String num  = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
	public String pattern = num + "\\." +num + "\\." + num + "\\." +num; 
}

