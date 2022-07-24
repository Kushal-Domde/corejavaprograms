// WAP to do sum of elements in  the ARRAY

package com.PrakashBabu.Array;

import java.util.Scanner;

public class Array2
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int sum=0;
		int n = obj.nextInt();
		int a[] = new int[n];
		int i;
		System.out.println("Enter "+n+" elements");
		for(i=0;i<a.length;i++) //i=0,i=1,i=2,i=3,i=4
		{
			a[i] = obj.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Elements are"+sum);
		obj.close();
	}
}
