//WAP to to Transpose matrix elemnts

package com.PrakashBabu.Array;

import java.util.Scanner;

public class Array14 
{

	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		int a[][]=new int [4][3];
		int i,j;
		System.out.println("Enter the elemnts to be inserted in Matrix: ");
		for(i=0;i<4;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Elements in the matrix are: ");
		for(i=0;i<4;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(i=0;i<3;i++)
		{
			int sum=0;
			for(j=0;j<4;j++)
			{
				sum=sum+a[j][i];
			}
			System.out.println("Sum of the coloumn elements is:"+sum);
		}
	}
}
