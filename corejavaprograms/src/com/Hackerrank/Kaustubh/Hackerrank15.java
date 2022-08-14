// You are given  pairs of strings. WAP to print number of unique pairs you currently have.
package com.Hackerrank.Kaustubh;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hackerrank15 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many elemnts u want to add");
		int t=scanner .nextInt();
		String []pair_left=new String[t];
		String []pair_right=new String[t];
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter First Name ");
			pair_left[i]=scanner.next();
			System.out.println("Enter Last Name ");
			pair_right[i]=scanner.next();
		}
		scanner.close();
		Set<String> set = new HashSet<>();
		for (int i=0; i<t; i++) {
			set.add(pair_left[i] +" "+ pair_right[i]);
			System.out.println(set.size());
		}
	}

}			
			
			
			
			
			
