//Wap to convert decimal number to octal
package com.w3resources.kaustubh;
import java.util.Scanner;
public class Main5 
{
	public static void main(String[]args)
	{
		int[]octalnumber=new int[200];
		int i=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the decimal number to be converted:");
		int decimalnumber=scanner.nextInt();
		scanner.close();
		int temporary=decimalnumber;
		while (temporary!= 0) 
		{
		    octalnumber[i]= temporary% 8;
		    temporary=temporary/ 8;
		    i++;
		}
	    System.out.println("Equivalent octal of "+decimalnumber+" is");
		for (i=i - 1;i>= 0;i--)
		    System.out.print(octalnumber[i]);
	}	 
}
