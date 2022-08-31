//Write a Java program to accepts an integer and count the factors of the number.
package com.w3resources.kaustubh;
import java.util.*;
public class Main21 
{
	public static void main(String[] args)
	{
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("Input an integer: ");
	      int x = scanner.nextInt(); 
	      scanner.close();
	      System.out.println(result(x));
	} 		
	public static int result(int num) 
	{	
			int ctr = 0;
	        for(int i=1; i<=(int)Math.sqrt(num); i++) 
	        {
	            if(num%i==0 && i*i!=num) 
	                ctr+=2;
	            else if (i*i==num) 
	                ctr++;
	        }
	        return ctr;
	}
}

