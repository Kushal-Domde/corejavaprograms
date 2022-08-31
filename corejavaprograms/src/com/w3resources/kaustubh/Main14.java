//WAJP and compute the sum of the digits of an integer.

package com.w3resources.kaustubh;

public class Main14 
{
	public static void main(String[] args) 
	{
		int number=45;
		int sum=0;
		int d;
		int temporary=number;
		while(temporary!=0)
		{
			d=temporary%10;
			temporary=temporary/10;
			sum=sum+d;
		}
		System.out.println("The sum of digits of "+number+" is "+sum);
	}
}
