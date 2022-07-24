// WAP to add matrix elements 

package com.PrakashBabu.Array;

import java.util.Scanner;

public class Array11 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int a[][]=new int[3][3];
		int i,j,sum=0;
		System.out.println("Enter the elements to be inserted in Array : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Elements in Array are: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum=sum+a[i][j];
			}	
		}
		System.out.println("Sum of elements in Array is:"+sum);
	}
}
	

