//WAJP to calculate the modules of 2 nos without using inbuilt modulus operator.
package com.w3resources.kaustubh;

public class Main25 
{
	public static void main(String[] args) 
	{
		int divident=27;
		int divisor=4;
		int quotient;
		int  remainder;
		quotient=divident/divisor;
		remainder=divident-(divisor*quotient);
		System.out.println(remainder);
	}
}
