// Given a large integer, use the Java BigInteger class' is ProbablePrime method to determine and print whether it's prime or not prime.

package com.Hackerrank.Kaustubh;

import java.util.Scanner;
import java.math.BigInteger;

public class Hackerrank5b 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		BigInteger bigInteger = scanner.nextBigInteger();
		scanner.close();
		System.out.println(bigInteger.isProbablePrime(10) ? "prime" : "not prime");
		//System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");	    
	}
}
 