// WAP to do sum of even elements in  the ARRAY

package com.PrakashBabu.Array;

import java.util.Scanner;

public class Array3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int sum=0;
		int n = scanner.nextInt();
		int a[] = new int[n];
		int i;
		System.out.println("Enter "+n+" elements");
		for(i=0;i<a.length;i++) //i=0,i=1,i=2,i=3,i=4
		{
			a[i] = scanner.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				sum=sum+a[i];
		}
		System.out.println("Sum of Even Elements are"+sum);
		scanner.close();
	}
}

	

