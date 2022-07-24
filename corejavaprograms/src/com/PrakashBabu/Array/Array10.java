//WAP to to read and write matrix in  the ARRAY


package com.PrakashBabu.Array;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args)
	{
		int a[][]=new int[3][3];
		int i,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the matrix elements");
		for(i=0;i<3;i++)
		{	
			for(j=0;j<3;j++)
			{
					a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Matrix elements are:");
		for(i=0;i<3;i++)
		{	
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
			
	}

}
