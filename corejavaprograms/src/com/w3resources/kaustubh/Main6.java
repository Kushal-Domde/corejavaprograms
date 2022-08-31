//Write a Java program to binary to Decimal    

package com.w3resources.kaustubh;
import java.util.Scanner;
public class Main6 
{
	public static void main(String[]args)
	{
		double decimalnumber=0;
		int i=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the binary number to be converted:");
		int binarynumber=scanner.nextInt();
		scanner.close();
		int temporary=binarynumber;
		while(temporary!=0)
		{
			int remainder=temporary%10;
			temporary=temporary/10;
			decimalnumber=decimalnumber+remainder*(int)(Math.pow(2,i));
			i++;
		} 
		System.out.println("Equivalent decimal of "+binarynumber+" is");
		System.out.print(decimalnumber);
	}
}
