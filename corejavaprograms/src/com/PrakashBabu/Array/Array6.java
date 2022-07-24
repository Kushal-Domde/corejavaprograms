//WAP to do sorting of elements in  Ascending order

package com.PrakashBabu.Array;

import java.util.Scanner;

public class Array6 
{

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int i,j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements of the array");
		for(i=0;i<a.length;i++) //i=0,i=1,i=2,i=3,i=4
		{
			a[i] = scanner.nextInt();
		}
		System.out.println("Elements in the array before sorting is: ");
		for(int l=0;l<a.length;l++)
			System.out.println(a[l]);
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++) //index 5 out of bounds for length 5 in  java if <=
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Elements in the array after sorting is: ");
		for(int l=0;l<a.length;l++)
			System.out.println(a[l]);
		scanner.close();
	}

}


