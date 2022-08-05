// Write a program  to add and multiply numbers of Using the power of Java's BigInteger class
package com.Hackerrank.Kaustubh;

import java.util.Scanner;
import java.math.BigInteger;

public class Hackerrank5 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		BigInteger a = new BigInteger(scanner.next());
		BigInteger b = new BigInteger(scanner.next());
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}
