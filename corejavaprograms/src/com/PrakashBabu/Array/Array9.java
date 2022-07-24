//WAP to do sum of even elements in  the ARRAY

package com.PrakashBabu.Array;

import java.util.Scanner;

public class Array9
{
	public static void main(String[] args)
	{
		int a[]= {12,45,23,07,1000000};
		int position;
		for(int i:a)
			System.out.println("Elements in Array are: "+i);
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the position to be updated:");
		position=scanner.nextInt();
		System.out.println("Enter the new element:");
		int element=scanner.nextInt();
		a[position]=element;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("updated array is:"+a[i]);
		}
		System.out.println("updated element is:"+element);
	}
}
